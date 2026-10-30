public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(String tipo, double radio, double altura) {
        super(tipo, radio);
        this.setAltura(altura);
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        double areaBase = super.area(); 
        double areaLateral = 2 * Math.PI * this.getRadio() * this.altura;
        
        return (2 * areaBase) + areaLateral;
    }
    public double volumen() {
        return super.area() * this.altura;
    }
}