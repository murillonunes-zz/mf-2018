package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class NomeDTO {

    private String id;
    private IndividuoDTO individuo;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private NomePreferidoDTO preferido;
    private UsoCondicionalDTO usoCondicional;

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

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public NomePreferidoDTO getPreferido() {
        return preferido;
    }

    public void setPreferido(NomePreferidoDTO preferido) {
        this.preferido = preferido;
    }

    public UsoCondicionalDTO getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(UsoCondicionalDTO usoCondicional) {
        this.usoCondicional = usoCondicional;
    }
}
