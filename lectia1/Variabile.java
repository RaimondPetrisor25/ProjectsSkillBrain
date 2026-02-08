package lectia1;

public class Variabile {
    public static void main(String[] args) {
        byte byteVariable = -128;
                //byte poate stoca numere naturale intre -128 si +127
        short shortVariable = 32767;
                //Short poate stoca numere naturale intre -32768 si +32767
        int intVariable = 2_147_483_647;
        //Int poate stoca numere naturale intre -2_147_482_648 si 2_147_482_647
        long longVariable = -9_223_372_036_854_775_807L;
        //Long poate stoca numere naturale intre -9_223_372_036_854_775_807L si 9_223_372_036_854_775_807L
        //particularitatea lui long este ca trebuie sa punem litera "L"
        float floatVariable = 3.12345F;
        //particularitatea lui float este ca trebuie sa punem litera "F"
        double doubleVariable = 1.79769313;
        //Double poate stoca numere cu virgula extrem de mari(64 biti)
        char charVariable = 'a';
                //particularitatea lui char este ca caracterul trebuie pus intre ghilimele simple
        String stringVariable = "Si aici putem sa scriem cate caractere ,cifre si simboluri vrem noi";
        //Particularitatea lui string este ca aceste caractere trebuie sa fie pus intre ghilimele duble
        boolean booleanVariable = false;
        //Boolean poate stoca doar "true sau false"

    }
}
