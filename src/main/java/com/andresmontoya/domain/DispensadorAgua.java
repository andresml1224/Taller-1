package com.andresmontoya.domain;

public class DispensadorAgua {

    public int serial;
    public String marca;
    public int cantMax;
    public int cantAct;
    public float temperatura;



    public int servir(int cantServida) {
        if (this.cantAct < cantServida) {
            System.out.println("No se puede servir");
            return cantAct;
        } else {
            this.cantAct = this.cantAct - cantServida;
            return cantAct;
        }

    }

    public int llenar(int cantLlenar, int cantidadLimite) {
        if (cantLlenar > cantidadLimite) {
            System.out.println("No es posible llenar mas de eso");
            return cantAct;
        } else {
            this.cantAct = this.cantAct + cantLlenar;
            return cantAct;
        }
    }

    public int vaciar() {
        this.cantAct = 0;
        return cantAct;
    }

    public float calentar(float nuevaTemp) {
        this.temperatura = this.temperatura + nuevaTemp;
        return temperatura;
    }

    public float enfriar(float nuevaTemp) {
        this.temperatura = this.temperatura - nuevaTemp;
        return temperatura;
    }

    public String mostrarNivel() {
        if (this.temperatura < 20) {
            return "El dispensador esta frio";
        } else {
            return "El dispensador esta caliente";
        }
    }
}