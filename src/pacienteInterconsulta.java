public class pacienteInterconsulta extends pacienteInterno{
    private String especialistaConsultado;

    public String getEspecialistaConsultado() {
        return especialistaConsultado;
    }

    public void setEspecialistaConsultado(String especialistaConsultado) {
        this.especialistaConsultado = especialistaConsultado;
    }

    public pacienteInterconsulta(String curp, String nombre, String padecimiento, String tratamiento, String area, byte sala, byte cama, String especialistaConsultado, String sinFecha, String sinHora, byte b, String sinHospitalDeProcedencia, String sinEspecialistaConsultado) {
        super(curp, nombre, padecimiento, tratamiento, area, sala, cama);
       setEspecialistaConsultado(especialistaConsultado);
    }

    public pacienteInterconsulta() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimiento", "Sin Tratamiento", "Sin Area", (byte) 1, (byte) 1, "Sin Medico Tratante", "Sin Fecha", "Sin Hora", (byte) 1, "Sin Hospital De Procedencia", "Sin Especialista Consultado" );

    }

    @Override
    public String toString() {
        return super.toString()+
                "\nEspecialista Consultado: " + especialistaConsultado;
}
    }
