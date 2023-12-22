package Test;

import java.io.IOException;

import Utilities.JsonReader;

public class JsonTest {

	public static void main(String[] args) throws IOException
	{
		
		JsonReader json= new JsonReader("./src/test/resources/Locator/OR.json");
		System.out.println(json.getLocator("Locator.HomePage.UserName.XPath"));
		
		
	}

}
