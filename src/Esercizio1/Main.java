package Esercizio1;

import static Esercizio1.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo= new Rettangolo(5,2);
        System.out.println(rettangolo.stampaRettangolo());
        Rettangolo rettangolo2 = new Rettangolo(6,12);
        System.out.println(rettangolo2.stampaRettangolo());
        System.out.println(stampaDueRettangoli(5,2,6,12));

    }
}