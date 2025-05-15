package com.dolibarr.erp.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
     public String getDataFromPropertyFile(String Key) throws IOException {
    	 
    	 FileInputStream fis=new FileInputStream("PropertyPath");
    	 Properties p=new Properties();
    	 p.load(fis);
    	 String data=p.getProperty(Key);
		return data  ;
    	 
     }
}
