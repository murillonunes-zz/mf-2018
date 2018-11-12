package com.github.murillonunes.dto;

import java.util.Date;

/**
 * Created by murillonunes on 12/11/18.
 */
public class VinculoDTO {

    private IdentificadorDTO identificador;
    private IndividuoDTO individuo;
    private RelacionamentoTipoDTO relacionamento;
    private Date dataInicio;
    private Date dataFinal;

    public IdentificadorDTO getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDTO identificador) {
        this.identificador = identificador;
    }

    public IndividuoDTO getIndividuo() {
        return individuo;
    }

    public void setIndividuo(IndividuoDTO individuo) {
        this.individuo = individuo;
    }

    public RelacionamentoTipoDTO getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(RelacionamentoTipoDTO relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
