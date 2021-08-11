package co.edu.utp.misiontic2022.c2.efraesco;

public class Carro extends Vehiculo {

    public Carro(Double precioBase, Boolean lujo, String marca, Integer modelo, Integer nroLlantas) {
        super(precioBase, lujo, marca, modelo, 4);
        calcularPrecio();
    }

    public Carro(Integer precioBase, Boolean lujo, String marca, Integer modelo, Integer nroLlantas) {
        super(precioBase.doubleValue(), lujo, marca, modelo, 4);
        calcularPrecio();
    }

    
    
    public void calcularPrecio() {
        Double precio = 0.0;
        
        // Calculos
        if ( marca == "Mazda") {
            if (modelo > 2012) {
                precio += 15000;
                if (lujo) {
                    precio += 10000;
                }
            } else if (modelo < 2012) {
                precio += 10000;
                if (lujo) {
                    precio += 8000;
                }
            }
        } else if ( marca == "Renault") { 
            if (modelo > 2012) {
                precio += 12000;
                if (lujo) {
                    precio += 8000;
                }
            } else if (modelo < 2012) {
                precio += 8000;
                if (lujo) {
                    precio += 5000;
                }
            }
        }

        super.setPrecioFinal(precioBase + precio);
    
    }
}
    