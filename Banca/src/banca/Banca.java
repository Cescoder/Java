package banca;

import java.util.Scanner;

public class Banca {
    //ATTRIBUTI
    private static int maxUsers = 3;
    private static int currentYear = 2022;
    
    private static Persona[] persona = new Persona[maxUsers];
    private static ContoCorrente[] conto = new ContoCorrente[maxUsers];
    
    static Scanner input = new Scanner(System.in);
    
    //MAIN
    public static void main(String[] args) {
        int f;
        int scelta;
        
        //Reset dei conti
        reset();
        
        //Menu
        do{
            f = 0;
            scelta = menu();
            
            switch(scelta){
                case 1:
                    logIn();        //Accesso al conto
                    break;
                case 2:
                    creaConto();    //Creazione di un nuovo conto
                    break;
                
                case 3:
                    printConti();   //Stampa di tutti i conti
                    break;
                
                case 4:
                    f = 1;          //Uscita
                    break;
            }
        }while(f == 0);
        
    }
    
    //METODI 
    
    public static void printConti(){
        println("\nConto\tNome\t\tCognome\t\tAnno\tSaldo");
        for(int i = 0; i<maxUsers; i++){
            println(i+"\t"+persona[i].getName()+"\t\t"+persona[i].getSurname()+"\t\t"+persona[i].getYearBorn()+"\t"+conto[i].getSaldo());
        }
    }
    
    public static void reset(){
        for(int i = 0; i<maxUsers; i++){
            persona[i] = new Persona("", "", 0);
            conto[i] = new ContoCorrente(persona[i], 0);
        }
    }
    
    public static int menu(){
        println("\nBENVENUTO IN BANCA\n");
        println("Immettere operazione desiderata:");
        println("\tAccedi al mio conto[1]");
        println("\tCrea un nuovo conto[2]");
        println("\tVisualizza tutti i conti[3]");
        println("\tEsci[4]\n");
        
        
        int choice;
        
        do{
            print("Scelta: ");
            choice = input.nextInt();
        }while(choice <1 || choice >4);
        
        return choice;
    }
    
    private static void print(String line){
        System.out.print(line);
    }
    
    private static void println(String line){
        System.out.println(line);
    }
    
    static private void logIn(){
        String name, surname;
        int yearBorn;
    
        println("\nPer accedere alla tua area personale immetti le credenziali:");
        
        do{
            print("Nome: ");
            name = input.next();
        }while(name.equals(""));
        
        do{
            print("Cognome: ");
            surname = input.next();
        }while(surname.equals(""));
        
        do{
            print("Anno di nascita: ");
            yearBorn = input.nextInt();
        }while(surname.equals(""));
        
        int ID = searchConto(name, surname, yearBorn);

        
        if(ID != -1)
            personalArea(ID);
        
        else
            println("\nConto inesistente");
        
            
        
    }
    
    static void personalArea(int ID){
        conto[ID].summary();
        conto[ID].menu();
    }
    
    static void creaConto(){
        String name, surname;
        int yearBorn;
        int ID = searchAvaible();
        
        if(ID != -1){
            
            println("\nE' possibile creare un nuovo conto!");
            
            do{
                print("Inserisci il tuo nome: ");
                name = input.next();
            }while(name.equals(""));
        
            do{
                print("Inserisci il tuo cognome: ");
                surname = input.next();
            }while(surname.equals(""));
            
            do{
                print("Inserisci il tuo anno di nascita: ");
                yearBorn = input.nextInt();
            }while(yearBorn < 1900 || yearBorn > currentYear);
            
            if(isAvaiable(name, surname, yearBorn)){
                persona[ID].setName(name);
                persona[ID].setSurname(surname);
                persona[ID].setYearBorn(yearBorn);
            
                println("Conto creato con successo!");
            }
            else
                println("Conto già esistente!");
            
            
        }
        else{
            println("Impossibile creare nuovo conto!");
        }
        
        printConti();
        
    }
    
    static private int searchAvaible(){
        for(int i = 0; i<maxUsers; i++)
            if(persona[i].getName().equals("") )
                return i;
        
        return -1;
            
        
    }
    
    static private int searchConto(String name, String surname, int yearBorn){
        for(int i = 0; i<maxUsers; i++)
            if(persona[i].getName().equals(name) && persona[i].getSurname().equals(surname) && persona[i].getYearBorn() == yearBorn)                return i;
        
        return -1;
    }
    
    static private boolean isAvaiable(String name, String surname, int yearBorn){
        for(int i = 0; i<maxUsers; i++)
            if(persona[i].getName().equals(name) && persona[i].getSurname().equals(surname) && persona[i].getYearBorn() == yearBorn)
                return false;
        
        return true;
    }
    
}
    

