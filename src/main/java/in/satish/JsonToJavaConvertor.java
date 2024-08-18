 package in.satish;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvertor {
    public static void main(String[] args)throws Exception {
    	
    	//File file = new File("Customer.json");
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Customer c = mapper.readValue(new File("Customer.json"), Customer.class);
    	System.out.println(c);
    	
    }
    
}
