package Sesion8.ArrayList;

public class CTriangulo {
    // Atributos
    private int lado1;
    private int lado2;
    private int lado3;

    // Constructor 1
    public CTriangulo(int lado1, int lado2, int prLado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        lado3 = prLado3;
    }
    // Constructor 2 - Crea triangulos equilateros
    public CTriangulo(int prLado){
        this.lado1 = prLado;
        this.lado2 = prLado;
        this.lado3 = prLado;
    }
    // Constructor 3 - Crea triangulo por defecto
    public CTriangulo(){
        this.lado1 = 1;
        this.lado2 = 1;
        this.lado3 = 1;
    }


    // Metodos
    public int obtenerPerimetro(){
        return lado1 + lado2 + lado3;
    }
    private double obtenerSemiPerimetro(){
        return this.obtenerPerimetro()/2.0;
    }
    public double obtenerArea(){
        double s = this.obtenerSemiPerimetro();
        double resultado = (s)*(s-lado1)*(s-lado2)*(s-lado3);
        return resultado;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }
}
