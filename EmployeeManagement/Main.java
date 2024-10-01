package EmployeeManagement;
 
/*
Soru: Personel Yönetimi
Super Class: Employee

name (String türünde) ve id (int türünde) adında iki üye değişkeni.
name ve id için bir yapıcı tanımla.
getDetails() adlı bir yöntem, çalışanın adını ve kimlik numarasını yazdırır.
Concrete Class: Manager

department (String türünde) adında bir üye değişkeni.
name, id ve department için bir yapıcı tanımla, süper sınıfın yapıcısını çağır.
getDetails() yöntemini geçersiz kıl ve "Manager: " + name + ", ID: " + id + ", Department: " + department şeklinde bir mesaj yazdır.
 */

class Employee{
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getDetails(){
        System.out.println(name+id);
    }
}
class Manager extends Employee{
    protected String department;

    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void getDetails(){
        System.out.println("Manager: "+name +"    ID: "+id+"      Department: "+department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Ross", "IT Manager");
        manager.getDetails();
    }
}
