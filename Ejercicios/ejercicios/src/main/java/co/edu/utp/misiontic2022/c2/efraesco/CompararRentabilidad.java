package co.edu.utp.misiontic2022.c2.efraesco;

import java.lang.Math;

public class CompararRentabilidad {
    // ---------------------------------------------
    // Atributos
    // ---------------------------------------------
    private Integer ValorProducto;
    private Integer Tiempo;
    private Double Interes;
    // ---------------------------------------------
    // Constructores
    // ---------------------------------------------
    public CompararRentabilidad()
    {
        this.Tiempo =0;
        this.ValorProducto = 0;
        this.Interes = 0.0;        
    }

    public CompararRentabilidad(Integer pTiempo, Integer pValorProducto, Double pInteres)
    {
        this.Tiempo = pTiempo;
        this.ValorProducto = pValorProducto;
        this.Interes = pInteres / 100.0;        
    }

    public CompararRentabilidad(Integer pTiempo, Integer pValorProducto, Integer pInteres)
    {
        this.Tiempo = pTiempo;
        this.ValorProducto = pValorProducto;
        this.Interes = pInteres.doubleValue() / 100.0;        
    }

    // ---------------------------------------------
    // Métodos
    // ---------------------------------------------
    public Integer calcularInteresSimple() {
        Double interesSimple = this.ValorProducto * this.Interes * this.Tiempo;
        interesSimple = (double) Math.round(interesSimple);
        System.out.println(interesSimple.intValue());
        return interesSimple.intValue();
    }
    
    public Integer calcularInteresCompuesto(){
        Double interesCompuesto = this.ValorProducto * (Math.pow((1 + this.Interes),this.Tiempo)-1);
        interesCompuesto = (double) Math.round(interesCompuesto);
        System.out.println(interesCompuesto.intValue());
        return interesCompuesto.intValue();
    }
 
    public String compararRentabilidad(Integer pTiempo, Integer pValorProducto, Integer pInteres)
    {
        this.Tiempo = pTiempo;
        this.ValorProducto = pValorProducto;
        this.Interes = (double) (pInteres / 100.0); 
        return this.compararRentabilidad();

    }

    public String compararRentabilidad(Integer pTiempo, Integer pValorProducto, Double pInteres)
    {
        this.Tiempo = pTiempo;
        this.ValorProducto = pValorProducto;
        this.Interes = pInteres / 100.0; 
        return this.compararRentabilidad();
    }


    public String compararRentabilidad()
    {
        Integer diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        if (diferencia > 0) {
            return "La diferencia en el total de intereses generados para el crédito, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el crédito.";
        }
    }

    public static void main(String[] args) {
        CompararRentabilidad comparar1 = new CompararRentabilidad();
        System.out.println(comparar1.compararRentabilidad(12,2000000,5.5)); 
        System.out.println("................................................"); 
        CompararRentabilidad comparar2 = new CompararRentabilidad();
        System.out.println(comparar2.compararRentabilidad(12,2000000,5));
        System.out.println("................................................"); 
        CompararRentabilidad comparar3 = new CompararRentabilidad();
        System.out.println(comparar3.compararRentabilidad());
    }
}