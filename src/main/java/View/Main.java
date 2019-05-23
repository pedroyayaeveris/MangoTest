package View;


import Controller.Controller;
import Model.Cart;
import Model.DataBase;
import Model.Product;
import Model.User;

import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Product p1 = dataBase.getP1();
        Product p2 = dataBase.getP2();
        Product p3 = dataBase.getP3();
        Product p4 = dataBase.getP4();

        User user = new User();
        Cart cart = new Cart();

        List<Product> buyProductsList = new ArrayList<>();
        buyProductsList.add(p1);
        buyProductsList.add(p2);
        buyProductsList.add(p3);
        buyProductsList.add(p4);



        cart.setProductList(buyProductsList);

        user.setCart(cart);

        Controller controller = new Controller();
        controller.checkAvailability(buyProductsList);

        

    }





}