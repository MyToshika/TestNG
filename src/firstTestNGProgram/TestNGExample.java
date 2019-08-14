package firstTestNGProgram;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestNGExample {
	
	 String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {	  
	      AssertJUnit.assertEquals(message,messageUtil.printMessage());
	   }

}
