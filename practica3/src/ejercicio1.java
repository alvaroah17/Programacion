public class ejercicio1 {
   public static void main(String[] args) {
       /*EJERCICIO 1
        Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla.
        Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
        */
       Double [][] doub = {
            {0.0, 30.0, 2.0, null, null, 5.0},
            {75.0, null, null, null, 0.0, null},
            {null, null, -2.0, 9.0, null, 11.0}
        };
       System.out.print("Array Num|");
        for (int i = 0; i < doub.length ; i++) {
            for (int j = 0; j < doub[i].length; j++) {
                System.out.printf("%10s","Columna "+j+"|");
            }
            break;
        }
       System.out.println();
       System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("%10s","Fila "+i+" |");
            for (int j = 0; j < doub[i].length; j++) {
                if (doub[i][j] == null){
                    System.out.printf("%10s"," "+"|");
                }
                else {
                    System.out.printf("%10s",doub[i][j]+"|");
                }
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
