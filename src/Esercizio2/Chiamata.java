package Esercizio2;

import java.util.Random;

public class Chiamata {

    private int numeroChiamato;
    private int durata;

    public Chiamata(int numeroChiamato){
        Random random = new Random();
        this.numeroChiamato=numeroChiamato;
        this.durata = random.nextInt(1, 100);
    }
}
