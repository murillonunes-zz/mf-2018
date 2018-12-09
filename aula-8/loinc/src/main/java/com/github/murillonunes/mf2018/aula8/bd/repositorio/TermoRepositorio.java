package com.github.murillonunes.mf2018.aula8.bd.repositorio;

import com.github.murillonunes.mf2018.aula8.bd.model.Termo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TermoRepositorio {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Termo> listarTodos() {
        return jdbcTemplate.query("select * from loinc",
                (rs, rowNum) -> new Termo(
                        rs.getString("loinc_num"),
                        rs.getString("component"),
                        rs.getString("scale_typ"),
                        rs.getString("long_common_name"),
                        rs.getString("shortname")));
    }

    public Termo buscarPorLoincNum(String loincNum) {
        return jdbcTemplate.queryForObject("select * from loinc where loinc_num = ?", new Object[]{ loincNum },
                (rs, rowNum) -> new Termo(
                        rs.getString("loinc_num"),
                        rs.getString("component"),
                        rs.getString("scale_typ"),
                        rs.getString("long_common_name"),
                        rs.getString("shortname")));
    }

}
