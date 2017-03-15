import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */


/**
 * @author MTse
 *
 */
public class main {
	public static String clippy = "";
	private String test = "";
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// instantiate copyInputFromClipboard
		clippy = copyInputFromClipboard.getClipboardVal(null);
//		System.out.println(clippy);//clipboardOut
		
		// instantiate regex runner object
		regexInput myVal = new regexInput();
		System.out.println(myVal.getInputValue(clippy));//pass clipboard to object
		
		try {
			File file = new File("c:/location.txt");
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
		
	}

}
