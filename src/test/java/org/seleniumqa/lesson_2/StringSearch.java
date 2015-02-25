package org.seleniumqa.lesson_2;

import org.testng.annotations.*;
import static org.testng.Assert.*;
/**
 * Created by admin on 11.02.2015.
 */
public class StringSearch {

    public String srcString1, trgString1, trgString2;

    @BeforeTest
    public void setUp(){
        srcString1 = "abcdefg";
        trgString1 = "abcdefg";
        trgString2 = "h";
    }

    @Test
    public void stringIsThere(){
        assertEquals(findString(srcString1, trgString1), 0);
    }

    @Test
    public void stringIsNotThere() {assertEquals(findString(srcString1, trgString2), -1);}

    @AfterTest
    public void TearDown(){
        srcString1 = "";
        trgString1 = "";
        trgString2 = "";
    }

    static public int findString(String sStr, String tStr){
        int tPos = 0;
        for (int i = 0; i <= sStr.length() - tStr.length(); i++){
            if (sStr.charAt(i) == tStr.charAt(tPos)) {
                int j = i;
                while (sStr.charAt(j) == tStr.charAt(tPos)) {
                    if (tPos == tStr.length() - 1) return i;
                    else {tPos += 1; j+=1;}
                }
                tPos = 0;
            }
        }
        return -1;
    }
}
