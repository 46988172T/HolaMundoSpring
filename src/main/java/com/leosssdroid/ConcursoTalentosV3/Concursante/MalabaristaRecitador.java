package com.leosssdroid.ConcursoTalentosV3.Concursante;

import com.leosssdroid.ConcursoTalentosV3.Actividades.Poema;

/**
 * Created by Leosss on 10/10/2016.
 */
public class MalabaristaRecitador extends Malabarista {

    private Poema poema;

    public MalabaristaRecitador(Poema poema) {
        this.poema = poema;
    }

    public MalabaristaRecitador(int pelotas, Poema poema) {
        super(pelotas);
        this.poema = poema;
    }

    public void ejecutar(){
        super.ejecutar();
        System.out.println("Mientras recita...");
        poema.recitar();
        System.out.println("Termina la actuación...");
    }
}
