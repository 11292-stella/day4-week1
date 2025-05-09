package AltroEserciz;

public abstract class Veicolo implements Movibile {

    private String modello;
    private int anno;

    public Veicolo(String modello, int anno) {
        this.modello = modello;
        this.anno = anno;
    }

    public abstract void muoversi();


}
