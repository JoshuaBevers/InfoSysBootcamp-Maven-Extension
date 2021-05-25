package oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class abRunner {

    public static void RUNNER() {
        car Mazda = new car(1, "car", 1992, "Mazda", 4);
        motocycle terry = new motocycle(2, "Clairance", 1992, "God HIMSELF", "Granit");
        plane megaman = new plane(3, "Jerry", 1992, "He believes", true);
        List<vehical> peronalGarage = new ArrayList<vehical>();
        garage parkingLot = new garage(peronalGarage);
        //adds two vehicals
        parkingLot.addLocomotive(Mazda);
        parkingLot.addLocomotive(terry);
        //calculate bill
        double bill = parkingLot.calcBill();
        System.out.println("Bill is: " + bill + "$");
        //print what we have in the garage
        parkingLot.printList();
        //remove by object.
        parkingLot.removeLocomotive(Mazda);
        parkingLot.printList();

        // remove by id.
        parkingLot.removeByID(2);
        parkingLot.printList();
        //add the plane and then remove all.
        parkingLot.addLocomotive(megaman);
        parkingLot.printList();
        parkingLot.removeAll();
        parkingLot.printList();

        //remove by type
        parkingLot.addLocomotive(megaman);
        parkingLot.printList();
        parkingLot.removeByType("plane");
        parkingLot.printList();


    }

}
