package org.seleniumqa.lesson_2;

import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 * Created by admin on 09.02.2015.
 */
public class PrimeNumber {

    public int number;

    @BeforeTest
    public void setUp(){
        number = 19;
    }

    @Test
    public void isPrimeTest(){
        assertTrue(isPrime(number));
    }

    @AfterTest
    public void tearDown(){
        number = 0;
    }

    static boolean isPrime(int num){
        if (num == 1)  return false;
        if (num == 2) return true;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }

}
