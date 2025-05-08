package esercizio1;

public class AppMain {

    public static void main(String[] args){


//        Dipendente n1 = new Dipendente("76544",23546,"produzione");
//        Dipendente n2 = new Dipendente("4556",66777,"amministrazione");
//        Dipendente n3 = new Dipendente("667888",3224566,"vendite");

//        Dipendente[] dipendenti = {n1,n2,n3};
//
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("matricola: " + dipendenti[i].getMatricola());
//
//        }

        Dipendente d1 = new DipendenteFullTime("111",2000,"produzione");
        Dipendente d2 = new DipendentePartTime("222",16,"vendite",80);
        Dipendente d3 = new Dirigente("333",5000,"amministrazione");
        Dipendente v1 = new Volontario("116",0,"non","Topo",20,"cv654");

        Dipendente[] dipendenti = {d1,d2,d3,v1};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola: " + dipendenti[i].getMatricola() +
                    " - Stipendio: " + dipendenti[i].calculateSalary() +
                    " - Check-in: ");
            dipendenti[i].checkIn();


        }


    }

}
