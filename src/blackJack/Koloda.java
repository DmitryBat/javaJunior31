package blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private Card[] cards = new Card[52];

    public Koloda(){
        cards[0] = new Card("Двойка трефа", 2);
        cards[1] = new Card("Двойка бубна", 2);
        cards[2] = new Card("Двойка пика", 2);
        cards[3] = new Card("Двойка Черви", 2);

        cards[4] = new Card("Тройка трефа", 3);
        cards[5] = new Card("Тройка бубна", 3);
        cards[6] = new Card("Тройка пика", 3);
        cards[7] = new Card("Тройка Черви", 3);

        cards[8] = new Card("Четыре трефа", 4);
        cards[9] = new Card("Четыре бубна", 4);
        cards[10] = new Card("Четыре пика", 4);
        cards[11] = new Card("Четыре Черви", 4);

        cards[12] = new Card("Пять трефа", 5);
        cards[13] = new Card("Пять бубна", 5);
        cards[14] = new Card("Пять пика", 5);
        cards[15] = new Card("Пять Черви", 5);

        cards[16] = new Card("Шесть трефа", 6);
        cards[17] = new Card("Шесть бубна", 6);
        cards[18] = new Card("Шесть пика", 6);
        cards[19] = new Card("Шесть Черви", 6);

        cards[20] = new Card("Семь трефа", 7);
        cards[21] = new Card("Семь бубна", 7);
        cards[22] = new Card("Семь пика", 7);
        cards[23] = new Card("Семь Черви", 7);

        cards[24] = new Card("Восемь трефа", 8);
        cards[25] = new Card("Восемь бубна", 8);
        cards[26] = new Card("Восемь пика", 8);
        cards[27] = new Card("Восемь Черви", 8);

        cards[28] = new Card("Девять трефа", 9);
        cards[29] = new Card("Девять бубна", 9);
        cards[30] = new Card("Девять пика", 9);
        cards[31] = new Card("Девять Черви", 9);

        cards[32] = new Card("Десять трефа", 10);
        cards[33] = new Card("Десять бубна", 10);
        cards[34] = new Card("Десять пика", 10);
        cards[35] = new Card("Десять Черви", 10);

        cards[36] = new Card("Валет трефа", 10);
        cards[37] = new Card("Валет бубна", 10);
        cards[38] = new Card("Валет пика", 10);
        cards[39] = new Card("Валет Черви", 10);

        cards[40] = new Card("Дама трефа", 10);
        cards[41] = new Card("Дама бубна", 10);
        cards[42] = new Card("Дама пика", 10);
        cards[43] = new Card("Дама Черви", 10);

        cards[44] = new Card("Король трефа", 10);
        cards[45] = new Card("Король бубна", 10);
        cards[46] = new Card("Король пика", 10);
        cards[47] = new Card("Король Черви", 10);

        cards[48] = new Card("Туз трефа", 11);
        cards[49] = new Card("Туз бубна", 11);
        cards[50] = new Card("Туз пика", 11);
        cards[51] = new Card("Туз Черви", 11);
    }

    public Card getRandomCard(){
        int index = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[index];
    }

}
