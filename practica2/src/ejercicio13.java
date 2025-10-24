import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cree una lista de enteros (ArrayList<Integer>).
        //Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
        //Muestre por pantalla todos los números de la lista y la suma total de los mismos.
        //1 Creamos un array list y le damos el nombre "NumerosPositivos"
        ArrayList<Integer> NumerosPositivos = new ArrayList<>();
        //2 Creamos una variable para almacene los numeros que vamos a meter por teclado y una para la suma final de todos
        int numerosXteclado=0;
        int suma=0;
        System.out.println("--- A continuación introduce los numeros enteros que quieras guardar en el array list [] ---");
        //3 Hacemos un bucle con while con la condicion de que numerosXteclado tiene que ser >=0 (positivo) para que se este
        //ejecutando una y otra vez sino se rompe (break). Dentro ponemos un print con el mensaje que queremos que se repita y un escaner a la
        // variable antes creada numerosXteclado para que recoja los valores que le demos por teclado
        while (numerosXteclado>=0){
            System.out.println("- Introduce SOLO números positivos, para finalizar introduce un número negativo");
            numerosXteclado=sc.nextInt();
            //4 Creamos un if dentro de nuestro bucle while en el que decimos que si numerosXteclado son >=0 (positivos) lo añadamos
            //a nuestro arrayList "NumerosPositivos"
            if (numerosXteclado>=0){
                NumerosPositivos.add(numerosXteclado);
            }
        }
        //5 Por ultimo creamos un bucle for para recorrer el arrayList y dentro decimos que a la variable creada al principio llamada "suma"
        //se le sume los numeros introducidos por teclado al arrayList "NumerosPositivos"
        for (int i=0;i<NumerosPositivos.size();i++){
            suma+=NumerosPositivos.get(i);
        }
        //6 Ya imprimimos los valores y ya está
        System.out.println("- Numeros enteros introducidos en la lista "+NumerosPositivos);
        System.out.println("- Suma de todos los números enteros introducidos en la lista = "+suma);
    }
}
