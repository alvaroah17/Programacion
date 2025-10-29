public class ejercicio1_3 {
    static void main(String[] args) {
        Double [] [] doub = {
                {0.0, 30.0, 2.0, null, null, 5.0},
                {75.0, null, null, null, 0.0, null},
                {null, null, -2.0, 9.0, null, 11.0}
        };
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-10s", "Columna " + i +"");
        }
        System.out.println();
        for (int filas = 0; filas < doub.length; filas++) {
            System.out.printf( "Fila " +"%-2s", filas +" |");
            for (int columnas = 0; columnas < doub[filas].length ; columnas++) {
                System.out.print(doub[filas][columnas]+" ");
                if (doub[filas][columnas]!=null){
                    System.out.printf("%-10s", doub[filas][columnas]);
                }
                else {
                    System.out.printf("%-10s", " ");
                }
            }
            System.out.println();
        }
    }
}
