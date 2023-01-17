package ua.hillel.tests.restTest;

import org.testng.annotations.Test;
import ua.hillel.homeTask_20.StoreController;
import ua.hillel.homeTask_20.entities.Store;

import java.io.IOException;

public class StoreRestTest {
    @Test
    public  void returnByStatus() throws IOException,NullPointerException {
        StoreController storeController = new StoreController();
        storeController.returnByStatus();
    }
    @Test
    public void placeNewOrderInStore() throws IOException{
        StoreController storeController = new StoreController();
        storeController.placeNewOrder("newOrder");
    }
    @Test
    public void placeNewOrderStoreWithGSON() throws IOException{
        StoreController storeController = new StoreController();
        Store store = new Store();
        store.setId(6);
        store.setPetId(1602);
        store.setQuantity(2);
        store.setShipDate("2023-01-16T21:12:48.341Z");
        store.setStatus("approved");
        store.setComplete(true);
        storeController.placeNewOrderWithGSON(store);
    }
    @Test
    public void findByID() throws IOException {
        StoreController storeController = new StoreController();
        storeController.findPurchaseById(10);
    }
    @Test
    public  void deleteOrderByID() throws IOException {
        StoreController storeController = new StoreController();
        storeController.deleteOrderByID(5);
    }
}
