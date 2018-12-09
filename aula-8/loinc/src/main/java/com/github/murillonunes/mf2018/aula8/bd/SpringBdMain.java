package com.github.murillonunes.mf2018.aula8.bd;

import com.github.murillonunes.mf2018.aula8.bd.repositorio.TermoRepositorio;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBdMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringBdMain.class.getPackage().getName());

        TermoRepositorio repo = applicationContext.getBean(TermoRepositorio.class);

        repo.listarTodos().forEach(loincNum -> System.out.println("Método listar():" + loincNum));

        //System.out.println("Método buscarPorLoincNum(): " + repo.buscarPorLoincNum("10003-2"));

        //System.out.println("Método buscarPorComponent(): " + repo.buscarPorComponent("lead V"));

        repo.buscarPorLoincNum("100").forEach(loincNum -> System.out.println("Método buscarPorLoincNum(): " + loincNum));

        repo.buscarPorComponent("R wave duration.lead II").forEach(loincNum -> System.out.println("Método buscarPorComponent(): " + loincNum));

        repo.buscarPorLongName("R wave duration in lead AVR").forEach((loincNum -> System.out.println("Método buscarPorLongName(): " + loincNum)));

        repo.buscarPorShortName("R wave dur L-I").forEach(loincNum -> System.out.println("Método buscarPorShortName(): " + loincNum));

        applicationContext.close();

        System.out.println("Fim!");
    }

}
