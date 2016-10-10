package com.leosssdroid.ConcursoTalentosV3.Concursante;

import com.leosssdroid.ConcursoTalentosV3.Actividades.Instrumento;

/**
 * Created by Leosss on 10/10/2016.
 */
public class Musico implements Concursante {

    private String cancion;
    private Instrumento instrumento;

    public void ejecutar() {
        System.out.println("Tocando "+cancion);
        instrumento.tocar();
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
}
