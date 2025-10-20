import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un array de números donde
        //le indicamos por teclado el tamaño del array,
        System.out.println("- Introduce el tamaño del array por teclado");
        int n= sc.nextInt();
        double [] array=new double[n];
        double suma=0;
        System.out.println("Muestra el valor de cada posición");
        for (int i=0;i< array.length;i++){
            array[i]=Math.random()*9;
            System.out.println(i+" "+array[i]);
            suma+=array[i];
        }
        System.out.println("- Suma de todos los valores aleatorios de cada posición");
        System.out.println(suma);
    }
}