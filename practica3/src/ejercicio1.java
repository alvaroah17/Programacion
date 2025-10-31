public class ejercicio1 {
   public static void main(String[] args) {
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
                System.out.printf("%10s",doub[i][j]+" |");
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
