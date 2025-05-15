package com.dolibarr.erp.generic.fileutility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	public String getDataFromJsonFile(String Key) throws Throwable {
		FileReader r=new FileReader("./ConfigAppData/Commondata1.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(r);
		JSONObject js=(JSONObject)obj;
		String data=(String)js.get(Key);
		return data;
	}
}
