import enums.Dipartimento;

public class Main {
    public static void main(String[] args) {
       /* Dipendente dipendente1 = new Dipendente(1, 1400, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente(2, 800, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente(3, 1200, Dipartimento.VENDITE);

        Dipendente[] array = {dipendente1, dipendente2, dipendente3};

        Dipendente.stampaMatricola(dipendente1, dipendente2, dipendente3);*/

        DipendentePartTime dipendentePartTime = new DipendentePartTime(3, 7, Dipartimento.PRODUZIONE, 80);
        DipendenteFullTime dipendenteFullTime = new DipendenteFullTime(2, 12, Dipartimento.VENDITE, 160);
        Dirigente dirigente = new Dirigente(1, 20, Dipartimento.AMMINISTRAZIONE, 180);

        Dipendente[] dipendenti = {dipendentePartTime, dipendenteFullTime, dirigente};
        for (Dipendente dipendente : dipendenti) {
            System.out.println("lo stipendio della matricola " + dipendente.getMatricola() + " è: " + dipendente.calculateSalary());

        }
        System.out.println("lo stipendio totale dei dipendenti è: " + Dipendente.calculateAllSalary(dipendentePartTime, dipendenteFullTime, dirigente));
    }
}