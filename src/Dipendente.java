import enums.Dipartimento;

public abstract class Dipendente {

    //ATTRIBUTI
    private int matricola;
    private double stipendioOra;
    private Dipartimento dipartimento;
    private double oreLavorate;


    /*COSTRUTTORI*/
    public Dipendente(int matricola, int stipendioOra, Dipartimento dipartimento, double oreLavorate) {
        this.matricola = matricola;
        this.stipendioOra = stipendioOra;
        this.dipartimento = dipartimento;
        this.oreLavorate = oreLavorate;
    }

    /*METODI*/
    public static void stampaMatricola(Dipendente dipendente1, Dipendente dipendente2, Dipendente dipendente3) {
        System.out.println("la matricola del dipendente 1 è:" + dipendente1.getMatricola());
        System.out.println("la matricola del dipendente 2 è:" + dipendente2.getMatricola());
        System.out.println("la matricola del dipendente 3 è:" + dipendente3.getMatricola());

    }

    public abstract double calculateSalary();
    

    /*GETTER SETTER*/

    public double getOreLavorate() {
        return oreLavorate;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendioOra() {
        return stipendioOra;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}



