package co.edu.udec.sistemaacademico.domain.model;

import co.edu.udec.sistemaacademico.domain.exceptions.AsignaturaException;
import co.edu.udec.sistemaacademico.domain.valueobjects.CodigoAsignatura;

public class Asignatura {

    private final CodigoAsignatura codigo;
    private String nombre;
    private int creditos;

    public Asignatura(
            CodigoAsignatura codigo,
            String nombre,
            int creditos) {

        if (nombre == null || nombre.isBlank()) {
            throw new AsignaturaException(
                    "El nombre de la asignatura es obligatorio");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public CodigoAsignatura getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }
}