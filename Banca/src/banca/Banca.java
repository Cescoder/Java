package banca;

public class Banca {

    public static void main(String[] args) {
        Borsello gabbo = new Borsello();
        
        gabbo.stampa();
        
        gabbo.setColor("Green");
        gabbo.togliSoldi(50);
        
        gabbo.stampa();
        
        gabbo.azzera();
        
        gabbo.stampa();
    }
    
}
