public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Vivo o muerto: el expediente García";
        miPelicula.fechaDeLanzamiento = 2024;
        miPelicula.duracionEnMinutos = 160;

        miPelicula.nuestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("suma de las evaluaciones: "+miPelicula.sumaDeLasEvaluaciones);
        System.out.println("Total de las evaluaciones hechas: "+miPelicula.totalDeLasEvaluaciones);
        System.out.println("El valor total de la media de las evaluaciones es: "+miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.duracionEnMinutos = 250;

        otraPelicula.nuestraFichaTecnica();
    }
}
