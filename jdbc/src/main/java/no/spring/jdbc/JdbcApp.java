package no.spring.jdbc;

import no.spring.jdbc.mappers.CityRowMapper;
import no.spring.jdbc.mappers.CountryRowMapper;
import no.spring.jdbc.model.City;
import no.spring.jdbc.model.Country;
import no.spring.jdbc.model.CountryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.util.List;

/**
 * User: Michael Johansen
 * Date: 06.01.14
 * Time: 12:41
 */
@Configuration
public class JdbcApp {
    private static Logger logger = LoggerFactory.getLogger(JdbcApp.class);

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addDefaultScripts().build();
    }

    @Bean
    @Autowired
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcApp.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        jdbcTemplate.setMaxRows(10);

        List<City> cityList = jdbcTemplate.query("select * from city", new CityRowMapper());
        for (City city : cityList) {
            logger.info("{}", city);
        }
        logger.info("Number of cities: {}", cityList.size());

        List<Country> countryList = jdbcTemplate.query("select * from country", new CountryRowMapper());
        for (Country country : countryList) {
            logger.info("{}", country);
        }
        logger.info("Number of countries: {}", countryList.size());
    }

}
