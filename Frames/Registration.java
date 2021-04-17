import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Registration extends JPanel {
	
	//fields
	private JTextField idInput,nameInput;
	private JTextArea addedResult;
	private JPanel panel;
	private JComboBox<String> campusList;
	private JButton backButton,addButton;
	
	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public Registration() {
		setLayout(new BorderLayout(0, 0));
		panel = new JPanel(new GridLayout(4, 2, 0, 0));
		idInput = new JTextField();
		nameInput = new JTextField();
		campusList = new JComboBox<>();
		backButton = new JButton("GO BACK");
		addButton = new JButton("ADD STUDENT");
		addedResult = new JTextArea();
		componetsProperties();
		addComponents();
		

	}
	//set components properties 
	private void componetsProperties() {
		addedResult.setRows(4);
		idInput.setHorizontalAlignment(SwingConstants.CENTER);
		nameInput.setHorizontalAlignment(SwingConstants.CENTER);
		setComponentsFont(idInput,nameInput,campusList,backButton,addButton,addedResult);
		
	}
	private void addComponents() {
		add(new LabelFor("ADD NEW STUDENT "), BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		panel.add(new LabelFor("STUDENT NAME"));
		panel.add(idInput);
		panel.add(new LabelFor("STUDENT ID#"));
		panel.add(nameInput);
		panel.add(new LabelFor("CAMPUS"));
		panel.add(campusList);
		backButton.addActionListener(a->{goBack();});
		panel.add(backButton);
		panel.add(addButton);
		add(new JScrollPane(addedResult), BorderLayout.SOUTH);
		
	}
	private void goBack() {
		StudentsRecordMain.layeredPane.removeAll();
		StudentsRecordMain.layeredPane.add(StudentsRecordMain.frontPanel);
		StudentsRecordMain.layeredPane.repaint();
		StudentsRecordMain.layeredPane.revalidate();
		
	}
	private void setComponentsFont(Component...components) {
		for (Component c :components) {
		c.setFont(new Font("Tahoma", Font.PLAIN, 20));				
		}
		
	}

}
