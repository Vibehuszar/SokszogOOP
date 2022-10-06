package hu.petrik.sokszog;

public class Paralelogramma extends Sokszog{
    private double alfa;
    private double b;


    public Paralelogramma() {
        super(veletlenOldalGeneralas());;
        this.alfa =veletlenSzogGeneralas();
        this.b = veletlenOldalGeneralas();
    }

    public static double veletlenOldalGeneralas(){
        return Math.random() * 10 + 5;
    }

    public  static double veletlenSzogGeneralas(){
        return Math.random() * 179;

    }
    public Paralelogramma(double a, double alfa, double b) {
        super(a);
        this.alfa = alfa;
        this.b = b;
    }

    public double getAlfa() {
        return alfa;
    }

    public double getB() {
        return b;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet(){
        return 2 * this.getA() + 2 * this.getB();
    }

    public double getTerulet(){

        double rad = (alfa * 180) / Math.PI;

        return this.getA() * this.b * Math.sin(rad);
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %-10.3f b = %-10.3f alfa = %-10.3f %s"
                ,this.getA(),this.getB(),this.alfa,super.toString());
    }
}
