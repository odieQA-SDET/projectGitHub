import java.util.Scanner;
public class Padang extends Ongkir
{
        public void padang() {
           double Volume,Panjang,Lebar,Tinggi,Biayakg,beratPerkg,Bayar;
            Scanner P = new Scanner(System.in);
            System.out.println("TUJUAN KOTA PADANG");
            System.out.println("===============================================");
            System.out.println("Silahkan Masukan Volume Barang dan Berat Kg");
            System.out.println("Input Panjang: ");
            Panjang = P.nextDouble();
            System.out.println("Input Lebar:   ");
            Lebar = P.nextDouble();
            System.out.println("Input Tinggi: ");
            Tinggi = P.nextDouble();
            System.out.println("Input Berat Barang: ");
            beratPerkg = P.nextDouble();

            Volume = Panjang*Lebar*Tinggi;
            System.out.println("Volumetrik Barang adalah : "+Volume+" m3");

            if (Volume <= 50) {
             Volume =1;
             Biayakg=5000;
             Bayar = Volume*beratPerkg*Biayakg;
             System.out.println("Ongkir adalah Rp: "+Bayar+"");
            }
            P.close();
        }
    }
