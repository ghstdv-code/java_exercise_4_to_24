package chapter14;

public class Product {
    String productName;
    float productPrice;

    Product(String name, float price){
        this.productName = name;
        this.productPrice = price;

        System.out.println(name + " Created");
        System.out.println("PHP " + price);
    }
}
