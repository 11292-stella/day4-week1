package AltroEserciz;

public class Bicicletta extends Veicolo{


    public Bicicletta(String modello, int anno) {
        super(modello, anno);
    }

    @Override
    public void muoversi() {
        System.out.println("Pedalare per muoversi!");
    }
}
