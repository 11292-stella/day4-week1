package esercizio1;

public class Dirigente extends Dipendente{


    public Dirigente(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
