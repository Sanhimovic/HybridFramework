package generic;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="register")
	public String[][] data()
	{
		String [][]arr= {{"Hello world","Eng","NCR","Delhi","C:\\Users\\QSPR\\Desktop\\password.txt"}};
		return arr;
	}
}
