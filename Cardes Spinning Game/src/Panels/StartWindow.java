package Panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.PlayersDashBoard;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StartWindow extends JFrame {

	public static JLayeredPane layeredPane;
	private JLabel info;
	private JButton startButton;
	private JPanel welcome;
	PlayersDashBoard dahshB = new PlayersDashBoard();


	/**
	 * Create the frame.
	 */
	public StartWindow() {
		GameWindow gamePanel = new GameWindow(dahshB);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400,300));
		layeredPane = new JLayeredPane();
		setContentPane(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		welcome = new JPanel(new BorderLayout(0, 0));
		startButton = new JButton("LETS PLAY");
	    startButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		layeredPane.add(welcome);
		info = new JLabel("CLICK LETS PLAY TO START");
		welcome.add(startButton, BorderLayout.SOUTH);
		info.setFont(new Font("Tahoma", Font.PLAIN, 24));
		info.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.add(info, BorderLayout.CENTER);
		startButton.addActionListener(s->swtichTo(gamePanel));
		pack();
		
	}
	
	public static void swtichTo(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}

}
