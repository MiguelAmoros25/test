import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        pacienteInterno pacienteInterno;
        PacienteExterno pacienteExterno;
        pacienteTraslado pacienteTraslado;
        pacienteInterconsulta pacienteInterconsulta;
        byte opc;

        opc = Byte.parseByte(JOptionPane.showInputDialog("1. Interno\n2. Externo\n3. Traslado\n4. Interconsulta"));

        switch (opc) {
            case 1:
                pacienteInterno = new pacienteInterno();
                pacienteInterno.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteInterno.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteInterno.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteInterno.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));
                pacienteInterno.setArea(JOptionPane.showInputDialog("Area: "));
                pacienteInterno.setSala(Byte.parseByte(JOptionPane.showInputDialog("Sala: ")));
                pacienteInterno.setCama(Byte.parseByte(JOptionPane.showInputDialog("Cama: ")));


                JOptionPane.showMessageDialog(null, pacienteInterno.toString());
                break;

            case 2:
                pacienteExterno = new PacienteExterno();
                pacienteExterno.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteExterno.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteExterno.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteExterno.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));
                pacienteExterno.setMedicoTratnte(JOptionPane.showInputDialog("Medico Tratante: "));
                pacienteExterno.setConsultorio(Byte.parseByte(JOptionPane.showInputDialog("Consultorio: ")));
                pacienteExterno.setFecha(JOptionPane.showInputDialog("Fecha: "));
                pacienteExterno.setHora(JOptionPane.showInputDialog("Hora: "));


                JOptionPane.showMessageDialog(null, pacienteExterno.toString());
                break;

            case 3:
                pacienteTraslado = new pacienteTraslado();
                pacienteTraslado.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteTraslado.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteTraslado.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteTraslado.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));
                pacienteTraslado.setHospitalProcedencia(JOptionPane.showInputDialog("Hospital de Procedencia: "));


                JOptionPane.showMessageDialog(null, pacienteTraslado.toString());
                break;

            case 4:
                pacienteInterconsulta = new pacienteInterconsulta();
                pacienteInterconsulta.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteInterconsulta.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteInterconsulta.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteInterconsulta.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));
                pacienteInterconsulta.setArea(JOptionPane.showInputDialog("Area: "));
                pacienteInterconsulta.setSala(Byte.parseByte(JOptionPane.showInputDialog("Sala: ")));
                pacienteInterconsulta.setCama(Byte.parseByte(JOptionPane.showInputDialog("Cama: ")));
                pacienteInterconsulta.setEspecialistaConsultado(JOptionPane.showInputDialog("Especialista Consultado: "));


                JOptionPane.showMessageDialog(null, pacienteInterconsulta.toString());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
}
