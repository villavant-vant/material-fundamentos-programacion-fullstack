
class CAuto extends CVehiculo { // CAuto es hijo de CVehiculo - Herencia
    private int numeroPuertas;

    public CAuto(String marca, String modelo, String color,  int numeroPuertas) {
        super(marca, modelo, color);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar(){
        System.out.print("El AUTO esta acelerando");
    }

    @Override
    public String toString() {
        return this.marca + " - " +  this.modelo + " - " + this.color + " - " + this.numeroPuertas;
    }
}
