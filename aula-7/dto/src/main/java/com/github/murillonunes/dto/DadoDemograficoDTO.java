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
import java.util.Date;

/**
 * @author murillonunes
 * @since 2018
 * @version 1.0
 */
@XmlRootElement(name = "dadoDemografico")
public class DadoDemograficoDTO {

    private final static GsonBuilder GSON_BUILDER;
    static {
        GSON_BUILDER = new GsonBuilder();
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonSerializer());
        GSON_BUILDER.registerTypeAdapter(LocalDate.class, new LocalDateJsonDeserializer());
        GSON_BUILDER.setPrettyPrinting();
    }

    private IndividuoDTO individuo;
    private Date nascimento;
    private String nascimentoAcuracia;
    private DataSeguimentoDTO nascimentoSeguimento;
    private NascimentoPluralidadeDTO nascimentoPluralidade;
    private NascimentoOrdemDTO nascimentoOrdem;
    private Date obito;
    private String obitoAcuracia;
    private ObitoFonteDTO obitoFonte;
    private SexoDTO sexo;
    private String mae;
    private String pai;
    private SituacaoFamiliarDTO situacaoFamiliar;
    private RacaDTO raca;
    private String comentario;
    private NacionalidadeDTO nacionalidade;
    private MunicipioDTO municipio;
    private EstadoDTO estado;
    private PaisDTO pais;
    private Date dataEntradaPais;

    public static DadoDemograficoDTO fromJson(final String json) {
        final Gson gson = GSON_BUILDER.create();
        return gson.fromJson(json, DadoDemograficoDTO.class);
    }

    public String toJson() {
        final Gson gson = GSON_BUILDER.create();
        return gson.toJson(this);
    }

    public static DadoDemograficoDTO fromXml(final String xml) throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(DadoDemograficoDTO.class);
        final Unmarshaller unm = context.createUnmarshaller();
        final StringReader sr = new StringReader(xml);
        return (DadoDemograficoDTO) unm.unmarshal(sr);
    }

    public String toXml() throws JAXBException {
        final JAXBContext context = JAXBContext.newInstance(DadoDemograficoDTO.class);
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    public void setNascimentoAcuracia(String nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    public DataSeguimentoDTO getNascimentoSeguimento() {
        return nascimentoSeguimento;
    }

    public void setNascimentoSeguimento(DataSeguimentoDTO nascimentoSeguimento) {
        this.nascimentoSeguimento = nascimentoSeguimento;
    }

    public NascimentoPluralidadeDTO getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(NascimentoPluralidadeDTO nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public NascimentoOrdemDTO getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(NascimentoOrdemDTO nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public Date getObito() {
        return obito;
    }

    public void setObito(Date obito) {
        this.obito = obito;
    }

    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    public ObitoFonteDTO getObitoFonte() {
        return obitoFonte;
    }

    public void setObitoFonte(ObitoFonteDTO obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    public SexoDTO getSexo() {
        return sexo;
    }

    public void setSexo(SexoDTO sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public SituacaoFamiliarDTO getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(SituacaoFamiliarDTO situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public RacaDTO getRaca() {
        return raca;
    }

    public void setRaca(RacaDTO raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public NacionalidadeDTO getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeDTO nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }

    public Date getDataEntradaPais() {
        return dataEntradaPais;
    }

    public void setDataEntradaPais(Date dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }
}
