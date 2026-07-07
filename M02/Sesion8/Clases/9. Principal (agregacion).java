
class Principal {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===");

        // Crear libros independientes (pueden existir sin biblioteca)
        CLibro libro1 = new CLibro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7");
        CLibro libro2 = new CLibro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-84-376-0855-6");
        CLibro libro3 = new CLibro("1984", "George Orwell", "978-84-376-0886-0");
        CLibro libro4 = new CLibro("El Principito", "Antoine de Saint-Exupéry", "978-84-376-0315-5");

        System.out.println("✓ Libros creados exitosamente (existen independientemente)");

        // Crear biblioteca
        System.out.println("\n--- CREANDO BIBLIOTECA ---");
        CBiblioteca biblioteca = new CBiblioteca("Biblioteca Central Municipal");
        System.out.println("✓ Biblioteca '" + biblioteca.getNombre() + "' creada");

        // Mostrar biblioteca vacía
        biblioteca.mostrarLibros();

        // Agregar libros a la biblioteca (agregación)
        System.out.println("\n--- AGREGANDO LIBROS A LA BIBLIOTECA ---");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        // Mostrar todos los libros de la biblioteca
        biblioteca.mostrarLibros();
    }
}
