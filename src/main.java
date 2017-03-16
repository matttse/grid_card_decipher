import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
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
	protected static int a = 97;
	protected static int b = 98;
	protected static int c = 99;
	protected static int d = 100;
	protected static int e = 101;
	protected static int f = 102;
	protected static int g = 103;
	protected static int h = 104;
	protected static int i = 105;
	protected static int j = 106;
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// instantiate copyInputFromClipboard
		clippy = copyInputFromClipboard.getClipboardVal(null);
		String passPhrase = "";
		// instantiate regex runner object
		regexInput myVal = new regexInput();
		//[a1][f2][c1][d5]
		System.out.println(myVal.getInputValue(clippy));//pass clipboard to object
		
		try {
			File file = new File("C:/asdasdasd.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
			}
			stringBuffer.trimToSize();
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			int col = 0;
			for (int cnt = 0; cnt < myVal.inputValue.length(); cnt++) {

				//row getter
				if (cnt % 2 != 0 && cnt != 0) {
					int row = Integer.parseInt(myVal.inputValue.substring(cnt, cnt+1))-1;
					//offset by 10
					passPhrase += stringBuffer.substring(row*10+col, row*10+col+1);

				} else {
					//col setter
					if (myVal.inputValue.charAt(cnt) == a || myVal.inputValue.charAt(cnt) == (a-32)) {
						col = 0; 
					} else if (myVal.inputValue.charAt(cnt) == b || myVal.inputValue.charAt(cnt) == (b-32)) {
						col = 1; 
					} else if (myVal.inputValue.charAt(cnt) == c || myVal.inputValue.charAt(cnt) == (c-32)) {
						col = 2; 
					} else if (myVal.inputValue.charAt(cnt) == d || myVal.inputValue.charAt(cnt) == (d-32)) {
						col = 3; 
					} else if (myVal.inputValue.charAt(cnt) == e || myVal.inputValue.charAt(cnt) == (e-32)) {
						col = 4; 
					} else if (myVal.inputValue.charAt(cnt) == f || myVal.inputValue.charAt(cnt) == (f-32)) {
						col = 5; 
					} else if (myVal.inputValue.charAt(cnt) == g || myVal.inputValue.charAt(cnt) == (g-32)) {
						col = 6; 
					} else if (myVal.inputValue.charAt(cnt) == h || myVal.inputValue.charAt(cnt) == (h-32)) {
						col = 7; 
					} else if (myVal.inputValue.charAt(cnt) == i || myVal.inputValue.charAt(cnt) == (i-32)) {
						col = 8; 
					} else if (myVal.inputValue.charAt(cnt) == j || myVal.inputValue.charAt(cnt) == (j-32)) {
						col = 9; 
					}
					
				}
			}

			System.out.println(passPhrase);
			StringSelection clipOut = new StringSelection(passPhrase);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(clipOut, clipOut);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
