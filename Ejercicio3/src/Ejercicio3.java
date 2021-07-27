import java.util.Scanner;

public class Ejercicio3 {
// Escribe un programa Java que lee un numero entero por teclado 
// y obtiene y muestra por pantalla el doble y el triple de ese numero.

    public static void leerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        Integer numero = sc.nextInt();
        sc.close();
        Calculos(numero);
    }

    public static void Calculos(Integer numero) {
        Integer doble = numero * 2; 
        Integer triple = numero * 3;
        System.out.println(" El doble de " + numero + " es: " + doble);
        System.out.println(" El triple de " + numero + " es: " + triple);
    }

    public static void main(String[] args) {
        leerNumero();
    }
}