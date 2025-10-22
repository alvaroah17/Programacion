import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Crea un programa en Java que:
        //Pida al usuario por teclado 10 números enteros y los guarde en un array.
        //Recorra el array para encontrar:
        //El valor máximo y la posición en la que aparece.
        //El valor mínimo y la posición en la que aparece.
        //Muestre el resultado en consola, por ejemplo:
        //EJEMPLOS:
        //Valor máximo: 92 en la posición 4
        //Valor mínimo: -3 en la posición 7
        int [] array =new int[10];
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        int ValorMaximo=array[0];
        int ValorMinimo=array[0];
        int posicionValorMaxima=0;
        int posicionValorMinimo=0;
        for (int i=0;i< array.length;i++){
            if (array[i]<ValorMinimo){
                ValorMinimo=array[i];
                posicionValorMinimo=i;
            }
            if (array[i]>ValorMaximo){
                ValorMinimo=array[i];
                posicionValorMinimo=i;
            }
            //Me queda imprimir en pantalla los diferentes valores
        }
    }
}
