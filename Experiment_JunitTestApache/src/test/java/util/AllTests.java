package util;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.Test;

@RunWith(Suite.class)
@SuiteClasses({MyNumberUtilsTest.class})
public class AllTests
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("All JUnit test");
        suite.addTest(new JUnit4TestAdapter(MyNumberUtils.class));
        return suite;
    }
}
