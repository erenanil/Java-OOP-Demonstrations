package InheritanceTR;

class Calisan {
    // Ortak özellikler
    String isim;
    String departman;
    double maas;

    // Yapıcı metod (Constructor)
    public Calisan(String isim, String departman, double maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }

    // Ortak bir metod (Çalışan için geçerli)
    public void calis() {
        System.out.println(this.isim + " çalışıyor.");
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Departman: " + departman);
        System.out.println("Maaş: " + maas + " TL");
    }
}
