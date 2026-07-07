
class Principal {
    public static void main(String[] args){
        CBiblioteca b1 = new CBiblioteca();
        System.out.println("Nombre de biblioteca: "+ b1.getNombre());
        CLibro l1 = new CLibro("Libro 1","R1","LG1");
        CLibro l2 = new CLibro("Libro 2","R2","LG2");
        CLibro l3 = new CLibro("Libro 3","R3","LG3");
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarLibro(l3);

        int posicion = b1.buscarLibroXTitulo("Librokjsdhjahdkjhasdjsad");
        if(posicion != -1){
            System.out.println("Libro encontrado en la posicion "+ posicion);
        }else{
            System.out.println("Libro no encontrado");
        }


    }
}
