package Esercizio3;

import java.util.Random;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int pezzi;

    public Articolo(String descrizione, double prezzo, int pezzi) {
        Random random = new Random();
        this.codiceArticolo = random.nextInt(1, 100);
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezzi = pezzi;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", pezzi=" + pezzi +
                '}';
    }
}
