package co.edu.utp.misiontic2022.c2.efraesco;

public class Moto extends Vehiculo {
    
    public Moto(Double precioBase, Boolean lujo, String marca, Integer modelo, String cilindro, String cilindro1) {
        super(precioBase, lujo, marca, modelo, 2);
        calcularPrecio();
    }
    
    public Moto(Integer precioBase, Boolean lujo, String marca, Integer modelo, String cilindro, String cilindro1) {
        super(precioBase.doubleValue(), lujo, marca, modelo, 2);
        calcularPrecio();
    }

    
    public void calcularPrecio() {
        Double precio = 0.0;
        
        // Calculos
        if ( marca == "Yamaha") {
            
            if (modelo > 2012) {
                precio += 2000;
                if (lujo) {
                    precio += 5000;
                }
            } else if (modelo < 2012) {
                precio += 1000;
                if (lujo) {
                    precio += 2000;
                }
            }
        } else if ( marca == "Suzuki") { 
            
            if (modelo > 2012) {
                precio += 1000;
                if (lujo) {
                    precio += 3000;
                }
            } else if (modelo <= 2012) {
                precio += 700;
                if (lujo) {
                    precio += 1000;
                }
            }
        }
        super.setPrecioFinal(precioBase + precio);
    }
        
}
    