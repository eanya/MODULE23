package ROUGH_TESTS_july_2017;

import com.facebook.pom.utils.Xls_Reader;

public class TestMyData {

	public static void main(String[] args) {
		getDataSktch.getData("LoginTest",new Xls_Reader(System.getProperty("user.dir")+"//ExcelSheets//TestData.xlsx"));
		getDataSktch.getData("ChangePassword",new Xls_Reader(System.getProperty("user.dir")+"//ExcelSheets//TestData.xlsx"));
		getDataSktch.getData("ChangePassword2",new Xls_Reader(System.getProperty("user.dir")+"//ExcelSheets//TestData.xlsx"));

	}

}
