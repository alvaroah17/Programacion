import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Escribe un programa java que invierta el orden de los valores de un array. Por invertir el orden de
        //los valores de un array, me refiero que el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6.
        int [] array = new int[6];
        int [] arrayInverso = new int[6];
        System.out.println("- Introduce los 6 numeros del array que quiere ue devuelva invertidos");
        for (int i=0;i<array.length;i++){
            System.out.println("- "+(i+1)+" Numero = ");
            array[i]=sc.nextInt();
        }
        for (int i=0;i<arrayInverso.length;i++){
            arrayInverso[i]=array[array.length-1-i];
        }
        for (int i=0;i<arrayInverso.length;i++){
            System.out.println("El array invertido es = Posicion "+ (i) +" "+ arrayInverso[i]);
        }
    }
}
