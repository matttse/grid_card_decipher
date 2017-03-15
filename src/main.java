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
		
		// instantiate regex runner object
		regexInput myVal = new regexInput();
		//[a1][b2][c3][d5]
		System.out.println(myVal.getInputValue(clippy));//pass clipboard to object
		char[] chArr = new char[10];
		try {
			File file = new File("C:/Users/ch165496/Desktop/serial_num_14194.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
//				stringBuffer.append("\n");
			}
			stringBuffer.trimToSize();
			//parse input Code response
			//only search every even input aka columns (A-J = 0-9)
			//if char is 1
			//only search stringbuffer 0-9
			//if char is 2
			//only search stringbuffer 10-19
			//if char is 3
			//only search stringbuffer 20-29
			//..
			/*
			for (int cnt = 0; cnt < myVal.inputValue.length(); cnt++) {
//				int rowchk = (int) myVal.inputValue.get(cnt).charAt(cnt);//returns a
				char charchk;
				
				//column check (even numbers divisible by 2)
				if (cnt % 2 != 0) {
					int rowchk = (int) myVal.inputValue.toUpperCase().charAt(cnt);	
					//a
					if (rowchk == a || rowchk == (a-32)) {
						//get chars (0-9) 
						
						stringBuffer.getChars(0, (9-myVal.inputValue.charAt(cnt+1)), chArr, cnt);	
					} else if (rowchk == b || rowchk == (b-32)) {
						stringBuffer.getChars(10, (19-myVal.inputValue.charAt(cnt+1)), chArr, cnt);
					}
					

//					stringBuffer.getChars(cnt, cnt + 1, chArr, cnt);
//				} else {
					
				}

			}*/
			
			
			
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
