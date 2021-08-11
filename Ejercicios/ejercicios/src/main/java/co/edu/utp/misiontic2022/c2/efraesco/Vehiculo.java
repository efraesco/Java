package co.edu.utp.misiontic2022.c2.efraesco;

public class Vehiculo {
    //private final Double precioBase;
    protected final Double precioBase;
    //private final Boolean lujo;
    protected final Boolean lujo;
    //private String marca;
    protected String marca;
    //private Integer modelo;
    protected Integer modelo;
    private Double precioFinal;
    private Integer nroLlantas;


    public Vehiculo() {
        this.precioBase = 0.0;
        this.lujo = false;
        this.marca = "Sin marca";
        this.modelo = 1900;
        this.nroLlantas = 0;
    }
    
    public Vehiculo(Double precioBase, Boolean lujo, String marca, Integer modelo, Integer nroLlantas) {
        this.precioBase = precioBase;
        this.lujo = lujo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroLlantas = nroLlantas;
    }
    
    public Vehiculo(Integer precioBase, Boolean lujo, String marca, Integer modelo, Integer nroLlantas) {
        this.precioBase = precioBase.doubleValue();
        this.lujo = lujo;
        this.marca = marca;
        this.modelo = modelo;
        this.nroLlantas = nroLlantas;
    }
    
    
    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Double getPrecioFinal() {
        return this.precioFinal;
    }
}