package co.edu.udec.sistemaacademico.domain.factory;

import co.edu.udec.sistemaacademico.domain.model.Estudiante;
import co.edu.udec.sistemaacademico.domain.valueobjects.CorreoElectronico;
import co.edu.udec.sistemaacademico.domain.valueobjects.Matricula;

public class EstudianteFactory {

    public static Estudiante crear(
            String matricula,
            String nombre,
            String correo,
            String grupo) {

        return new Estudiante(
                new Matricula(matricula),
                nombre,
                new CorreoElectronico(correo),
                grupo
        );
    }
}
