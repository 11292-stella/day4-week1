package altriEsercizi;

public class Cane extends Animale {


    public Cane(String name, int eta, String razza) {
        super(name, eta, razza);
    }

    @Override
    public void faiSuono() {
        System.out.println("Bau bau!");
    }
}
