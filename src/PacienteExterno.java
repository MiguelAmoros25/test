public class PacienteExterno extends Paciente{
    private String medicoTratnte;
    private String fecha;
    private String hora;
    private byte consultorio;

    public PacienteExterno(String curp, String nombre, String padecimiento, String tratamiento, String medicoTratnte, byte b, byte b1, String fecha, String hora, String sinHora, byte consultorio) {
        super(curp, nombre, padecimiento, tratamiento);
        setMedicoTratnte(medicoTratnte);
        setFecha(fecha);
        setHora(hora);
        setConsultorio(consultorio);

    }

    public PacienteExterno() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimiento", "Sin Tratamiento", "Sin Area", (byte) 1, (byte) 1, "Sin Medico Tratante", "Sin Fecha", "Sin Hora", (byte) 1 );
    }

    public String getMedicoTratnte() {
        return medicoTratnte;
    }

    public void setMedicoTratnte(String medicoTratnte) {
        this.medicoTratnte = medicoTratnte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public byte getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(byte consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMedico Tratante: " + medicoTratnte +
                "\nFecha: " + fecha +
                "\nHora: " + hora +
                "\nConsultorio; " + consultorio;

    }
}
