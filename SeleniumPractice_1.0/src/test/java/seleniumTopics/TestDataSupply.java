package seleniumTopics;

import org.testng.annotations.DataProvider;

public class TestDataSupply {
  

	@DataProvider(name="TestDataSupply")
	  public static Object[][] DataDriven()
	  {
		  
		  Object[][] Data=new Object[3][2];
		  
		  Data[0][0]="Avi403@amarpaliprincley.com";
		  Data[0][1]="Avi@1234";
		  
		  Data[1][0]="Rishab403@amarpaliprincley.com";
		  Data[1][1]="Rishab@1234";
		  
		  Data[2][0]="Abhay403@amarpaliprincley.com";
		  Data[2][1]="Abhay@1234";
		  
		return Data;
		 
		  
	  }
}
