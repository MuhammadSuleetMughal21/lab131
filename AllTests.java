package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ isevenTest.class, isOddTest.class, factorialTest.class, isPrimeTest.class })
public class AllTests {

}
