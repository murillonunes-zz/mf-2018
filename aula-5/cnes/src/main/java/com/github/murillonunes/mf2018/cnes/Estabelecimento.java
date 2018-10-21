/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.murillonunes.mf2018.cnes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    /*
     * Constantes com o número das colunas correspondentes às informações relevantes ao Programa no
     * arquivo CSV remoto para facilitar a adaptação no caso de futuras mudanças na estrutura do
     * arquivo independente.
     */
    private static final int COLUNA_DO_CODIGO_CNES = 1;
    private static final int COLUNA_DA_RAZAO_SOCIAL = 5;
    private static final int COLUNA_DA_LATITUDE = 39;
    private static final int COLUNA_DA_LONGITUDE = 40;

    private String codigoCNES;
    private String razaoSocial;
    private String latitude;
    private String longitude;

    public static List<Estabelecimento> csvParser(BufferedReader csvReader) throws IOException {
        String linha;
        int numeroDaLinha = 0;
        List<Estabelecimento> estabelecimentos = new ArrayList<Estabelecimento>();

        while ((linha = csvReader.readLine()) != null) {
            if (numeroDaLinha != 0) {
                estabelecimentos.add(csvLineParser(linha));
            }

            numeroDaLinha++;
        }

        return estabelecimentos;
    }

    private static Estabelecimento csvLineParser(final String linha) {
        String linhaAlterada = linha;
        linhaAlterada = linhaAlterada.substring(1, linhaAlterada.length() - 1);
        linhaAlterada = linhaAlterada.substring(0, linhaAlterada.length() - 2);
        String[] campos = linhaAlterada.split("\";\"");
        Estabelecimento e = new Estabelecimento();
        e.setCodigoCNES(campos[COLUNA_DO_CODIGO_CNES]);
        e.setRazaoSocial(campos[COLUNA_DA_RAZAO_SOCIAL]);
        e.setLatitude(campos[COLUNA_DA_LATITUDE]);
        e.setLongitude(campos[COLUNA_DA_LONGITUDE]);

        return e;
    }

    public String getCodigoCNES() {
        return codigoCNES;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return latitude;
    }

    public void setCodigoCNES(String codigoCNES) {
        this.codigoCNES = codigoCNES;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
