package no.spring.jdbc.model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * User: Michael Johansen
 * Date: 06.01.14
 * Time: 13:38
 */
public class Country {
    private final String code;
    private final String name;
    private final String continent;
    private final String region;
    private final BigDecimal surfaceArea;
    private final Integer indepYear;
    private final Integer population;
    private final BigDecimal lifeExpectancy;
    private final BigDecimal GNP;
    private final BigDecimal GNPOld;
    private final String localName;
    private final String governmentForm;
    private final String headOfState;
    private final Integer capital;
    private final String code2;

    public Country(String code,
                   String name,
                   String continent,
                   String region,
                   BigDecimal surfaceArea,
                   Integer indepYear,
                   Integer population,
                   BigDecimal lifeExpectancy,
                   BigDecimal gnp,
                   BigDecimal gnpOld,
                   String localName,
                   String governmentForm,
                   String headOfState,
                   Integer capital,
                   String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        GNP = gnp;
        GNPOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public BigDecimal getGNPOld() {
        return GNPOld;
    }

    public String getLocalName() {
        return localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public String getCode2() {
        return code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
