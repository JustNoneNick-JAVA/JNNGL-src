package com.jnngl.library.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesFile {

	  private static final Logger log = Logger.getLogger(PropertiesFile.class.getName());

	  private String propertiesFileName;

	  private Properties properties;

	  /**
	   * Constructor - call this constructor to "wrap" a Properties file with this class.
	   * Yes, it's just that easy.
	   * 
	   * @param propertiesFileName
	   *          The name of the Properties file - relative to the
	   *          CLASSPATH - that you want to process using this class.
	   */
	  public PropertiesFile(String propertiesFileName) {

	    // Store the properties file name
	    this.propertiesFileName = propertiesFileName;

	    // Create the Properties object
	    properties = new Properties();

	    // Load the properties file into the Properties object
	    try {
	      properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFileName));
	      log.info("Properties file '" + propertiesFileName + "' loaded.");
	    } catch (IOException e) {
	      String message =
	          "Exception while reading properties file '" + propertiesFileName + "':" + e.getLocalizedMessage();
	      log.log(Level.SEVERE, message, e);
	      // Let's nip this in the bud
	      throw new RuntimeException(message, e);
	    }
	  }

	  /**
	   * Fetches a single property whose value will be returned as a String.
	   * 
	   * @param propertyName
	   *          The name of the property (e.g., the.property.name)
	   * 
	   * @return String - the value of the property as a String (e.g., "propertyValue")
	   */
	  public String getProperty(String propertyName) {
	    String ret = "";
	    log.fine("Looking for property '" + propertyName + "'...");

	    // Read the property
	    ret = properties.getProperty(propertyName);

	    log.fine("Property value is '" + ret + "'");

	    return ret;
	  }

	  /**
	   * Adds a property to this Properties file.
	   * 
	   * @param propertyName
	   * @param propertyValue
	   */
	  public void putProperty(String propertyName, String propertyValue) {
	    properties.put(propertyName, propertyValue);
	  }

	  /**
	   * Saves the properties object to a new file, along with
	   * the COPYRIGHT statement.
	   * 
	   * All properties that have been added will be stored as well.
	   * 
	   * @param makeBackup
	   */
	  public void save(boolean makeBackup) {
	    String outputFileName = this.propertiesFileName + ((makeBackup) ? ".bak" : "");

	    try {
	      // Get the CLASSPATH root directory
	      String classpathRoot = getClass().getResource("/").getPath();

	      // Open an OutputStream to write the properties backup file to
	      FileOutputStream fileOutputStream = new FileOutputStream(classpathRoot + File.separator + outputFileName);

	      // Write the properties. Use the COPYRIGHT as the comments.
	      properties.store(fileOutputStream, fetchCopyright());
	    } catch (IOException e) {
	      String message = "Exception occurred: " + e.getLocalizedMessage();
	      log.log(Level.SEVERE, message, e);
	    }
	  }

	  /**
	   * Reads the COPYRIGHT statement from the project and returns it
	   * to the caller.
	   * 
	   * @return String - the COPYRIGHT statement
	   * 
	   * @throws IOException
	   *           - if something goes horribly wrong.
	   */
	  private String fetchCopyright() throws IOException {
	    String ret = null;

	    byte[] bytes = Files.readAllBytes(Paths.get("./COPYRIGHT"));

	    ret = new String(bytes);

	    return ret;
	  }

	}
