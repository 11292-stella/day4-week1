package altriEsercizi;

public class Gatto extends Animale {


    public Gatto(String name, int eta, String razza) {
        super(name, eta, razza);
    }

    @Override
    public void faiSuono() {
        System.out.println("Miao miao");
    }
}
