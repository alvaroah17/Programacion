import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra,
        //por ejemplo 56999545W. Realiza un programa donde le pidas al usuario SOLO el número del dni y el programa te devuelva la letra.
        //Para calcular la letra solo tienes que dividir el número del DNI entre 23, el resto de esta división se corresponde con la posición de la letra en el abecedario.
        //Utiliza un array para guardar CADA letra del abecedario.
        String [] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("- Introduce el número de tu DNI");
        int NumDNI = sc.nextInt();
        //Otra forma valida de hacerlo para entenderlo mejor (hay que almacenar el resto del numero del dni en una variable
        //int PosicionLetraDNI=NumDNI%23;
        System.out.println("- Letra de tu DNI");
        System.out.println(letrasDNI[NumDNI%23]);
        }
    }
