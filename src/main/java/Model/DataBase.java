package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private Product p1 = new Product("Blue Dress", 1);
    private Product p2 = new Product("White Dress", 2);
    private Product p3 = new Product("Black Dress", 0);
    private Product p4 = new Product("Grey Dress", 0);

    private List<Product> databaseProductList = new ArrayList<>();

    public void add(){
        databaseProductList.add(p1);
        databaseProductList.add(p2);
        databaseProductList.add(p3);
    }

    public Product getP1() {
        return p1;
    }

    public void setP1(Product p1) {
        this.p1 = p1;
    }

    public Product getP2() {
        return p2;
    }

    public void setP2(Product p2) {
        this.p2 = p2;
    }

    public Product getP3() {
        return p3;
    }

    public void setP3(Product p3) {
        this.p3 = p3;
    }


    public Product getP4() {
        return p4;
    }

    public void setP4(Product p4) {
        this.p4 = p4;
    }



    public List<Product> getDatabaseProductList() {
        return databaseProductList;
    }

    public void setDatabaseProductList(List<Product> databaseProductList) {
        this.databaseProductList = databaseProductList;
    }
}
