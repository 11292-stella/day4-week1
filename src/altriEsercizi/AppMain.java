package altriEsercizi;

public class AppMain {

    public static void main(String[] args){


        Animale d1 = new Topo("Topetto",3,"mouse");
        Animale d2 = new Cane("Joy",4,"volpina");
        Animale d3 = new Gatto("Ravhi",5,"Bianchetto");

        Animale[] animali = {d1,d2,d3};

        for (int i = 0; i < animali.length ; i++) {

            System.out.println("Nome: " + animali[i].getName() + ", Età: " + animali[i].getEta() + ", Razza: " + animali[i].getRazza());
            animali[i].faiSuono();


        }

    }
}
