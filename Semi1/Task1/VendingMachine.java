package Semi1.Task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void intProduct(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product el : products) {
            if (el.getName().equals(name)) {
                return el;
            }


        }
        return new Product("product is undefined", 0);

    }
}
