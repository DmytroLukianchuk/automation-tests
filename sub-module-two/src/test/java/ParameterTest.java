import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by qa1 on 12/12/15.
 */
@RunWith(Parameterized.class)

public class ParameterTest {

    @Parameterized.Parameters()
    public static Object[][] data() {
        Object [][] a = {
                {1, 2, 3}, // this one would fail on purpose
                {3, 5, 15},
                {6, 7, 42}
        };

        return a;
    }

    public static int base;
    public static int height;
    public static int area;

    public ParameterTest(int base, int height, int  area) {
        this.base = base;
        this.height = height;
        this.area = area;
    }

    @Test
    public void areaTest() {
        Triangle triangle = new Triangle();
        Assert.assertEquals("areaIs:", area, triangle.getTriangleleArea(base, height));
        System.out.println("base = " + base + " height = " + height + " area = " + area);
    }
}
