package com.github.murillonunes.dto;

import java.util.Date;

/**
 * Created by murillonunes on 12/11/18.
 */
public class IdentificadorDTO {

    private IdentificadorTipoDTO tipo;
    private String designacao;
    private String emissor;
    private Date data;

    public IdentificadorTipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(IdentificadorTipoDTO tipo) {
        this.tipo = tipo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
