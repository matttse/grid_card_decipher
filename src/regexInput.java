/**
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MTse
 *
 */
public class regexInput extends valuePair {
	
	protected String inputValue = "";
	
	/**
	 * @param args
	 * @return 
	 */
	public String getInputValue(String clippy) {
		// Pattern
		String pattern = "[..]";//"\[.?)\]";
		
		// pattern object
		Pattern checking = Pattern.compile(pattern);
		
		// value pair matches
		Matcher inputValue = checking.matcher(clippy);
		System.out.println(inputValue);
		
		return inputValue.toString();
		
	}
	
	public regexInput() {
		super();
		this.letter = "D";//inputValue.substring(0);
		this.number = "1";//inputValue.substring(1);
	}

}
