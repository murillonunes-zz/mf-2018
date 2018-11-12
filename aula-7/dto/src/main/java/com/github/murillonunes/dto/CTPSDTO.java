package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class CTPSDTO {

    private IdentificadorDTO identificador;
    private int serie;
    private EstadoDTO estado;

    public IdentificadorDTO getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDTO identificador) {
        this.identificador = identificador;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }
}
