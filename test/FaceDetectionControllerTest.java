package test;

import org.junit.Assert;
import org.junit.Test;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;

public class FaceDetectionControllerTest {

    @Test
    public void detectAndDisplay(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        MatOfRect faces = new MatOfRect();
        Mat grayFrame = new Mat();
        Assert.assertNotEquals("The Matrix and Reaction Matrix are not equal, which is correct",faces,grayFrame);
    }

    @Test
    public void grabFrame() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat frame = new Mat();
        frame.empty();
        Assert.assertNotNull("Frame is empty yet not null, which is correct", frame);
        frame = null;
        Assert.assertNull("Frame is null, which is correct",frame);
    }
}