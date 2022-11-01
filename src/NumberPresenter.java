public class NumberPresenter {
    /*Plik NumberPresenter.java zawiera niekompletny program wyświetlający liczbę całkowitą
    w różnych systemach liczbowych. Pobierz plik, usuń błędy i uruchom program. */

    public static void main(String[] args) {
        //deklaracja zmiennej lokalnej
        int i = 123;

         showInt(i);
         showIntAsBinary(i);
         showIntAsOctal(i);
         showIntAsHex(i);
    }

    public static void showInt(int i) {
        System.out.println("dziesietnie: \t" + i);
        System.out.println("------------------------");
    }

    public static void showIntAsBinary(int i) {
        System.out.println("binarnie: \t\t" + Integer.toBinaryString(i));
    }

    public static void showIntAsOctal(int i) {
        System.out.println("osemkowo: \t\t" + Integer.toOctalString(i));
    }

    public static void showIntAsHex(int i) {
        System.out.println("szesnastkowo: \t" + Integer.toHexString(i));
    }

    // Uzyskany wynik:
    /*  dziesietnie: 	123
        ------------------------
    binarnie: 		1111011
    osemkowo: 		173
    szesnastkowo: 	7b */


}





