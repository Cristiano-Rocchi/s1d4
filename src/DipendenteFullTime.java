import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {


    /*ATTRIBUTI*/
    public DipendenteFullTime(int matricola, int stipendioOra, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendioOra, dipartimento, oreLavorate);
    }

    /*METODO*/
    @Override
    public double calculateSalary() {

        return this.getStipendioOra() * getOreLavorate();
    }
}
