public class pacienteTraslado extends Paciente{
    private String hospitalProcedencia;

    public String getHospitalProcedencia() {
        return hospitalProcedencia;
    }

    public void setHospitalProcedencia(String hospitalProcedencia) {
        this.hospitalProcedencia = hospitalProcedencia;
    }

    public pacienteTraslado(String curp, String nombre, String padecimiento, String tratamiento, String hospitalProcedencia, byte b, byte b1, String sinMedicoTratante, String sinFecha, String sinHora, byte b2, String sinHospitalDeProcedencia) {
        super(curp, nombre, padecimiento, tratamiento);
        setHospitalProcedencia(hospitalProcedencia);
    }

    public pacienteTraslado() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimiento", "Sin Tratamiento", "Sin Area", (byte) 1, (byte) 1, "Sin Medico Tratante", "Sin Fecha", "Sin Hora", (byte) 1, "Sin Hospital De Procedencia" );
        }

    @Override
    public String toString() {
        return super.toString()+
                "\nHospital De Procedencia: " + hospitalProcedencia ;


}
    }
