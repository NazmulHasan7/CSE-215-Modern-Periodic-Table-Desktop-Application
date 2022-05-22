package Elements;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Text extends JFrame {

	private String info;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text frame = new Text();
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
	public Text() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Print button
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File file = new File ("C:\\Users\\USER\\Desktop\\Information.txt");
					if(!file.exists()) {
						file.createNewFile();
					}
					PrintWriter output = new PrintWriter(file);
					output.print(info);
					JOptionPane.showMessageDialog(null, "Printed. Please check the file named 'Information.txt' in desktop window");
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "file can not be created");
				}
			}
		});
		btnPrint.setBounds(10, 407, 89, 23);
		contentPane.add(btnPrint);
	
		//Back button	
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(535, 407, 89, 23);
		contentPane.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 634, 396);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Georgia", Font.PLAIN, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(true);
		
	}
	public Text(String info) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(10, 407, 89, 23);
		contentPane.add(btnPrint);
		btnPrint.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File file = new File ("Information.txt");
					if(!file.exists()) {
						file.createNewFile();
					}
					//Splitting string in lines using 
					String [] lines = info.split(",");
					PrintWriter output = new PrintWriter(file);
					for(int i = 0 ; i < lines.length; i++) {
						output.println(lines[i]);
					}
					JOptionPane.showMessageDialog(null, "Printed. Please check the file named 'Information.txt' in sorce folder.");
					
					output.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "file can not be created");
				}
			}
		});
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(535, 407, 89, 23);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 634, 396);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Georgia", Font.PLAIN, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setText(info);	

	}

}
