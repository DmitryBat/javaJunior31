package lesson4;

public class HomeWorkLesson4Task3 {
    public static void main(String[] args) {
        //3 - напечатать среднюю стоимость поездки в любую страну

        String[][] tours = {{"Турция", "100000", "6 дней", "Самолет"},
                {"Египет", "150000", "5 дней", "Самолет"},
                {"Египет", "180000", "4 дней", "Самолет"},
                {"Карелия", "60000", "3 дней", "Автобус"},
                {"Байкал", "70000", "6 дней", "Самолет"},
                {"Сочи", "90000", "5 дней", "Самолет"},
                {"Золотое кольцо", "20000", "5 дней", "Автобус"}};

        int money = 0;
        for (int i = 0; i < tours.length; i++) {
            String price = tours[i][1];
            int priceOfTour = Integer.parseInt(price);
            money = money + priceOfTour;
        }
        int avrg = money / tours.length;

        System.out.println("Средняя стоимость всех туров: " + avrg);

    }
}
