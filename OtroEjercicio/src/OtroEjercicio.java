import java.util.Scanner;

// Implementar un algoritmo que genere un numero al azar, pida por teclado adivinar el numero; 
// y de acuerdo a la entrada indique si el numero a buscar es mayor o menor, 
// al final debe indicar el numero de intentos que se necesitaron para adivinar el numero

public class OtroEjercicio {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var aleatorio = (int)(Math.random() * 100 + 1);
        var numero = 0;
        var adivinaste = false;
        var intentos = 0;

        do {
            System.out.print("Digita un número:");
            numero = sc.nextInt();

            adivinaste = Validar(numero, aleatorio);
            intentos++;
        } while (!adivinaste);
        sc.close();
        System.out.println("Aleatorio: "+aleatorio+"\nTotal de intentos: " + intentos);
    }

    private static boolean Validar(int numero, int aleatorio) {
        var adivinaste = false;
        if (numero < aleatorio) {
            System.out.println("El número que busca es mayor");
        } else if (numero > aleatorio){
            System.out.println("El número que busca es menor");
        } else {
            System.out.println("Adivinaste !!!!!!");
            adivinaste = true;
        }

        return adivinaste;
    }
}
