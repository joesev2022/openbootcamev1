import model.Coche;

import java.util.Scanner;

public class OpenBootCampEv1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, cantPuertas, resultado;
        sc.useDelimiter("\n");
        System.out.println("Bienvenido ingrese 3 números para sumarlos:");
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = sc.nextInt();
        System.out.println("Sumando los 3 números: " + suma(num1,num2,num3));

        Coche miCoche = new Coche();
        System.out.println("Ingrese cantidad de puertas, máximo hasta 4");
        cantPuertas = sc.nextInt();
        resultado = miCoche.incrementarNumPuertas(cantPuertas);
        System.out.println("El coche tiene " + resultado + " puertas.");
    }

    public static int suma(int num1, int num2, int num3){
        int suma;
        suma = num1 + num2 + num3;
        return suma;
    }
}
