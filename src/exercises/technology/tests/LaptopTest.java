package exercises.technology.tests;

import exercises.technology.Laptop;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class LaptopTest {
    ArrayList<String> MacOs = new ArrayList<>(Arrays.asList("MacOS"));
    Laptop myLaptop = new Laptop("test", "test502", 1200, MacOs, 14.1, 2.4);

    @Test
    public void testConstructorSetsScreenSize() {
        assertEquals(14.1, myLaptop.getScreenSize());
    }

    @Test
    public void testConstructorSetsBatteryLife() {
        assertEquals(2.4, myLaptop.getBatteryLife());
    }

}
