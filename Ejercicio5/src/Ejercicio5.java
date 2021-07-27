import java.util.Scanner;

public class Ejercicio5 {

   // Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
   // A continuación muestra un mensaje indicando si la variable es par o impar.
   // Utiliza el operador condicional ( ? : ) para resolverlo.

   /* public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite un número: ");
      Integer numero = sc.nextInt();
      sc.close();
      String cadena = new String();
      cadena = (numero % 2 == 0) ? " es par": " es impar";
      System.out.println("El número " + numero + cadena);
     
   } */
   public static Integer entradaDatos() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite un número: ");
      Integer numero = sc.nextInt();
      sc.close();
      return numero;
   }

   public static String procesoDatos(Integer numero) {
      String cadena = new String();
      cadena = (numero % 2 == 0) ? " es par": " es impar";
      return "El numero " + numero + cadena;
   }

   public static void salidaDatos(String cadena) {
      System.out.println(cadena);
   }

   public static void main(String[] args) {
      Integer numero = entradaDatos();
      String resultado = procesoDatos(numero);
      salidaDatos(resultado);

   }

}
