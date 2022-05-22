package Elements;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Online extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Online frame = new Online();
					frame.setTitle("Online Sites");
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
	public Online() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(585, 427, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblSomeWebsitesWith = new JLabel("Some websites with interactive periodic table");
		lblSomeWebsitesWith.setFont(new Font("Georgia", Font.BOLD, 14));
		lblSomeWebsitesWith.setToolTipText("");
		lblSomeWebsitesWith.setBounds(10, 11, 540, 14);
		contentPane.add(lblSomeWebsitesWith);
		
		JLabel lblDynamicPeriodicTable = new JLabel("Dynamic Periodic Table");
		lblDynamicPeriodicTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.ptable.com/");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
				
			}
		});
		lblDynamicPeriodicTable.setForeground(Color.BLUE);
		lblDynamicPeriodicTable.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDynamicPeriodicTable.setBounds(10, 36, 198, 23);
		contentPane.add(lblDynamicPeriodicTable);
		
		JLabel lblChemicool = new JLabel("Chemicool");
		lblChemicool.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.chemicool.com/");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblChemicool.setForeground(Color.BLUE);
		lblChemicool.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChemicool.setBounds(10, 66, 198, 23);
		contentPane.add(lblChemicool);
		
		JLabel lblWebElements = new JLabel("Web Elements");
		lblWebElements.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.webelements.com/");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblWebElements.setForeground(Color.BLUE);
		lblWebElements.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWebElements.setBounds(10, 95, 198, 23);
		contentPane.add(lblWebElements);
		
		JLabel lblPeriodicTableFor = new JLabel("Periodic Table for kids");
		lblPeriodicTableFor.setToolTipText("");
		lblPeriodicTableFor.setFont(new Font("Georgia", Font.BOLD, 14));
		lblPeriodicTableFor.setBounds(10, 124, 540, 14);
		contentPane.add(lblPeriodicTableFor);
		
		JLabel lblDucksters = new JLabel("Ducksters");
		lblDucksters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.ducksters.com/science/periodic_table.php");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblDucksters.setForeground(Color.BLUE);
		lblDucksters.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDucksters.setBounds(10, 144, 198, 23);
		contentPane.add(lblDucksters);
		
		JLabel lblPeriodicTableOn = new JLabel("Periodic Table");
		lblPeriodicTableOn.setToolTipText("");
		lblPeriodicTableOn.setFont(new Font("Georgia", Font.BOLD, 14));
		lblPeriodicTableOn.setBounds(10, 178, 111, 14);
		contentPane.add(lblPeriodicTableOn);
		
		JLabel lblWikipedia = new JLabel("Wikipedia");
		lblWikipedia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://en.wikipedia.org/wiki/Periodic_table");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblWikipedia.setForeground(Color.BLUE);
		lblWikipedia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWikipedia.setBounds(129, 174, 198, 23);
		contentPane.add(lblWikipedia);
		
		JLabel lblPeriodicTableTest = new JLabel("Periodic Table Test and Quiz");
		lblPeriodicTableTest.setToolTipText("");
		lblPeriodicTableTest.setFont(new Font("Georgia", Font.BOLD, 14));
		lblPeriodicTableTest.setBounds(10, 219, 224, 14);
		contentPane.add(lblPeriodicTableTest);
		
		JLabel lblThatquizorg = new JLabel("ThatQuiz.org");
		lblThatquizorg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.thatquiz.org/tq-m/science/periodic-table/");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblThatquizorg.setForeground(Color.BLUE);
		lblThatquizorg.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThatquizorg.setBounds(10, 244, 198, 23);
		contentPane.add(lblThatquizorg);
		
		JLabel lblMultipleChoice = new JLabel("100+ Multiple choice questions");
		lblMultipleChoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://www.proprofs.com/quiz-school/topic/periodic-table");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblMultipleChoice.setForeground(Color.BLUE);
		lblMultipleChoice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMultipleChoice.setBounds(10, 278, 224, 23);
		contentPane.add(lblMultipleChoice);
		
		JLabel lblTheIupacPeriodic = new JLabel("The IUPAC Periodic Table");
		lblTheIupacPeriodic.setToolTipText("");
		lblTheIupacPeriodic.setFont(new Font("Georgia", Font.BOLD, 14));
		lblTheIupacPeriodic.setBounds(10, 320, 224, 14);
		contentPane.add(lblTheIupacPeriodic);
		
		JLabel lblIupacPeriodicTable = new JLabel("IUPAC periodic table");
		lblIupacPeriodicTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				URI uri ;
				
				try {
					uri = new URI("https://iupac.org/what-we-do/periodic-table-of-elements/");
					browser.browse(uri);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Sorry can not open browser.");
				}
			}
		});
		lblIupacPeriodicTable.setForeground(Color.BLUE);
		lblIupacPeriodicTable.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIupacPeriodicTable.setBounds(10, 345, 224, 23);
		contentPane.add(lblIupacPeriodicTable);
	}
}
