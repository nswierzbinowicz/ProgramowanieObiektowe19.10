import static java.lang.Math.*;
public class Zestaw3 {

    public static int silnia(int n){
        int val = 1;
        for(int i = 1; i <= n; i++){
            val *= i;
        }
        return val;
    }
    static void trojkiPitagorejskie(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(pow(i,2) + pow(j,2) == pow(k,2)){
                        System.out.println(i + "² + " + j + "² = " + k + "²");
                    }
                }
            }
        }
    }
    static void liczbypierwsze(int n ){
        for(int i = 2; i <= n; i++){
            for(int j = 2; j < n;j++){
                if(i%j == 0 && i != j){
                    System.out.println(i);
                }
            }
        }
    }
    static void trojkatpascala(int n){
        String space = "";
        for(int i = 0; i < n; i++){
            for(int k = 1; k <= n-i;k++){
                space += " ";
            }
            System.out.printf(space);
            space = "";
            for(int j = 0; j <= i; j++){
                System.out.printf(silnia(i)/(silnia(j)*silnia(i-j)) + " ");
            }
            System.out.println(" ");
        }
    }
    static boolean czyPalindrom(int n){
        int dlugosc = 1;
        int nclone = n;
        int nclone2 = n;
        int valtocheck = 0;
        while(nclone >= 10){
            nclone /= 10;
            dlugosc += 1;
        }
        for(int i = 1; i <= dlugosc; i++){
            valtocheck += nclone2%10 * Math.pow(10,dlugosc - i);
            nclone2 /= 10;
        }
        if(n == valtocheck){
            System.out.println("Podana liczba jest palindromem " + valtocheck);
            return true;
        }
        else{
            System.out.println("Podana liczba nie jest palindromem " + valtocheck);
            return false;
        }
    }
    public static void main(String[] args) {
//        trojkatpascala(2);
//        czyPalindrom(56261);
//        trojkiPitagorejskie(100);
          liczbypierwsze(10);
    }
}
