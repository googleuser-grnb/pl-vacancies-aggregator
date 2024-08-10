package com.googleuse_grnb.vacancies_aggregator;

import com.googleuse_grnb.vacancies_aggregator.entites.Vacancy;
import com.googleuse_grnb.vacancies_aggregator.helpers.GlassDoorParser;
import com.googleuse_grnb.vacancies_aggregator.helpers.JustJoinItParser;
import com.googleuse_grnb.vacancies_aggregator.helpers.NoFluffJobsParser;
import com.googleuse_grnb.vacancies_aggregator.helpers.TheProtocolParser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class VacanciesScheduler {

    @Scheduled(cron = "52 * * * * *")
    public void getNewVacancies() {
        List<Vacancy> parsedVacancies = Stream.of(
                        new JustJoinItParser(),
                        new TheProtocolParser(),
                        new NoFluffJobsParser(),
                        new GlassDoorParser()
                )
                .flatMap(parser -> parser.getVacancies().stream())
                .toList();
    }
}
