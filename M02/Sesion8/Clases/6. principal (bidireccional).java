
class principal {
    public static void main(String[] args) {
        CMedico medico1 = new CMedico("Armas","Cardiologia","C10");
        CMedico medico2 = new CMedico("Andrade","Neurologia","C15");
        CPaciente paciente1 = new CPaciente("Harumi", 20, "95999999");
        CPaciente paciente2 = new CPaciente("Luis", 30, "90000000");
        medico1.atenderPaciente(paciente1);
        medico2.atenderPaciente(paciente2);
    }
}
