
import java.util.ArrayList;

class ArrayListClase {
    public static void main(String[] args) {
        CTriangulo tr1 = new CTriangulo(6,8,9);
        CTriangulo tr2 = new CTriangulo(7,7,7);
        CTriangulo tr3 = new CTriangulo(7,5,6);
        CTriangulo tr4 = new CTriangulo(8);

        ArrayList<CTriangulo> triangulos = new ArrayList<CTriangulo>();
        triangulos.add(tr1);
        triangulos.add(tr2);
        triangulos.add(tr3);

        for(int i = 0; i < triangulos.size(); i++){
            CTriangulo aux = triangulos.get(i);
            System.out.println("Lado 1 " +aux.getLado1());
            System.out.println("Lado 2 " +aux.getLado2());
            System.out.println("Lado 3 " +aux.getLado3());

        }

    }
}
