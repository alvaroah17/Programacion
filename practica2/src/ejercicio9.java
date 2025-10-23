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
        System.out.println("- Introduce por teclado las 10 números enteros para las 10 posiciones del array");
        //Creamos el array de 10 posiciones
        int [] array =new int[10];
        //Creamos un bucle que ira por todas las posiciones del array y con scaner iremos metiendo nosotros los valores del array
        //ya que i (el contador) va por las distintas posiciones 1 a 1 y nosotros iremos dandole el valor que queramos
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        //Declaramos las distintas variables fuera del bucle para poder identificar cual es el valor Maximo/Mínimo y sus posiciones.
        int ValorMaximo=array[0];//Esto quiere decir que tienen inicialmente el valor de la posicion 0 del array
        int ValorMinimo=array[0];
        int posicionValorMaxima=0;
        int posicionValorMinimo=0;
        //Creamos otro bucle que vaya de nuevo por todas las posiciones del array y dentro 2 if
        for (int i=0;i< array.length;i++){
            //En el 1 if le decimos que si la posicion del array por la que vaya el contador (empezando en 0) es menor que ValorMinimo
            //ValorMinimo es igual a esa posición, entonces ira por todas las posiciones viendo cual es menor y guardando en esa variable el valor
            //mas bajo. Y para la posicion del valor minimo le decimos que posicionValorMinimo es igual a "i" que es el que hace contador de
            //por las posiciones del array, y la posicion en la que se encuentra al guardar el valorMinimo es la que mostrará
            if (array[i]<ValorMinimo){
                ValorMinimo=array[i];
                posicionValorMinimo=i;
            }
            if (array[i]>ValorMaximo){
                ValorMaximo=array[i];
                posicionValorMaxima=i;
            }
            //Imprimimos en pantalla los diferentes valores fuera del bucle (for)
        }
        System.out.println("- Valor maximo = "+ValorMaximo);
        System.out.println("- Valor mínimo = "+ValorMinimo);
        System.out.println("- Posición valor máximo = "+ posicionValorMaxima);
        System.out.println("- Posición valor mínimo = "+ posicionValorMinimo);
    }
}
