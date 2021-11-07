import java.util.Scanner;
public class Problem5_UbahHuruf {
    static String ubahHuruf = "abcdefghijklmnopqrstuvwxyz";
    public static String encoding(String pText, int Key) {
        pText = pText.toLowerCase();
        StringBuilder cText = new StringBuilder();
        for (int i = 0; i < pText.length(); i++) {
            int charIndex = ubahHuruf.indexOf(pText.charAt(i));
            int newIndex = (charIndex + Key) % 26;
            char cipherChar = ubahHuruf.charAt(newIndex);
            cText.append(cipherChar);
        }
        return cText.toString();
    }

    public static String decoding(String cText, int Key) {
        cText = cText.toLowerCase();
        StringBuilder pText = new StringBuilder();
        for (int i = 0; i < cText.length(); i++) {
            int charIndex = ubahHuruf.indexOf(cText.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex < 0) {
                newIndex = ubahHuruf.length() + newIndex;
            }
            char plainChar = ubahHuruf.charAt(newIndex);
            pText.append(plainChar);
        }
        return pText.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.print("Enter Plain Text >>");
                String plain = scan.nextLine();
                System.out.print("Enter Key >>");
                int Key = scan.nextInt();
                String cipherText = encoding(plain, Key);
                System.out.println("The Chiper Text: " + cipherText);
                System.out.println("The decoded Massage Is: " + decoding(cipherText, Key));
    }
}
/*
          System.out.println(alphabet("SEPULSA OKE"));     // COZEVCK YUO
          System.out.println(alphabet("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
          System.out.println(alphabet("INDONESIA"));       // SXNYXOCSK
          System.out.println(alphabet("GOLANG"));          // QYVKXQ
          System.out.println(alphabet("PROGRAMMER"));     // ZBYQBKWWOB
  */




