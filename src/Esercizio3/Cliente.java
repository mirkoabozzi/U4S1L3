package Esercizio3;

import java.util.Random;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String nome, String cognome, String email, String dataIscrizione){
        Random random= new Random();
        this.codiceCliente= random.nextInt(1,100);
        this.nome= nome;
        this.cognome=cognome;
        this.email=email;
        this.dataIscrizione=dataIscrizione;

    }
}
