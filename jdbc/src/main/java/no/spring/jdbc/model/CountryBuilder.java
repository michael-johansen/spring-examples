package no.spring.jdbc.model;

import java.math.BigDecimal;

public class CountryBuilder {
    private String code;
    private String name;
    private String continent;
    private String region;
    private BigDecimal surfaceArea;
    private Integer indepYear;
    private Integer population;
    private BigDecimal lifeExpectancy;
    private BigDecimal gnp;
    private BigDecimal gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    public CountryBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public CountryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CountryBuilder setContinent(String continent) {
        this.continent = continent;
        return this;
    }

    public CountryBuilder setRegion(String region) {
        this.region = region;
        return this;
    }

    public CountryBuilder setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
        return this;
    }

    public CountryBuilder setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
        return this;
    }

    public CountryBuilder setPopulation(Integer population) {
        this.population = population;
        return this;
    }

    public CountryBuilder setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
        return this;
    }

    public CountryBuilder setGnp(BigDecimal gnp) {
        this.gnp = gnp;
        return this;
    }

    public CountryBuilder setGnpOld(BigDecimal gnpOld) {
        this.gnpOld = gnpOld;
        return this;
    }

    public CountryBuilder setLocalName(String localName) {
        this.localName = localName;
        return this;
    }

    public CountryBuilder setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
        return this;
    }

    public CountryBuilder setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
        return this;
    }

    public CountryBuilder setCapital(Integer capital) {
        this.capital = capital;
        return this;
    }

    public CountryBuilder setCode2(String code2) {
        this.code2 = code2;
        return this;
    }

    public Country createCountry() {
        return new Country(code, name, continent, region, surfaceArea, indepYear, population, lifeExpectancy, gnp, gnpOld, localName, governmentForm, headOfState, capital, code2);
    }
}