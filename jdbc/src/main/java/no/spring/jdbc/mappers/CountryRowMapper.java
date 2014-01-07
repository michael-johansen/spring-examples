package no.spring.jdbc.mappers;

import no.spring.jdbc.model.Country;
import no.spring.jdbc.model.CountryBuilder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
* User: Michael Johansen
* Date: 06.01.14
* Time: 13:54
*/
public class CountryRowMapper implements RowMapper<Country> {
    @Override
    public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CountryBuilder()
                .setCode(rs.getString(1))
                .setName(rs.getString(2))
                .setContinent(rs.getString(3))
                .setRegion(rs.getString(4))
                .setSurfaceArea(rs.getBigDecimal(5))
                .setIndepYear(rs.getInt(6))
                .setPopulation(rs.getInt(7))
                .setLifeExpectancy(rs.getBigDecimal(8))
                .setGnp(rs.getBigDecimal(9))
                .setGnpOld(rs.getBigDecimal(10))
                .setLocalName(rs.getString(11))
                .setGovernmentForm(rs.getString(12))
                .setHeadOfState(rs.getString(13))
                .setCapital(rs.getInt(14))
                .setCode2(rs.getString(15))
                .createCountry();
    }
}
