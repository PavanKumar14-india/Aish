package Reg;

import org.testng.annotations.Test;

public class Demo2Test {
	@Test
	public void demo2()
	{
		System.out.println("smoke---Commit");
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
}
