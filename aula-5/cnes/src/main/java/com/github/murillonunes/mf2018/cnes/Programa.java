/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.murillonunes.mf2018.cnes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class Programa {

    private static final String DEFAULT_URL = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP";
    // Alterar para barra invertida caso queira executar o Programa no Windows. Para sistemas Linux usar barra para a direita.
    private static final String DEFAULT_FILE = "web-app/src/estabelecimentos.json";
    private static final String ESTABELECIMENTOS_DEFAULT_FILE = "tbEstabelecimento201809.csv";

    /**
     * Para evitar a criação de instâncias.
     */
    private Programa() {
    }

    public static void main(final String[] args) throws IOException {

        String urlString, fileName;

        if (args == null || args.length != 2) {
            System.err.println("WARNING: Os parâmetros estão errados! Insira a URL primeiramente e, " +
                    "depois, o nome do arquivo JSON que deverá ser gerado.\nWARNING: As configurações padrão serão " +
                    "utilizadas nesta execução.");

            urlString = DEFAULT_URL;
            fileName = DEFAULT_FILE;
        } else {
            urlString = args[0];
            fileName = args[1];
        }

        System.out.println("INFO: Lendo arquivo de estabelecimentos.\nINFO: Aguarde...");

        URL url = new URL(urlString);
        try (BufferedReader reader = readFileFromZIP(url, ESTABELECIMENTOS_DEFAULT_FILE)) {
            List<Estabelecimento> estabelecimentos = Estabelecimento.csvParser(reader);
            String jsonContent = convertToJson(estabelecimentos);
            Path filePath = Paths.get(fileName);
            saveToFile(jsonContent, filePath);
        }

    }

    private static void saveToFile(String jsonContent, Path filePath) throws FileNotFoundException {
        File file = filePath.toFile();
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }

        try (PrintStream output = new PrintStream(new FileOutputStream(file, false))) {
            output.print(jsonContent);
        }

        System.out.println("INFO: JSON salvo com sucesso.");
        System.out.println("INFO: Diretório do arquivo: " + filePath.toAbsolutePath());
    }

    private static BufferedReader readFileFromZIP(URL url, String fileName) throws IOException {
        URLConnection connection = url.openConnection();
        ZipInputStream stream = new ZipInputStream(connection.getInputStream(), Charset.forName("UTF-8"));
        ZipEntry entry;

        while ((entry = stream.getNextEntry()) != null) {
            if (entry.getName().equals(fileName)) {
                return new BufferedReader(new InputStreamReader(stream, Charset.forName("UTF-8")));
            }
        }
        throw new FileNotFoundException("ERROR: Arquivo não encontrado!");
    }

    private static String convertToJson(Object obj) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        return gson.toJson(obj);
    }

}
