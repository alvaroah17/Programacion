import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Programa Java que llene un array con 10 números enteros que se leen por teclado. A continuación calcula y muestra
        //la media de los valores positivos y la de los valores negativos del array.
        System.out.println("- Introduce los 10 valores del array");
        int [] array = new int[10];
        //Declaramos las siguientes variables
        int positivo=0;
        int negativo=0;
        double PromedioPositivo=0;
        double PromedioNegativo=0;
        int SumaNumPositivos=0;
        int SumaNumNegativos=0;
        //Bucle para introducir valores en cada celda del array
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        //Bucle para contar que celda del array es un numero positivo,
        //negativo o un cero
        for (int i=0;i< array.length;i++){
            if (array[i]>=0){
                SumaNumPositivos+=array[i];
                positivo++;
            }
            if (array[i]<0){
                SumaNumNegativos+=array[i];
                negativo++;
            }
        }
        PromedioPositivo=(double) SumaNumPositivos/(double) positivo ;
        PromedioNegativo=(double) SumaNumNegativos/(double) negativo;
        System.out.println("- Numeros positivos = "+ positivo);
        System.out.println("- Numeros negativos = "+ negativo);
        System.out.println("- Promedio Números positivo = "+ PromedioPositivo);
        System.out.println("- Promedio Números negativos = "+ PromedioNegativo);
    }
}