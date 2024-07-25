import enums.Dipartimento;

public class Dirigente extends Dipendente {


    public Dirigente(int matricola, int stipendioOra, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendioOra, dipartimento, oreLavorate);
    }


    @Override
    public double calculateSalary() {

        return this.getStipendioOra() * getOreLavorate();
    }
}
