package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Vivo o muerto: el expediente García", 2024);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.evalua(6);
        var peliculaDeJean = new Pelicula("Rapidos y furiosos", 2001);
        peliculaDeJean.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJean);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificable() > 2){
                System.out.println(pelicula.getClasificable());
            }
        }

    }
}
