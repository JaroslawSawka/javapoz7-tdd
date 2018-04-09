package com.sda.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterServiceTest {

    WriterService writerService = new WriterService();

    @Before
    public void init(){
        this.writerService = new WriterService();
    }


    @Test
    public void testOneName(){
        //given
        String name = "Jarek";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, Jarek.", result);
    }

    @Test
    public void testNullName(){
        String name = null;

        String result = writerService.write(name);

        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testCapitalize(){
        String name = "JAREK";

        String result = writerService.write(name);

        Assert.assertEquals("HELLO, " + name + "!", result);
    }
}
