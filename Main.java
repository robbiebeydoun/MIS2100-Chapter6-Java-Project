package Beydoun.Robbie.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numerator;
	private JTextField denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		numerator = new JTextField();
		numerator.setBounds(0, 0, 130, 26);
		panel.add(numerator);
		numerator.setColumns(10);
		
		denominator = new JTextField();
		denominator.setBounds(0, 0, 130, 26);
		panel.add(denominator);
		denominator.setColumns(10);
		
		JLabel division = new JLabel("New label");
		division.setBounds(0, 0, 61, 16);
		panel.add(division);
		
		JButton calculate = new JButton("calculate");
		
		
		calculate.setBounds(0, 0, 117, 29);
		panel.add(calculate);
		calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			double numer = Double.parseDouble(numerator.getText());
			double denom = Double.parseDouble(denominator.getText());
			SimpleMath firstSimpleMath = new SimpleMath();
			try {
				double result = firstSimpleMath.divide(numer, denom);
				division.setText(Double.toString(result));
			}
			catch(ArithmeticException error) {
				division.setText("Cannot divide by 0");
				
			}
			}
		});
	}
}

