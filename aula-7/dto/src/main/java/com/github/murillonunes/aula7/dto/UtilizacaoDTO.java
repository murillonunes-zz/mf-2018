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
@XmlRootElement(name = "utilizacao")
public class UtilizacaoDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private NomeDTO nome;
    private NomeUsoDTO uso;
    private IdentificadorDTO identificador;
    private Date dataInicial;
    private Date dataFinal;

    public static UtilizacaoDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, UtilizacaoDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static UtilizacaoDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(UtilizacaoDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (UtilizacaoDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(UtilizacaoDTO.class);
        final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        final StringWriter sw = new StringWriter();
        m.marshal(this, sw);
        return sw.toString();
    }

    public NomeDTO getNome() {
        return nome;
    }

    public void setNome(NomeDTO nome) {
        this.nome = nome;
    }

    public NomeUsoDTO getUso() {
        return uso;
    }

    public void setUso(NomeUsoDTO uso) {
        this.uso = uso;
    }

    public IdentificadorDTO getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDTO identificador) {
        this.identificador = identificador;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
