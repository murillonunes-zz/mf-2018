package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class ComunicacaoDTO {

    private IndividuoDTO individuo;
    private ComunicacaoMeioDTO meio;
    private ComunicacaoPreferenciaDTO preferencia;
    private String detalhe;
    private ComunicacaoUsoDTO uso;

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
