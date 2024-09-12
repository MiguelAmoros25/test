public class Paciente {
    private String curp;
    private String nombre;
    private String padecimiento;
    private String tratamiento;

    public Paciente(String curp, String nombre, String padecimiento, String tratamiento) {
        setCurp(curp);
        setNombre(nombre);
        setPadecimiento(padecimiento);
        setTratamiento(tratamiento);
    }

    public Paciente() {
        this("Sin CURP","Sin Nombre", "Sin Padecimiento","Sin Tratamiento");
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public java.lang.String toString() {
        return "CURP: " + curp +
                "\nNombre: " + nombre +
                "\nPadecimiento: " + padecimiento +
                "\nTratamiento: " + tratamiento ;

    }
}
