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
import java.util.Date;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
@XmlRootElement(name = "identificador")
public class IdentificadorDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private IdentificadorTipoDTO tipo;
    private String designacao;
    private String emissor;
    private Date data;

    public static IdentificadorDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, IdentificadorDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static IdentificadorDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(IdentificadorDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (IdentificadorDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(IdentificadorDTO.class);
        final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        final StringWriter sw = new StringWriter();
        m.marshal(this, sw);
        return sw.toString();
    }

    public IdentificadorTipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(IdentificadorTipoDTO tipo) {
        this.tipo = tipo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
