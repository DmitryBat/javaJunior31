package lesson5;

public class Main1 {
    public static void main(String[] args) {
        // К нам приходит путь к картинке. Нужно проверить картинка это или нет
        // и напечатать на консоль картинка или нет

        // C:\Program Files (x86)\Windows Media Player\Media Renderer\DMR_48.jpg

        String pathToImage = "C:\\Program Files (x86)\\Windows Media Player\\Media Renderer\\DMR_48.jpg";
        if(pathToImage.endsWith(".png")||pathToImage.endsWith(".jpeg")||pathToImage.endsWith(".jpg")){
            System.out.println("Это картинка!");
        }else {
            System.out.println("Это не картинка!");
        }
    }
}
