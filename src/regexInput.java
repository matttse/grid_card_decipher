/**
 * 
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author MTse
 *
 */
public class regexInput {
	
	String inputValue = "";
	private String pattern = "";
	
	/**
	 * @param args
	 * @return 
	 */
	public String getInputValue(String clippy) {		
		
		// Declare Pattern
		pattern = "\\[(.)(.)\\]";
		
		// pattern object
		Pattern checking = Pattern.compile(pattern);
		
		// value pair match object
		Matcher clipboardValue = checking.matcher(clippy);
		//while there are still values to find, keep iterating
		while (clipboardValue.find()) {
			inputValue += clipboardValue.group(1).charAt(0);
			inputValue += clipboardValue.group(2).charAt(0);
			
		} 
		
		
		return inputValue;
		
	}
	

	
}
