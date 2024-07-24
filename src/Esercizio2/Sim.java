package Esercizio2;

import java.util.Arrays;

public class Sim {

    private int numeroTelefono;
    private int credito;
    private Chiamata chiamate[];


    public Sim(int numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void printData(){
        System.out.println("Numero telefono: " + this.numeroTelefono );
        System.out.println("Credito: " + this.credito + "€");
        System.out.println("Ultime chiamate: " + Arrays.toString(this.chiamate));

    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }
}
