package lectia4;


public class Tema {


    //Problema1
    //Creati o metodata "gradeTranslator",si care are return type void.
    //Aceasta functie trebuie sa aiba un parametru de tip int care sa reprezinte un procent intre 1 si 100.
    //Procent intre 90 si 100 > Grade:A
    //Procent intre 80 si 89 > Grade:B
    //Procent intre 70 si 79 > Grade:C
    //Procent intre 60 si 69 > Grade:D
    //Procent sub 60 > Grade:F.


    public static void gradeTranslator(int procent) {
        if (procent < 0 || procent > 100) {
            System.out.println();
            System.out.println(procent + " nu este valid");

        } else if (procent >= 90) {
            System.out.println();
            System.out.println(procent + " este valid. Grad: A");
        } else if (procent >= 80) {
            System.out.println();
            System.out.println(procent + " este valid. Grad: B");
        } else if (procent >= 70) {
            System.out.println();
            System.out.println(procent + " este valid. Grad: C");
        } else if (procent >= 60) {
            System.out.println();
            System.out.println(procent + "este valid. Grade: D");
        } else {
            System.out.println(procent + "este valid. Grade F");

            //Problema2
            //Creati o functie care sa se numeaasca "checkDateType" si care are return type void.
            //Aceasta functie trebuie sa aiba un parametru de tip String care reprezinta o zi a saptamanii.
            //Aceasta functie trebuie sa ne spuna daca data ziua introdusa este zi lucratoare,zi de weekend
            //Sau este un text valid.

        }
    }

       public static void checkDateType(String zi) {
        switch (zi){
            case "luni" , "marti" ,"miercuri" , "joi" , "vineri" -> System.out.println("zi lucratoate");
            case "sambata" , "duminica" -> System.out.println("wekeend");
            default -> System.out.println("zi invalida");

       }






}



































}
