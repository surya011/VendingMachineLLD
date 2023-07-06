
import Controller.VendingMachineController;
import models.ProductType;


public class Main {
    public static void main(String[] args) {
        VendingMachineController controller = new VendingMachineController();
        controller.addProducts("A1", "Chips", 20, ProductType.SNACK, 5);
        controller.addProducts("A2", "Soda", 1, ProductType.BEVERAGE, 5);
        controller.addProducts("A3", "Solano", 2, ProductType.CANDY, 5);
        controller.addProducts("A4", "Dairy Milk", 20, ProductType.CHOCLATES, 5);

        controller.purchaseProduct("A1",10);
    }
}