package Elements;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Comment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comment frame = new Comment();
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
	public Comment() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 414, 119);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(true);
		
		JLabel lblAddYourCommet = new JLabel("Add your commet here :");
		lblAddYourCommet.setFont(new Font("Georgia", Font.BOLD, 12));
		lblAddYourCommet.setBounds(10, 11, 185, 25);
		contentPane.add(lblAddYourCommet);
		
		JLabel lblEnterYourName = new JLabel("Enter your name :");
		lblEnterYourName.setFont(new Font("Georgia", Font.BOLD, 12));
		lblEnterYourName.setBounds(10, 154, 133, 34);
		contentPane.add(lblEnterYourName);
		
		textField = new JTextField();
		textField.setBounds(10, 183, 414, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						File file = new File("comments.txt");
						if(!file.exists()) {
						file.createNewFile();
						}
						
						  FileWriter fw = new FileWriter(new File("comments.txt"),true);
				    	  BufferedWriter bw = new BufferedWriter(fw);
				    	  PrintWriter pw = new PrintWriter(bw);
				    	  
				    	   pw.println("Comment : "+textArea.getText());
				    	   pw.println("Commented by : "+textField.getText());
				    	   pw.println("Commented on : "+new java.util.Date());
				    	   pw.println("");
				    	   //fw.close();
				    	   //bw.close();
				    	   pw.close();
				    	   dispose();
				    	   
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,"File not found", null,JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		btnSubmit.setBounds(10, 227, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnDispose = new JButton("EXIT");
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnDispose.setBounds(335, 230, 89, 23);
		contentPane.add(btnDispose);
	}
}
