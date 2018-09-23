/*
 * Copyright (c) 2018. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.murillonunes.mf2018.aula3.dir.arquivos;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Murillo Nunes
 * @since Setembro de 2018
 * @version 1.0
 */
public class Visitante extends SimpleFileVisitor<Path> {
    
    @Override
    public final FileVisitResult visitFile(final Path file, 
            final BasicFileAttributes attribs) throws IOException {
        
        if (file.toFile().isDirectory()) {
            System.out.println(file.toFile().getPath());
        }
        
        return FileVisitResult.CONTINUE;
    }
    
}
