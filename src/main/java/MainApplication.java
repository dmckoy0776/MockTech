import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Product apple = new Product(1.50, "red", "small", "apple");
        Product banana = new Product(0.50, "yellow", "small", "banana");
        addProduct(apple);
        addProduct(banana);
        printProducts();
//        System.out.println(printProducts().toString());
    }

    public static List<Product> printProducts(){
        for (Product product : productList) {
            System.out.println(product.getPrice());
            System.out.println(product.getName());
        }
        return productList;
    }

    public static void addProduct(Product product){
       productList.add(product);
    }
}
