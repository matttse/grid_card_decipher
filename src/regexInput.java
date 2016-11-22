/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MTse
 *
 */
public class regexInput extends valuePair {
	
//	protected String[] inputValue;
	List<String> inputValue = new ArrayList<String>();
	private String pattern = "";
	private int valCnt = 0;
	
	/**
	 * @param args
	 * @return 
	 */
	public String getInputValue(String clippy) {
		// Declare Pattern
		pattern = "\\[..\\]";//"\[.?)\]";
		
		// pattern object
		Pattern checking = Pattern.compile(pattern);
		
		// value pair match object
		Matcher clipboardValue = checking.matcher(clippy);
		//while there are still values to find, keep iterating
		while (clipboardValue.find()) {
			inputValue.add(clipboardValue.group(0));
			valCnt++;
		} 
		valCnt = 0;//reset
		
		//return string
		return inputValue.toString();
		
	}
}
