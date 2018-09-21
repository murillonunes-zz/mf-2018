/*
 * Copyright (c) 2018. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.mf2018.aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Essa classe tem como objetivo solucionar a questão proposta no exercício 11 da aula 3
 * da disciplina de Métodos e Ferramentas de ES ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Murillo Nunes
 * @since Setembro de 2018
 * @version 1.0
 */
public class Aplicacao {

    public static final String URL_PADRAO = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";

    /**
     * O programa funciona da seguinte maneira:
     * (a) Recebe uma URL para um arquivo no formato CSV
     * contendo dados sobre as Instituições de Ensino Superior (IES) brasileiras; caso não seja
     * fornecida uma URL como argumento, será utilizada uma URL definida na constante URL_PADRAO.
     * (b) É feito download do arquivo CSV, a leitura dos seus dados e a ordenação, por ordem
     * decrescente, agrupando por estado, a quantidade de instituições.
     *
     * @param args URL para o arquivo CSV
     * @throws MalformedURLException
     * @throws IOException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url;
        if (args != null && args.length > 0) {
            url =  new URL(args[0]);
        } else {
            url = new URL(URL_PADRAO);
        }

        URLConnection conexao = url.openConnection();
        InputStreamReader csv = new InputStreamReader(((URLConnection) conexao).getInputStream());
        BufferedReader buffer = new BufferedReader(csv);



    }

}
