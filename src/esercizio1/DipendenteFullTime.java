package esercizio1;

public class DipendenteFullTime extends Dipendente  {

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    public DipendenteFullTime(String matricola, double stipendio, String dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
}
