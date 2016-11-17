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
	private String pattern = "";
	
	public regexInput() {
		super();
		this.letter = "D";//inputValue.substring(0);
		this.number = "1";//inputValue.substring(1);
	}
	/**
	 * @param args
	 * @return 
	 */
	public String getInputValue(String clippy) {
		// Declare Pattern
		pattern = "[..]";//"\[.?)\]";
		
		// pattern object
		Pattern checking = Pattern.compile(pattern);
		
		// value pair match object
		Matcher inputValue = checking.matcher(clippy);
		if (inputValue.find()) {
			System.out.println(inputValue.group(0));
			System.out.println(inputValue.group(1));
		}
		
		
		return inputValue.toString();
		
	}
}
