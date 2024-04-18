import com.aluracursos.screematch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Vivo o muerto: el expediente García");
        miPelicula.setFechaDeLanzamiento(2024);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.nuestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Total de las evaluaciones hechas: "+miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("El valor total de la media de las evaluaciones es: "+miPelicula.calculaMedia());
    }
}