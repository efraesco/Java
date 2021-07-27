import java.util.Scanner;

//Implementar un algoritmo que pida dos numeros y luego el simbolo de la operacion a realizar entre los dos numeros introducidos
public class calculadora {
    public static void main(String[] args) throws Exception {
        var entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        var num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        var num2 = entrada.nextInt();
        System.out.println("Introduce el operador (+|-|*|/): ");
        var operador = entrada.next();
        entrada.close(); /* Inhabilita el scanner para que deje de escuchar el teclado */
        var resultado = operacion(num1,num2,operador);
        System.out.println(resultado);
    }

    public static String operacion(int a, int b, String operador) {
        String cadena;
        var resultado=0;
        var operacion = "";
        switch(operador) {
            case "+": operacion="suma"; resultado=a+b; break;
            case "-": operacion="resta"; resultado=a-b; break;
            case "*": operacion="multiplicacion"; resultado=a*b; break;
            case "/": operacion="division"; resultado=a/b; break;
        }
        cadena = "La " + operacion + " de " + a + " " + operador + " " + b + " = " + resultado; 
        return cadena;
    }
}
