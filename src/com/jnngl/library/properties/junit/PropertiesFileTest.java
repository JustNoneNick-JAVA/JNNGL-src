package com.jnngl.library.properties.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jnngl.library.properties.PropertiesFile;

public class PropertiesFileTest {

	  private PropertiesFile classUnderTest;

	  @Before
	  public void setUp() throws Exception {
	    classUnderTest = new PropertiesFile("junitp.properties");
	  }

	  @After
	  public void tearDown() throws Exception {
	    classUnderTest = null;
	  }

	  @Test
	  public void testGetProperty() {
	    String propertyName = "property1";
	    String expectedPropertyValue = "property1Value";
	    String actualPropertyValue = classUnderTest.getProperty(propertyName);

	    assertEquals(expectedPropertyValue, actualPropertyValue);

	  }

	  @Test
	  public void testPutProperty() {
	    String propertyName = "dynamicProperty";

	    classUnderTest.putProperty(propertyName + "1", "value1");
	    classUnderTest.putProperty(propertyName + "2", "value2");
	    classUnderTest.putProperty(propertyName + "3", "value3");
	    classUnderTest.putProperty(propertyName + "4", "value4");

	    // Now save the properties to original file (no backup)
	    classUnderTest.save(false);

	    // Now save the properties to backup file
	    classUnderTest.save(true);

	  }

	}
