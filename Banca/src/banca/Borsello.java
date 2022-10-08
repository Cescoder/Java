
package banca;


public class Borsello {
    //ATTRIBUTI
    private double saldo;
    private String colore;
    
    //COSTRUTTORE
    Borsello(){
        saldo = 100;
        colore = "White";
    }
    
    //METODI
    void setColor(String color){
        colore = color;
    }
    
    String getColor(){
        return colore;
    }
    
    double getSaldo(){
        return saldo;
    }
    
    void mettiSoldi(double saldo){
        this.saldo += saldo;
    }
    
    void togliSoldi(double saldo){
        this.saldo -= saldo;
    }
    
    void azzera(){
        saldo = 0;
        colore = "Incolore";
    }
    
    void stampa(){
        System.out.println("\nSaldo: "+saldo);
        System.out.println("Colore: "+colore);
    }
}
