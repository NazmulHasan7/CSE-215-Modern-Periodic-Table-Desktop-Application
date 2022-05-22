package Elements;

import java.awt.EventQueue;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Periodic Table");
		frame.setBounds(100, 100, 1029, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Background Image
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("G:\\NSU CSE\\3rd_Fall '19\\CSE 215 Project\\PeriodicTable\\periodic_1.jpg"));
		label.setBounds(0, 29, 1013, 583);
		frame.getContentPane().add(label);
		
		//Creating MenuBar
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1013, 28);
		frame.getContentPane().add(menuBar);
		
		JMenu mnPeriodicTable = new JMenu("Periodic Table");
		mnPeriodicTable.setForeground(new Color(0, 0, 0));
		mnPeriodicTable.setFont(new Font("Georgia", Font.BOLD, 14));
		mnPeriodicTable.setBackground(Color.CYAN);
		menuBar.add(mnPeriodicTable);
		
		//Periodic Table Frame (invoking) 
		JMenuItem mntmViewWithDetails = new JMenuItem("Modern Periodic Table with details");
		mntmViewWithDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Modern_Periodic_Table table = new Modern_Periodic_Table();
				table.setVisible(true);
				//frame.dispose();
			}
			
		});
		mntmViewWithDetails.setForeground(new Color(0, 0, 0));
		mntmViewWithDetails.setBackground(Color.CYAN);
		mntmViewWithDetails.setFont(new Font("Georgia", Font.BOLD, 13));
		mnPeriodicTable.add(mntmViewWithDetails);
		
		JSeparator separator = new JSeparator();
		mnPeriodicTable.add(separator);
		
		JMenuItem mntmHistoryOfModern = new JMenuItem("History of Modern Periodic Table");
		mntmHistoryOfModern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{
					File file = new File("periodictable.txt");
					if(file.exists()) {
						Scanner input = new Scanner (file);
					   ArrayList<String> list = new ArrayList<>();
					    input.useDelimiter(".");
					  
					    while(input.hasNext()) {   
					    	list.add(input.nextLine()+"\n");
					    	
					    }
					   input.close();
					    Text text = new Text(list.toString());
					    text.setVisible(true);
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "File not found.");
				}
			}
			
		});
		mntmHistoryOfModern.setForeground(Color.BLACK);
		mntmHistoryOfModern.setBackground(Color.CYAN);
		mntmHistoryOfModern.setFont(new Font("Georgia", Font.BOLD, 13));
		mnPeriodicTable.add(mntmHistoryOfModern);
		
		JSeparator separator_1 = new JSeparator();
		mnPeriodicTable.add(separator_1);
		
		JMenuItem mntmDetailsAboutModern = new JMenuItem("Details about Modern Periodic Table");
		mntmDetailsAboutModern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File file = new File("info.txt");
					if(file.exists()) {
						Scanner input = new Scanner (file);
					   ArrayList<String> list = new ArrayList<>();
					  //  input.useDelimiter(".");
					  
					    while(input.hasNext()) {   
					    	list.add(input.nextLine());
					    	
					    }
					   input.close();
					    Text text = new Text(list.toString());
					    text.setVisible(true);
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "File not found.");
				}
			}
		});
		mntmDetailsAboutModern.setBackground(Color.CYAN);
		mntmDetailsAboutModern.setForeground(Color.BLACK);
		mntmDetailsAboutModern.setFont(new Font("Georgia", Font.BOLD, 13));
		mnPeriodicTable.add(mntmDetailsAboutModern);
		
		JMenu mnSearchElements = new JMenu("Search Elements");
		mnSearchElements.setForeground(Color.BLACK);
		mnSearchElements.setFont(new Font("Georgia", Font.BOLD, 14));
		menuBar.add(mnSearchElements);
		
		// Searching Elements
		JMenuItem mntmSearchByAtomic = new JMenuItem("Search by Atomic Number");
		mntmSearchByAtomic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   try {
							String numberString = JOptionPane.showInputDialog(null,"Enter Atomic Number : ",null);
					      if(numberString != null) {
							int num = Integer.parseInt(numberString);
					        
					      if((num < 1 || num > 118))
					    	  throw new IllegalArgumentException("Wrong input"); 
					      
					        ArrayList<Element> list = new ArrayList<>();
							ArrayElements elements = new ArrayElements();
							list = elements.getList();
							
							for(int i = 0 ; i < list.size(); i++) {
								if(num == list.get(i).getAtomicNumber()) {
									Text text = new Text(list.get(i).toString());
									text.setVisible(true);
									break;
								}
							}
					      }
					      
				    }
				    catch(Exception ex) {
					      JOptionPane.showMessageDialog(null, "You did not enter a  valid atomic number.", "Failure", JOptionPane.ERROR_MESSAGE); 
				}
					
			}
		});
		mntmSearchByAtomic.setForeground(Color.BLACK);
		mntmSearchByAtomic.setFont(new Font("Georgia", Font.BOLD, 13));
		mntmSearchByAtomic.setBackground(Color.PINK);
		mnSearchElements.add(mntmSearchByAtomic);
		
		JSeparator separator_2 = new JSeparator();
		mnSearchElements.add(separator_2);
		
		JMenuItem mntmSearchByElement = new JMenuItem("Search by Element Name");
		mntmSearchByElement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      String name = JOptionPane.showInputDialog("Enter Element Name : ");
				     
				      if(name!= null) {
				      ArrayList<Element> list = new ArrayList<>();
						ArrayElements elements = new ArrayElements();
						list = elements.getList();
						int i;
						for( i = 0 ; i < list.size(); i++) {
							if(name.equalsIgnoreCase(list.get(i).getName())) {
								Text text = new Text(list.get(i).toString());
								text.setVisible(true);
								break;
							}
						}
						if(i >= list.size())
							throw new IllegalArgumentException("Wrong input");
				      }
			    }
			    catch(Exception ex) {
				      JOptionPane.showMessageDialog(null, "You did not enter a  valid correct element name.", "Failure", JOptionPane.ERROR_MESSAGE); 
			   }
			}
		});
		mntmSearchByElement.setBackground(Color.PINK);
		mntmSearchByElement.setForeground(Color.BLACK);
		mntmSearchByElement.setFont(new Font("Georgia", Font.BOLD, 13));
		mnSearchElements.add(mntmSearchByElement);
		
		JSeparator separator_3 = new JSeparator();
		mnSearchElements.add(separator_3);
		
		JMenuItem mntmSearchByElement_1 = new JMenuItem("Search by Element Symbol");
		mntmSearchByElement_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      String symbol = JOptionPane.showInputDialog("Enter Element Symbol : ");
				      
				      if(symbol != null) {
				       
				    	ArrayList<Element> list = new ArrayList<>();
						ArrayElements elements = new ArrayElements();
						list = elements.getList();
						int i;
						for( i = 0 ; i < list.size(); i++) {
							if(symbol.equalsIgnoreCase(list.get(i).getSymbol())) {
								Text text = new Text(list.get(i).toString());
								text.setVisible(true);
								break;
							}
						}
						if(i >= list.size())
							throw new IllegalArgumentException("Wrong input");
				      }
			    }
			    catch(Exception ex) {
				      JOptionPane.showMessageDialog(null, "You did not enter a  valid correct element symbol.", "Failure", JOptionPane.ERROR_MESSAGE); 
			   }
			}
		});
		mntmSearchByElement_1.setForeground(Color.BLACK);
		mntmSearchByElement_1.setFont(new Font("Georgia", Font.BOLD, 13));
		mntmSearchByElement_1.setBackground(Color.PINK);
		mnSearchElements.add(mntmSearchByElement_1);
		
		JMenu mnOnlineHelp = new JMenu("Online Help");
		mnOnlineHelp.setForeground(Color.BLACK);
		mnOnlineHelp.setFont(new Font("Georgia", Font.BOLD, 14));
		menuBar.add(mnOnlineHelp);
		
		JMenuItem mntmUsefulWebsites = new JMenuItem("Useful Websites");
		mntmUsefulWebsites.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Online online = new Online();
				online.setVisible(true);
			}
			
		});
		mntmUsefulWebsites.setFont(new Font("Georgia", Font.BOLD, 13));
		mntmUsefulWebsites.setBackground(Color.CYAN);
		mnOnlineHelp.add(mntmUsefulWebsites);
		
		JMenu mnQuickTest = new JMenu("Test Yourself");
		mnQuickTest.setForeground(Color.BLACK);
		mnQuickTest.setFont(new Font("Georgia", Font.BOLD, 14));
		menuBar.add(mnQuickTest);
		
		//TEST 
		JMenuItem mntmQuickTest = new JMenuItem("Quick Test     ");
		mntmQuickTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Quiz quiz = new Quiz();
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
		
			}
		});
		mntmQuickTest.setFont(new Font("Georgia", Font.BOLD, 13));
		mntmQuickTest.setBackground(Color.PINK);
		mnQuickTest.add(mntmQuickTest);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Georgia", Font.BOLD, 14));
		mnHelp.setForeground(Color.BLACK);
		menuBar.add(mnHelp);
		
		JMenuItem mntmComment = new JMenuItem("Comment");
		mntmComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comment comment = new Comment();
				comment.setVisible(true);
			}
		});
		mntmComment.setBackground(Color.CYAN);
		mntmComment.setFont(new Font("Georgia", Font.BOLD, 14));
		mntmComment.setForeground(Color.BLACK);
		mnHelp.add(mntmComment);
		
		JSeparator separator_4 = new JSeparator();
		mnHelp.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		mnHelp.add(separator_5);
		
		JMenuItem mntmAboutThisApplication = new JMenuItem("About this application");
		mntmAboutThisApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This application is developed for CSE215 project of North South University.\n"
						+ "This is submitted to the instructor of this course, Silvia Ahmed.\nThe application is developed by team ERROR.\n"
						+ "Members : \nNazmul Hasan [1911742]\nSamya Sunibir Das [1911563]\nThank you.");
			}
		});
		mntmAboutThisApplication.setBackground(Color.CYAN);
		mntmAboutThisApplication.setFont(new Font("Georgia", Font.BOLD, 14));
		mntmAboutThisApplication.setForeground(Color.BLACK);
		mnHelp.add(mntmAboutThisApplication);
		
		JSeparator separator_6 = new JSeparator();
		mnHelp.add(separator_6);
		
		JMenu mnNewMenu = new JMenu("Rate us");
		mnNewMenu.setBackground(Color.CYAN);
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Georgia", Font.BOLD, 14));
		mnHelp.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("See current rating");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					File file = new File("rating.txt");
					Scanner input = new Scanner(file);
					int count = 0;
					double rate = 0;
					
					while(input.hasNextDouble()) {
						rate+= input.nextDouble();
						count++;
					}
					JOptionPane.showMessageDialog(null,"Average rating: " +(rate/count) +" out of 10");
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"File not found", null,JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		mntmNewMenuItem.setBackground(Color.CYAN);
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu.add(separator_7);
		
		JMenuItem mntmRate = new JMenuItem("Rate ");
		mntmRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter buff;
				try {
					double point = 0;
					String value = JOptionPane.showInputDialog("Rate it on a scale of 10 : ");

					 if(value != null) {
						point = Double.parseDouble(value);
						
				      if((point < 0 || point > 10))
				    	  throw new IllegalArgumentException("Wrong input"); 
				      }
					 File rating = new File("rating.txt");
					 if(!rating.exists())
						 rating.createNewFile();
					
					 //Here true is to append the content to file
					buff = new BufferedWriter(new FileWriter(rating, true));
					buff.write("\n"+value+" ");
					buff.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "You did not enter a  valid input.", "Failure", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		mntmRate.setBackground(Color.CYAN);
		mntmRate.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmRate);
		
		JMenuItem mntmHistoryOfPeriodic = new JMenuItem();
		mntmHistoryOfPeriodic.setBounds(0, 55, 129, 22);
		frame.getContentPane().add(mntmHistoryOfPeriodic);
	}
}