package AltroEserciz;

public class Auto extends Veicolo {


    public Auto(String modello, int anno) {
        super(modello, anno);
    }

    @Override
    public void muoversi() {
        System.out.println("Metti in moto!");
    }
}
