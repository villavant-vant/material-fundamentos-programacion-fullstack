
class CPaciente {
    private String nombre;
    private int edad;
    private String telefono;
    private CMedico medicoAsignado;

    public CPaciente(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.medicoAsignado = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CMedico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(CMedico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
}
