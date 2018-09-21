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
import java.util.*;
import java.util.Map.Entry;

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
    public static final int LINHAS_IGNORADAS = 11;

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

        int linhaAtual = 0;
        String linhaLendo;
        HashMap<String, Integer> quantIESPorEstado = new HashMap<String, Integer>();
        while ((linhaLendo = buffer.readLine()) != null) {
            linhaAtual++;
            if (linhaAtual > LINHAS_IGNORADAS) {
                String[] dados = linhaLendo.split(";");
                if (dados != null && dados.length > 9 && !dados[0].isEmpty()) {
                    quantIESPorEstado.put(dados[9], quantIESPorEstado.getOrDefault(dados[9], 0) + 1);
                }
            }
        }

        Map<String, Integer> ordemDescrescente = ordenar(quantIESPorEstado, false);
        for (Map.Entry<String, Integer> entry : ordemDescrescente.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

    }

    private static Map<String, Integer> ordenar (Map<String, Integer> mapOriginal, final boolean ordem) {
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(mapOriginal.entrySet());

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2)
            {
                if (ordem)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        Map<String,Integer> mapOrdenado = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            mapOrdenado.put(entry.getKey(), entry.getValue());
        }

        return mapOrdenado;
    }

}
