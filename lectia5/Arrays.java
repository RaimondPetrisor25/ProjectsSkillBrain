package lectia5;

public class Arrays {

    public static void main(String[] args) {

        //Un Array este exact ca un sir de valori din matematica
        //Se defineste prin specificarea tipului de date pe care il va contine sirul
        //In cazul nostru int si un numar de paranteze patrate care definesc dimensiunile sirului
        //2 seturi de paranteze = 2 dimensiuni(o matrice ca in matematica)
        int[] sir = {1, 15, 24, 50};

        //UN sir trebuie neaparat sa stie ce dimensiune are
        //Ori prin initializare ca un numar de valori(ca in cazul de mai sus)
        //Ori prin specificarea intre paranteze a dimensiunii ca in cazul de mai sor
        int[] sir2 = new int[6];

       //Valorile stocate pot fi sterse sau actualizate in orice fel avem nevoie
        //Actualizarea se face ca mai jos
        sir2[0] = 18;
        sir2[3] = 98;
        sir2[1] = 196;

        // !!! Un sir sau array nu este niciodata gol.El este mereu preinitilizat de java cu valori arry
        String[] sirDeTexte = new String[4];

        sirDeTexte[1] = "georgel";
        sirDeTexte[3] = "ionica";
       //Definirea unui sir cu 2 dimensiuni(matrice)
       //UN sir odata initializat cu o dimensiune nu poate fi schimbata
        int[][] matrice = new int[3][3];

        matrice[0][0] = 19;
        matrice[2][2] = 198;
    }
}
