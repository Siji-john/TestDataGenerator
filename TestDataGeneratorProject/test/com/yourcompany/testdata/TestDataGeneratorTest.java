package com.yourcompany.testdata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDataGeneratorTest {

    private TestDataGenerator generator;

    @Before
    public void setUp() {
        generator = new TestDataGenerator();
    }

    @Test
    public void testGenerateNameNotNull() {
        String name = generator.generateName();
        assertNotNull("Generated name should not be null", name);
        System.out.println("Generated Name: " + name); 
        assertFalse("Generated name should not be empty", name.trim().isEmpty());
    }

	 @Test 
	public void testGenerateEmailValid() { 
	  String email = generator.generateEmail();
	  assertNotNull("Generated email should not be null", email);
	  System.out.println("Generated email: " + email); 
	  assertTrue("Generated email should be valid", generator.isValidEmail(email));
	  }
	  
	 @Test 
	public void testGeneratePhoneNumberValid() { 
	  String phone = generator.generatePhoneNumber();
	  assertNotNull("Generated phone number should not be null", phone);
	  System.out.println("Generated phone: " + phone); 
	  assertTrue("Generated phone number should be valid",generator.isValidPhoneNumber(phone)); 
	  }
	 
     @Test
	public void testGenerateWebsiteValid() { 
	  String website = generator.generateWebsite();
	  assertNotNull("Generated website should not be null", website);
	  System.out.println("Generated Website: " + website); 
	  assertTrue("Generated website should be valid",generator.isValidURL(website)); 
	  }
	
	 @Test 
	public void testInvalidEmail() { 
	String invalidEmail = "not-an-email";
	System.out.println("Generated Email: " + invalidEmail);
	assertFalse("Invalid email should fail validation",generator.isValidEmail(invalidEmail)); 
	  }
	  
	  @Test 
	public void testInvalidPhoneNumber() { 
	String invalidPhone = "abc123!!"; 
	System.out.println("Generated Phone: " + invalidPhone);
	assertFalse("Invalid phone number should fail validation",generator.isValidPhoneNumber(invalidPhone)); 
	  }
	  
	  @Test 
	public void testInvalidWebsite() { 
	String invalidWebsite = "htp:/invalid-url"; 
	System.out.println("Generated Website: " + invalidWebsite);
	assertFalse("Invalid website should fail validation",generator.isValidURL(invalidWebsite)); 
	  }
	 
}
