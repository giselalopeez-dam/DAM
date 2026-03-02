/*En un curso hay 5 estudiantes que han hecho 3 exámenes durante el semestre.
Las notas se guardan en un array bidimensional, donde la primera dimensión (fila)
corresponde a un estudiante y la segunda dimensión (columna) a un examen.
Examen 1 Examen 2 Examen 3
Alumno 1 6 7 9
Alumno 2 5.5 6 8.25
Alumno 3 7 3.5 8
Alumno 4 5 6 5.5
Alumno 5 9 8.5 9,25
Se pide:
● Mostrar las notas de cada estudiante junto con su promedio final.
● Indicar cuántos estudiantes aprobaron (promedio mayor o igual a 6).
● Mostrar el promedio general del curso. */

import java.util.Arrays;

public class ejercicio7 {

    public static void main(String[] args) {

        double[][] notas = {
                { 6, 7, 9 },
                { 5.5, 6, 8.25 },
                { 7, 3.5, 8 },
                { 5, 6.5, 5 },
                { 9, 8.5, 9.25 } };

        double notaMedia = 0;
        int aprobao = 0;

        for (int i = 0; i < notas.length; i++) {

            int alumno = i + 1;

            System.out.println("Alumno " + alumno + ":");

            double sumaNotas = 0;

            for (int j = 0; j < notas[0].length; j++) {

                System.out.println(notas[i][j] + " ");
                sumaNotas += notas[i][j];
            }

            double promedio = sumaNotas / notas[i].length;
            notaMedia += promedio;

            if (notaMedia >= 6) {
                aprobao++;
            }
            System.out.println("Promedio: " + promedio);

        }

        System.out.println("El numero de aprobados es: " + aprobao);

        double promedioCurso = notaMedia / notas.length;

        System.out.println("La nota promedia del curso es " + promedioCurso);
    }
}
