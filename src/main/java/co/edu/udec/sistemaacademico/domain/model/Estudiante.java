package co.edu.udec.sistemaacademico.domain.model;

import co.edu.udec.sistemaacademico.domain.exceptions.EstudianteException;
import co.edu.udec.sistemaacademico.domain.valueobjects.CorreoElectronico;
import co.edu.udec.sistemaacademico.domain.valueobjects.Matricula;

public class Estudiante {

    private final Matricula matricula;
    private String nombre;
    private CorreoElectronico correo;
    private String grupo;

    public Estudiante(
            Matricula matricula,
            String nombre,
            CorreoElectronico correo,
            String grupo) {

        if (nombre == null || nombre.isBlank()) {
            throw new EstudianteException(
                    "El nombre no puede estar vacío");
        }

        this.matricula = matricula;
        this.nombre = nombre;
        this.correo = correo;
        this.grupo = grupo;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public CorreoElectronico getCorreo() {
        return correo;
    }

    public String getGrupo() {
        return grupo;
    }
}
