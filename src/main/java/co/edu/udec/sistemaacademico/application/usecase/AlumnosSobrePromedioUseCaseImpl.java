package co.edu.udec.sistemaacademico.application.usecase;

import co.edu.udec.sistemaacademico.application.dto.AlumnosSobrePromedioResponse;
import co.edu.udec.sistemaacademico.application.ports.ControlEscritoRepository;
import co.edu.udec.sistemaacademico.application.ports.EstudianteRepository;
import co.edu.udec.sistemaacademico.domain.model.ControlEscrito;
import co.edu.udec.sistemaacademico.domain.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class AlumnosSobrePromedioUseCaseImpl
        implements AlumnosSobrePromedioUseCase {

    private final ControlEscritoRepository controlRepository;
    private final EstudianteRepository estudianteRepository;

    public AlumnosSobrePromedioUseCaseImpl(
            ControlEscritoRepository controlRepository,
            EstudianteRepository estudianteRepository) {

        this.controlRepository = controlRepository;
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<AlumnosSobrePromedioResponse> ejecutar() {

        double suma = 0;
        int cantidad = 0;

        for (ControlEscrito control :
                controlRepository.listarTodos()) {

            suma += control.getNota();
            cantidad++;
        }

        double promedio = suma / cantidad;

        List<AlumnosSobrePromedioResponse> resultado =
                new ArrayList<>();

        for (ControlEscrito control :
                controlRepository.listarTodos()) {

            if (control.getNota() > promedio) {

                Estudiante estudiante =
                        estudianteRepository
                                .buscarPorMatricula(
                                        control.getMatriculaAlumno()
                                );

                if (estudiante != null) {

                    resultado.add(
                            new AlumnosSobrePromedioResponse(
                                    estudiante.getMatricula().value(),
                                    estudiante.getNombre(),
                                    estudiante.getGrupo(),
                                    control.getNota()
                            )
                    );
                }
            }
        }

        return resultado;
    }
}
