package com.github.murillonunes.mf2018.aula8.bd.repositorio;

import com.github.murillonunes.mf2018.aula8.bd.model.Termo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

/**
 * Classe que permite realizar consultas à tabela LOINC do banco de dados de Termos LOINC.
 */
@Repository
public class TermoRepositorio {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Método que obtém todos os Termos LOINC registrados no banco de dados LOINC
     *
     * @return Lista com todos os Termos LOINC presentes no banco de dados
     */
    public List<Termo> listarTodos() {
        return jdbcTemplate.query("select * from loinc",
                (rs, rowNum) -> new Termo(
                        rs.getString("loinc_num"),
                        rs.getString("component"),
                        rs.getString("scale_typ"),
                        rs.getString("long_common_name"),
                        rs.getString("shortname")));
    }

    /**
     * Método que busca Termos LOINC a partir de um número
     *
     * @param loincNum Número LOINC que se quer buscar no banco de dados
     * @return Termo LOINC encontrado a partir do número
     */
    public Termo buscarPorLoincNum(String loincNum) throws EmptyResultDataAccessException {
        try {
            return jdbcTemplate.queryForObject("select * from loinc where loinc_num = ?", new Object[]{ loincNum },
                    (rs, rowNum) -> new Termo(
                            rs.getString("loinc_num"),
                            rs.getString("component"),
                            rs.getString("scale_typ"),
                            rs.getString("long_common_name"),
                            rs.getString("shortname")));
        } catch (EmptyResultDataAccessException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    /**
     * Método que busca Termos LOINC a partir do seu Component
     *
     * @param component Component LOINC que se quer buscar no banco de dados
     * @return Termo LOINC encontrado a partir do Component
     */
    public Termo buscarPorComponent(String component) throws EmptyResultDataAccessException {
        try {
            return jdbcTemplate.queryForObject("select * from loinc where component = ?", new Object[]{ component },
                    (rs, rowNum) -> new Termo(
                            rs.getString("loinc_num"),
                            rs.getString("component"),
                            rs.getString("scale_typ"),
                            rs.getString("long_common_name"),
                            rs.getString("shortname")));
        } catch (EmptyResultDataAccessException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    /**
     * Método que busca Termos LOINC a partir do seu Long Name
     *
     * @param longName Long Name LOINC que se quer buscar no banco de dados
     * @return Termo LOINC encontrado a partir do Long Name
     */
    public Termo buscarPorLongName(String longName) throws EmptyResultDataAccessException {
        try {
            return jdbcTemplate.queryForObject("select * from loinc where long_common_name = ?",
                    new Object[]{ longName },
                    (rs, rowNum) -> new Termo(
                            rs.getString("loinc_num"),
                            rs.getString("component"),
                            rs.getString("scale_typ"),
                            rs.getString("long_common_name"),
                            rs.getString("shortname")));
        } catch (EmptyResultDataAccessException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    /**
     * Método que busca Termos LOINC a partir do seu Shortname
     *
     * @param shortName Shortname LOINC que se quer buscar no banco de dados
     * @return Termo LOINC encontrado a partir do Shortname
     */
    public Termo buscarPorShortName(String shortName) throws EmptyResultDataAccessException {
        try {
            return jdbcTemplate.queryForObject("select * from loinc where shortname = ?", new Object[]{ shortName },
                    (rs, rowNum) -> new Termo(
                            rs.getString("loinc_num"),
                            rs.getString("component"),
                            rs.getString("scale_typ"),
                            rs.getString("long_common_name"),
                            rs.getString("shortname")));
        } catch (EmptyResultDataAccessException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

}
