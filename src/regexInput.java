/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

/**
 * @author MTse
 *
 */
public class regexInput {
	
//	protected String[] inputValue;
	List<String> inputValue = new ArrayList<String>();
	private String pattern = "";
	private int valCnt = 0;
	
	/**
	 * @param args
	 * @return 
	 */
	public String getInputValue(String clippy) {
		
		try {
			File file = new File("C:/Users/ch165496/Desktop/serial12345666666.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Declare Pattern
		pattern = "\\[(.)(.)\\]";
		
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
