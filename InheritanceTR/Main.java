package InheritanceTR;

public class Main {
    public static void main(String[] args) {
        // Calisan sınıfından bir nesne oluşturuluyor
        Calisan calisan = new Calisan("Anıl", "Muhasebe", 5000);
        calisan.calis(); // Çıktı: Anıl çalışıyor.
        calisan.bilgileriGoster(); // Çıktı: İsim: Anıl, Departman: Muhasebe, Maaş: 5000 TL

        // Yonetici sınıfından bir nesne oluşturuluyor
        Yonetici yonetici = new Yonetici("Eda", "Pazarlama", 8000, 5);
        yonetici.calis(); // Çıktı: Eda çalışıyor.
        yonetici.ekipYonet(); // Çıktı: Eda Pazarlama departmanındaki ekibi yönetiyor.
        yonetici.bilgileriGoster(); // Çıktı: İsim: Eda, Departman: Pazarlama, Maaş: 8000 TL, Yönettiği Ekip Sayısı: 5
    }
}
