public class Ejercicio1 {
    // Implemente un algoritmo que recibe una cadena con el nombre e imprime un saludo
    public static String saludo(String nombre){
        
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;

    }

    public static void main(String[] args) {
        
        String nombre = "Efrain Escobar"; 
        String saludoCompleto = saludo(nombre); 
        System.out.println(saludoCompleto);
    
    }

}
