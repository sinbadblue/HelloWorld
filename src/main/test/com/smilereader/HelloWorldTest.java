package com.smilereader;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: shijunkong
 * Date: 1/28/12
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld newBie = new HelloWorld();
        Assert.assertEquals("Hello World!", newBie.hello());
    }
}
