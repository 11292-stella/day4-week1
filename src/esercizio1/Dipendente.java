package esercizio1;

public abstract class Dipendente {

    private String matricola;
    private double stipendio;
    private String dipartimento;


    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setDipartimento(String dipartimento) {
        if(dipartimento.equals("produzione") || dipartimento.equals("amministrazione") || dipartimento.equals("vendite")){
            this.dipartimento = dipartimento;
        } else {
            System.out.println("dipartimento non valido");
        }

    }

    public void checkIn() {
        System.out.println("Il dipendente inizia il suo turno");
    }

    public abstract double calculateSalary();


}
