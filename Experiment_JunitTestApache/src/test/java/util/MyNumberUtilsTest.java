package util;

import static org.junit.Assert.*;

public class MyNumberUtilsTest {

    @org.junit.Test
    public void toInt() {
        System.out.println("TEST ToInt:");
        int num = MyNumberUtils.toInt("");
        if (num ==  0)
        {
            System.out.println("num is 0 , OK");
        }
        else
        {
            System.out.println(("Error in ToInt"));
        }
    }

    @org.junit.Test
    public void max() {
        System.out.println("TEST Max:");
        int num1 = 1 , num2 = 2 , num3 = 3 ;
        int max = MyNumberUtils.max(num1,num2,num3);
        if (max ==  3)
        {
            System.out.println("max in 1,2,3 is 3 , OK!");
        }
        else
        {
            System.out.println(("Error in Max"));
        }
    }

    @org.junit.Test
    public void isDigits() {
        System.out.println("TEST IsDigits:");
        boolean bIsDigits = MyNumberUtils.isDigits("1234abc");
        if (bIsDigits == false)
        {
            System.out.println("1234abc is not digits , OK");
        }
        else
        {
            System.out.println(("Error in IsDigits"));
        }
    }
}