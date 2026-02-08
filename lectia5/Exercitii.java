package lectia5;

import java.util.Scanner;

public class Exercitii {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Sa se creeze o functie care sa calculeze si sa afiseze suma primelor n numere
        //n fiind un numar citit de la tastatura


        int n = input.nextInt();
        sumaNumere(n);

        //Sa se creeze o functie care va lua ca si parametru un numar introdus de la tastatura
        //Iar functia noastra va inversa cifrele numarului si le va afisa -> daca numarul nostru este 1234
        //Functia va afisa 4321
        int numar = input.nextInt();
         inversareCifre(numar);

         //Sa se creeze o functie care sa afiseze daca un numar se afla intr-un interval valid
         //Daca numarul nu este in intervalul valid sa se repete pana cand numarul introdus este valid
        int numar2 = input.nextInt();
        validNumber();

        //Sa se printeze o piramida formata din stelute(*) cu un numar de randuri specificat de la tastatura
        piramida(15 );

        //sa se creeze o functie care sa afiseze cate cifre are un numar
        numaratorCifre(123456);


    }

    public static void sumaNumere(int n){
        int suma = 0;
        for(int i =0; i<= n; i++){
            suma = suma + i;
            //suma += i;
        }
        System.out.println(suma);
    }

    public static void inversareCifre(int numar){
        int reversed = 0;

        while(numar != 0){
           int digit = numar %10;
           reversed = (reversed + digit) * 10;
           numar /= 10;

        }

        System.out.println(reversed);
    }

    public static void validNumber(){
     int numar;
        do {
            System.out.println("Introduceti un numar intre 1 si 10 ");
            numar = input.nextInt();
        }while (numar< 1 || numar > 10);

        System.out.println("Ati introdus un numar valid: " + numar);
        input.close();


    }

    public static void piramida(int nrRanduri){
        for (int i = 1; i <= nrRanduri; i++){
            for(int j = 1; j<= nrRanduri-i;j++){
                System.out.print(" ");}
            for (int k = 1;k <=2*i-1; k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void numaratorCifre(int numar){
        int counter = 0;
        while (numar != 0){
            numar = numar/ 10;
            counter++;


        }
        System.out.println(counter);
    }



}
