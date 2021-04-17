package panels;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AllRecodPanel extends JPanel {
	
	private JTextArea textArea ;
	private JButton backButton ;

	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public AllRecodPanel() {
		this.setLayout(new BorderLayout(0, 0));
		this.textArea = new JTextArea();
		this.backButton = new JButton("GO BACK TO MAIN WINDOW");
		allRecodPanelComponents();

	}
	private void allRecodPanelComponents() {
		this.add(new LabelFor("ALL STUDENTS RECORDS"), BorderLayout.NORTH);
		this.add(backButton, BorderLayout.SOUTH);
		this.add(new JScrollPane(resultsOutput(textArea)), BorderLayout.CENTER);
		this.backButton.addActionListener(a->{OptionsPanel.callBack();});
		this.backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
		
	private JTextArea resultsOutput(JTextArea textArea) {
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		return textArea;
	}
}
