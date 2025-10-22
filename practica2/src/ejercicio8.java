import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
        //una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.
        System.out.println("- Introduce un número de personas que se van a medir");
        int n=sc.nextInt();
        double [] ArrayAltura=new double[n];
        double promedio=0;
        double suma=0;
        System.out.println("- Introduce la altura de las diferentes personas que se van a medir");
        for (int i=0;i<ArrayAltura.length;i++) {
            ArrayAltura[i]= sc.nextDouble();
            suma+=ArrayAltura[i];
        }
        promedio=suma/n;
        System.out.println("- La altura media de N personas es = "+promedio);
        int superior=0;
        int inferior=0;
        for (int i=0;i<ArrayAltura.length;i++){
            if (ArrayAltura[i]<promedio){
                inferior++;
            }
            if (ArrayAltura[i]>=promedio){
                superior++;
            }
        }
        System.out.println(superior+ " Personas son mayor a la media  ");
        System.out.println(inferior+ " Personas son menor a la media  ");
    }
}
