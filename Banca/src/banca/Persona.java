package banca;

public class Persona {
    
    //ATTRIBUTI
    private String name;
    private String surname;
    private int yearBorn;

    public Persona(String name, String surname, int yearBorn) {
        this.name = name;
        this.surname = surname;
        this.yearBorn = yearBorn;
    }
    
    public  void reset(){
        name = "";
        surname = "";
        yearBorn = 0;
        
    }
    
    //GETTERS
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearBorn() {
        return yearBorn;
    }
    
    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }
    
}
