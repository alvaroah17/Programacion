import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array
        //y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
        System.out.println("- Introduce los 10 valores del array");
        int [] array = new int[10];
        //Declaramos las siguientes variables
        int positivo=0;
        int negativo=0;
        int cero=0;
        //Bucle para introducir valores en cada celda del array
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
            }
        //Bucle para contar que celda del array es un numero positivo,
        //negativo o un cero
        for (int i=0;i< array.length;i++){
            if (array[i]>0){
                positivo++;
            }
            if (array[i]<0){
                negativo++;
            }
            if (array[i]==0){
                cero++;
            }
        }
        System.out.println("- Numeros positivos = "+ positivo);
        System.out.println("- Numeros negativos = "+ negativo);
        System.out.println("- Ceros = "+ cero);
    }
}
