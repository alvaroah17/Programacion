public class ejercicio4 {
    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones
        int [] array = new int[100];
        //que contendrá los números del 1 al 100
        for (int i=0;i<array.length;i++) {
            //Para desde la posición 0 del array
            //empezar con el numero 1 en vez de 0
            array [i]=i+1;
        }
        //Obtén la suma de todos ellos
        int suma=0;
        int media=0;
        for (int i=0;i<array.length;i++){
            //SUMA
            suma=suma+array[i];
            //MEDIA
            media=suma/array.length;
        }
        //Imprime la suma y la media
        System.out.println("Suma de todos los números del 1 al 100 = " +suma);
        System.out.println("Media de todos los números del 1 al 100 = " +media);
    }
}
