package lesson8.practica;

public class Student {
    private String name;
    private String surname;
    private String adress;
    private String phoneNumber;

    public Student (){

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String surname, String name, String adress, String phoneNumber){
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdres() {
        return adress;
    }

    public void setAdres(String adres) {
        this.adress = adres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void doDomashka(){
        System.out.println("�� ����� �������!!!!");
    }
}
