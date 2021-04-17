package panels;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class EditRecordPanel extends JPanel {
	private JTextField currentId,searchInput,currentName;
	private JComboBox<String> currentCampus = new JComboBox<>();
	private JPanel editsPanel=new JPanel(new GridLayout(6, 2, 0, 0));
	private JButton backButton,saveButton,printButton,searchButton,deletButton;

	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public EditRecordPanel() {
		setLayout(new BorderLayout(0, 0));
		backButton = new JButton("GO BACK");
		searchInput = new JTextField();
		saveButton = new JButton("SAVE CHANGES");
		searchButton = new JButton("SEARCH");
		currentId = new JTextField();
		currentName = new JTextField();
		currentCampus = new JComboBox<>();
		printButton = new JButton("PRINT RECORD");
		deletButton = new JButton("REMOVE STUDENT");
		addComponents();

	}
	//set components properties 
	private void componentsProperties() {
		setComponentsFont(backButton,searchButton,saveButton,printButton,
				searchInput,deletButton,currentCampus,currentId,currentName);
		searchInput.setHorizontalAlignment(SwingConstants.CENTER);
		
		
	}
	private void setComponentsFont(JComponent...components) {
		for (JComponent com :components) {
		com.setFont(new Font("Tahoma", Font.PLAIN, 20));				
		}
		
	}
	
	private void addComponents() {
		componentsProperties();
		add(new LabelFor("ENETER STUDENT ID TO MAKE CHANGES"), BorderLayout.NORTH);
		backButton.addActionListener(a->{goBack();});
		add(backButton, BorderLayout.SOUTH);
		add(editsPanel, BorderLayout.CENTER);
		editsPanel.add(new LabelFor("STUDENT ID NUMBER"));
		editsPanel.add(searchInput);
		editsPanel.add(saveButton);
		editsPanel.add(searchButton);
		editsPanel.add(new LabelFor("CURRENT ID NUMBER"));
		editsPanel.add(currentId);
		editsPanel.add(new LabelFor("STUDENT NAME"));
		editsPanel.add(currentName);
		editsPanel.add(new LabelFor("CAMPUS"));
		editsPanel.add(currentCampus);
		editsPanel.add(printButton);
		editsPanel.add(deletButton);


	}

	private void goBack() {
		SelectionWindow.layeredPane.removeAll();
		SelectionWindow.layeredPane.add(SelectionWindow.frontPanel);
		SelectionWindow.layeredPane.repaint();
		SelectionWindow.layeredPane.revalidate();
		
	}

}
