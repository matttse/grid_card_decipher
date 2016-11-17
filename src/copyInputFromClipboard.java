/**
 * 
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * @author MTse
 *
 */
public class copyInputFromClipboard {
	public static String clipboardInput = "";
	/**
	 * @param args
	 * @return 
	 */
	public static String getClipboardVal(String[] args) {
		// instantiate toolkit
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// instantiate clipboard
		Clipboard clipboard = toolkit.getSystemClipboard();
		try {
			clipboardInput = (String) clipboard.getData(DataFlavor.stringFlavor);
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (clipboardInput != null) {
//			System.out.println(clipboardInput);
			return (clipboardInput);
		} else {
			clipboardInput = "Invalid Copy Method";
			return clipboardInput;	
		}


	}

}
