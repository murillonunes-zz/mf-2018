/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.aula7.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javax.xml.bind.JAXBException;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
public class AreaGeograficaDTOTest {

    private AreaGeograficaDTO areaGeograficaDeTeste() {
        final AreaGeograficaDTO areaGeografica = new AreaGeograficaDTO();
        areaGeografica.setAlternativo("Área geográfica texto alternativo");
        areaGeografica.setCodigo(100);
        areaGeografica.setDescricao("Descrição da área geográfica");
        return areaGeografica;
    }

    private boolean isEquals(final Object objectA, final Object objectB) {
        Boolean equals = EqualsBuilder.reflectionEquals(objectA, objectB, false, Object.class);
        return equals;
    }

    @Test
    public void areaGeograficaToJsonAndFromJsonTest() {
        final AreaGeograficaDTO areaGeografica = areaGeograficaDeTeste();
        final String jsonTest = areaGeografica.toJson();
        final AreaGeograficaDTO areaGeograficaObtida = AreaGeograficaDTO.fromJson(jsonTest);
        Assertions.assertTrue(isEquals(areaGeografica, areaGeograficaObtida));
    }

}
