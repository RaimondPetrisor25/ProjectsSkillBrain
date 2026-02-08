package lectia6;

public class Main {

    public static void main(String[] args) {
        //Exemplu de obiect
        //Creem un obiect particular dupa sablonul oferit de clasa creata de noi

        Utilizator utilizator3 = new Utilizator();

        //Populam atribute cu valori
        utilizator3.setPrenume("georgel");
        utilizator3.setNume("georgescu");
        utilizator3.setAdresaEmail("georgel.georgescu@mail.com");
        utilizator3.setAdresaLivrare("Strada Unirii nr 20");
        utilizator3.setNrTelefon(12345678);

        //Apelam metode din interiorul clasei
        System.out.println(utilizator3.getFullName());
       //Creem un alt obiect dupa sablonul oferit de clasa

        System.out.println(utilizator3.getAdresaLivrare());

        Masina lexus = new Masina();

        lexus.culoare = "rosu";
        lexus.nrUsi = 5;
        lexus.hasItp = true;
        lexus.numarInmatriculare = "B666MTB";

        System.out.println(lexus.getCuloare());

        //Masina de raliu mosteneste trasaturi de la masina normala
        MasinaDeRaliu subaru = new MasinaDeRaliu( 125);

        //Avem acces la toate trasaturile mostenite de la superclasa
        subaru.culoare = "albastru";
        subaru.nrUsi = 4;
        subaru.hasItp = true;
        subaru.numarConcurs = 123;
        subaru.puncteCampionat = 600;

        subaru.getCuloare();


    }
        public static void suma(int a , int b) {
            System.out.println(a + b);


        }

        //Polymorphism
       //Putem avea metode cu acelasi nume dar semnatura diferta
       //Prin semnatura se intelege nr ,tipul sau ordinea parametrilor dintre paranteze
        public static void suma2(int a ,int b, int c){
            System.out.println(a+b+c);
        }
        public static void suma3(double a , double b){
            System.out.println(a+b);
    }
    public static void suma(int a ,double b){

        System.out.println(a+b);

    }
    public static void suma(double a , int b){
        System.out.println(a+b);

    }




    }

