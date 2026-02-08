package lectia4;

public class Excertii {
    public static void main(String[] args) {
    //Sa se creeze o functie care sa verifice daca un an este bisect sau nu
    //anul trebuie sa se imparta exact la 4 dar sa nu se imparta exact la 100
    //Sau sa se imparta exact la 400

        isLeapYear( 2025);
        isLeapYear( 2000);
        isLeapYear( 6800);
        isLeapYear( 6804);

        //sa creem o functie care reprezinta un minicalculator
        //se dau 2 numere si un caracter care reprezinta operatia ce trebuie executata cu cele 2 numere
        calculator( 10 , 15, '+');
        calculator( 20, 67, '-');
        calculator( 100, 92 , '*');
        calculator(16,18,'/');
        calculator(70,19,'a');



    }

    public static void isLeapYear(int anul){
      if((anul % 4 ==0 && anul % 100 != 0) || (anul % 400 == 0)){
          System.out.println(anul + "este an bisect");
      }else {
          System.out.println(anul + "nu este bisect");
      }
    }
public static void calculator(int a, int b, char operatia){
        switch (operatia){
            case '+' -> System.out.println("+ " + (a + b));
            case '-' -> System.out.println("-"  + (a - b));
            case '*' -> System.out.println("* " + (a * b));
            case '/' -> System.out.println("/ " + (a / b));
            default -> System.out.println("Operatie invalid");


        }
}
}



