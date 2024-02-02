package Saurabhpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngday1 {
	@Parameters({"URL"})
	@Test
	public void Demo1(String urlValue) { // Here we have defined this on the basis of test folder not the globally
		
		System.out.println("Bye");
		System.out.println(urlValue);
	}
	
	@Test(enabled=false) // If we know that there is a bug related to this test case and if we do not want to run this test case so we can disable this test case keeping other test cases in running phase
	// And it we replace "false" with "true" then again this test will be active and can run with all other test cases
	public void newDemoNew() {
		
		System.out.println("Latest code is coming");
	}
	
	
	@Test(timeOut=4000) // It means that this test case will wait 4 seconds before it runs as this test case is taking time to execute so we provided timeout in milliseconds.
	public void demoTest() {
		
		System.out.println("How are you?");
		
	}
	
	@Test(dependsOnMethods= {"Demo1","demoTest"}) // It means that "Demo2" method is depend on "Demo1" so first "Demo1" method will execute and then "Demo2" method will execute. We are doing this because we know that by default methods executed in alphabetical orders.
	public void Demo2(){
		
		System.out.println("Hello");
	}
		@AfterMethod // This will run after every method of this class (Testngday1)
		public void afterEveryMethod() {
			System.out.println("This will run after every method ");
			
			
		//XML file settings only work when we run the test cases through XML file (Right click on the XML file to run) otherwise if we run the test cases through class (Right click on the class to run the test cases) then class setting will work.	
			
			
			
			
		
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
