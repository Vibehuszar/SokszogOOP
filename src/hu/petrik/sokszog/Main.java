package hu.petrik.sokszog;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            double a = Math.random() * 5 +10;
            double b = Math.random() * 5 + 10;
            Teglalap t = new Teglalap(a,b);
            System.out.println(t);
        }

        Haromszog h1 = new Haromszog(3,4,5);
        System.out.println(h1);

        Paralelogramma p1 = new Paralelogramma();
        System.out.println(p1);

        Negyzet n1 = new Negyzet();
        System.out.println(n1);
    }
}