package no.pub.repository;

import no.pub.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by matmoe on 15.01.14.
 */
@Repository
public class InfoRepositoryImpl implements InfoRepository {


    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final RowMapper<Info> infoMapper = new RowMapper<Info>() {
        @Override
        public Info mapRow(ResultSet rs, int rowNum) throws SQLException {
            Info info = new Info();
            info.setId(rs.getLong(1));
            info.setType(rs.getString(2));
            info.setInfo(rs.getString(3));
            return info;
        }
    };


    @Autowired
    public InfoRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public Info getById(Long id) {
        return jdbcTemplate.queryForObject("select * from info where id=:id", asMap(id), infoMapper);
    }

    @Override
    public List<Info> getAll() {
        return jdbcTemplate.query("select * from info", infoMapper);
    }
    private HashMap<String, Object> asMap(Long id) {
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("id", id);
        return parameters;
    }

    private HashMap<String, Object> getParameterMap(Info info) {
        HashMap<String, Object> paramMap = new HashMap<>();

        paramMap.put("id", info.getId());
        paramMap.put("type", info.getType());
        paramMap.put("info", info.getInfo());
        return paramMap;
    }
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

}
