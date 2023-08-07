package com.example;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeattTest() throws Exception{
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult,actualResult);
    }


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getKittensSimpleTest() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void GetKittensWithParamsTest() {
        Feline feline = new Feline();
        int expectedResult = 2;
        int actualResult = feline.getKittens(2);
        assertEquals(expectedResult,actualResult);
    }
}