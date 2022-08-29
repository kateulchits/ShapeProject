import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SquareTest {
    public double side1 = 4;
    public String side2 = "five";

    @Test(groups = {"SquareTest", "positive"})
    public void sideTest() {
        assertTrue(String.format("square side < 0"), side1 > 0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void sideInputTest() {
        int sideValue = Integer.parseInt(side2);
    }
}
