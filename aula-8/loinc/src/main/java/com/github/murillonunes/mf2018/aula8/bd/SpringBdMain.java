package com.github.murillonunes.mf2018.aula8.bd;

import com.github.murillonunes.mf2018.aula8.bd.repositorio.TermoRepositorio;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBdMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringBdMain.class.getPackage().getName());

        TermoRepositorio repo = applicationContext.getBean(TermoRepositorio.class);

        //repo.listarTodos().forEach(loincNum -> System.out.println("Método listar():" + loincNum));

        //System.out.println("Método buscarPorLoincNum(): " + repo.buscarPorLoincNum("10003-2"));

        System.out.println("Método buscarPorComponent(): " + repo.buscarPorComponent("R wave"));

        //System.out.println("Método buscarPorLongName(): " + repo.buscarPorLongName(
        //        "DBG Ab [Presence] in Serum or Plasma from Blood product unit"));

        //System.out.println("Método buscarPorShortName(): " + repo.buscarPorShortName("R wave dur L-V1"));

        applicationContext.close();

        System.out.println("Fim!");
    }

}
