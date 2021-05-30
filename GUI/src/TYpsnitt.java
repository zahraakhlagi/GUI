import java.awt.GraphicsEnvironment;

public class TYpsnitt {

	public static void main(String[] args) {
		GraphicsEnvironment ge;
		ge= GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] font= ge.getAvailableFontFamilyNames();
		
		for(int i=0;i<font.length;i++) {
			System.out.println(font[i]);
		}
	}

}
