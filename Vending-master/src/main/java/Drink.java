public class Drink {

    private String name;
    private int quantity = 10;
    private int price = 0;


    public Drink(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }



}
