package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.ObtenerPromedioGrupoResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

public class ObtenerPromedioGrupoUseCaseImpl
        implements ObtenerPromedioGrupoUseCase {

    private final ControlEscritoRepository controlRepository;
    private final EstudianteRepository estudianteRepository;

    public ObtenerPromedioGrupoUseCaseImpl(
            ControlEscritoRepository controlRepository,
            EstudianteRepository estudianteRepository) {

        this.controlRepository = controlRepository;
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public ObtenerPromedioGrupoResponse ejecutar(
            String grupo) {

        double suma = 0;
        int cantidad = 0;

        for (ControlEscrito control :
                controlRepository.listarTodos()) {

            Estudiante estudiante =
                    estudianteRepository.buscarPorMatricula(
                            control.getMatriculaAlumno()
                    );

            if (estudiante != null &&
                    estudiante.getGrupo().equals(grupo)) {

                suma += control.getNota();
                cantidad++;
            }
        }

        double promedio = 0;

        if (cantidad > 0) {
            promedio = suma / cantidad;
        }

        return new ObtenerPromedioGrupoResponse(
                grupo,
                promedio
        );
    }
}