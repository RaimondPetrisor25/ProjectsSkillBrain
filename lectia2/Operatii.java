package lectia2;

public class Operatii {
    public static void main(String[] args) {
        //Declaram variabile si le atribuim valori
        int primaVariabila = 15;
        int aDouaVariabila = 60;
        //Facem diverese operatii matematice cu valorile stocate in variabilele noastre

        int suma = primaVariabila + aDouaVariabila;
        int scadere = primaVariabila - aDouaVariabila;
        int inmultire = primaVariabila * aDouaVariabila;
        //Transformam prin ''casting variabilele de tip int in variabile de double
        //Ca escuatia noastra sa afiseze rezultatul corect(altfel afiseaza 0.0)
        double impartire = (double) primaVariabila / aDouaVariabila;
        int restulImpartirii = primaVariabila % aDouaVariabila;
        //Cand avem o impartire cu virgula,al carei rezultat incercam sa il stocam intr-un int
        //Tot ce urmeaza dupa virgula este STERS(java nu aproximeaza)

        int altaImpartire = 13/ 4;

        double rezultatCuVirgula = 13D / 4D;

        //Afisam rezultatul fiecarei operatii in consola

        System.out.println(suma);
        System.out.println(scadere);
        System.out.println(inmultire);
        System.out.println(impartire);
        System.out.println(restulImpartirii);


    }



}
