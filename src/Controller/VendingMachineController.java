package Controller;
import java.util.HashMap;

import models.Product;
import models.VendingMachine;
import models.Product;
import models.ProductType;


public class VendingMachineController  {
    private VendingMachine vendingMachine;
    public VendingMachineController() {
        vendingMachine = new VendingMachine();
    }

    // Add Products

    public void addProducts(String code, String name, double price, ProductType type, int quantity ){
        VendingMachine.addProduct(code,name,price,type,quantity);
    }
    public void removeProduct(String code){
        VendingMachine.removeProduct(code);
    }

    // Purchasing the product

    public void purchaseProduct(String code, int quantity){
        if(VendingMachine.purchaseProduct(code,quantity) ){

            System.out.println("You purchased  "+ VendingMachine.getProducts().get(code).getName());
        } else {
            System.out.println("Product Not Available");
        }
    }




}
