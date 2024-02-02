package Saurabhpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testngday2 {
	@Test(groups= {"Sanity"}) // Only this test case will not run as we have tag this with the "groups" and provided "exclude" in the testng3 XML file
	public void Demo3() {
		
		System.out.println("Take care");
	}
	
	@BeforeSuite // This will run before all the test case folder like Ashu and Ashu1 in the testng XML file
	public void topPriority() {
		System.out.println("This is the top priority");
	}
	
	@AfterSuite // This will run after all the test case folder like Ashu and Ashu1 in the testng XML file
	public void lastPriority() {
		System.out.println("This is the last priority");
	}
	

}
