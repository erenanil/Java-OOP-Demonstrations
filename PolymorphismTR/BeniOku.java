/*

            Bu bölümü okuduktan sonra CarSeller Sınıfına geçip örnekleri detaylıca incelemen senin için faydalı olacaktır!!!


    Polymorphism (Çok Biçimlilik) Nedir?

    Polymorphism, Türkçesiyle "çok biçimlilik," bir nesnenin farklı şekillerde davranabilmesini ifade eder.
    Nesne yönelimli programlamanın (OOP) temel kavramlarından biridir ve yazılım geliştirme süreçlerinde 
    esnekliği artırır, kodun yeniden kullanılabilirliğini sağlar.

    Polymorphism'in Temel Amaçları:
    - Aynı işlemin farklı nesneler tarafından farklı şekilde uygulanmasını sağlamak.
    - Kodun bakımını ve genişletilmesini kolaylaştırmak.
    - Daha az kodla daha fazla işlevsellik sunmak.

    --------------------------------------------
    Polymorphism Türleri:
    --------------------------------------------

    1. Compile-time Polymorphism (Derleme Zamanı Çok Biçimlilik):
        - Compile-time Polymorphism, programın derleme aşamasında belirlenen çok biçimliliktir.
        - Aynı isimdeki metotların farklı parametre listeleriyle tanımlanmasıdır.
        - Bu işlem Java'da **Metot Aşırı Yükleme (Method Overloading)** ile sağlanır.
        
        Öne Çıkan Özellikler:
        - Metot isimleri aynıdır, ancak parametrelerin türü, sırası veya sayısı farklıdır.
        - Kodun okunabilirliğini artırır.
        - İşlem derleme aşamasında belirlenir.

    2. Run-time Polymorphism (Çalışma Zamanı Çok Biçimlilik):
        - Run-time Polymorphism, programın çalışma aşamasında belirlenen çok biçimliliktir.
        - Bir alt sınıfın, üst sınıfta tanımlanmış bir metodu yeniden tanımlamasıyla sağlanır.
        - Bu işlem Java'da **Metot Geçersiz Kılma (Method Overriding)** ile sağlanır.
        
        Öne Çıkan Özellikler:
        - Üst sınıfta tanımlanmış bir metodun alt sınıflar tarafından yeniden yazılması gereklidir.
        - Çalışma zamanı sırasında hangi metodun çalışacağına karar verilir.
        - Kalıtım (inheritance) ve dinamik bağlama (dynamic binding) kullanılır.

    --------------------------------------------
    Run-time Polymorphism'de Önemli Kurallar:
    --------------------------------------------
    - Alt sınıfta yeniden tanımlanan metot, üst sınıftaki metodun imzasıyla birebir aynı olmalıdır.
    - Alt sınıf metodu, üst sınıf metodunun erişim belirleyicisinden daha kısıtlayıcı olamaz.
    - Üst sınıfta metot `final` veya `static` olarak tanımlanmışsa, geçersiz kılınamaz (override edilemez).

    --------------------------------------------
    Faydaları:
    --------------------------------------------
    - Kodun esnekliğini artırır: Aynı metot farklı nesneler için farklı davranışlar sergileyebilir.
    - Kodun tekrar kullanımını kolaylaştırır: Bir üst sınıfta genel davranışlar tanımlanırken, alt sınıflarda özel davranışlar tanımlanabilir.
    - Dinamik bağlama sayesinde çalışma zamanı kararlarını destekler.

    --------------------------------------------
    Polymorphism'in Kullanım Alanları:
    --------------------------------------------
    - Farklı sınıflarda ortak davranışlar sergileyen metotlar tanımlamak.
    - Dinamik yapılar oluşturmak ve farklı nesnelerle çalışmayı kolaylaştırmak.
    - Kodun genişletilebilirliğini artırmak.

    Not: Polymorphism, genellikle kalıtım (inheritance) ve arayüzler (interfaces) ile birlikte kullanılır.
*/
