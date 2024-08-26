public class ShoppingCart {
    private Item[] sepet;
    private int urunSayisi;

    public ShoppingCart() {
        this.sepet = new Item[10]; // Sabit boyutlu bir dizi, 10 ürüne kadar destekler.
        this.urunSayisi = 0;
    }

    public void urunEkle(Item urun) {
        if (urunSayisi < sepet.length) {
            sepet[urunSayisi] = urun;
            urunSayisi++;
        } else {
            System.out.println("Sepet dolu");
        }
    }

    public double toplamFiyatHesapla() {
        double toplamFiyat = 0.0;
        for (int i = 0; i < urunSayisi; i++) {
            toplamFiyat += sepet[i].getSatisFiyati();
        }
        return toplamFiyat;
    }

    public void sepetiYazdir() {
        for (int i = 0; i < urunSayisi; i++) {
            System.out.println(sepet[i].getUrunAdi() + " - Fiyat: " + sepet[i].getSatisFiyati() + " TL");
        }
    }
}
