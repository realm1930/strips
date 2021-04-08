package be.vdab.strips.repositories;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

import be.vdab.strips.domain.Figuur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class JdbcFiguurRepository implements FiguurRepository {
    private final JdbcTemplate template;
    private final RowMapper<Figuur> figuurMapper = (result, rowNum) -> new Figuur(result.getLong("id"), result.getString("naam"));

    public JdbcFiguurRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Figuur> findAll() {
        var sql = "select id, naam from figuren order by naam";
        return template.query(sql, figuurMapper);
    }
}
