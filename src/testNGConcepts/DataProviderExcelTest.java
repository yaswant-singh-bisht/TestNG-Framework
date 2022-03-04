package testNGConcepts;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNGUtil.GetData;

public class DataProviderExcelTest {

//	"http://demo.automationtesting.in/Register.html"
	String excelFilePath = System.getProperty("user.dir")+"\\TestData\\DataProvider.xlsx";
	String sheetName = "Sheet1";
	
    @DataProvider(name="excelData")
	public Object[][] excelDataProvider(){
		GetData obj = new GetData();
		Object[][] outputData = obj.getExcelData(excelFilePath, sheetName);
		return outputData;
	}
	
	@Test (dataProvider = "excelData")
	public void registerUser(String email, String fName, String lName, String add1, String city, String state, String postalCode) {
		System.out.println(email + ", " + fName + ", " + lName + ", " + add1 + ", " + city + ", " + state + ", " + postalCode);
	}
    
}
