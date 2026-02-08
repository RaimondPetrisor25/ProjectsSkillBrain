package lectia6;


//Masina de raliu mosteneste trasaturi si functii de la masina normala
//Pt ca masina de raliu are aceleasi trasaturi ca maina normala + inca 2
//In loc sa copiem trasaturile de la masina normala aici le punem intr-o relatie de mostenire si evitam
//Mostenirea se obtine cu cuvantul "extends" urmat de numele clasei de la care mostenim
//Clasa de la care mostenim se numeste superclasa
//Clasa care mosteneste se numeste subclasa
public class Masina {

    //O clasa este compusa din 2 parti
    //Atribute

    String culoare;
    int nrUsi;
    String numarInmatriculare;
    boolean hasItp;

    //Functii
    public String getCuloare(){
        return culoare;
    }


    //O clasa este un sablon pt obiecte
    //Descrie trasaturile obiectelor(la modul general)
    //Si contine functii ale obiectelor

}
