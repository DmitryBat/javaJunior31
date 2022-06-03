package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // сколько мы заберем в банке через 5 лет если отдадим 100 000 на депозит под 18% годовых?
        // проценты добавл€ютс€ к телу депозита ежемес€чно

        double money = 100000;
        int year = 5;
        int procent = 18;

        for (int month = 0; month < 12 * year; month++) {
            money = money + ((money / 100 * procent) / 12);
        }
        System.out.println(money);
    }
}
