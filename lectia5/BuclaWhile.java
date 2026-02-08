package lectia5;

public class BuclaWhile {

    public static void main(String[] args) {
        int[] sir = {10, 15, 155, 80, 98, 102};
        int counter = 0;
        while (counter < sir.length) {
            System.out.println(sir[counter]);
            counter++;
        }
        int counter2 = 0;
       do{
           System.out.println(sir[counter2]);
           counter2++;
       }while (counter2 < sir.length);



    }


}
