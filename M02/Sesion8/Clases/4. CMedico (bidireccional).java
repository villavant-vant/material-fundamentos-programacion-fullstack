
class CMedico {
    private String nombre;
    private String especialidad;
    private String cedula;
    private CPaciente pacienteActual; // Asociación 1:1

    public CMedico(String nombre, String especialidad, String cedula) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cedula = cedula;
        this.pacienteActual = null;
    }

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

    public CPaciente getPacienteActual() {
        return pacienteActual;
    }

    public void setPacienteActual(CPaciente pacienteActual) {
        this.pacienteActual = pacienteActual;
    }

    // Método para atender paciente
    public void atenderPaciente(CPaciente paciente) {
        if (this.pacienteActual != null) {
            System.out.println("El Dr. " + this.nombre + " ya está atendiendo a otro paciente.");
            return;
        }

        // Establecer la relación 1:1
        this.pacienteActual = paciente;
        paciente.setMedicoAsignado(this);
        System.out.println("=== INICIANDO CONSULTA ===");
        System.out.println("Dr. " + this.nombre + " (" + this.especialidad + ")");
        System.out.println("Atendiendo a: " + paciente.getNombre());

    }


}
