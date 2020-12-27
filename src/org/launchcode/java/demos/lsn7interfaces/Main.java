package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


//        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName()  + ": " + flavor.getAllergens().size() + " allergens");
//        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator ConeComparator = new ConeComparator();
        cones.sort(ConeComparator);
//        for (Cone cone : cones) {
//            System.out.println(cone.getName() + ": " + cone.getCost());
//        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavors:");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }

        System.out.println("\nFlavor Allergens:");
        for(Flavor allergen : flavors){
            System.out.println(allergen.getName() + ": " + allergen.getAllergens());
        }

        System.out.println("\nCone prices:");
        for (Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        Comparator toppingComparator = new ToppingComparator();
        toppings.sort(toppingComparator);
        System.out.println("\nToppings: ");
        for(Topping topping : toppings){
            System.out.println(topping.getName() + ": $" + topping.getCost());
        }
    }
}
