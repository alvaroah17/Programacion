import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //EjERCICIO 2
        //Muestra por pantalla todos los elementos
        //de un array de números enteros separados por un espacio.
        //----------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduza un valor");
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("Elementos de un array separados por espacio");
        for (int i = 0; i<5; i++) {
            System.out.print(arrayInt[i]+" ");
        }
    }
}