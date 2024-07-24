package Esercizio3;

import java.util.Arrays;

public class Carrello {

    private Cliente cliente;
    private Articolo[] articoli;
    private double totale;

    public Carrello(Cliente cliente, Articolo[] articoli) {
        this.cliente = cliente;
        this.articoli = articoli;
        this.totale = calcolaTotale(articoli);
    }

    public double calcolaTotale(Articolo[] articoli) {
        double counter = 0;
        for (int i = 0; i < articoli.length; i++) {
            counter = articoli[i].getPrezzo() + counter;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totale=" + totale +
                '}';
    }
}
