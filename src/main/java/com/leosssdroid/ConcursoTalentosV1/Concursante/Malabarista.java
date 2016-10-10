package com.leosssdroid.ConcursoTalentosV1.Concursante;

/**
 * Created by Leosss on 10/10/2016.
 */
public class Malabarista implements Concursante{
    private int pelotas = 5;

    public Malabarista() {
    }

    public Malabarista(int pelotas) {
        this.pelotas = pelotas;
    }

    public int getPelotas() {
        return pelotas;
    }

    public void setPelotas(int pelotas) {
        this.pelotas = pelotas;
    }

    public void ejecutar() {
        System.out.println("Malabar con "+pelotas+" pelotas");
    }
}
