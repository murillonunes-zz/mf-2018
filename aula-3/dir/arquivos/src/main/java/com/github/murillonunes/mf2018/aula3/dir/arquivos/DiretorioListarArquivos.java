/*
 * Copyright (c) 2018. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.mf2018.aula3.dir.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Essa classe tem como objetivo solucionar a questão proposta no exercício 12
 * da aula 3 da disciplina de Métodos e Ferramentas de ES ministrada pelo 
 * professor Fábio Nogueira de Lucena.
 *
 * @author Murillo Nunes
 * @since Setembro de 2018
 * @version 1.0
 */
public class DiretorioListarArquivos {
    
    public static void main(String[] args) throws IOException {
        
        Path diretorioAtual = Paths.get("C:\\Users");
        System.out.println("Arquivos a partir de: " + 
                diretorioAtual.toAbsolutePath());
        
        Files.walkFileTree(diretorioAtual, new Visitante());
        
    }

}
