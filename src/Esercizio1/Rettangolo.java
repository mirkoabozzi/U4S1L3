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

    public double perimetro(){
        return (this.altezza + this.altezza) * 2;
    }

    public double area(){
        return this.altezza * this.larghezza;
    }

    public String stampaRettangolo() {
             double perimetro = perimetro();
             double area = area();
             return "Perimetro = "+ perimetro + " area = "+ area;
    }

    public static String stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        double perimetro1 = rettangolo1.perimetro();
        double area1 = rettangolo1.area();
        double perimetro2 = rettangolo2.perimetro();
        double area2 = rettangolo2.area();
        return "Somma perimetri= " + (perimetro1 + perimetro2) + " Somma aree= "+ (area1 + area2);
    }

}
