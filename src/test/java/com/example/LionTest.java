package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void getKittensTest() throws Exception {
       Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualResult = lion.doesHaveMane();
        assertTrue(actualResult);
    }
    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualResult = lion.doesHaveMane();
        assertFalse(actualResult);
    }
    @Test(expected = Exception.class)
    public void doesHaveManeInvalidValueTest() throws Exception {
        Lion lion = new Lion("Одуванчик", feline);
        lion.doesHaveMane();
    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult,actualResult);

    }
}