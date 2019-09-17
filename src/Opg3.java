public class Opg3 {

    /*OPGAVEBESKRIVELSE: Lav en metode midterst, der tager tre tal som parametre.
      Metoden skal returnere den midterste værdi.
      F.eks. skal kaldet midterst( 6, 10, 8 ) returnere 8.
     */

    /*Opdeling af programkode og testkode.
      Først udvikles testkoden, derefter programkoden, som kommer til sidst i sit eget scope uden for main.
      Rækkefølge af hvordan man opstiller en test case er i paranteser.
     */

    //Testkode

    public static void main(String[] args) {

        //Test CaseA: hvor sidste værdi er midterst (*1*)
        //Input 6, 10, 8
        //Forventet output 8

        //Opstilling af input (*2*)
        int x = 6;
        int y = 10;
        int z = 8;

        //Generer output (*4*)
        int output = midterst(x, y, z);

        //Sammenligningen med forventet output (*3*)
        if (output == 8)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        //_______________________________________________________

        //Test CaseB: hvor første værdi er midterst (*1*)
        //Input 3, 7, 2
        //Forventet output 3

        //Opstilling af input (*2*)
        x = 3;
        y = 7;
        z = 2;

        //Generer output (*4*)
        output = midterst(x, y, z);

        //Sammenligningn med forventet output (*3*)
        if (output == 3)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        //_______________________________________________________


        //Test CaseC: hvor midterste værdi er midterst (*1*)
        //Input 10, 25, 50
        //Forventet output 25

        //Opstilling af input (*2*)
        x = 10;
        y = 25;
        z = 50;

        //Generer output (*4*)
        output = midterst(x, y, z);

        //Sammenligningn med forventet output (*3*)
        if (output == 25)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        //_______________________________________


        //Test CaseD: hvor midterste værdi er midterst (*1*)
        //Input 6, 6, 10
        //Forventet output 6

        //Opstilling af input (*2*)
        x = 6;
        y = 6;
        z = 10;

        //Generer output (*4*)
        output = midterst(x, y, z);

        //Sammenligningn med forventet output (*3*)
        if (output == 6)
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }


//__________________________________________________________
    //Programkode, som er isoleret. (*5*)

    static int midterst(int x, int y, int z){
    //(...noget smart metode kode her...)
        if (x <= y && y < z || x > y && y > z){
            System.out.println(y);
            return y;

        } else if (y <= x && y < z || y > x && x > z){
            System.out.println(x);
            return x;

        } else {
            System.out.println(z);
            return z;
            }

    }

}
