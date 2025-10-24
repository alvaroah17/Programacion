import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cree una lista de enteros (ArrayList<Integer>).
        //Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
        //Muestre por pantalla todos los números de la lista y la suma total de los mismos.
        ArrayList<Integer> NumerosEnteros = new ArrayList<>();
        int x=0;
        int suma=0;
        while (x>=0){
            x=sc.nextInt();
            NumerosEnteros.add(x);

            if (x<0){
                break;
            }
        }
    }
}
