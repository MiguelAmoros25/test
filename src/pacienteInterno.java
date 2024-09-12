public class pacienteInterno extends Paciente{
    private String area;
    private byte sala;
    private byte cama;

    public pacienteInterno(String curp, String nombre, String padecimiento, String tratamiento, String area, byte sala, byte cama) {
        super(curp, nombre, padecimiento, tratamiento);
        setArea(area);
        setSala(sala);
        setCama(cama);
    }

    public pacienteInterno() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimiento", "Sin Tratamiento", "Sin Area", (byte) 1, (byte) 1);
    }

    public String getArea() {
        return area;

    }

    public void setArea(String area) {
        this.area = area;
    }

    public byte getSala() {
        return sala;
    }

    public void setSala(byte sala) {
        this.sala = sala;
    }

    public byte getCama() {
        return cama;
    }

    public void setCama(byte cama) {
        this.cama = cama;
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nArea: " + area +
                "\nSala: " + sala +
                "\ncama: " + cama;

    }
}
