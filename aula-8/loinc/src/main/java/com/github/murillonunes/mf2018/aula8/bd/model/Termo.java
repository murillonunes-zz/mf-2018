package com.github.murillonunes.mf2018.aula8.bd.model;

public class Termo {

    private String loincNum;

    private String component;

    private String scaleTyp;

    private String longCommonName;

    private String shortName;

    public Termo(String loincNum, String component, String scaleTyp, String longCommonName, String shortName) {
        this.loincNum = loincNum;
        this.component = component;
        this.scaleTyp = scaleTyp;
        this.longCommonName = longCommonName;
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "Termo{" +
                "loincNum='" + loincNum + '\'' +
                ", component='" + component + '\'' +
                ", scaleTyp='" + scaleTyp + '\'' +
                ", longCommonName='" + longCommonName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
