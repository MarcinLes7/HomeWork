public class NumberPresenter1 {
    public static void main(String[] args) {

        // Próba zrobienia tego samego w inny sposób
        int x = 123;

        System.out.println("----------------");
        System.out.println("Liczba " + x + " wyrażona dziesiętnie to " + Integer.toBinaryString(x));
        System.out.println("Liczba " + x + " wyrażone w systemie ósemkowym to " + Integer.toOctalString(x));
        System.out.println("Liczba " + x + " wyrażona w systemie szesnastkowym to " + Integer.toHexString(x));

    }
    // Uzyskany wynik:
    /*  Liczba 123 wyrażona dziesiętnie to 1111011
    Liczba 123 wyrażone w systemie ósemkowym to 173
    Liczba 123 wyrażona w systemie szesnastkowym to 7b */




}
