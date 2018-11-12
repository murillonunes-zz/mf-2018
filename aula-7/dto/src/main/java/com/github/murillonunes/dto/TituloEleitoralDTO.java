package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class TituloEleitoralDTO {

    private IdentificadorDTO identificador;
    private int zona;
    private int sessao;

    public IdentificadorDTO getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDTO identificador) {
        this.identificador = identificador;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int sessao) {
        this.sessao = sessao;
    }
}
