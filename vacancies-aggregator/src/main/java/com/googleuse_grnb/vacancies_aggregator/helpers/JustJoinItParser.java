package com.googleuse_grnb.vacancies_aggregator.helpers;

import com.googleuse_grnb.vacancies_aggregator.entites.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class JustJoinItParser implements VacanciesParser{

    @Override
    public List<Vacancy> getVacancies() {
        try {
            Document doc = Jsoup.connect(
                    "https://justjoin.it/all-locations/java/employment-type_permanent/experience-level_junior"
            ).get();

            Elements links = doc.select(".offer_list_offer_link");
            Elements vacanciesNames = doc.select("h3");
            Elements companies = doc.select(".MuiSvgIcon-root + span");
        } catch (IOException _) {

        }

        return List.of();
    }
}
