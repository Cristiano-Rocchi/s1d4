import enums.Dipartimento;

public abstract class Dipendente {

    //ATTRIBUTI
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;


    /*COSTRUTTORI*/
    public Dipendente(int matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    /*METODI*/
    public static void stampaMatricola(Dipendente dipendente1, Dipendente dipendente2, Dipendente dipendente3) {
        System.out.println("la matricola del dipendente 1 è:" + dipendente1.getMatricola());
        System.out.println("la matricola del dipendente 2 è:" + dipendente2.getMatricola());
        System.out.println("la matricola del dipendente 3 è:" + dipendente3.getMatricola());

    }

    public abstract void calculateSalary();

    /*GETTER SETTER*/
    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


}
