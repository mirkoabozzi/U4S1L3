package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(123456789);
        Chiamata chiamata = new Chiamata(987654321);
        Chiamata chiamata1 = new Chiamata(111111111);
        Chiamata chiamata2 = new Chiamata(222222222);
        Chiamata chiamata3 = new Chiamata(333333333);
        Chiamata chiamata4 = new Chiamata(444444444);

        Chiamata[] ultimeChiamate = {chiamata, chiamata1, chiamata2, chiamata3, chiamata4};

        sim.setChiamate(ultimeChiamate);
        sim.printData();
    }

}
