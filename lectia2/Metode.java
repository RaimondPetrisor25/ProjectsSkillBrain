package lectia2;

public class Metode {
    public static void main(String[] args) {
        //Apelam functiile declarate si pasam o valoare pentru care vrem sa ne fie calculat perimetru/Arie
        perimetruPatrat(15);
        perimetruPatrat( 25);
        perimetruPatrat( 32);
        perimetruPatrat( 65);
        ariePatrat(72);
        //Incercam sa adunam rezultatul a doua functii care nu dau mai departe niciun rezultat.Au return
        //type void(adica nimic - rezultatul nu este o valoare tangibilla)

        //int arieTotala = ariePatrat( 72) + ariePatrat( 50);
        int ariaPatratelor = ariaUnuiPatrat(72) + ariaUnuiPatrat( 72);
        //Am declarat o functie care calculeaza perimetrul unui patrat dar nu da nicio valoare mai departe
        //adica are return type void(vid)
        System.out.println(ariaPatratelor);




    }

    public static void perimetruPatrat(int latura) {
        System.out.println(latura * 4);

    }
    public static void ariePatrat(int latura) {
        System.out.println(latura * latura);
        //Am declarat o functie care calculeaza aria unui patrat DAR da mai departe rezultatul calcului
        //adica are return type definit in acest caz "int"
    }
        public static int ariaUnuiPatrat(int latura) {
            return latura * latura;
        }





}
