package hu.petrik.sokszog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sokszogek {
    private List<Sokszog> sokszogek = new ArrayList<>();

    public Sokszogek(int i){
        Random rand = new Random();
        int r;
        for (int j = 0; j < i; j++) {
            r = rand.nextInt(4);

            switch (r){
                case 0:
                    Teglalap t = new Teglalap();
                    sokszogek.add(t);
                    break;
                case 1 :
                    Haromszog h = new Haromszog();
                    sokszogek.add(h);
                    break;
                case 2:
                    Paralelogramma p = new Paralelogramma();
                    sokszogek.add(p);
                    break;
                case 3:
                    Negyzet n = new Negyzet();
                    sokszogek.add(n);
                    break;
                default:
                    break;

            }
        }
    }
    public double getOsszKerulet(){
        double ossz = 0;
        for (int i = 0; i < sokszogek.size(); i++) {
            ossz += sokszogek.get(i).getKerulet();
        }
        return ossz;
    }
    public double getOsszTerulet(){
        double ossz = 0;
        for (int i = 0; i < sokszogek.size(); i++) {
            ossz += sokszogek.get(i).getTerulet();
        }
        return ossz;
    }
    public double getMaxTerulet(){
        double max = 0;
        for (int i = 0; i < sokszogek.size(); i++) {
            if (sokszogek.get(i).getTerulet() > max){
                max = sokszogek.get(i).getTerulet();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return String.format("Sokszögek:\n%s\n",sokszogek);

    }
}
