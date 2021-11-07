import java.util.Scanner;
public class Segitiga extends  Bangun_Datar
    {
        public void segitiga() {
            double A,T,S,luas,kel;
            Scanner s3 =new Scanner(System.in);
            System.out.println("Segitiga");
            System.out.println("========");
            System.out.println("Input ALas :  ");
            A = s3.nextDouble();
            System.out.println("Input Tinggi :  ");
            T = s3.nextDouble();
            System.out.println("Input Sisi :  ");
            S = s3.nextDouble();

            luas = (A * T)/2;
            kel = (S*2)+A;
            System.out.println("Luas Segitiga adalah     : "+luas+"  cm");
            System.out.println("Keliling Segitiga adalah : "+kel+"   cm");
            s3.close();
        }
    }
