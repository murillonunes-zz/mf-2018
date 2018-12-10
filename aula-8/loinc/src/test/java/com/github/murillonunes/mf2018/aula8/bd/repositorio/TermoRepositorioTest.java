package com.github.murillonunes.mf2018.aula8.bd.repositorio;

import com.github.murillonunes.mf2018.aula8.bd.config.BdConfig;
import com.github.murillonunes.mf2018.aula8.bd.model.Termo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BdConfig.class})
public class TermoRepositorioTest {

    @Autowired
    private TermoRepositorio repo;

    @Before
    public void setup() {}

    @Test
    public void buscaPorLoincNumSucesso() {
        List<Termo> listaTermos = repo.buscarPorLoincNum("10000-8");
        Assert.assertEquals(1, listaTermos.size());
    }

    @Test
    public void buscaPorLoincNumFalha() {
        List<Termo> listaTermos = repo.buscarPorLoincNum("99999");
        Assert.assertEquals(0, listaTermos.size());
    }

    @Test
    public void buscaPorComponentSucesso() {
        List<Termo> listaTermos = repo.buscarPorComponent("R wave duration.lead II");
        Assert.assertEquals(1, listaTermos.size());
    }

    @Test
    public void buscaPorComponentFalha() {
        List<Termo> listaTermos = repo.buscarPorComponent("Componente Teste");
        Assert.assertEquals(0, listaTermos.size());
    }

    @Test
    public void buscaPorLongNameSucesso() {
        List<Termo> listaTermos = repo.buscarPorLongName("R wave duration in lead V6");
        Assert.assertEquals(1, listaTermos.size());
    }

    @Test
    public void buscaPorLongNameFalha() {
        List<Termo> listaTermos = repo.buscarPorLongName("Long Name Teste");
        Assert.assertEquals(0, listaTermos.size());
    }

    @Test
    public void buscaPorShortNameSucesso() {
        List<Termo> listaTermos = repo.buscarPorShortName("R wave dur L-V1");
        Assert.assertEquals(1, listaTermos.size());
    }

    @Test
    public void buscaPorShortNameFalha() {
        List<Termo> listaTermos = repo.buscarPorShortName("Short Name Teste");
        Assert.assertEquals(0, listaTermos.size());
    }

}