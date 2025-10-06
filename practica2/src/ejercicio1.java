import java.util.Scanner;

public class ejercicio1 {


    public static void main (String[] args){
        //EjERCICIO 1
        //Crea un array de 10 posiciones de números con valores pedidos por teclado.
        // Muestra por consola el índice y el valor al que corresponde.
        //----------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        for (int i=0; i<10; i++){
            System.out.println("Introduza un valor");
            arrayInt[i] =sc.nextInt();
        }
        System.out.println("Distintas posiciones del array[10]");
        for (int i=0; i<10; i++){
            System.out.println(i+" --> "+ arrayInt[i]);
        }
    }

}
