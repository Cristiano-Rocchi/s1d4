import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, int stipendio, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

    }
}
