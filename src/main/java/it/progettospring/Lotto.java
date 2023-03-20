package it.progettospring;

public class Lotto {
    int min;
    int max;
    public int [] getNumber(){
        int [] numeriFortunati = {0, 0, 0, 0, 0};
        for(int i=0; i<5; i++){
            numeriFortunati[i] = (int) (Math.random() * (max-min)) + 1;
        }
        return numeriFortunati;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
}
