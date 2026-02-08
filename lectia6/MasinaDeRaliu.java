package lectia6;

public class MasinaDeRaliu extends Masina {

    int numarConcurs;
    int puncteCampionat;

    //Constructor
    //Un constructor este o medota speciala care este apelata in momentul in case se creeaza un obiect
    //Aceasta metoda trebuie sa aiba numele perfect identic cu al clasei(case sensitive)
    //Este utilizata pt a obliga utilizatorul clasei noastre sa dea niste valori preliminare unir
    //atribute selectate de noi


    public MasinaDeRaliu(int numarConcurs){
        this.numarConcurs = numarConcurs;

    }

    //Constructorul poate si el sa fie overload(polymorphism)
    //Trebuie sa avem acelasi nume de parametrii diferiti de tip,numar sau ordine



    public MasinaDeRaliu(int numarConcurs, int puncteCampionat){
        this.numarConcurs = numarConcurs;
        this.puncteCampionat = puncteCampionat;
    }

     //Java creeaza automat un constructor gol cu fiecare clasa
        public MasinaDeRaliu(){


        }
        //Overridingul se poate folosi doar in clase care se afla intr-o relatie de mostenire
        //Ca sa sa putem suprascrie o metoda aceasta trebuie sa aibe exact aceiasi denumire,acelasi retur type
        //Si acelasi numar si tip de parametrii
        //Numai implementarea dintre acolade trebuie sa difere
        //De asemenea este un good practice sa punem @Override in fata unei metode suprascrise
    @Override
    public String getCuloare(){
        return "albastru";
    }

}

