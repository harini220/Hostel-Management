package main;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import main.Hostel;
public class HostelTest {

	public String givenCorrect() {
		  
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    return generatedString;
	}
	@SuppressWarnings("static-access")
	@Test
	public void studentNameTest() throws IOException {
		boolean chk = true;
		h	= new Hostel();
		
		BufferedWriter out = new BufferedWriter(new FileWriter("hostel.txt",true));
//		assertEquals(false,h.verifyName("test rNo"));
		
			try{
				out.write("tekjhgfdsst rNo");
				out.newLine();
	           }catch(Exception e){
	               //print
	               System.out.println(e);
	               
	           }finally{
	               out.close();
	           }
		
		
		assertEquals(true,h.verifyName("tekjhgfdsst"));
		
		
		
		
//		fail("Not yet implemented");
	}
	@SuppressWarnings("static-access")
	@Test
	public void studentDuplicacyTest() throws IOException{
//		boolean chk = true;
		assertEquals(false,h.verifyName("abcdef"));
	}
}

	
			
			


	