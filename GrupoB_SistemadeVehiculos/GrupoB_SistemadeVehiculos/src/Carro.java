public class Carro extends Vehiculo{
    private int cilindraje;
    private String tipoCombustible;

    public Carro(String tipoCombustible, int cilindraje, String marca, String modelo, int año){
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    @Override 
    public void calcularConsumo(double Km){
        double litros = Km* (cilindraje/100000.0);
        System.out.println("Consump para" + Km + "Km con " + cilindraje + "cc: " + litros + "litros de " + tipoCombustible);
        return;
    }
    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo: Carro de combustion");
        System.out.println("Cilindraje: " + cilindraje + "cc");
        System.out.println("Combustible: " + tipoCombustible);
    }
}
