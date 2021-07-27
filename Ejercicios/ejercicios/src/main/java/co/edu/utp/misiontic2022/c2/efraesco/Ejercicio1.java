package co.edu.utp.misiontic2022.c2.efraesco;

import java.util.Scanner;

// Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) 
// y calcule su número de la suerte.
// El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento 
// y a continuación sumando las cifras obtenidas en la suma.

public class Ejercicio1 {

    public static void saludo(){
        System.out.println("############################################");
        System.out.println("Aplicación Calcular Número de la Suerte");
        System.out.println("############################################");
    }
    public static String pedirFechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su fecha de nacimiento en el formato dd/mm/yyyy (dia/mes/año): ");
        String fechaNacimiento = sc.nextLine();
        sc.close();
        return fechaNacimiento;
    }

    public static Integer procesaFechaNacimiento(String fechaNacimiento) {
        Integer resultado = 0;
        String[] partes = fechaNacimiento.split("/");
        
        for (int i=0; i <= partes.length-1; i++) {
            resultado += Integer.parseInt(partes[i]);
        }
        
        System.out.println("Primer resultado suma de Año+Mes+Dia: " + resultado);
        
        Integer porcion = resultado;

        resultado = 0;

        do {
            resultado += porcion % 10;
            porcion /= 10;                       
                        
        } while (porcion > 0);

        return resultado;
    }
    public static void main(String[] args) {
        saludo();
        String fechaNacimiento = pedirFechaNacimiento();
        Integer resultado = procesaFechaNacimiento(fechaNacimiento);
        System.out.println("Numero de la suerte: " + resultado);
        
        
    }
}