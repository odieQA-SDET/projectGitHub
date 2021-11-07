import java.util.Scanner;

public class Persegi extends  Bangun_Datar
{
    public void persegi() {
        double Luas,Kel,sisi;
        Scanner P = new Scanner(System.in);
        System.out.println("Persegi/Bujur Sangkar");
        System.out.println("=====================");
        System.out.println("Input Sisi : ");
        sisi = P.nextDouble();

        Luas = sisi*sisi;
        Kel = 4 * sisi;
        System.out.println("Luas Persegi adalah          : "+Luas+"  cm");
        System.out.println("Luas Keliling Persegi adalah : "+Luas+"  cm");
        P.close();

    }
}
