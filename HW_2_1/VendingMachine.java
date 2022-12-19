import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private List<Product> prod_list; 
    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("rock", 1)));
    public VendingMachine (List<Product> prod_list) {
        this.prod_list = prod_list;
    }

    public VendingMachine () {
        this(DEFAULT);
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        prod_list.forEach(i-> result.append(i.toString()+"\n"));
        return result.toString();
    }
    public List<Product> findByName(String name){
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i->{
            if (i.getName().equals(name))
            result.add(i);
        });
        return result;
    }
    // public String name;
    // public double price;

    // public Product(String name, double price) {
    //     this.name = name;
    //     this.price = price;
    // }

    // public String getName() {
    //     return name;
    // }
    // private void setName(String name) {
    //     this.name = name;
    // }
    // public double getPrice() {
    //     return price;
    // }
    // public void setPrice(double price) {
    //     this.price = price;
    // }
    // public String toString(){
    //     return String.format("%s - %f", name, price);
    // }
}