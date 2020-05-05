import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args){
        String restrict = "n";
        Scanner sc = new Scanner(System.in);
        Bakery bakery = new Bakery();
        ArrayList<Pastry> tempGoods = bakery.displayAll();
        System.out.print("Type 'all' to display the entire menu, or enter a dietary restriction: ");

        restrict = sc.nextLine();
        if (restrict.equals("all")){
            for (int i = 0; i < tempGoods.size(); i++){
                if (tempGoods.get(i).getInStock() != 0){
                    System.out.printf("Name: %s\nPrice: $%.2f\nExp Date: %s\nDietary Restrictions: %s\nIn Stock: %s", tempGoods.get(i).getName(), tempGoods.get(i).getPrice(), tempGoods.get(i).getExpDate(), tempGoods.get(i).getDietaryRes(), tempGoods.get(i).getInStock());
                } else {
                    System.out.printf("Name: %s\nIn Stock: %s\nSorry, we are out of those.",tempGoods.get(i).getName(),tempGoods.get(i).getInStock());
                }
                System.out.println("\n");
            }
        } else {
            for (int i = 0; i < tempGoods.size();i++){
                for (int j = 0; j < tempGoods.get(i).getDietaryRes().size(); j++){
                    if (!restrict.equals(tempGoods.get(i).getDietaryRes().get(j))){
                        System.out.printf("Name: %s\nPrice: $%.2f\nExp Date: %s\nDietary Restrictions: %s\nIn Stock: %s", tempGoods.get(i).getName(), tempGoods.get(i).getPrice(), tempGoods.get(i).getExpDate(), tempGoods.get(i).getDietaryRes().get(j), tempGoods.get(i).getInStock());
                        System.out.println("\n");
                    } else
                        return;
                }
            }
        }
    }
}
/*
if user types "all" display all
else if restrict input (eggs) .equals tempgood.get(i).getDietaryRestriction (coconut)
    print all minus anything that contains eggs
 */