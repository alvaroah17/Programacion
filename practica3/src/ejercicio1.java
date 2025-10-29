public class ejercicio1 {
    static void main(String[] args) {
        Double [][] doub = {
            {0.0, 30.0, 2.0, null, null, 5.0},
            {75.0, null, null, null, 0.0, null},
            {null, null, -2.0, 9.0, null, 11.0}
        };
        for (int i = 0; i < doub.length ; i++) {
            for (int j = 0; j < doub.length ; j++) {
                System.out.print("Columna" +i + " ");
                break;
            }
        }
        for (int i = 0; i < doub.length; i++) {
            System.out.print("Fila "+i+" |");
            for (int j = 0; j < doub[i].length; j++) {
                System.out.print(doub[i][j]+" ");
            }
            System.out.println();
        }
    }
}
