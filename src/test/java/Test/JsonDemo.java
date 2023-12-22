package Test;

import java.io.IOException;

import Utilities.JsonReaders;

public class JsonDemo {

	public static void main(String[] args) throws IOException 
	{
	
		JsonReaders json= new JsonReaders("./src/test/resources/Locator/New.json");
		System.out.println(json.getLocator("Locator.HomePage.UserName.XPath"));

	}

}
