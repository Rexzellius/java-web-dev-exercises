package studios;

import java.util.ArrayList;
import java.time.*;

public class Menu {
    public static void main(String[] arg) {
        MenuItem item1 = new MenuItem("Handsome Squidward Sushi", 32.59, "8oz sushi." +
                " With a choice of fried rice, mix vegetables or additional fish sacrifices.", "mainCourse", false, LocalDate.of(2002, Month.DECEMBER, 12));
        MenuItem item2 = new MenuItem("Spongebob Fillet Mignon", 26.59, "6oz Pan seared" +
                " & served with a side of screaming pink stars.",
                "mainCourse", true, LocalDate.of(2020, Month.DECEMBER, 12));
        MenuItem item3 = new MenuItem("Sandy Cheeks's Tail BBQ", 13.29, "Fresh Texan 8oz BBQ." +
                " With a robust marinara. No, it's SFW.", "appetizer", false, LocalDate.of(2002, Month.DECEMBER, 12));
        MenuItem item4 = new MenuItem("Bikini Bottom Specialty", 10.89, "A very moist dish." +
                " that you shouldn't ask where it came from or if it's PETA approved.", "dessert", true, LocalDate.of(2020, Month.DECEMBER, 12));

        ArrayList<MenuItem> allItems = new ArrayList<>();
        ArrayList<MenuItem> mainCourses = new ArrayList<>();
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        allItems.add(item4);

        addItemByCategory(allItems, mainCourses, appetizers, desserts);
        String starLine = "********************";
        String dashedLine = "------------------------------";

        System.out.println("[ Appetizers ]");
        for (MenuItem item : appetizers) {
            System.out.println(item.getName() + "- $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("Current date of addition: " + item.getDate());
            System.out.println(dashedLine + "\n");
        }

        System.out.println(starLine);
        System.out.println("[ Main Courses ]");
        for (MenuItem item : mainCourses) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("Current date of addition: " + item.getDate());
            System.out.println(dashedLine);
        }

        System.out.println("\n" + starLine);;
        System.out.println("[ Desserts ]");
        for (MenuItem item : desserts) {
            System.out.println(item.getName() + "- $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("Current date of addition: " + item.getDate());
            System.out.println(dashedLine);
        }
    }

    //Methods here
    public static void addItemByCategory(ArrayList<MenuItem> all, ArrayList<MenuItem> main,
                                         ArrayList<MenuItem> apps,
                                         ArrayList<MenuItem> des) {
        for (MenuItem item : all) {
            if (item.getCategory() == "mainCourse" && !main.contains(item)) {
                main.add(item);
            } else if (item.getCategory() == "appetizer" && !apps.contains(item)) {
                apps.add(item);
            } else {
                if (!des.contains(item)) {
                    des.add(item);
                }
            }
        }
    }
}
