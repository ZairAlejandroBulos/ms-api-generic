package com.utn.genericsbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Rocket extends Base {

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "year_first_launch", nullable = false)
    private Integer yearFirstLaunch;

    public Rocket() {
    }

    public Rocket(Long id) {
        super(id);
    }

    public Rocket(String name, String country, Integer yearFirstLaunch) {
        this.name = name;
        this.country = country;
        this.yearFirstLaunch = yearFirstLaunch;
    }

    public Rocket(Long id, String name, String country, Integer yearFirstLaunch) {
        super(id);
        this.name = name;
        this.country = country;
        this.yearFirstLaunch = yearFirstLaunch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYearFirstLaunch() {
        return yearFirstLaunch;
    }

    public void setYearFirstLaunch(Integer yearFirstLaunch) {
        this.yearFirstLaunch = yearFirstLaunch;
    }
}
