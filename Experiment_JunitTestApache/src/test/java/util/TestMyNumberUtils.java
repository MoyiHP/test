package util;

import util.MyNumberUtils;

public class TestMyNumberUtils
{
    public static void main(String[] args)
    {
        TestMyNumberUtils myTest = new TestMyNumberUtils();
        myTest.testToInt();
        myTest.testIsDigits();
        myTest.testMax();
    }

    public void testToInt()
    {
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

    public void testIsDigits()
    {
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

    public void testMax()
    {
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
}