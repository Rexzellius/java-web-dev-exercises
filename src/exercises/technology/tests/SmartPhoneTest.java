package exercises.technology.tests;

import exercises.technology.SmartPhone;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartPhoneTest {
    SmartPhone newSmartPhone = new SmartPhone("Apple", "", 4.2, "IoS", false);

    @Test
    public void constructorSetsIsGoogleOperated() {
        assertFalse(newSmartPhone.isGoogleOperated());
    }
}
