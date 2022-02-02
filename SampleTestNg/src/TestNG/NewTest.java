package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	 Assert.assertEquals(com.Calc.add(15,15), 30);
	 //assertEquals(0, 0);
  }
}
