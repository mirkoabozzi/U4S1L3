package Esercizio1;

public class Rettangolo {

    //attributi
    private double altezza;
    private double larghezza;

    //costruttori
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //metodi
    public String stampaRettangolo() {
             double perimetro =  (this.altezza + this.larghezza) * 2 ;
             double area = this.altezza * this.larghezza;
             return "Perimetro = "+ perimetro + " area = "+ area;
    }

    public static String stampaDueRettangoli(double altezza1, double larghezza1,double altezza2, double larghezza2) {
        double perimetro1 = (altezza1 + larghezza1)*2;
        double area1= (altezza1 * larghezza1);
        double perimetro2 = (altezza2 + larghezza2)*2;
        double area2= (altezza2 * larghezza2);
        return "Somma perimetri= " + (perimetro1 + perimetro2) + " Somma aree= "+ (area1 + area2);
    }

}
