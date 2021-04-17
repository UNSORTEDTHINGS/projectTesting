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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import student.Campus;

@SuppressWarnings("serial")
public class NewStudentPanel extends JPanel implements ActionListener{
	//fields
	private JTextField idInput,nameInput;
	private JComboBox<Campus> campusList;
	private JButton backButton,addButton;
	private JTextArea addedResult;
	private JPanel panel;
	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public NewStudentPanel() {
		setLayout(new BorderLayout(0, 0));
		panel = new JPanel(new GridLayout(4, 2, 0, 0));
		idInput = new JTextField();
		nameInput = new JTextField();
		campusList = new JComboBox<>(Campus.values());
		backButton = new JButton("GO BACK");
		addButton = new JButton("ADD STUDENT");
		addedResult = new JTextArea();
		NewStudentPanelComponents();
		
	}
	
	private void NewStudentPanelComponents() {
		add(new LabelFor("ADD NEW STUDENT "), BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(new JScrollPane(addedResult), BorderLayout.SOUTH);
		addToPanel(new LabelFor("STUDENT NAME"),nameInput
				,new LabelFor("STUDENT ID#"),idInput,new LabelFor("CAMPUS"),campusList
				,backButton,addButton);
 		 
	}
	private void addToPanel(JComponent...components) {
		for (JComponent c :components) {
		c.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(c);
		}
		campusList.addActionListener(this);
		addButton.addActionListener(this);
		backButton.addActionListener(a->{OptionsPanel.callBack();});
		addedResult.setRows(4);
		idInput.setHorizontalAlignment(SwingConstants.CENTER);
		nameInput.setHorizontalAlignment(SwingConstants.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		// TODO Auto-generated method stub
		
	}

}
