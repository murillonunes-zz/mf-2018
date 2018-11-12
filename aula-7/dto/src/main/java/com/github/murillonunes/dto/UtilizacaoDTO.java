package com.github.murillonunes.dto;

import java.util.Date;

/**
 * Created by murillonunes.
 */
public class UtilizacaoDTO {

    private NomeDTO nome;
    private NomeUsoDTO uso;
    private IdentificadorDTO identificador;
    private Date dataInicial;
    private Date dataFinal;

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
