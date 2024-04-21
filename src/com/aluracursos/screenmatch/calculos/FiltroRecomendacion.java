package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4){
            System.out.println("Muy recomendada actualmente");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("Entre las populares del momento");
        } else {
            System.out.println("Para ver despues");
        }
    }
}
