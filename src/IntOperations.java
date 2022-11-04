public class IntOperations {
    public static void main(String[] args) {
       int a = 15;
       int b = 15;

       addNumbers(a, b);
       addBinaryNumbers(a, b);
       addOctalNumbers(a, b);
       addHexNumbers(a, b);

    }
    static void addNumbers(int a, int b) {
        int sumNumber = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + sumNumber + '\n');
    }

    static void addBinaryNumbers(int a, int b) {
        int sumBinary = a + b;
        System.out.println("binarnie");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("------ (+)");
        System.out.println(Integer.toBinaryString(sumBinary) + '\n');

    }
    static void addOctalNumbers(int a, int b) {
       int sumOctal = a + b;
        System.out.println("Ósemkowo");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("------ (+)");
        System.out.println(Integer.toOctalString(sumOctal) + '\n');
    }
    static void addHexNumbers(int a, int b) {
        int sumHex = a + b;
        System.out.println("Szesnastkowo");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println("------ (+)");
        System.out.println(Integer.toHexString(sumHex) + '\n');
    }


}


/* Napisz program wykonujący dowolną operację na dwóch liczbach całkowitych
   typu int oraz demonstruje wizualnie to działanie w dwójkowym,
  ósemkowym oraz szesnastkowym systemie liczbowym */