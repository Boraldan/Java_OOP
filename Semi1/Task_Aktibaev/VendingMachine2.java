package Semi1.Task_Aktibaev;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine2 {
    private List<Product2> productList;

    public VendingMachine2(List<Product2> productList) {
        this.productList = productList;
    }

    public VendingMachine2(){
        this.productList = new ArrayList<>();
    }

    public List<Product2> getProductList() {
        return productList;
    }

    public void setProductList(List<Product2> productList) {
        this.productList = productList;
    }

    public void addProduct2(Product2 product2) {
        productList.add(product2);
    }
//    public void addProduct(String name, double cost){
//        addProduct(new Product2(name, cost));
//    }

    public List<Product2> getProducByCost(int cost) {
        List<Product2> res = new ArrayList<>();
        for (Product2 el : productList) {
            if (el.getCost() <= cost) {
                res.add(el);
            }
        }
        return  res;
    }
}
