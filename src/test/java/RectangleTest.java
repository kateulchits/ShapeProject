import org.example.shape.Rectangle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class RectangleTest {
    double firstSide1 = 20;
    double secondSide2 = 15;
    double expectedArea1 = 200;

    @Test(groups = {"RectangleTests", "positive"})
    public void sideTest() {
        assertNotEquals(firstSide1, secondSide2, String.format("first side: "+firstSide1+" second side: "+secondSide2));
    }

    @Test(groups = {"RectangleTests", "negative"})
    public void rectangleArea() {
        Rectangle rectangle1 = new Rectangle(firstSide1, secondSide2);
        assertEquals(expectedArea1, rectangle1.getArea());
    }
}
