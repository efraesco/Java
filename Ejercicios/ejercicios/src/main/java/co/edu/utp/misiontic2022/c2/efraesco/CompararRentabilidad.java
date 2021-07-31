package co.edu.utp.misiontic2022.c2.efraesco;

public class CompararRentabilidad {
    // ---------------------------------------------
    // Atributos
    // ---------------------------------------------
    private Integer ValorProducto;
    private Integer Tiempo;
    private Double Interes;
    // ---------------------------------------------
    // Métodos
     // ---------------------------------------------
    public Double calcularInteresSimple() {
        Double interesSimple = ValorProducto * Interes * Tiempo;
        System.out.println(interesSimple);
        return interesSimple;
    }
    
    public Double calcularInteresCompuesto(){
        Double interesCompuesto = ValorProducto * (1 + Math.pow(Interes, Tiempo)-1);
        System.out.println(interesCompuesto);
        return interesCompuesto;
    }
    
    public String compararRentabilidad(Integer pTiempo, Integer pValorProducto, Double pInteres)
    {
        this.Tiempo = pTiempo;
        this.ValorProducto = pValorProducto;
        this.Interes = pInteres; 

        Double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia > 0) {
            return "La diferencia en el total de intereses generados para el crédito, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el crédito.";
        }
    }
}