package test;

import org.junit.Assert;
import org.junit.Test;

public class FaceDetectionTest {

    @Test
    public void main() throws Exception {
        String args = "ABCD";
        Assert.assertNotNull("LAUNCH VARIABLE IS NOT NULL", args);
        args = null;
        Assert.assertNull("LAUNCH VARIABLE IS NULL", args);

    }

    @Test
    public void testing() throws Exception {
        System.out.println("Pratik.");
        int a = 7, b = 6;
        int c = a + b;
        Assert.assertEquals("They are equal", c, 13);

    }
}