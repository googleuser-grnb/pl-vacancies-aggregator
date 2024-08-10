package com.googleuse_grnb.vacancies_aggregator.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "vacancies")
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "vacancy_id", nullable = false)
    private String id;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

    @Column(name = "company", nullable = false, length = 100)
    private String company;

    @Column(name = "name", nullable = false, length = 100)
    private String name;
}
