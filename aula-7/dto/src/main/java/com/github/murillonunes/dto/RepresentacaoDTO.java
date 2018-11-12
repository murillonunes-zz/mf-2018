package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class RepresentacaoDTO {

    private NomeDTO nome;
    private String utilizacao;
    private String alternativa;

    public NomeDTO getNome() {
        return nome;
    }

    public void setNome(NomeDTO nome) {
        this.nome = nome;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}
