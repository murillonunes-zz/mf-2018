/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.aula7.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDate;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
@XmlRootElement(name = "areaGeografica")
public class AreaGeograficaDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private int codigo;
    private String alternativo;
    private String descricao;

    public static AreaGeograficaDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, AreaGeograficaDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static AreaGeograficaDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(AreaGeograficaDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (AreaGeograficaDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(AreaGeograficaDTO.class);
        final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        final StringWriter sw = new StringWriter();
        m.marshal(this, sw);
        return sw.toString();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}