import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {


    public DipendentePartTime(int matricola, int stipendioOra, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendioOra, dipartimento, oreLavorate);
    }

    @Override
    public double calculateSalary() {
        return this.getStipendioOra() * getOreLavorate();


    }
}
