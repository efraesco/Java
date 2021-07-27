import java.util.Scanner;

public class Ejercicio2 {
    //Implemente un algoritmo que reciba un numero por teclado y cuente cuantas cifras o digitos contiene e imprima el mensaje en consola

    public static String cuentaDigitos(Long numero){
        Integer contador = 0;
        Long numeroOperar = numero;
        while (numeroOperar > 0) {
            System.out.println("Numero:" + numeroOperar);
            //numeroOperar = numeroOperar / 10;
            numeroOperar /= 10;
            contador++; 
        }        
        return "El numero " + numero + " tiene " + contador + " cifras";
                      
    }
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite un numero :");
        Long numero = sc.nextLong();
        String resultado = cuentaDigitos(numero);
        System.out.println(resultado);
        sc.close();
    }
}
