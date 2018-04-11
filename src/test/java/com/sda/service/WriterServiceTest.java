package com.sda.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

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
    public void testEmptyName(){
        //given
        String name = "";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.", result);

    }

    @Test
    public void testCapitalize(){
        String name = "JAREK";

        String result = writerService.write(name);

        Assert.assertEquals("HELLO, " + name + "!", result);
    }

    @Test
    public void testBlankName(){
        //given
        String name = "     ";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testMultipleNames() {
        //given
        String value = "Jarek,Anna,Jan";

        //when
        String result = writerService.write(value);

        //then
        Assert.assertEquals("Hello, Jarek, Anna and Jan.", result);
    }

    @Test
    public void testMultipleCapitalizedNames() {
        //given
        String value = "SZYMON,ANNA,JAN";

        //when
        String result = writerService.write(value);

        //then
        Assert.assertEquals("HELLO, SZYMON, ANNA AND JAN!", result);
    }
}
