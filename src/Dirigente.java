import enums.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

    }
}
