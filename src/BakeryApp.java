import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bakery bakery = new Bakery();

        for (Pastry pastry: bakery.getBakedGoods()){
            System.out.printf("Name: %s\nPrice: $%.2f\nExp Date: %s\nIn Stock: %s", pastry.getName(), pastry.getPrice(), pastry.getExpDate(), pastry.getExpDate(), pastry.getInStock());
            System.out.println("\n");
        }
    }
}
