package com.upgrade.gcm;

import com.upgrade.gcm.models.DairyProduct;
import com.upgrade.gcm.models.Fruit;
import com.upgrade.gcm.models.GroceryItem;
import com.upgrade.gcm.models.Vegetable;
import com.upgrade.gcm.services.InventoryService;
import com.upgrade.gcm.services.InventoryServiceImpl;
import com.upgrade.gcm.utils.DataLoad;

public class Main {
    public static void main(String[] args) {

        // 100% data abstraction
        InventoryService service = new InventoryServiceImpl();       // taking the reference of interface but creating the object of implementation class
        // add grocery Items
       /* service.addItem(new Fruit("Mango", 120, 2, true));
        service.addItem(new Vegetable("Spinach", 40, 1.5, true));
        service.addItem(new DairyProduct("Cheese", 500, 0.5, 25));*/
        DataLoad load = new DataLoad();
        while (true){
            System.out.println("Add Item in Your inventory");
            GroceryItem item = load.getData();
            service.addItem(item);
            System.out.println("Continue??");
            if(load.getScanner().next().equals("n"))
            break;
            else
                continue;


        }

        // show inventory
        service.showInventory();

        // show total bill
        System.out.println("--------------final Bill------------------");
        System.out.println("Total:"+service.calculateBill());
    }
}
