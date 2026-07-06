package Sesion8;

public class Principal {
    public static void main(String[] args) {
        CMedico medico1 = new CMedico("Juan","neurologia","C10");
        CPaciente paciente1 = new CPaciente("John",20,"9999999999");
        CPaciente paciente2 = new CPaciente("Harumi",30,"8192929292");
        medico1.atenderPaciente(paciente2); // asociacion
    }
}
