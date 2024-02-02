package Saurabhpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngday4 {
	@Parameters({"URL"}) // We have define "URL" value in the testng XML file and then using the value in the attached test case which is "Demo5"
	@Test
	public void Demo5(String urlName){ // here we are transferring URL stored value in the test case by giving argument in the method.
		
		System.out.println("Big");
		System.out.println(urlName); // here we are printing the URL text to check the functionality 
	}
	
	@Test
	public void Demo6() {
		System.out.println("Small");
	}
	
	@Test(dataProvider="getData") // Here we have passed the data provider method which we have created below 
	public void Demo7(String username, String password) {
		System.out.println("Younger");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void looklogin() {
		System.out.println("Look login is here");
	}
	
	@Test
	public void looklogout() {
		System.out.println("Look logout is here");
	}

	@Test
	public void lookDashboard() {
		System.out.println("Look Dashboard is here");
	}
	
	@BeforeTest // This method will run at the 1st place in that specific test folder like in Ashu1 under testng xml file 
	public void earlier() {
		System.out.println("I will be the first execution");
	}
	
	@AfterTest  // This method will run at the last  place in that specific test folder  like in Ashu1 under testng xml file 
	public void last() {
		System.out.println("I will be the last execution");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		//1st set - User name and password - Good credit score
		//2nd set - User name and password - No credit history
		//3rd set - User name and password - Bad credit history
		
		// Here we need to pass 3 set of data means 3 rows and 2 columns with 2 values (User name ands password)
		
		Object[][] data = new Object[3][2]; // Here 3 is the number or rows as we have 3 sets of data and 2 is the columns with 2 values (User name and password)
		//1st set of data 
		data[0][0]= "Firstusername"; // First row and first column
		data[0][1]="Firstpassword";//First row and 2nd column
		//2nd set of data
		data[1][0]= "Secondusername";//2nd row and 1st column
		data[1][1]="Secondpassword";//2nd row and 2nd column
		//3rd set of data
		data[2][0]= "Thirdusername";//3rd row and 1st column
		data[2][1]="Thirdpassword";//3rd row and 2nd column
		return data;
		
		// First row and column starts from 0 index
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
