package Utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JsonReader 
{
	public File jsonfile;
	public String fileName;
	
	public JsonReader(String fileName)
	{
		this.fileName=fileName;
	}
	
	public String getLocator(String locator) throws IOException
	{
		jsonfile=new File(fileName);
		
		return JsonPath.read(jsonfile, "$." +locator);
		
		
	}
	

}
