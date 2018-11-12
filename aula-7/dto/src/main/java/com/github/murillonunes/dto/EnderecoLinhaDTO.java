package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class EnderecoLinhaDTO {

    private EnderecoDTO endereco;
    private String linha;
    private int ordem;

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
}
