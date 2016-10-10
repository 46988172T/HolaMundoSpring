package com.leosssdroid.ProyectoInterpreteV1;

/**
 * Created by Leosss on 09/10/2016.
 */
public class Traductor {
    private InterpreteEs interpreteEs;
    private String nombre;

    public void hablar(){
        this.interpreteEs.saludar();
        System.out.println(nombre);
        this.interpreteEs.despedirse();
    }

    public InterpreteEs getInterpreteEs() {
        return interpreteEs;
    }

    public void setInterpreteEs(InterpreteEs interpreteEs) {
        this.interpreteEs = interpreteEs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
