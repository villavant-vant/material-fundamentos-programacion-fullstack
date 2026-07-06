package Sesion8;

public class CMedico {
    // Atributos
    private String nombre;
    private String especialidad;
    private String cedula;
    private CPaciente pacienteActual;


    //Constructor
    public CMedico(String nombre, String especialidad, String cedula) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cedula = cedula;
    }
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Metodos
    public void atenderPaciente(CPaciente paciente) { // Asociacion  El doctor se asocia al Paciente para atenderlo
        System.out.println("=== ATENDER PACIENTE ===");
        this.pacienteActual = paciente;
        System.out.println("El doctor " + this.nombre + " esta atentiendo al paciente " + paciente.getNombre());
    }
}
