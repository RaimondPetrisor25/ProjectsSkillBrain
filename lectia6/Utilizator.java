package lectia6;

public class Utilizator {

      //oricare dintre cei 4 modificator de acces pot fi folositi si pentru atribute

    //Incapsularea
    //Atat atributele cat si metodele pot fi declarate private ceea cel incapsuleaza(se limiteaza accesul)
    //Doar la fisierul unde acestea sunt declarate.
    //Se poate creea acces indirect la acesta cu ajutorul metodelor getter si setter
    //De asemenea putem sa alegem sa creem getter sau setter sau niciuna pt un anumit atribut
    //Este o metoda de securizare a datelor
     private String prenume;
     private String nume;
     private String adresaEmail;
     private String adresaLivrare;
     private double nrTelefon;

     //Medoda getter
       public String getNume() {
            return nume;
      }
     //Metoda setter
      public void setNume(String nume) {
            this.nume = nume;
      }

      public String getAdresaEmail() {
            return adresaEmail;
      }

      public void setAdresaEmail(String adresaEmail) {
            this.adresaEmail = adresaEmail;
      }

      public String getPrenume() {
            return prenume;
      }

      public void setPrenume(String prenume) {
            this.prenume = prenume;
      }

      public String getAdresaLivrare() {
            return adresaLivrare;
      }

      public void setAdresaLivrare(String adresaLivrare) {
            this.adresaLivrare = adresaLivrare;
      }

      public double getNrTelefon() {
            return nrTelefon;
      }

      public void setNrTelefon(double nrTelefon) {
            this.nrTelefon = nrTelefon;
      }
//Acces modifieers / modificari de acces
      //public -> cel mai permisiv modificator de acces.Permite accesul de oriunde la codul prefixat
      //cu acest cuvant cheie.

      public String getFullName(){
          return prenume + " " + nume;
      }

      //protected -> este mai restrictiv decat public.Permite accesul la codul prefixat cu el doar din
      //clase care se afla in acelasi pachet/folder si din clase aflate in relatie de mostenire cu
      //clasa noastra
      protected String functia1(){
            return "functia1";
      }

      //default(cand nu avem niciun modificator de acces specificat in fata functiei sau atributului) ->
      //este mai restrictiv decat protected .Permite acces la codul care nu are nicun prefix doar din clase care
      //se afla in acelasi pachet/folder.Spre deosebire de protected nu permite accesul si din clase
      //aflate in relatie de mostenire.
      String functia2(){
            return "functia2";
      }

      //private -> este cel mai restrictiv dintre acces modifiers.Permite acces la functia sau atributul
      //prefixat cu acesta doar din interiorul clasei in care este declarat
      private String functia3(){
            return "functia 3";
      }
}
