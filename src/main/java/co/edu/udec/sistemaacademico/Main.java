package co.edu.udec.sistemaacademico;


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


    }
}