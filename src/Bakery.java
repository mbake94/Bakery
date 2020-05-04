import java.util.ArrayList;

public class Bakery{
    private ArrayList<Pastry> bakedGoods;

    public ArrayList<Pastry> getBakedGoods() {
        return bakedGoods;
    }

    public void setBakedGoods(ArrayList<Pastry> bakedGoods) {
        this.bakedGoods = bakedGoods;
    }

    public Bakery(){
        // create dietary restrictions

        ArrayList<String> restriction1 = new ArrayList<>();
        restriction1.add("eggs");
        restriction1.add("coconut");
        Pastry item1 = new Pastry("MULTI-GRAIN WHITE BREAD", 10.95, "2 Months",restriction1 , 12 );

        ArrayList<String> restriction2 = new ArrayList<>();
        restriction2.add("banana");
        Pastry item2 = new Pastry("BANANA BREAD", 5.95, "9 Days", restriction2, 25);


        ArrayList<String> restriction3 = new ArrayList<>();
        restriction3.add("banana");
        Pastry item3 = new Pastry("6-PACK OF MUFFINS", 16.50, "6 Days", restriction3, 54);


        ArrayList<String> restriction4 = new ArrayList<>();
        Pastry item4 = new Pastry("GLUTEN FREE DINNER ROLLS", 3.00, "2 Months if frozen", restriction4, 80);


        ArrayList<String> restriction5 = new ArrayList<>();
        Pastry item5 = new Pastry("BEST BREADS BOX", 24.00, "2 Months if frozen", restriction5, 100);

        ArrayList<String> restriction6 = new ArrayList<>();
        Pastry item6 = new Pastry("CINNAMON BREAD", 10.95, "1 Month if frozen", restriction6, 32);

        ArrayList<String> restriction7 = new ArrayList<>();
        Pastry item7 = new Pastry("SOFT PIZZA CRUST", 6.95, "6 Days", restriction7, 21);

        ArrayList<String> restriction8 = new ArrayList<>();
        Pastry item8 = new Pastry("SAVORY ROLLS", 3.00, "7 Days", restriction8, 56);

        ArrayList<String> restriction9 = new ArrayList<>();
        Pastry item9 = new Pastry("LARGE HAMBURGER BUNS", 5.00, "6 Days", restriction9, 13);

        ArrayList<String> restriction10 = new ArrayList<>();
        Pastry item10 = new Pastry("SPRING HAPPY SET", 34.95, "8 Days", restriction10, 11);

        ArrayList<String> restriction11 = new ArrayList<>();
        Pastry item11 = new Pastry("CINNAMON RAISIN BREAD", 10.95, "9 Days", restriction11, 24);

        ArrayList<String> restriction12 = new ArrayList<>();
        Pastry item12 = new Pastry("DOZEN SAVORY EMPANADAS", 39.00, "6 Days", restriction12, 0);

        ArrayList<String> restriction13 = new ArrayList<>();
        Pastry item13 = new Pastry("BREAD PUDDING", 4.50, "4 Days", restriction13, 8);

        ArrayList<String> restriction14 = new ArrayList<>();
        Pastry item14 = new Pastry("NAKED BERRY CAKE", 29.00, "6 Days", restriction14, 5);

        ArrayList<String> restriction15 = new ArrayList<>();
        Pastry item15 = new Pastry("GOLDEN FLOWER CAKE", 64.00, "6 Days", restriction14, 8);







        // Add the new items to the baked goods array list

//        bakedGoods.add(item1);
//        bakedGoods.add(item2);
//        bakedGoods.add(item3);
//        bakedGoods.add(item4);
//        bakedGoods.add(item5);
//        bakedGoods.add(item6);
//        bakedGoods.add(item7);
//        bakedGoods.add(item8);
//        bakedGoods.add(item9);
//        bakedGoods.add(item10);
//        bakedGoods.add(item11);
//        bakedGoods.add(item12);
//        bakedGoods.add(item13);
//        bakedGoods.add(item14);
//        bakedGoods.add(item15);

    }



}
