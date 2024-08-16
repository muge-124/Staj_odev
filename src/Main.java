public class Main {
    public static void main(String[] args) {

        dikdörtgencevrealan dikdortgen = new dikdörtgencevrealan(10, 5);


        double alan = dikdortgen.alanHesapla();
        double cevre = dikdortgen.cevreHesapla();


        System.out.println("Dikdörtgenin Alanı: " + alan + " birim kare");
        System.out.println("Dikdörtgenin Çevresi: " + cevre + " birim");
    }
}
