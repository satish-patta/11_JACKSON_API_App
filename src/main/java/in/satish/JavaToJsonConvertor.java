package in.satish;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JavaToJsonConvertor {
  public static void main(String[] args)throws Exception {
	  Address add = new Address();
	  add.setCity("Hyd");
	  add.setState("TG");
	  add.setCountry("India");
	  
	  Customer c = new Customer();
	  c.setCusId(101);
	  c.setCusName("Satish");
	  c.setCusEmail("satishpatta690@gmail.com");
	  c.setCusPhn((long)70958647);
      c.setCusAdd(add);
	  
	  ObjectMapper mapper = new ObjectMapper();
	  mapper.writeValue(new File("Customer.json"), c);
	  System.out.println("Conversion done...");
	  

  }
}
