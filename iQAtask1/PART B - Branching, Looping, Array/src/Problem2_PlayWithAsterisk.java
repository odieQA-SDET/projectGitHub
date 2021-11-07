import java.util.Scanner;
public class Problem2_PlayWithAsterisk {
    public static void main(String[] args){
            int t;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan tinggi : ");
        t= input.nextInt();
        input.close();
        int jum = 1;
        for (int i=1;i<=t;i++) {
            for (int s = t - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int b=1;b<=jum;b++){
                System.out.print("*");
        }jum+=2;
        System.out.print("\n");
        }

        }
    }

