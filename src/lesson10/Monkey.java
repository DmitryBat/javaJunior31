package lesson10;

public class Monkey implements ZooAnimal{

    @Override
    public void voice() {
        System.out.println("YYYYYyyyyyyyaaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("�������� �������");
    }

    @Override
    public void run() {
        System.out.println("�������� ������");
    }
}
