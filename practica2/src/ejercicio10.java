import java.util.Scanner;

public class ejercicio10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Crea un programa que muestre por pantalla la nota de un estudiante,
        //de entre una lista de estudiantes con sus respectivas notas.
        //El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).
        //Utiliza un array para los nombres de los alumnos y otro para las notas.
        //¿Serías capaz de hacerlo con un array BIdimensional?
        System.out.println("- Pon el nombre del estudiante ");
        //Pedimos por teclado el nombre del estudiante del que queremos saber la nota
        String NombreAlumno = sc.nextLine();
        //Array String (para texto) con los nombres de los estudiantes
        String [] ArrayEstudiantes = {"Alvaro", "Marco", "Sergio", "Cristian"};
        //Array double (decimales) con las notas de los estudiantes
        double [] ArrayNotas = {7.5, 6.5, 8.0, 8.5};
        //Hacemos un bucle que vaya desde la posicion 0 hasta 3 (4 valores que hemos introducido)
        //en el ArrayEstudiantes (nombres) dentro del array
        for (int i=0;i<ArrayEstudiantes.length;i++){
            //Con un if miramos si la el contenido de la posicion del array ArrayEstudiantes es igual a los NombreAlumno introducidos
            //por teclado, y si son igual que imprima el dato de la posicion correspondiente del ArrayNotas (Nota) a la posicion correspondiente
            //del ArrayEstudiantes (Nombres Alumnos). Por ejemplo en el ArrayEstudiantes Alvaro es la posición 0 y en el ArrayNotas 7.5
            //es la posición 0 también. Imprime los dos ya que al imprimir el contador para las dos empieza en 0 (i).
            if (ArrayEstudiantes[i].equals(NombreAlumno)) {
                System.out.println("- La nota del alumno "+ArrayEstudiantes[i]+ " es = "+ArrayNotas[i]);
            }
        }

    }
}
