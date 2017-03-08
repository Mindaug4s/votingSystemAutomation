package test.data;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "TestDataProvider")

	public static Object[][] getDataFromDataProvider() {

		return TestFileReader.fillArrayWithDataFromFile();

		// new Object[][] { { "Naujamiesčio", "Vytenio" } };
	}

}
