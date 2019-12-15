
import java.util.Scanner;

public class Fibonacci {

    private final Scanner sc;
    private final int max_prvku = 50;
    public int[] tabulka;

    public Fibonacci(){

    sc = new Scanner(System.in);
   tabulka = new int[max_prvku];
   tabulka[0] = 0;
   tabulka[1] = 1;
        for(int i = 2; i < max_prvku; ++i){
            tabulka[i] = -1;
        }



    }

    public void menu(){
        while(true){
            int volba;

            System.out.println("\n1 - Počítej rekurzivně");
            System.out.println("2 - Počítej nerekurzivně");
            System.out.println("3 - Počítej dynamicky s tabulkou");
            System.out.println("---------------------------------");
            System.out.println("4 - KONEC");
            System.out.println("5 - TEST tabulka");
            System.out.println("6 - TEST tabulka - Vypiš celou tabulku");
            System.out.print("Tvoje volba: ");

            volba = sc.nextInt();

            switch(volba){

                case (1):
                    //CalcRek(poradi());
                    System.out.println("\nVysledek rekurzivně: " + CalcRek(poradi()));
                    break;

                case (2):
                    System.out.println("\nVysledek rekurzivně: " + CalcNerek(poradi()));
                    break;

                case (3):
                    System.out.println("\nVýsledek pomocí tabulky: " + CalcRekTable(poradi()));
                    break;

                case (4): //Exit app
                    return;

                case (5): //test jestli je uložené číslo v tabulce
                    System.out.print("Zadej pořadové číslo v tabulce: ");
                    int x = sc.nextInt();
                    System.out.println("Fibonacciho číslo na pozici " + x + " je : " + tabulka[x]);
                    break;

                case (6): //výpis celé tabulky
                    System.out.println("\nVýpis tabulky: ");
                    for (int i=0;i<max_prvku;i++)
                        System.out.print(tabulka[i] + " ");
                    break;

                default:
                    System.out.println("Zadejte volbu 1-5");
                    break;
            }
        }
    }

    public int CalcRek(int n){

        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return CalcRek(n - 1) + CalcRek(n - 2);

    }

    public int CalcRekTable(int n){

        if(n == 0 ) return tabulka[n];
        else if(n == 1 ) return tabulka[n];
        else tabulka[n] =  CalcRek(n - 1) + CalcRek(n - 2);

        return tabulka[n];
    }

    public int CalcNerek(int n){

        int vysledek = 0;
        int minule = 1;
        int predminule = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i=1; i < n; i++){
            vysledek = minule + predminule;
            predminule = minule;
            minule = vysledek;
        }
        return vysledek;

    }

    /*
    public void zadejMezPosloupnosti(){

        int poradi;
        System.out.print("Zadej pořadí Fibonacciho prvku posloupnosti počítaného REKURZIVNĚ: ");
        poradi = sc.nextInt();
        System.out.println("Vysledek rekurzivně: " + CalcRek(poradi));
        System.out.print("Zadej pořadí Fibonacciho prvku posloupnosti počítaného NEREKURZIVNĚ: ");
        poradi = sc.nextInt();
        System.out.println("Vysledek NErekurzivně: " + CalcNerek(poradi));

    }*/

    public int poradi(){

        int poradi;
        System.out.print("Zadej pořadí Fibonacciho prvku posloupnosti: ");

        //TODO omezení na max_prvku!!!
        return poradi = sc.nextInt();

    }




}
