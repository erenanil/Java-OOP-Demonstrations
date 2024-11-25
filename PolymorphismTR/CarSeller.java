
public class CarSeller {
    public static void main(String[] args) {
    //method overloading ile polymorphism
    /*
    CarSeller obj1 = new CarSeller();
    obj1.motor();
    obj1.yakit();
    obj1.yakit(2024);
    obj1.yakit(1.68);
    obj1.yakit(2024,1.678);
    obj1.yakit(1.97,2024);
*/

    //overriding ile polymorphism
    Bmw obj2 = new Bmw();
    obj2.yakit();//bmw'nin kendi metodu yani parent'ı çağrılır.
    
    
    Bmw obj3 = new BmwBenzinli();
    obj3.yakit();//Benzinli metodu çağrılır.   
        
    Bmw obj4 = new BmwElektrikli();
    obj4.yakit();//Bmw Elektrikli metodu çağrılır.

    Bmw obj5 = new BmwDizel();
    obj5.yakit();// Bmw Dizel metodu çağrılır.


}
    public void motor(){
        System.out.println("ben bagimsiz classtaki motor metoduyum");

    } 
    public void yakit(){
        System.out.println("ben bagimsiz classtaki yakit metoduyum");

    } 
    public void yakit(double maxTuketim){
        System.out.println("ben bagimsiz classtaki yakit metoduyum ve tüketim");

    }
    public void yakit(int yil){
        System.out.println("ben bagimsiz classtaki yakit metoduyum ve yil");

    }
    public void yakit(int yil,double maxTuketim){
        System.out.println("ben bagimsiz classtaki yakit metoduyum ve yil+tuketim");

    }
    public void yakit(double maxTuketim,int yil){
        System.out.println("ben bagimsiz classtaki yakit metoduyum ve tüketim+yil");

    }
    
}
