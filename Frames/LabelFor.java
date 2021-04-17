import java.awt.Font;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LabelFor extends JLabel{
	
	private final Font LABEL_FONTS = new Font("Tahoma", Font.PLAIN, 20);
	
	public LabelFor(String name) {
		setText(name);
		setFont(LABEL_FONTS);
		setHorizontalAlignment(CENTER);
		setFocusable(false);
	}

}
