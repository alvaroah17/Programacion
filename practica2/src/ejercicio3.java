import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //EjERCICIO 2
        //Muestra por pantalla todos los elementos
        //de un array de números enteros separados por un espacio.
        //----------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int array [] = {60,70,30,40,50};
        int menor =array[0];
        for (int i=0;i<5;i++) {
            if (array[i]<menor){
                menor=array[i];
            }
        }
        System.out.println(menor);
    }
}