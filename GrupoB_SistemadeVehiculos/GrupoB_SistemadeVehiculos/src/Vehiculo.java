public class Vehiculo{
    private String marca;
    private String modelo;
    private int año;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;

    }
    public Vehiculo(double velocidadActual){
        this.velocidadActual = 0;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;        
    }

    public void acelerar(){
        velocidadActual = velocidadActual + 10;
        System.out.println("Acelerando la velocidad actual: " + velocidadActual + "Km/h");
    }
    public void acelerar(int velocidadObjetivo){
        if(velocidadObjetivo > velocidadActual){
            velocidadActual = velocidadObjetivo;
            System.out.println("Velocidad establecida en: " + velocidadActual + "Km/h");

        }else{
            System.out.println("La velocidad objetivo de ser mayor a la actual.");
        }

    }
    public void calcularConsumo(double Km){
        double consumo = (Km / 100) * 10;
        System.out.println("Consumo estimado para " + Km + "Km: " + consumo + "litros");
        return;
    }
    public void frenar(){
        velocidadActual = 0;
        System.out.println("Vehiculo detenido.");
    }
    public void mostrarInfo(){
        System.out.println("===? Informacion del Vehiculo ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h ");
    }
}