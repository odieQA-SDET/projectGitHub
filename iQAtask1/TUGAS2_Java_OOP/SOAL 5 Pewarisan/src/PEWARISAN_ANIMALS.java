public class PEWARISAN_ANIMALS {
    public static void main(String[] args)
    {
        System.out.println("HELLO I'M PARENT OF ALL ANIMAL MY NAME IS BINATANG LANGKA & PERKASA HA HA HAHAHA");
        System.out.println("================================================================================");
        System.out.println("===>>HERBIVORA<<===");
        Herbivora H = new Herbivora();
        H.tampilkan();

        System.out.println("===>>CARNIVORA<<===");
        Carnivora C = new Carnivora();
        C.tampilkan();

        System.out.println("===>>OMNIVORA<<===");
        Omnivora O =new Omnivora();
        O.tampilkan();
    }
}
