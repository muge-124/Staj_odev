public class Item {
    private String urunAdi;
    private String tedarikciAdi;
    private double satisFiyati;
    private double alisFiyati;

    public Item(String urunAdi, String tedarikciAdi, double satisFiyati, double alisFiyati) {
        this.urunAdi = urunAdi;
        this.tedarikciAdi = tedarikciAdi;
        this.satisFiyati = satisFiyati;
        this.alisFiyati = alisFiyati;
    }

    // Getter ve Setter metodları
    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getTedarikciAdi() {
        return tedarikciAdi;
    }

    public void setTedarikciAdi(String tedarikciAdi) {
        this.tedarikciAdi = tedarikciAdi;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public double getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    // %20 arttıran method
    public void satisFiyatiArttir() {
        this.satisFiyati *= 1.20;
    }

    public double karHesapla() {
        return this.satisFiyati - this.alisFiyati;
    }

    public void showInfos() {
        System.out.println("Ürün adı: " + this.urunAdi);
        System.out.println("Tedarikçi adı: " + this.tedarikciAdi);
        System.out.println("Satış Fiyatı: " + this.satisFiyati);
        System.out.println("Alış Fiyatı: " + this.alisFiyati);
    }
}
