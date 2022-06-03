package lesson6;

public class Main {
    public static void main(String[] args) {
       int vowels = TextUtils.countVowels("shgkgwekrtwh;dglk");
        System.out.println(vowels);

        TextUtils.printReverse("Hello");

        String codeWord = TextUtils.codding("fgr");
        System.out.println(codeWord);

        Methods.printSquareTriangle(7,3,6);

        Methods.lesserNumber(33,2,3,11);

        Methods.wordOnTitleLetters("как дела?");

        Methods.typeOfTriangle(3,4,5);


    }

}
