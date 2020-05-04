import java.util.ArrayList;

public class Pastry {
    private String name;
    private double price;
    private String expDate;
    private ArrayList<String> dietaryRes;
    private int inStock;

    public Pastry(String name, double price, String expDate, ArrayList<String> dietaryRes, int inStock) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietaryRes = dietaryRes;
        this.inStock = inStock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public ArrayList<String> getDietaryRes() {
        return dietaryRes;
    }

    public void setDietaryRes(ArrayList<String> dietaryRes) {
        this.dietaryRes = dietaryRes;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
