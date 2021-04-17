package panels;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import student.Campus;

@SuppressWarnings("serial")
public class EditRecordPanel extends JPanel implements ActionListener {

	private JButton backButton,saveButton,printButton,searchButton,deletButton;
	private JTextField currentId,searchInput,currentName;
	private JComboBox<Campus> currentCampus ;
	private JPanel editsPanel;

	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public EditRecordPanel() {
		setLayout(new BorderLayout(0, 0));
		editsPanel =new JPanel(new GridLayout(6, 2, 0, 0));
		currentCampus = new JComboBox<>(Campus.values());
		backButton = new JButton("GO BACK");
		searchInput = new JTextField();
		saveButton = new JButton("SAVE CHANGES");
		searchButton = new JButton("SEARCH");
		currentId = new JTextField();
		currentName = new JTextField();
		currentCampus = new JComboBox<>();
		printButton = new JButton("PRINT RECORD");
		deletButton = new JButton("REMOVE STUDENT");
		panelComponets();

	}
	private void panelComponets() {
		add(new LabelFor("ENETER STUDENT ID TO MAKE CHANGES"), BorderLayout.NORTH);
		backButton.addActionListener(a->{OptionsPanel.callBack();});
		add(backButton, BorderLayout.SOUTH);
		add(editsPanel, BorderLayout.CENTER);
		editsPanelComponents(new LabelFor("STUDENT ID NUMBER"),
				searchInput,saveButton,searchButton,
				new LabelFor("CURRENT ID NUMBER"),currentId,new LabelFor("STUDENT NAME"),
				currentName,new LabelFor("CAMPUS"),currentCampus,printButton,deletButton);
	}

	private void editsPanelComponents(JComponent...components) {
		for (JComponent com :components) {
			editsPanel.add(com);
			com.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		//addActionListners
		currentCampus.addActionListener(this);
		searchButton.addActionListener(this);
		deletButton.addActionListener(this);
		printButton.addActionListener(this);
		saveButton.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent click) {
		// TODO Auto-generated method stub

	}


}
