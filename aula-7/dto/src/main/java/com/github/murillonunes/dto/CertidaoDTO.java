package com.github.murillonunes.dto;

/**
 * Created by murillonunes.
 */
public class CertidaoDTO {

    private IdentificadorDTO identificador;
    private CertidaoTipoDTO tipo;
    private String cartorio;
    private int livro;
    private int folha;
    private int termo;

    public IdentificadorDTO getIdentificador() {
        return identificador;
    }

    public void setIdentificador(IdentificadorDTO identificador) {
        this.identificador = identificador;
    }

    public CertidaoTipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(CertidaoTipoDTO tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public int getFolha() {
        return folha;
    }

    public void setFolha(int folha) {
        this.folha = folha;
    }

    public int getTermo() {
        return termo;
    }

    public void setTermo(int termo) {
        this.termo = termo;
    }
}
