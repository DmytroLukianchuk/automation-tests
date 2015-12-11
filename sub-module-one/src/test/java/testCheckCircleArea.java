/**
 * Created by qa1 on 12/11/15.
 */

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class testCheckCircleArea {

    @Test
    public void testCheckCircleArea() {
        //Testing the class
        Circle circle = new Circle();

        //Checking method
        double result = circle.getCircleArea(1);

        Assert.assertEquals("radius = 1", 3.141592653589793, result);

    }
}
