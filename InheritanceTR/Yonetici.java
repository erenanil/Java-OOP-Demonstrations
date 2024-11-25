package InheritanceTR;

// Yonetici sınıfı, Calisan sınıfından kalıtım alır
class Yonetici extends Calisan {
    // Yöneticinin ekstra bir özelliği
    int ekipSayisi; // Yöneticinin yönettiği ekip sayısı

    // Yonetici yapıcı metodu, Calisan sınıfının yapıcısını çağırarak miras alır
    public Yonetici(String isim, String departman, double maas, int ekipSayisi) {
        super(isim, departman, maas); // Üst sınıfın yapıcı metodunu çağırıyoruz
        this.ekipSayisi = ekipSayisi;
    }

    // Yöneticinin özel bir metodu
    public void ekipYonet() {
        System.out.println(this.isim + " " + this.departman + " departmanındaki ekibi yönetiyor.");
    }

    // Yöneticinin bilgilerini gösterme
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yönettiği Ekip Sayısı: " + ekipSayisi);
    }
}

