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
//		System.out.println(clippy);
		
		regexInput myVal = new regexInput();
		System.out.println(myVal.getInputValue(clippy));
		
	}

}
