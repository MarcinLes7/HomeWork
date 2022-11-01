public class Calculator {
    public static void main(String[] args) {

/*      Napisz program Calculator.java, zawierający metody do sumowania, odejmowania i mnożenia
        dwóch liczb całkowitych. Zaprezentuj działanie każdej z metod. */

        int numberx = 5;
        int numbery = 2;

        Numbers(numberx, numbery); // nie wiem dlaczego tak to ma działać?

    }

    public static void Numbers(int numberx, int numbery) { // dlaczego tak?
        int sumNumber = numberx + numbery;
        System.out.println("Suma liczb: " + numberx + " + " + numbery + " = " + sumNumber);

        int divNumber = numberx - numbery;
        System.out.println("Różnica liczb: " + numberx + " - " + numbery + " = " + divNumber);

        int multNumber = numberx * numbery;
        System.out.println("Iloczyn liczb: " + numberx + " * " + numbery + " = " + multNumber);
    }

}
