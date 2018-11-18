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
@XmlRootElement(name = "endereco")
public class EnderecoDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private String id;
    private IndividuoDTO individuo;
    private String bairro;
    private String distrito;
    private MunicipioDTO municipio;
    private EstadoDTO estado;
    private String cep;

    public static EnderecoDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, EnderecoDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static EnderecoDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(EnderecoDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (EnderecoDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(EnderecoDTO.class);
        final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        final StringWriter sw = new StringWriter();
        m.marshal(this, sw);
        return sw.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndividuoDTO getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDTO individuo) {
        this.individuo = individuo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public MunicipioDTO getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public EnderecoTipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(EnderecoTipoDTO tipo) {
        this.tipo = tipo;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataInicialAcuracia() {
        return dataInicialAcuracia;
    }

    public void setDataInicialAcuracia(String dataInicialAcuracia) {
        this.dataInicialAcuracia = dataInicialAcuracia;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataFinalAcuracia() {
        return dataFinalAcuracia;
    }

    public void setDataFinalAcuracia(String dataFinalAcuracia) {
        this.dataFinalAcuracia = dataFinalAcuracia;
    }

    private String caixaPostal;
    private PaisDTO pais;
    private EnderecoTipoDTO tipo;
    private Date dataInicial;
    private String dataInicialAcuracia;
    private Date dataFinal;
    private String dataFinalAcuracia;

}
