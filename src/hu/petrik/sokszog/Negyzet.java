package hu.petrik.sokszog;

public class Negyzet extends Sokszog{



    public Negyzet(){
        super(veletlenOldalGeneralas());
}
    public static double veletlenOldalGeneralas(){
        return Math.random() * 10 + 5;
    }

    public double getKerulet(){
        return 4 * this.getA();
    }

    public double getTerulet(){
        return Math.pow(this.getA(),2);
    }

    @Override
    public String toString() {
        return String.format("Négyzet: a = %-10.3f, %s",
                this.getA(), super.toString());
    }
}
