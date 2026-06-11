package co.edu.udec.sistemaacademico;
import co.edu.udec.sistemaacademico.application.dto.ObtenerNotaControlResponse;
import co.edu.udec.sistemaacademico.application.dto.ListarControlesAlumnoResponse;
import co.edu.udec.sistemaacademico.application.dto.ObtenerPromedioGrupoResponse;
import co.edu.udec.sistemaacademico.application.dto.ListarControlesGrupoResponse;
import co.edu.udec.sistemaacademico.application.dto.AlumnosSobrePromedioResponse;
import co.edu.udec.sistemaacademico.application.dto.RegistrarControlEscritoRequest;


import co.edu.udec.sistemaacademico.application.dto.EliminarEstudianteResponse;

import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.ActualizarEstudianteResponse;


import co.edu.udec.sistemaacademico.application.dto.ListarEstudianteResponse;
import java.util.List;
import co.edu.udec.sistemaacademico.application.dto.BuscarEstudianteResponse;
import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteRequest;
import co.edu.udec.sistemaacademico.application.dto.RegistrarEstudianteResponse;
import co.edu.udec.sistemaacademico.infrastructure.config.DependencyContainer;
import co.edu.udec.sistemaacademico.infrastructure.controller.EstudianteController;

public class Main {

    public static void main(String[] args) {

        DependencyContainer container =
                new DependencyContainer();

        EstudianteController controller =
                container.estudianteController();

        RegistrarEstudianteResponse response =
                controller.registrar(
                        new RegistrarEstudianteRequest(
                                "2025001",
                                "Kevin Gonzalez",
                                "kevin@gmail.com",
                                "5A"
                        )
                );

        controller.registrar(
                new RegistrarEstudianteRequest(
                        "2025002",
                        "Maria Perez",
                        "maria@gmail.com",
                        "6A"
                )
        );

        controller.registrar(
                new RegistrarEstudianteRequest(
                        "2025003",
                        "Juan Torres",
                        "juan@gmail.com",
                        "6A"
                )
        );



        controller.registrar(
                new RegistrarEstudianteRequest(
                        "2025002",
                        "Maria Perez",
                        "maria@gmail.com",
                        "6A"
                )
        );


        controller.registrar(
                new RegistrarEstudianteRequest(
                        "2025003",
                        "Juan Torres",
                        "juan@gmail.com",
                        "6A"
                )
        );
        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C001",
                        "2025001",
                        4.5,
                        "2025-06-10"
                )
        );

        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C001",
                        "2025001",
                        4.5,
                        "2026-06-10"
                )
        );

        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C002",
                        "2025002",
                        3.8,
                        "2026-06-10"
                )
        );

        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C003",
                        "2025003",
                        4.9,
                        "2026-06-10"
                )
        );

        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C002",
                        "2025001",
                        3.8,
                        "2025-06-15"
                )
        );


        controller.registrarControl(
                new RegistrarControlEscritoRequest(
                        "C003",
                        "2025001",
                        4.9,
                        "2025-06-20"
                )
        );


        System.out.println("=== ESTUDIANTE REGISTRADO ===");

        System.out.println(
                "Matricula: "
                        + response.matricula()
        );

        System.out.println(
                "Nombre: "
                        + response.nombre()
        );

        System.out.println(
                "Correo: "
                        + response.correo()
        );

        System.out.println(
                "Grupo: "
                        + response.grupo()
        );

        BuscarEstudianteResponse estudiante =
                controller.buscar("2025001");

        System.out.println();

        System.out.println(
                "=== ESTUDIANTE ENCONTRADO ==="
        );

        System.out.println(
                "Matricula: "
                        + estudiante.matricula()
        );

        System.out.println(
                "Nombre: "
                        + estudiante.nombre()
        );

        System.out.println(
                "Correo: "
                        + estudiante.correo()
        );

        System.out.println(
                "Grupo: "
                        + estudiante.grupo()
        );

        System.out.println();

        System.out.println(
                "=== LISTA DE ESTUDIANTES ==="
        );

        List<ListarEstudianteResponse> estudiantes =
                controller.listar();

        for (ListarEstudianteResponse e : estudiantes) {

            System.out.println(
                    "Matricula: " + e.matricula()
            );

            System.out.println(
                    "Nombre: " + e.nombre()
            );

            System.out.println(
                    "Correo: " + e.correo()
            );

            System.out.println(
                    "Grupo: " + e.grupo()
            );

            System.out.println("------------------");
        }

        System.out.println();

        ActualizarEstudianteResponse actualizado =
                controller.actualizar(
                        new ActualizarEstudianteRequest(
                                "2025001",
                                "Kevin Antonio Gonzalez",
                                "kevin@unicartagena.edu.co",
                                "6A"
                        )
                );

        System.out.println(
                "=== ESTUDIANTE ACTUALIZADO ==="
        );

        System.out.println(
                "Matricula: "
                        + actualizado.matricula()
        );

        System.out.println(
                "Nombre: "
                        + actualizado.nombre()
        );

        System.out.println(
                "Correo: "
                        + actualizado.correo()
        );

        System.out.println(
                "Grupo: "
                        + actualizado.grupo()
        );

        System.out.println();

        EliminarEstudianteResponse eliminado =
                controller.eliminar(
                        "2025001"
                );

        System.out.println(
                "=== ELIMINAR ESTUDIANTE ==="
        );

        System.out.println(
                eliminado.mensaje()
        );

        System.out.println();

        BuscarEstudianteResponse verificacion =
                controller.buscar(
                        "2025001"
                );

        System.out.println(
                "=== VERIFICACION ==="
        );

        if (verificacion == null) {

            System.out.println(
                    "Estudiante no encontrado"
            );
        }

        System.out.println();

        System.out.println(
                "=== CONSULTA NOTA CONTROL ==="
        );

        ObtenerNotaControlResponse nota =
                controller.obtenerNota(
                        "C001",
                        "2025001"
                );

        if (nota != null) {

            System.out.println(
                    "Control: "
                            + nota.idControl()
            );

            System.out.println(
                    "Alumno: "
                            + nota.matriculaAlumno()
            );

            System.out.println(
                    "Nota: "
                            + nota.nota()
            );
        }

        System.out.println();

        System.out.println(
                "=== CONTROLES DEL ALUMNO ==="
        );

        List<ListarControlesAlumnoResponse> controles =
                controller.listarControlesAlumno(
                        "2025001"
                );

        for (ListarControlesAlumnoResponse c : controles) {

            System.out.println(
                    "Control: " + c.idControl()
            );

            System.out.println(
                    "Nota: " + c.nota()
            );

            System.out.println(
                    "Fecha: " + c.fecha()
            );

            System.out.println("----------------");
        }


        System.out.println();

        System.out.println(
                "=== PROMEDIO DEL GRUPO ==="
        );

        ObtenerPromedioGrupoResponse promedio =
                controller.obtenerPromedioGrupo(
                        "6A"
                );

        System.out.println(
                "Grupo: "
                        + promedio.grupo()
        );

        System.out.println(
                "Promedio: "
                        + promedio.promedio()
        );

        System.out.println();
        System.out.println(
                "=== CONSULTA 1 ==="
        );

        ObtenerNotaControlResponse notaConsulta =
                controller.obtenerNota(
                        "C001",
                        "2025001"
                );

        System.out.println(
                "Control: " + nota.idControl()
        );

        System.out.println(
                "Alumno: " + nota.matriculaAlumno()
        );

        System.out.println(
                "Nota: " + nota.nota()
        );

        System.out.println();
        System.out.println(
                "=== CONSULTA 2 ==="
        );

        for (ListarControlesAlumnoResponse c :
                controller.listarControlesAlumno(
                        "2025001"
                )) {

            System.out.println(
                    "Control: " +
                            c.idControl()
            );

            System.out.println(
                    "Nota: " +
                            c.nota()
            );

            System.out.println(
                    "-------------"
            );
        }

        System.out.println();
        System.out.println(
                "=== CONSULTA 3 ==="
        );

        ObtenerPromedioGrupoResponse promedioGrupo =
                controller.obtenerPromedioGrupo(
                        "6A"
                );

        System.out.println(
                "Grupo: " +
                        promedio.grupo()
        );

        System.out.println(
                "Promedio: " +
                        promedio.promedio()
        );
        System.out.println();
        System.out.println(
                "=== CONSULTA 4 ==="
        );

        for (ListarControlesGrupoResponse c :
                controller.listarControlesGrupo(
                        "6A"
                )) {

            System.out.println(
                    "Control: " +
                            c.idControl()
            );

            System.out.println(
                    "Alumno: " +
                            c.nombreAlumno()
            );

            System.out.println(
                    "Grupo: " +
                            c.grupo()
            );

            System.out.println(
                    "Nota: " +
                            c.nota()
            );

            System.out.println(
                    "-------------"
            );
        }
        System.out.println();
        System.out.println(
                "=== CONSULTA 5 ==="
        );

        for (AlumnosSobrePromedioResponse a :
                controller.alumnosSobrePromedio()) {

            System.out.println(
                    "Matricula: " +
                            a.matricula()
            );

            System.out.println(
                    "Nombre: " +
                            a.nombre()
            );

            System.out.println(
                    "Grupo: " +
                            a.grupo()
            );

            System.out.println(
                    "Nota: " +
                            a.nota()
            );

            System.out.println(
                    "-------------"
            );
        }


    }





}