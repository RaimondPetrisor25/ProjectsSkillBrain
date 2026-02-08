package lectia3;

public class excercitii {
    //Sa creem o functie/metoda care sa verifice daca un numar este par sau impar
    //functia noastra va returna "true" daca numarul este par si "false" daca numarul este impar

    public static void main(String[] args) {
        System.out.println(estePar(15));
        System.out.println(estePar(16));
      //  estePar()
        //functia noastra trebuie doar sa afiseze intr-un format predefinit transformarea noastra
        //Format : minute = x ore ,sau y zile ,sau z ani
        convertorTimp(365);
        convertorTimp(6890);
        convertorTimp(1235689);

        //Sa creem o functie/metoda care sa returneze cubul uni numar (numarul respectiv ridicat la puterea a3a)
        System.out.println(ricicareLaCub(15));
        //Sa creem o functie/metoda care sa returneze lungimea unu string
        System.out.println(lungimeString("salutare"));




    }

    /**
     * Aceasta functie verifica daca un numar este par sau impar
     * @param numar -> parametrul reprezinta numarul pe care il verific
     * @return ca returna un boolean in functie de paritatea numarului
     */

public static boolean estePar(int numar) {
return (numar % 2)  == 0;
    }
    public static void convertorTimp(int minute) {
        int ore = minute / 60;
        int zile = minute / 1440;
        int ani = minute / 525600;

        System.out.println(minute + " minute = " + ore + " ore sau " + zile + " zile " + ani + " ani ");
    }
            public static double ricicareLaCub(double numar) {
                return Math.pow(numar, 3);
            }
        public static int lungimeString(String input){
    return input.length();

        }


}