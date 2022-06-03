package lesson5;

public class Main5 {
    public static void main(String[] args) {

        /**
         * Есть текст (email от пользователя)
         * нужно понять валидный он или нет
         *
         */

        String email = "sgjkhldg@sdljg";
        if(!email.contains("@")||email.contains(" ") ){
            System.out.println("EMail не содердит @");
            return; //либо System.exit("0");

            // 2 - содержание проблеов
            /**
             * 3 - чтобы содержалась только одна собачка (***)
             * 4 - чтобы не начиналась на спецсимвол
             * 5 -
             */
        }
    }
}
