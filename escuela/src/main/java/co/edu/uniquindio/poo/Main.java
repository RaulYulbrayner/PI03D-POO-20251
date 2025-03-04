package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Escuela escuela = new Escuela("CASD", "123");

        //Creamos a los docentes
        Docente docente1 = new Docente("Raul Rivera", "Ingeniero");
        Docente docente2 = new Docente("Maria Gomez", "Licenciada");

        //Creamos a los estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Rojas", 16);
        Estudiante estudiante2 = new Estudiante("Juliana Gonzalez", 17);
        Estudiante estudiante3 = new Estudiante("Camila Lopez", 15);
        Estudiante estudiante4 = new Estudiante("Pedro Jaramillo", 16);
        Estudiante estudiante5 = new Estudiante("Oscar Perez", 16);

        //Vamos agregar docentes a la escuela
        escuela.registrarDocente(docente1);
        escuela.registrarDocente(docente2);

        //Vamos agregar estudiantes a la escuela
        escuela.registrarEstudiante(estudiante1);
        escuela.registrarEstudiante(estudiante2);
        escuela.registrarEstudiante(estudiante3);
        escuela.registrarEstudiante(estudiante4);
        escuela.registrarEstudiante(estudiante5);

        //Asignar estudiantes a la materia
        List<Estudiante> estudiantesCurso = new ArrayList<>();
        estudiantesCurso.add(estudiante1);
        estudiantesCurso.add(estudiante3);
        estudiantesCurso.add(estudiante5);

        //Crear la materia
        Materia materia = new Materia("Programación 1", "003R", docente1, estudiantesCurso);

        escuela.registrarMateria(materia);

        System.out.println(materia.toString());

    }
}