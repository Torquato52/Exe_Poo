package Ex_1;

public class Circulo {
    
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getPerimetro(){
        return 2 * Math.PI * raio;
    }
    
}