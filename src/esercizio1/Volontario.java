package esercizio1;

public class Volontario extends Dipendente{

    private String nome;
    private int eta;
    private String cv;


    public Volontario(String matricola, double stipendio, String dipartimento, String nome, int eta, String cv) {
        super(matricola, stipendio, dipartimento);
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {

        System.out.println("Il volontario " + nome + " inizia il suo servizio.");
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }
}
