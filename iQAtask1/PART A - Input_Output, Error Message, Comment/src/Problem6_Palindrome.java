public class Problem6_Palindrome {
    private static boolean palindrome(String value) {
        StringBuffer rv = new StringBuffer(value).reverse();
        return value.equalsIgnoreCase(rv.toString());
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));       //true
        System.out.println(palindrome("katak"));       //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu"));   //false
        System.out.println(palindrome("lion"));        //false
    }
}
