import java.util.*;
class Macierze{
    public static int[][] tworzenie(int n){
        Random ran= new Random();
        int[][] tab= new int[n][n];
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[0].length;j++){
                tab[i][j]=ran.nextInt(9);
            }
        }
        return tab;
    }
    public static void druk(int[][] tab){
        int lenW=tab.length;
        int lenK=tab[0].length;
        for(int i=0;i<lenW;i++){
            for(int j=0;j<lenK;j++){
                System.out.printf("  %d  ",tab[i][j]);
            }
            System.out.println("");
        }
    }
    public static int[][] trans(int[][] tab) {
        int lenW = tab.length;
        int lenK = tab[0].length;
        int[][] transpose = new int[lenW][lenK];
        for (int i = 0; i < lenW; i++) {
            for (int j = 0; j < lenK; j++) {
                transpose[i][j] = tab[j][i];
            }
        }
        return transpose;
    }
    public static int[][] dod(int[][] tab1,int[][] tab2){
        if(tab1.length!=tab2.length){
            System.out.println("Niepoprawny wymiar macierzy");
            return null;
        }
        if(tab1[0].length!=tab2[0].length){
            System.out.println("Niepoprawny wymiar macierzy");
            return null;
        }
        int lenW=tab1.length;
        int lenK=tab1[0].length;
        int[][] wyn=new int[lenW][lenK];
        for(int i=0;i<lenW;i++){
            for(int j=0;j<lenK;j++){
                wyn[i][j]=tab1[i][j]+tab2[i][j];
            }
        }
        return wyn;
    }
    public static int[][] mno(int[][] tab1,int[][] tab2){
        if(tab1.length!=tab2.length){
            System.out.println("Niepoprawny wymiar macierzy");
            return null;
        }
        if(tab1[0].length!=tab2[0].length) {
            System.out.println("Niepoprawny wymiar macierzy");
            return null;
        }
        int lenW=tab1.length;
        int lenK=tab1[0].length;
        int[][] wyn=new int[lenW][lenK];
        for(int i=0;i<lenW;i++){
            for(int j=0;j<lenK;j++){
                wyn[i][j]=tab1[i][j]*tab2[i][j];
            }
        }
        return wyn;
    }
    public static double wyz(int[][] tab){
        double wyznacznik = 0;
        if(tab.length==2&&tab[0].length==2) {
            wyznacznik=tab[0][0]*tab[1][1]-tab[0][1]*tab[1][0];
        }
        else if(tab.length==3&&tab[0].length==3){
            double dod,uje;
            dod=tab[0][0]*tab[1][1]*tab[2][2]+tab[1][0]*tab[2][1]*tab[0][2]+tab[2][0]*tab[0][1]*tab[1][2];
            uje=tab[0][2]*tab[1][1]*tab[2][0]+tab[1][2]*tab[2][1]*tab[0][0]+tab[2][2]*tab[0][1]*tab[1][0];
            wyznacznik=dod-uje;
        }
        else{
            System.out.println("Metoda odpowiedzialna za obliczanie wyznacznika nie obsluguje innych wielkosci macierzy niz 2x2 oraz 3x3");
            return Double.NaN;
        }

        return wyznacznik;
    }
}
public class Main{
public static void main(String[] args){
        int n = 3;
        int[][] tab = Macierze.tworzenie(n);
        Macierze.druk(tab);
        int[][] trans = Macierze.trans(tab);
        System.out.println("Macierz po transpozycji:");
        Macierze.druk(trans);

        int wynik[][] = Macierze.dod(tab, trans);
        System.out.println("Macierz po dodaniu macierzy i jej transpozycji");
        Macierze.druk(wynik);
        int mno[][] = Macierze.mno(wynik, tab);
        System.out.println("Macierz po wymnozeniu macierzy wynikowej oraz utworzonej na poczatku");
        Macierze.druk(mno);
        double wyznacznik = Macierze.wyz(tab);
        System.out.println("Ponowny wydruk pierwotnej macierzy:");
        Macierze.druk(tab);
    if (!Double.isNaN(wyznacznik)) {
        System.out.println("Wyznacznik macierzy wydrukowanej powyzej: " + wyznacznik);
    }

    }
    }

