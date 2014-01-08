package no.pub.repository;

import no.pub.model.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:58
 */
@Repository
public class PubRepositoryImpl implements PubRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final RowMapper<Pub> pubMapper = new RowMapper<Pub>() {
        @Override
        public Pub mapRow(ResultSet rs, int rowNum) throws SQLException {
            Pub pub = new Pub();
            pub.setId(rs.getLong(1));
            pub.setName(rs.getString(2));
            pub.setType(rs.getString(3));
            pub.setRating(rs.getInt(4));
            pub.setLat(rs.getDouble(5));
            pub.setLon(rs.getDouble(6));
            pub.setPostalCode(rs.getString(7));
            return pub;
        }
    };


    @Autowired
    public PubRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public Pub getById(Long id) {
        return jdbcTemplate.queryForObject("select * from pub where id=:id", asMap(id), pubMapper);
    }

    @Override
    public List<Pub> getAll() {
        return jdbcTemplate.query("select * from pub", pubMapper);
    }

    @Override
    public void save(Pub pub) {
        HashMap<String, Object> paramMap = getParameterMap(pub);
        if (pub.getId() == null) {
            jdbcTemplate.update("insert into Pub values (null,:name,:type,:rating,:lat,:lon,:postalcode)", paramMap);
        } else {
            jdbcTemplate.update("update Pub set name=:name,type=:type,rating=:rating,lat=:lat,lon=:lon,postalcode=:postalcode where id=:id", paramMap);
        }

    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("delete from Pub where id=:id", asMap(id));
    }

    private HashMap<String, Object> asMap(Long id) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("id", id);
        return parameters;
    }

    private HashMap<String, Object> getParameterMap(Pub pub) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", pub.getId());
        paramMap.put("name", pub.getName());
        paramMap.put("type", pub.getType());
        paramMap.put("rating", pub.getRating());
        paramMap.put("lat", pub.getLat());
        paramMap.put("lon", pub.getLon());
        paramMap.put("postalcode", pub.getPostalCode());
        return paramMap;
    }
}
