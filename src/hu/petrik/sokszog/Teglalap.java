package hu.petrik.sokszog;

public class Teglalap extends Sokszog{

    private  double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public Teglalap(){
        super(veletlenOldalGeneralas());
        this.b = veletlenOldalGeneralas();
    }

    public static double veletlenOldalGeneralas(){
        return Math.random() * 10 + 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet(){
        return 2* (this.getA() + this.getB());
    }

    public double getTerulet(){
        return this.getA() * this.getB();
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %-10.3f b = %-10.3f %s  ",
                this.getA(), this.getB(), super.toString());
    }
}
