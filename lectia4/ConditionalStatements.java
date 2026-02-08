package lectia4;

import javax.xml.transform.Source;

public class ConditionalStatements {

    public static void main(String[] args) {
        int numar = 17;

        if (numar % 2 == 0) {
            System.out.println("Numarul " + numar + "este par");
        } else {
            System.out.println("Expresia este falsa");
        }
        System.out.println("dupa if");

        canVote(25);
        canVote(12);
        canVote(18);
        naturaNumar(15);
        naturaNumar(0);
        naturaNumar(-40);
        isVowel('a');
        isVowel('b');


    }


    public static void canVote(int varsta) {
        if (varsta >= 18) {
            System.out.println("Poti vota");
        } else {
            System.out.println("Esti prea tanar sa poti vota");
        }
    }

    public static void naturaNumar(int numar) {
        //Verificam daca numarul este pozitiv,negativ sau 0
        if (numar > 0) {
            System.out.println("numar pozitiv ");
        } else if (numar < 0) {
            System.out.println("numar negativ");
        } else {
            System.out.println("zero");
        }

    }

    public static void isVowel(char caracter) {
        if (caracter == 'a') {
            System.out.println("Vocala");
        } else if (caracter == 'e') {
            System.out.println("Vocala");
        } else if (caracter == 'i') {
            System.out.println("Vocala");
        } else if (caracter == 'o') {
            System.out.println("Vocala");
        } else if (caracter == 'u') {
            System.out.println("Vocala");
        } else {
            System.out.println("Consoana");
        }
    }

    public static void isVowel2(char caracter) {


    }

    public static void isVowelSwitch(char caracter) {
        switch (caracter) {
            case 'a':
                System.out.println("Vocala");
                break;
            case 'e':
                System.out.println("Vocala");
                break;
            case 'i':
                System.out.println("Vocala");
                break;
            case 'o':
                System.out.println("Vocala");
            case 'u':
                System.out.println("Vocala");
                break;
            default:
                System.out.println("Consoana");
            {
            }
        }
    }
    public static void isVowelEnahancedSwitch(char caracter) {
        switch (caracter){
            case 'a' -> System.out.println("Vocala");
            case 'e' -> System.out.println("Vocala");
            case 'i' -> System.out.println("Vocala");
            case 'o' -> System.out.println("Vocala");
            case 'u' -> System.out.println("Vocala");
            default -> System.out.println("Consoana");
        }
    }
       public static void isVowelEnhancedSwitchsShort(char caracter){
        switch (caracter){
            case 'a' , 'e' , 'i' , 'o' , 'u' -> System.out.println("Vocala");
            default -> System.out.println("consola");
        }
       }

    }











