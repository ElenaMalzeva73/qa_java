package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexTest {
    private final boolean hasMane;
    private final String sex;
    Feline feline;
    public  LionSexTest(String sex,boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters(name = "{index}: sex = {0}, hasMane = {1}")
            public static Collection<Object[]> getLionSexTest() {
        return Arrays.asList(new Object[][]{
                        {"Самец",true},
                        {"Самка",false},
        });
    }

    @Test
     public void testLionSexTest() throws Exception{
        Lion lion = new Lion(sex,feline);
        assertEquals(hasMane,lion.doesHaveMane());
    }

}
