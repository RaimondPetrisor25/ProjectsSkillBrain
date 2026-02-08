package lectia5;

public class BuclaFor {

    public static void main(String[]  args) {

        //O bucla(loop) este un bloc de cod ce se va repeta de un numar de ori
        //O bucla for are nevoie de un contor care sa inregistreze de cate ori s-a repetat bucla
        //O conditie care va opri repetarea buclei
        //SI o "functie care incrementeze controlul in asa fel incat bucla sa se opreasca
        for(int i=0; i < 15;  i++){
            System.out.println(i);
            //Mai jos nu este definita bucla "for each".Nu exista un cuvant cheie "each' in java dar
            //Functia a capatat acest nume pentru ca efectueaza o operatie pentru fiecare element din sir
            //Datorita acestui "pentru fiecare "a fost denumita "for each"
            //NU mai avem nevoie sa definim counter
            //Nu mai este nevoie sa stim lungimea sirului dinainte
            //NU mai este nevoie sa incrementam counterul manual
            //Bucla for each va avea o variabila(in cazul nostru "numar")care va lua fiecare valoare stocata in
            //si va face ceva cu ea in blockul for,in acest caz sa o afiseze

        }

        int[] sir = {10, 15, 21, 286, 295, 1100, 50, 86};
        //pentru a afisa fiecare element din arryul "sir" ne putem folosii de o bucla
        //in aceasta bucla vom definii contorul nostru sa fie egal cu indexul de unde vrem sa incepem afisarea
        //definim conditia de oprire a buclei in asa fel incat sa nu despasim dimensiunea sirului
        //iar la final incrementam contorul ca bucla sa nu se repete la infinit
        for(int i = 0;i<sir.length;i++ ){
            System.out.println(sir[i]);
        }


        for(int numar : sir){
            System.out.println(numar);
        }

    }
}
