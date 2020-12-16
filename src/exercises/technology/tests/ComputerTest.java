package exercises.technology.tests;

import exercises.technology.Computer;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {

    Computer newComputer = new Computer("Rexcrosoft", "Intel", 16.78);

    @Test
    public void testConstructorSetsProcessorSpeed() {
        assertEquals(16.78, newComputer.getProcessorSpeedInMGz(), .001);
    }

    @Test
    public void testConstructorSetsManufacturer() {
        assertEquals("Rexcrosoft", newComputer.getManufacturer());
    }

    @Test
    public void testConstructorSetsProcessorType() {
        assertEquals("Intel", newComputer.getProcessor());
    }

    @Test
    public void testEachComputerReceivesUniqueID() {
        Computer newComputer2 = new Computer("Co.", "Apple", 6000);
        assertNotEquals("1stComputerID=" +newComputer.getId()+ "\n2ndComputerID=" +newComputer2.getId(), newComputer.getId(), newComputer2.getId());
    }
}
