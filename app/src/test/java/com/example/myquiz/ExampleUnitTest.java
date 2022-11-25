package com.example.myquiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    MathGenerator mathGenerator = new MathGenerator();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void Test1(){
        int a = mathGenerator.getRandom(10, -10);
    }
    @Test
    public void test2(){
        int a = mathGenerator.getRandom(10, -10);
        int b = mathGenerator.getRandom(10, -10);
        assert a != b;
    }

}