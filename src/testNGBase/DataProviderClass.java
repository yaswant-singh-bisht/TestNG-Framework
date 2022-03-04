package testNGBase;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider (name="diffClassInputDt")
	public Object[][] getExcelData() {
		Object data[][] = {
				{"testcust200000@mail.com","Name200000","Testcust200000","1919 Gallows Rd Ste 200","Vienna","Virginia","22180"},
				{"testcust200001@mail.com","Name200001","Testcust200001","1919 Gallows Rd Ste 200","Vienna","Virginia","22180"},
				{"testcust200002@mail.com","Name200002","Testcust200002","1919 Gallows Rd Ste 200","Vienna","Virginia","22180"},
				{"testcust200003@mail.com","Name200003","Testcust200003","1919 Gallows Rd Ste 200","Vienna","Virginia","22180"}
		};
		return data;
	}

}
