package AltroEserciz;

public class AppMain {
    public static void main(String[] args){

        Veicolo v1 = new Auto("Topolino",2002);
        Veicolo v2 = new Bicicletta("tre ruote",2000);

        Veicolo[] veicoli = {v1,v2};

        for (int i = 0; i < veicoli.length ; i++) {
            veicoli[i].muoversi();

        }

    }
}
