public final class CarroElectrico  extends Carro {
    private double capacidadBateria;
    private double autonomiaKm;

    public CarroElectrico(double capacidadBateria, double autonomiaKm, String tipoCombustible, int cilindraje){
        super(cilindraje, tipoCombustible);
        this.capacidadBateria = capacidadBateria;
        this.autonomiaKm = autonomiaKm;
    }
    @Override 
    public void calcularConsumo(double Km){
         double KWh = (Km /autonomiaKm)*capacidadBateria;
         System.out.println("Consumo para " + Km + "Km: " + KWh + "kWh (electrico)");
         return;
    }
    public void cargaBateria(){
        System.out.println("Bateria cargada al 100%");
        System.out.println("Autonomia disponible: " + autonomiaKm + " Km");
    }
    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo: Carro Electrico");
        System.out.println("Capacidad bateria. " + capacidadBateria + "KWh");
        System.out.println("Autonomia: " + autonomiaKm + " Km");
    }
}
