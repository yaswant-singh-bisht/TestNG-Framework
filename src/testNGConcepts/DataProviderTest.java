package testNGConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNGBase.DataProviderClass;

public class DataProviderTest {

	@DataProvider (name="inputDt")
	public Object[][] getData() {
		Object data[][] = {
				{"testcust100000@mail.com","Name100000","Testcust100000","1919 Gallows Rd Ste 400","Vienna","Virginia","22182"},
				{"testcust100001@mail.com","Name100001","Testcust100001","1919 Gallows Rd Ste 400","Vienna","Virginia","22182"},
				{"testcust100002@mail.com","Name100002","Testcust100002","1919 Gallows Rd Ste 400","Vienna","Virginia","22182"},
				{"testcust100003@mail.com","Name100003","Testcust100003","1919 Gallows Rd Ste 400","Vienna","Virginia","22182"}
		};
		return data;
	}

	@Test (dataProvider = "inputDt")
	public void registerUser(String email, String fName, String lName, String add1, String city, String state, String postalCode) {
		System.out.println(email + ", " + fName + ", " + lName + ", " + add1 + ", " + city + ", " + state + ", " + postalCode);
	}



	//Data provider is in separate class
	@Test (dataProvider = "diffClassInputDt", dataProviderClass = DataProviderClass.class)
	public void registerUser1(String email, String fName, String lName, String add1, String city, String state, String postalCode) {
		System.out.println(email + ", " + fName + ", " + lName + ", " + add1 + ", " + city + ", " + state + ", " + postalCode);
	}

}
