package lesson7;

public class Tovar {
    // характеристики (поля класса)
    // здесь могут быть переменные ТОЛЬКО которые относятся к ОДНМУ объекту
    // НЕ МОГУТ быть переменные которые НЕ описывают состояние объекта
    private int price;
    private String name;
    private int salePrice;

    public void setName(String name){
        // this - тот объект, у которого вызван данный метод
        this.name = name;

    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setSalePrice(int salePrice){
        this.salePrice = salePrice;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getSalePrice(){
        return this.salePrice;
    }
}
