package lesson8.practica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student("������", "����", "������, ��������","89546632135");// ����� ������������
        Student petya = new Student();

        Otlichnik sveta = new Otlichnik();
        sveta.setName("�����");
        sveta.setName("������ ��������");
        sveta.setPhoneNumber("523549879653");
        sveta.setSurname("�������");

        ArrayList<Student> students= new ArrayList<>();
        students.add(vasya);
        students.add(sveta);
        students.add(petya);

        // for each (����� ����� �������� �� ���� �������� � ����� ���������
        for(Student st:students){
            st.doDomashka(); // �����������
        }


    }
}
