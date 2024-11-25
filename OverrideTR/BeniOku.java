/*
    Override (Metot Geçersiz Kılma) Nedir?

    Metot Geçersiz Kılma (Override), bir alt sınıfın, üst sınıfında tanımlı olan bir metodu kendi ihtiyacına göre yeniden tanımlamasıdır.
    Bu, alt sınıfın üst sınıfından miras aldığı metodu, kendi özel implementasyonu ile değiştirmesini sağlar.
    Java'da metot geçersiz kılma, **runtime polymorphism** yani çalışma zamanı polymorfizmi ile birlikte kullanılır.

    Kalıtım (Inheritance) ile birlikte çalışarak, alt sınıfın üst sınıfın metodunu değiştirebilmesini sağlar.

    --------------------------------------------
    Override (Metot Geçersiz Kılma) Kuralları:
    --------------------------------------------

    - Alt sınıftaki metot, üst sınıftaki metotla aynı isme ve parametre listesine sahip olmalıdır.
    - Alt sınıftaki metot, üst sınıftaki metotla aynı dönüş tipine sahip olmalıdır.
    - Üst sınıftaki metot `final`, `static` veya `private` ise, bu metotlar alt sınıf tarafından geçersiz kılınamaz.
    - Geçersiz kılınan metot, üst sınıftaki metotla aynı erişim belirleyicilerine sahip olmalıdır veya daha geniş erişim sağlanabilir (örneğin, `protected` metodu `public` olarak geçersiz kılmak mümkündür, ama `private` metodu geçersiz kılamazsınız).

    --------------------------------------------
    Metot Geçersiz Kılmanın Faydaları:
    --------------------------------------------
    - Alt sınıfın, üst sınıftan miras aldığı metodu özelleştirmesini sağlar.
    - Programın esnekliğini artırır; aynı metot farklı sınıflarda farklı şekilde çalışabilir.
    - Polymorphism ile daha dinamik ve esnek bir yapı oluşturulmasına olanak tanır.

    --------------------------------------------
    Metot Geçersiz Kılma Örneği:
    --------------------------------------------
    Java'da metot geçersiz kılma genellikle şu şekilde yapılır:

    1. Üst sınıf (superclass) bir metot tanımlar.
    2. Alt sınıf (subclass) aynı isme ve parametre listesine sahip metodu tanımlar.
    3. Alt sınıfın metodu, üst sınıftaki metodu geçersiz kılar.

    Örnek:

class Hayvan {
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor.");
    }
}

class Kedi extends Hayvan {
    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
}

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        hayvan.sesCikar(); // Çıktı: Hayvan ses çıkarıyor.
        
        Kedi kedi = new Kedi();
        kedi.sesCikar(); // Çıktı: Miyav!
    }
}
    */
