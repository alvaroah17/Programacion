import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //EjERCICIO 3
        //Crea un array que contenga 5 números.
        //Realiza un programa que te muestre por pantalla SOLO el más pequeño de ellos.
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