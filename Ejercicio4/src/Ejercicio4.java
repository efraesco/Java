import java.util.Scanner;

public class Ejercicio4 {
    
    // Escribe un programa que lea una cantidad de grados centigrados 
    // y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)

    public static void calculaGrados (double gradosCentigrados)
    {
        
        double gradosFahrenheit = 32 + 1.8 * gradosCentigrados;        
        System.out.println(gradosCentigrados + " grados centigrados (ºC) equivalen a " + gradosFahrenheit + " grados Fahrenheit (ºF)"); 
       }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la temperatura en grados centigrados (ºC): ");
        double gradosCentigrados = sc.nextDouble();
        sc.close();
        calculaGrados(gradosCentigrados);
    }
}