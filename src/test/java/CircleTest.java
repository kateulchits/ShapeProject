import org.example.shape.Circle;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CircleTest {
double radius1 = 5;
double expectedArea1 = 78.5;

@Test(groups = {"CircleTests", "negative"})
public void areaTest() {
    Circle circle1 = new Circle(radius1);
    double realArea1 = circle1.getArea();
    assertEquals(String.format("wrong circle area"), realArea1, expectedArea1);
}
}
