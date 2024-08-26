public class Main {
    public static void main(String[] args) {
        Item items1 = new Item("Elma", "Müge", 20.0, 15.0);
        Item items2 = new Item("Armut", "Melis", 40.0, 25.0);
        Item items3 = new Item("Muz", "Özdilek", 60.0, 35.0);

        ShoppingCart sepet = new ShoppingCart();
        items1.showInfos();
        System.out.println("Kâr: " + items1.karHesapla() + " TL");

        sepet.urunEkle(items1);
        sepet.urunEkle(items2);
        sepet.urunEkle(items3);

        System.out.println("\nSepetteki ürünler: ");
        sepet.sepetiYazdir();

        double toplamFiyat = sepet.toplamFiyatHesapla();
        System.out.println("\nSepetteki ürünlerin toplam fiyatı: " + toplamFiyat + " TL");

        // Satış fiyatını %20 artırma ve güncellenmiş fiyatları tekrar yazdırma
        items1.satisFiyatiArttir();
        items2.satisFiyatiArttir();
        items3.satisFiyatiArttir();

        System.out.println("\n%20 zamdan sonra sepetteki ürünler:");
        sepet.sepetiYazdir();

        // Güncellenmiş toplam fiyatı hesaplama ve yazdırma
        toplamFiyat = sepet.toplamFiyatHesapla();
        System.out.println("\nGüncellenmiş toplam fiyat: " + toplamFiyat + " TL");
    }
}
