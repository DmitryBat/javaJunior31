package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        //- деньги которые у нас есть - 1000 рублей
        //- стоимость пиццы - 230 рублей
        //- стоимость жвачки - 26 рублей
        //- стоимость конфеты - 2,5 рубля

        int cash = 1000;
        int pizzaPrice = 230;
        int gumPrice = 26;
        double candiesPrice = 2.5;

        //купить максимум возможных пицц, затем на сдачу купить максимум жвачек,
        //затем на оставшуюся сдачу купить конфет.
        //В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
        //На эти деньги мы можем купить:
        //- 4 пиццы
        //- 3 жвачки
        //- 0 конфет
        //Сдача с магазина: 2 рубля.

        int quantityPizza = cash / pizzaPrice;
        int cashAfterPizzaBuying = cash - pizzaPrice * quantityPizza;
        int quantityGum = cashAfterPizzaBuying / gumPrice;
        int cashAfterGumBuying = cashAfterPizzaBuying - gumPrice * quantityGum;
        int quantityCandies = (int) (cashAfterGumBuying / candiesPrice);
        double cashAfterCandiesBuying = cashAfterGumBuying - candiesPrice * quantityCandies;

        System.out.println("На " + cash + " руб мы можем купить:");
        System.out.println(quantityPizza + " Пиццы");
        System.out.println(quantityGum + " Жвачки");
        System.out.println(quantityCandies + " Конфет");
        System.out.println("Сдача с магазина: " + cashAfterCandiesBuying + " Руб");
    }
}
