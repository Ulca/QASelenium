package org.seleniumqa.lesson_2;

import org.testng.annotations.*;
import static org.testng.Assert.*;
/**
 * Created by admin on 11.02.2015.
 */
public class StringSearch {

    public String srcString, trgString;

    @BeforeTest
    public void setUp(){
        srcString = "abcdefg";
        trgString = "abcdefg";
    }

    @Test
    public void stringIsThere(){
        assertEquals(findString(srcString, trgString), 0);
    }

    @AfterTest
    public void TearDown(){
        srcString = "";
        trgString = "";
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
