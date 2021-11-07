public class Problem5_Bilangan_Prima {
    private static boolean primeNumber(int value) {
        int num;
        num = value;
        if (num <  2 || num % 2 == 0)
                return false;
            for (int a = 3; a * a <= num; a += 2)
                if (num % a == 0)
                    return false;
                        return true;
                }
                public static void main(String[] args) {
                    System.out.println(primeNumber( 11)); //true
                    System.out.println(primeNumber( 13)); //true
                    System.out.println(primeNumber( 17)); //true
                    System.out.println(primeNumber( 20)); //false
                    System.out.println(primeNumber( 35)); //false
            }
        }


