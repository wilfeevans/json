package Utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JsonReaders
{
	public File jsonfile;
	public String fileName;
	
	public JsonReaders(String fileName)
	{
		this.fileName= fileName;
		
	}
	
	public String getLocator(String locator) throws IOException
	{
		jsonfile= new File(fileName);
		
		return JsonPath.read(jsonfile, "$." +locator);
		
		
	}
	
	

}
