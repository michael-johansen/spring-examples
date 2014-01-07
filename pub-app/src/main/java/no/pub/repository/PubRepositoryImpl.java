package no.pub.repository;

import no.pub.model.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:58
 */
@Repository
public class PubRepositoryImpl implements PubRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Pub> pubMapper = new RowMapper<Pub>() {
        @Override
        public Pub mapRow(ResultSet rs, int rowNum) throws SQLException {
            return null;
        }
    };
    ;

    @Autowired
    public PubRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Pub getById(Long id) {
        return jdbcTemplate.queryForObject("select * from pub where id=?",
                new Object[]{id},
                pubMapper);
    }

    @Override
    public List<Pub> getAll() {
        return jdbcTemplate.query("select * from pub",pubMapper);
    }

    @Override
    public void save(Pub pub) {
        jdbcTemplate.update("insert into Pub values (1,2,3)");
    }
}
