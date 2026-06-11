package co.edu.udec.sistemaacademico.domain.model;

public class ControlEscrito {

    private final String idControl;
    private final String matriculaAlumno;
    private final double nota;
    private final String fecha;

    public ControlEscrito(
            String idControl,
            String matriculaAlumno,
            double nota,
            String fecha) {

        this.idControl = idControl;
        this.matriculaAlumno = matriculaAlumno;
        this.nota = nota;
        this.fecha = fecha;
    }

    public String getIdControl() {
        return idControl;
    }

    public String getMatriculaAlumno() {
        return matriculaAlumno;
    }

    public double getNota() {
        return nota;
    }

    public String getFecha() {
        return fecha;
    }
}
