package InheritanceTR;

public class BeniOku {
    /*
    ***NOT***: Konuyu buradan çalışıp örneklere geçmeniz sizin için faydalı olacaktır.

     *                          INHERITANCE Konu Anlatımı
     

     * Bir sınıfın, başka bir sınıfın özelliklerini (değişkenler, metodlar, vb.) otomatik olarak edinmesini sağlayan konsepttir.
     

     * extends anahtar kelimesi kullanılır.
     

     * Child, parent'ını seçer.
     

     * Java sigle inheritance'a izin verir. (Analoji olarak, Bir çocuğun bir ailesi olur gibi düşünebilirsiniz.)
      yani, B ---> A


     * Ancak bir sınıf birden fazla sınıf tarafından inherit edilebilir.
      yani  B ----> A <---- C
      Burada C ve B sınıfları child sınıftır ve A sınıfını parent olarak seçmişlerdir.
      Buna Hiyerarşik Kalıtım denir ve birden fazla child sınıfının aynı parent sınıfını seçtiği yapıdır.



     * Eğer özelliklerini inherit etmek istediğimiz birden fazla sınıf varsa Multi-Level yapıyla hepsinin özelliklerini kullanabiliriz.
     Şöyle bir yapı oluşturmalıyız;
      A <-------- B <-------- C
     C önce B'yi parent olarak seçer ve ardından B, A'yı parent olarak seçmektedir ve dolayısıyla C, B'nin ve A'nın özelliklerine sahip olur.


     *Private, sınıf üyeleri inherit edilmez.

     *Default erişim belirleyicisi ile tanımlanan üyeler sadece aynı paket içerisindeki sınıflar tarafından erişilebilir.

     *Public, herkes tarafından kullanılır.

     *Protected, sadece alt sınıflar (child sınıfes) ve aynı paket içerisindeki sınıflar tarafından erişilebilir.



     *                      Inheritance'ın faydaları
     * Inheritance ile daha az kod yazabiliriz, böylece yazılımın bakımı ve güncellenmesi daha kolay hale gelir. Özellikle büyük projelerde, bir parent sınıftaki değişikliklerin tüm child sınıflara otomatik olarak yansıması, bakım süresini önemli ölçüde azaltır
     
      
    
     *                      Nasıl Yapılandırılır ?
     * Sürekli kullanacağımız değişkenler ve metodları bir base (veya parent) sınıf'ta toplayıp, oluşturduğumuz tüm sınıfları bu base sınıftan miras alacak şekilde yapılandırabiliriz
     * Özellikleri açısından birbirini kapsayan obje gruplarımı inheritance ile yapılandırıp daha az variable ve kod ile istediğimiz işlemleri yapabiliriz.
     */
}
