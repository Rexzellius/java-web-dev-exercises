package exercises.technology;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

        public static void main(String[] args) {
            Computer dell = new Computer("Dell", "6510", 1.03);
            Computer alienwareGaming = new Computer("Alienware Gaming", "6203", 1.80);
            ArrayList<String> operatingSystem = new ArrayList<>(Arrays.asList("Mac", "Windows 10"));
            Laptop myLaptop = new Laptop("Ienovo", "i5-0000H", 2600, operatingSystem, 14, 4);
            SmartPhone androidNokia = new SmartPhone("Android", "Android Nokia 4545", 2000, "Android", true);
            ArrayList<Computer> computers = new ArrayList<>(Arrays.asList(dell, alienwareGaming, myLaptop, androidNokia));
            for(Computer computer : computers) {
                System.out.println(computer.getClass()+ " " + computer.getManufacturer()+ " has id - " +computer.getId());
                System.out.println("Processor speed as MHZ: " +String.format("%.5f", computer.getProcessorSpeedInGHZ()));
            }
        }
}
