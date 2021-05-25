package oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class garage {

    protected List<vehical> garageList;

    public garage(List<vehical> garageList) {
        this.garageList = garageList;
    }

    public void addLocomotive(vehical loco) {
        this.garageList.add(loco);
    }

    public void removeLocomotive(vehical loco) {
        this.garageList.remove(loco);
    }

    public double calcBill() {
        //get vehical types.
        double bill = 0.00;
        for (int i = 0; i < this.garageList.size(); i++) {
            vehical e = this.garageList.get(i);
            if (e instanceof car) {
                bill = bill + e.year;
            }
            if (e instanceof plane) {
                //have fun clients.
                bill = bill + e.ID;
            }
            if (e instanceof motocycle) {
                bill = bill + 5;
            }
        }
        return bill;
    }

    public void removeByID(int Search) {
        if (!this.garageList.isEmpty()) {
            int index = 0;
            for (int i = 0; i < this.garageList.size(); i++) {
                if (this.garageList.get(i).ID == Search) {
                    index = i;
                }
            }
            this.garageList.remove(index);
        } else {
            System.out.println("Nothing in the garage to remove.");
        }
    }


    public void removeByType(String givenType) {
        if (!this.garageList.isEmpty()) {
            List<vehical> indexesToRemove = new ArrayList<vehical>();
            for (int i = 0; i < this.garageList.size(); i++) {
                vehical e = this.garageList.get(i);
                if (givenType == "car") {
                    if (e instanceof car) {
                        indexesToRemove.add(e);
                    }
                }
                if (givenType == "plane") {
                    if (e instanceof plane) {
                        indexesToRemove.add(e);
                    }
                }
                if (givenType == "motocycle") {
                    if (e instanceof motocycle) {
                        indexesToRemove.add(e);
                    }
                }
                //remove by types.
                indexesToRemove.forEach(
                        index -> {
                            this.garageList.remove(index);
                        }
                );
            }
        } else {
            System.out.println("Nothing in the garage to remove.");
        }
    }

    public void removeAll() {
        if (!this.garageList.isEmpty()) {
            this.garageList.clear();
        } else {
            System.out.println("Nothing in the garage to remove.");
        }
    }

    public void printList() {
        if (!this.garageList.isEmpty()) {
            System.out.println("");
            System.out.println(this.garageList.iterator().next().toString());
        } else {
            System.out.println("Sorry! You have no cars!");
        }
    }
}
