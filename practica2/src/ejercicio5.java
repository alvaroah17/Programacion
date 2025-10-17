import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un array de números donde
        //le indicamos por teclado el tamaño del array,
        int n= sc.nextInt();
        double [] array=new double[n];
        array[n]=Math.random()*9;
    }
}
