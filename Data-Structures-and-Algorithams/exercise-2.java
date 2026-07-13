//Exercise 2: Implementing a E-commerce Platform Search Function
import java.util.*;
class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}

public class Exercise2 {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (Products must be sorted by ID)
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].id == id) {
                return products[mid];
            } else if (products[mid].id < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 103;

        Product p1 = linearSearch(products, searchId);

        if (p1 != null)
            System.out.println("Linear Search: " + p1.name);
        else
            System.out.println("Product not found");

        Product p2 = binarySearch(products, searchId);

        if (p2 != null)
            System.out.println("Binary Search: " + p2.name);
        else
            System.out.println("Product not found");
    }
}