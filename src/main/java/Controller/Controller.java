package Controller;


import Model.Payment;
import Model.Product;
import java.util.ArrayList;
import java.util.List;


public class Controller {

    Payment payment = new Payment();

    public void checkAvailability(List<Product> listToBuy, List<Product> dataBaseList){
        Boolean success = null;
        List<Product> missingProducts = new ArrayList<>();
        for (Product product:listToBuy) {
            if (product.getStock()<=0){
                missingProducts.add(product);
                success = false;
            } else {
                success = true;
            }
        }

        if (success){
            System.out.println("Su solicitud de pago fue exitosa. Gracias por comprar en MANGO.");
            payment.setSuccess(true);
        } else {
            payment.setSuccess(false);
            comunicateError(missingProducts);
        }
    }

    public void comunicateError(List<Product> missingProducts){
        System.out.println("No se pudo procesar su orden ya que los siguientes productos se encuentran sin stock:");
        for (Product product: missingProducts) {
            System.out.println(product.getName());
        }
        System.out.println("Disculpe las molestias ocasionadas.");
    }
}
