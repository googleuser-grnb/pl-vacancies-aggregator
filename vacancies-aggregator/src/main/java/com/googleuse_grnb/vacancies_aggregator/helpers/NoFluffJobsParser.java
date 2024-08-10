package com.googleuse_grnb.vacancies_aggregator.helpers;

import com.googleuse_grnb.vacancies_aggregator.entites.Vacancy;

import java.util.List;

public class NoFluffJobsParser implements VacanciesParser{
    @Override
    public List<Vacancy> getVacancies() {
        return List.of();
    }
}
