package info.hunterline.dev;

import org.junit.Assert;
import org.junit.Test;

public class testHelloWorld {

    @Test
    public void testHello() {
        HelloWorld test = new HelloWorld();
        Assert.assertTrue(test.sayHello() == "Hello World!");
    }
}

