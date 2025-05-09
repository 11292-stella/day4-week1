package altriEsercizi;

public abstract class Animale{

    private String name;
    private int eta;
    private String razza;

    public Animale(String name, int eta, String razza) {
        this.name = name;
        this.eta = eta;
        this.razza = razza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }


    public abstract void faiSuono();


}
