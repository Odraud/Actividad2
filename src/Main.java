import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String nombreAlumno = "";
        double [] calificaciones = new double[5];
        double promedio;
        char califFinal;
        System.out.println("Escriba el nombre del alumno: ");
        nombreAlumno = scan.next();
        for(int i=0; i < 5; i++){
            System.out.println("Escriba la calificación #" + (i+1) + ": ");
            calificaciones[i]= Double.parseDouble(scan.next());
        }
        promedio = calculaPromedio(calificaciones);
        califFinal = calculaCalificacion(promedio);
        imprimirResultado(nombreAlumno, calificaciones, promedio, califFinal);
    }
    public static double calculaPromedio(double [] calificaciones){
        double sumCalif = 0, promedio = 0;
        for(int i=0; i < 5; i++){
            sumCalif = sumCalif + calificaciones[i];
        }
        promedio = sumCalif/5;
        return promedio;
    }
    public static char calculaCalificacion(double promedio){
        char califFinal = '-';
        if (promedio <= 50){
            califFinal = 'F';
        } else if (promedio >= 51 && promedio <= 60){
            califFinal = 'E';
        } else if (promedio >= 61 && promedio <= 70){
            califFinal = 'D';
        } else if (promedio >= 71 && promedio <= 80) {
            califFinal = 'C';
        } else if (promedio >= 81 && promedio <= 90){
            califFinal = 'B';
        } else {
            califFinal = 'A';
        }
        return califFinal;
    }
    public static void imprimirResultado(String nombre, double[] calificaciones, double promedio, char califFinal){
        System.out.println("Nombre del estudiante: " + nombre);
        for(int i = 0; i < 5; i++){
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + califFinal);
    }

}