package banca;

import java.util.Scanner;

public class ContoCorrente {
    //ATTRIBUTI
    private double saldo;
    Persona persona;
    
    static Scanner input = new Scanner(System.in);

    //COSTRUTTORE
    public ContoCorrente(Persona persona, double saldo) {
        this.saldo = saldo;
        this.persona = persona;
    }
    
    //METODI
    public void summary(){
        println("\n\nArea personale di " + persona.getName() +" " + persona.getSurname());
        println("Nome: "+ persona.getName());
        println("Cognome: "+ persona.getSurname());
        println("Anno di nascita: "+persona.getYearBorn());  
        println("Saldo: "+this.saldo+"\n");
    }
    
    @Override
    public String toString() {
        return "ContoCorrente{" + "saldo=" + saldo + ", persona=" + persona + '}';
    }
    
    static void print(String line){
        System.out.print(line);
    }
    
    static void println(String line){
        System.out.println(line);
    }

    public void menu() {
        int f;
        
        do{
            f = 0;
            
            println("Selezionare l'operazione desiderata:");
            println("\tPreleva[1]");
            println("\tDeposita[2]");
            println("\tElimina conto[3]");
            println("\tEsci[4]");

            print("\nScelta: ");
            int scelta = input.nextInt();

            switch(scelta){
                case 1:
                    preleva();
                    break;

                case 2:
                    deposita();
                    break;

                case 3:
                    reset();
                    f = 1;
                    break;

                case 4:
                    f = 1;
                    break;
            }
        }while(f==0);
        
        
    }
    
    public void preleva(){
        
        double money;
        
        if(saldo>0){
            do{
                print("Inserire la somma di denaro da prelevare(max: "+this.saldo+"): ");
                money = input.nextDouble();
            }while(money < 1  || saldo - money < 0);
            println("Operazione effettuata!");
            saldo -= money;
        }
        else{
            println("Bancarotta, sei povero!");
        }

    }
    
    public void deposita(){
        double money;
        
        do{
            print("Inserire la somma di denaro da depositare: ");
            money = input.nextDouble();
        }while(money < 1);
        
        println("Operazione effettuata!");
        
        saldo += money;
    }
    
    public void reset(){
        saldo = 0;
        persona.reset();
        
        println("Conto corrente eliminato!");
    }
    
    //SETTERS AND GETTERS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}