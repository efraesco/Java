package co.edu.utp.misiontic2022.c2.efraesco;

public class PrecioTotal {
    private Double totalVehiculos;
    private Double totalCarros;
    private Double totalMotos;
    private Vehiculo[] vehiculos;
    
    public PrecioTotal(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
        this.totalVehiculos = 0.0;
        this.totalCarros = 0.0;
        this.totalMotos = 0.0;
    
        for (Vehiculo movilizador : vehiculos) {
         
            if ( movilizador instanceof Carro) {
                this.totalCarros += movilizador.getPrecioFinal();
            } else if (movilizador instanceof Moto ) {
                this.totalMotos += movilizador.getPrecioFinal();
            }
        }
        
    }

    
    public void mostrarTotales() {
        // Calculos
        
        
        this.totalVehiculos = this.totalCarros + this.totalMotos;

        System.out.println("El precio total de los Vehiculos es de " + this.totalVehiculos);
        System.out.println("La suma del precio de los Carros es de  " + this.totalCarros);
        System.out.println("La suma del precio de las Motos es de " + this.totalMotos);
    }
}
    