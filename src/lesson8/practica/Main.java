package lesson8.practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student("Иванов", "Вася", "Москва, Шлюзовая","89546632135");// вызов конструктора
        Student petya = new Student();

        Otlichnik sveta = new Otlichnik();
        sveta.setName("Света");
        sveta.setName("Нижний Новгород");
        sveta.setPhoneNumber("523549879653");
        sveta.setSurname("Петрова");

        ArrayList<Student> students= new ArrayList<>();
        students.add(vasya);
        students.add(sveta);
        students.add(petya);

        // for each (когда нужно пройтись по всем объектам в одном хранилище
        for(Student st:students){
            st.doDomashka(); // полиморфизм
        }


    }
}
