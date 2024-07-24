package Esercizio3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente mirko = new Cliente("Mirko", "Abozzi", "mirko@gmail.com", new Date());

        Articolo iphone = new Articolo("iphone", 1000, 1);

        Articolo mac = new Articolo("mac", 1299, 1);
    }
}
