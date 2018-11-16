/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.dto;

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
@XmlRootElement(name = "comunicacao")
public class ComunicacaoDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private IndividuoDTO individuo;
    private ComunicacaoMeioDTO meio;
    private ComunicacaoPreferenciaDTO preferencia;
    private String detalhe;
    private ComunicacaoUsoDTO uso;

    public static ComunicacaoDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, ComunicacaoDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static ComunicacaoDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(ComunicacaoDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (ComunicacaoDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(ComunicacaoDTO.class);
        final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        final StringWriter sw = new StringWriter();
        m.marshal(this, sw);
        return sw.toString();
    }

    public IndividuoDTO getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDTO individuo) {
        this.individuo = individuo;
    }

    public ComunicacaoMeioDTO getMeio() {
        return meio;
    }

    public void setMeio(ComunicacaoMeioDTO meio) {
        this.meio = meio;
    }

    public ComunicacaoPreferenciaDTO getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(ComunicacaoPreferenciaDTO preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public ComunicacaoUsoDTO getUso() {
        return uso;
    }

    public void setUso(ComunicacaoUsoDTO uso) {
        this.uso = uso;
    }
}
