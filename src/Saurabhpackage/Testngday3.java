package Saurabhpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngday3 {
	@Test(groups={"Smoke"}) // Only this test case will run as we have tag this with the "groups" and provided "include" in the testng3 XML file.
	public void Demo4() {
		
		System.out.println("Luck");
	}

	
	@Test(groups= {"Smoke"})
	public void newDemo() {
		
		System.out.println("New course is coming");
	}
	@Parameters({"URL","API"})
	@Test
	public void oldDemo(String urlNew,String API) { // // Here we have defined this on the basis of test folder not the globally
		
		System.out.println("This is an old course");
		System.out.println(urlNew);
		System.out.println(API);
	}
	
	@BeforeMethod // This will run before every method of this class (Testngday3)
	public void beforeEveryMethod() {
		System.out.println("This should run before every method of the class");
	}
	
	@BeforeClass // This will run before all the methods of this class
	public void beforeClass() {
		System.out.println("Before this class");
	}
	
	@AfterClass // This will run after all the methods of this class
	public void afterClass() {
		System.out.println("After this class");
	}
	
	
	
}

