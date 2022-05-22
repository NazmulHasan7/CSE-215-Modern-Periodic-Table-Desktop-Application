package Elements;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class QuizTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizTest frame = new QuizTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizTest(ArrayList<String> question, ArrayList<String>answer ) {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 890, 546);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmitAnswer = new JButton("SUBMIT ANSWER");
		btnSubmitAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Correct : " +Quiz.getMarks()+ "\nPonits out of 10 : " +Quiz.getMarks()+ "\nAnswers : "+answer.toString());
			}
		});
		btnSubmitAnswer.setForeground(Color.BLACK);
		btnSubmitAnswer.setBounds(10, 473, 174, 23);
		btnSubmitAnswer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnSubmitAnswer);
		
		JButton btnExitTest = new JButton("EXIT TEST");
		btnExitTest.setForeground(Color.BLACK);
		btnExitTest.setBounds(748, 473, 116, 23);
		btnExitTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Quiz.setMarkstoZero();
				dispose();
			}
		});
		btnExitTest.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnExitTest);
		
		textField = new JTextField();
		textField.setText(question.get(0));
		textField.setBounds(20, 64, 410, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_2.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(0))) {
					
					Quiz.updateMarks();
				    textField_2.setEditable(false);
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(20, 105, 410, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_3.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(1))) {
					
					Quiz.updateMarks();
				    textField_3.setEditable(false);
				}
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(20, 187, 410, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText(question.get(1));
		
		textField_4.setColumns(10);
		textField_4.setBounds(20, 146, 410, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			int count= 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_5.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(2))) {
					
					Quiz.updateMarks();
				    textField_5.setEditable(false);
				}
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(20, 269, 410, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(20, 228, 410, 30);
		contentPane.add(textField_6);
		textField_6.setEditable(false);
		textField_6.setText(question.get(2));
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_7.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(3))) {
					
					Quiz.updateMarks();
				    textField_7.setEditable(false);
				}
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(20, 351, 410, 30);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(20, 310, 410, 30);
		contentPane.add(textField_8);
		textField_8.setEditable(false);
		textField_8.setText(question.get(3));
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_9.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(4))) {
					
					Quiz.updateMarks();
				    textField_9.setEditable(false);
				}
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(20, 432, 410, 30);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(20, 392, 410, 30);
		contentPane.add(textField_10);
		textField_10.setEditable(false);
		textField_10.setText(question.get(4));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(454, 64, 410, 30);
		contentPane.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setText(question.get(5));
		
		textField_11 = new JTextField();
		textField_11.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_11.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(5))) {
					
					Quiz.updateMarks();
				    textField_11.setEditable(false);
				}
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(454, 105, 410, 30);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(454, 146, 410, 30);
		contentPane.add(textField_12);
		textField_12.setEditable(false);
		textField_12.setText(question.get(6));
		
		textField_13 = new JTextField();
		textField_13.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_13.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(6))) {
					Quiz.updateMarks();
				    textField_13.setEditable(false);
				}
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(454, 187, 410, 30);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(454, 228, 410, 30);
		contentPane.add(textField_14);
		textField_14.setEditable(false);
		textField_14.setText(question.get(7));
		
		textField_15 = new JTextField();
		textField_15.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_15.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(7))) {
					
					Quiz.updateMarks();
				    textField_15.setEditable(false);
				}
			}
		});
		textField_15.setColumns(10);
		textField_15.setBounds(454, 269, 410, 30);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(454, 310, 410, 30);
		contentPane.add(textField_16);
		textField_16.setEditable(false);
		textField_16.setText(question.get(8));
		
		
		textField_17 = new JTextField();
		textField_17.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_17.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(8))) {
					
					Quiz.updateMarks();
				    textField_17.setEditable(false);
				}
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(454, 351, 410, 30);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(454, 392, 410, 30);
		contentPane.add(textField_18);
		textField_18.setEditable(false);
		textField_18.setText(question.get(9));
		
		textField_19 = new JTextField();
		textField_19.addActionListener(new ActionListener() {
			int count = 0 ;
			public void actionPerformed(ActionEvent e) {
				String ans = "xXx";
				if(count ==0) {
				 ans = textField_19.getText();
				count++;
				}
				if(ans.equalsIgnoreCase(answer.get(9))) {
					Quiz.updateMarks();
				    textField_19.setEditable(false);
				}
			}
		});
		textField_19.setColumns(10);
		textField_19.setBounds(454, 433, 410, 30);
		contentPane.add(textField_19);
		
		JLabel lblQuickTest = new JLabel("Quick Test ");
		lblQuickTest.setForeground(Color.BLACK);
		lblQuickTest.setFont(new Font("Georgia", Font.BOLD, 16));
		lblQuickTest.setBounds(10, 11, 123, 42);
		contentPane.add(lblQuickTest);
		
		JLabel lblPleaseAnswerThsese = new JLabel("Please answer thsese questions and press submit answer to get points  ");
		lblPleaseAnswerThsese.setForeground(Color.BLACK);
		lblPleaseAnswerThsese.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPleaseAnswerThsese.setBounds(178, 26, 613, 14);
		contentPane.add(lblPleaseAnswerThsese);
		
		label = new JLabel(" 1");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setForeground(Color.BLACK);
		label.setBounds(0, 67, 24, 23);
		contentPane.add(label);
		
		label_1 = new JLabel(" 2");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(0, 146, 24, 30);
		contentPane.add(label_1);
		
		label_2 = new JLabel(" 3");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(0, 228, 24, 30);
		contentPane.add(label_2);
		
		label_3 = new JLabel(" 4");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(0, 310, 24, 30);
		contentPane.add(label_3);
		
		label_4 = new JLabel(" 5");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(0, 391, 24, 30);
		contentPane.add(label_4);
		
		label_5 = new JLabel("  6");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(429, 62, 24, 30);
		contentPane.add(label_5);
		
		label_6 = new JLabel("  7");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(429, 146, 24, 30);
		contentPane.add(label_6);
		
		label_7 = new JLabel("  8");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(429, 228, 24, 30);
		contentPane.add(label_7);
		
		label_8 = new JLabel("  9");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(429, 310, 24, 30);
		contentPane.add(label_8);
		
		label_9 = new JLabel(" 10");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(429, 391, 24, 30);
		contentPane.add(label_9);
	}

	public QuizTest() {
		this(null,null);
	}
	
}
