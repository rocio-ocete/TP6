public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Milagritos Ocete", "Argentina");
        Autor a2 = new Autor("A002", "Andrecito Pambicito", "Chile");
        Autor a3 = new Autor("A003", "Horacio Caniche", "Uruguay");

        biblioteca.agregarLibro("L001", "Dos choris y una coca porfavor", 1917, a1);
        biblioteca.agregarLibro("L002", "Esquere modo diavlo", 1947, a2);
        biblioteca.agregarLibro("L003", "Mentira colgala", 1963, a3);
        biblioteca.agregarLibro("L004", "Al toque roque", 1985, a1);
        biblioteca.agregarLibro("L005", "Ay Adela yo te doy mi mortadela", 1998, a2);

        biblioteca.listarLibros();

        System.out.println("\nBuscando libro con ISBN L003:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("L003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        biblioteca.filtrarLibrosPorAnio(1997);

        biblioteca.eliminarLibro("L005");
        biblioteca.listarLibros();

        System.out.println("\nTotal de libros: " + biblioteca.obtenerCantidadLibros());

        biblioteca.mostrarAutoresDisponibles();
    }
}