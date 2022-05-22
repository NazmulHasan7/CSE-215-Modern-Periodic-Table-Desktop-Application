package Elements;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Modern_Periodic_Table extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modern_Periodic_Table frame = new Modern_Periodic_Table();
					frame.setTitle("MODERN PERIODIC TABLE");
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
	public Modern_Periodic_Table() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1344, 710);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 255, 0));
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("mandiliv.jpeg"));
		label.setBounds(257, 11, 60, 60);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("MODERN PERIODIC TABLE WITH DETAILS");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 22));
		lblNewLabel.setBounds(369, 14, 585, 57);
		contentPane.add(lblNewLabel);
		
		//SODIUM
		JButton btnK = new JButton("Na");
		btnK.setForeground(Color.MAGENTA);
		btnK.setBackground(UIManager.getColor("Button.background"));
		btnK.setFont(new Font("Georgia", Font.BOLD, 17));
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(10).toString());
				text.setVisible(true);
			}
		});
		btnK.setBounds(10, 213, 70, 37);
		contentPane.add(btnK);
		
		//LITHIUM
		JButton btnLi = new JButton("Li");
		btnLi.setForeground(Color.MAGENTA);
		btnLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(2).toString());
				text.setVisible(true);
			}
		});
		btnLi.setBackground(UIManager.getColor("Button.background"));
		btnLi.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLi.setBounds(10, 161, 70, 37);
		contentPane.add(btnLi);
		
		//POTASSIUM
		JButton button_1 = new JButton("K");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(18).toString());
				text.setVisible(true);
			}
		});
		button_1.setForeground(Color.MAGENTA);
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_1.setFont(new Font("Georgia", Font.BOLD, 17));
		button_1.setBounds(10, 265, 70, 37);
		contentPane.add(button_1);
		
		//RUBIDIUM
		JButton btnRb = new JButton("Rb");
		btnRb.setForeground(Color.MAGENTA);
		btnRb.setBackground(UIManager.getColor("Button.background"));
		btnRb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(36).toString());
				text.setVisible(true);
			}
		});
		btnRb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnRb.setBounds(10, 319, 70, 37);
		contentPane.add(btnRb);
		
		JButton btnFr = new JButton("Fr");
		btnFr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(86).toString());
				text.setVisible(true);
			}
		});
		btnFr.setForeground(Color.MAGENTA);
		btnFr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnFr.setBounds(10, 425, 70, 37);
		contentPane.add(btnFr);
		
		JButton btnCs = new JButton("Cs");
		btnCs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(54).toString());
				text.setVisible(true);
			}
		});
		btnCs.setForeground(Color.MAGENTA);
		btnCs.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCs.setBounds(10, 372, 70, 37);
		contentPane.add(btnCs);
		
		//HYDROGEN
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(0).toString());
				text.setVisible(true);
			}
		});
		btnH.setForeground(Color.BLUE);
		btnH.setBackground(UIManager.getColor("Button.background"));
		btnH.setFont(new Font("Georgia", Font.BOLD, 17));
		btnH.setBounds(10, 107, 70, 37);
		contentPane.add(btnH);
		
		JLabel lblHydrozen = new JLabel("Hydrogen");
		lblHydrozen.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblHydrozen.setBounds(10, 145, 80, 14);
		contentPane.add(lblHydrozen);
		
		JLabel lblLithium = new JLabel("Lithium");
		lblLithium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLithium.setBounds(10, 197, 70, 14);
		contentPane.add(lblLithium);
		
		JLabel lblSodium = new JLabel("Sodium");
		lblSodium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSodium.setBounds(10, 250, 70, 14);
		contentPane.add(lblSodium);
		
		JLabel lblPotassium = new JLabel("Potassium");
		lblPotassium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPotassium.setBounds(10, 302, 70, 14);
		contentPane.add(lblPotassium);
		
		JLabel lblRubidium = new JLabel("Rubidium");
		lblRubidium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRubidium.setBounds(10, 356, 70, 14);
		contentPane.add(lblRubidium);
		
		JLabel lblCesium = new JLabel("Cesium");
		lblCesium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCesium.setBounds(10, 408, 70, 14);
		contentPane.add(lblCesium);
		
		JLabel lblDarmstadtium = new JLabel("Francium");
		lblDarmstadtium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblDarmstadtium.setBounds(10, 462, 86, 14);
		contentPane.add(lblDarmstadtium);
		
		JButton btnCa_1 = new JButton("Ca");
		btnCa_1.setForeground(new Color(128, 0, 128));
		btnCa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(19).toString());
				text.setVisible(true);
			}
		});
		btnCa_1.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCa_1.setBackground(UIManager.getColor("Button.background"));
		btnCa_1.setBounds(83, 265, 70, 37);
		contentPane.add(btnCa_1);
		
		JButton btnSc = new JButton("Sc");
		btnSc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(20).toString());
				text.setVisible(true);
			}
		});
		btnSc.setForeground(new Color(0, 191, 255));
		btnSc.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSc.setBackground(UIManager.getColor("Button.background"));
		btnSc.setBounds(156, 265, 70, 37);
		contentPane.add(btnSc);
		
		JButton btnTi = new JButton("Ti");
		btnTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(21).toString());
				text.setVisible(true);
			}
			
		});
		btnTi.setForeground(new Color(0, 206, 209));
		btnTi.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTi.setBackground(UIManager.getColor("Button.background"));
		btnTi.setBounds(229, 265, 70, 37);
		contentPane.add(btnTi);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(22).toString());
				text.setVisible(true);
			}
		});
		btnV.setForeground(new Color(0, 204, 204));
		btnV.setFont(new Font("Georgia", Font.BOLD, 17));
		btnV.setBackground(UIManager.getColor("Button.background"));
		btnV.setBounds(301, 265, 70, 37);
		contentPane.add(btnV);
		
		JButton btnCr = new JButton("Cr");
		btnCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(23).toString());
				text.setVisible(true);
			}
		});
		btnCr.setForeground(new Color(72, 209, 204));
		btnCr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr.setBackground(UIManager.getColor("Button.background"));
		btnCr.setBounds(374, 265, 70, 37);
		contentPane.add(btnCr);
		
		JButton btnCr_17 = new JButton("Mn");
		btnCr_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(25).toString());
				text.setVisible(true);
			}
		});
		btnCr_17.setForeground(new Color(72, 209, 204));
		btnCr_17.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_17.setBackground(UIManager.getColor("Button.background"));
		btnCr_17.setBounds(446, 265, 70, 37);
		contentPane.add(btnCr_17);
		
		JButton btnCr_16 = new JButton("Fe");
		btnCr_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(25).toString());
				text.setVisible(true);
			}
		});
		btnCr_16.setForeground(new Color(72, 209, 204));
		btnCr_16.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_16.setBackground(UIManager.getColor("Button.background"));
		btnCr_16.setBounds(519, 265, 70, 37);
		contentPane.add(btnCr_16);
		
		JButton btnCr_15 = new JButton("Co");
		btnCr_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(26).toString());
				text.setVisible(true);
			}
		});
		btnCr_15.setForeground(new Color(72, 209, 204));
		btnCr_15.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_15.setBackground(UIManager.getColor("Button.background"));
		btnCr_15.setBounds(592, 265, 70, 37);
		contentPane.add(btnCr_15);
		
		JButton btnCr_12 = new JButton("Ni");
		btnCr_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(27).toString());
				text.setVisible(true);
			}
		});
		btnCr_12.setForeground(new Color(72, 209, 204));
		btnCr_12.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_12.setBackground(UIManager.getColor("Button.background"));
		btnCr_12.setBounds(665, 265, 70, 37);
		contentPane.add(btnCr_12);
		
		JButton btnCr_11 = new JButton("Cu");
		btnCr_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(28).toString());
				text.setVisible(true);
			}
		});
		btnCr_11.setForeground(new Color(72, 209, 204));
		btnCr_11.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_11.setBackground(UIManager.getColor("Button.background"));
		btnCr_11.setBounds(739, 265, 70, 37);
		contentPane.add(btnCr_11);
		
		JButton btnCr_4 = new JButton("Zn");
		btnCr_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(29).toString());
				text.setVisible(true);
			}
		});
		btnCr_4.setForeground(new Color(72, 209, 204));
		btnCr_4.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_4.setBackground(UIManager.getColor("Button.background"));
		btnCr_4.setBounds(812, 265, 70, 37);
		contentPane.add(btnCr_4);
		
		JButton btnGa = new JButton("Ga");
		btnGa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(30).toString());
				text.setVisible(true);
			}
		});
		btnGa.setForeground(new Color(255, 69, 0));
		btnGa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnGa.setBackground(UIManager.getColor("Button.background"));
		btnGa.setBounds(884, 265, 70, 37);
		contentPane.add(btnGa);
		
		JButton btnGe = new JButton("Ge");
		btnGe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(31).toString());
				text.setVisible(true);
			}
		});
		btnGe.setForeground(new Color(51, 204, 0));
		btnGe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnGe.setBackground(UIManager.getColor("Button.background"));
		btnGe.setBounds(957, 265, 70, 37);
		contentPane.add(btnGe);
		
		JButton btnAs = new JButton("As");
		btnAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(32).toString());
				text.setVisible(true);
			}
		});
		btnAs.setForeground(new Color(51, 204, 0));
		btnAs.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAs.setBackground(UIManager.getColor("Button.background"));
		btnAs.setBounds(1030, 265, 70, 37);
		contentPane.add(btnAs);
		
		JButton btnSe = new JButton("Se");
		btnSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(33).toString());
				text.setVisible(true);
			}
		});
		btnSe.setForeground(new Color(51, 0, 204));
		btnSe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSe.setBackground(UIManager.getColor("Button.background"));
		btnSe.setBounds(1103, 265, 70, 37);
		contentPane.add(btnSe);
		
		JButton btnBr = new JButton("Br");
		btnBr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(34).toString());
				text.setVisible(true);
			}
		});
		btnBr.setForeground(new Color(255, 204, 51));
		btnBr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnBr.setBackground(UIManager.getColor("Button.background"));
		btnBr.setBounds(1176, 265, 70, 37);
		contentPane.add(btnBr);
		
		JButton btnKr = new JButton("Kr");
		btnKr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(35).toString());
				text.setVisible(true);
			}
		});
		btnKr.setForeground(new Color(255, 255, 0));
		btnKr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnKr.setBackground(UIManager.getColor("Button.background"));
		btnKr.setBounds(1249, 265, 70, 37);
		contentPane.add(btnKr);
		
		JButton btnSr = new JButton("Sr");
		btnSr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(37).toString());
				text.setVisible(true);
			}
			
		});
		btnSr.setForeground(new Color(128, 0, 128));
		btnSr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSr.setBackground(UIManager.getColor("Button.background"));
		btnSr.setBounds(83, 319, 70, 37);
		contentPane.add(btnSr);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(38).toString());
				text.setVisible(true);
			}
		});
		btnY.setForeground(new Color(0, 191, 255));
		btnY.setFont(new Font("Georgia", Font.BOLD, 17));
		btnY.setBackground(UIManager.getColor("Button.background"));
		btnY.setBounds(156, 319, 70, 37);
		contentPane.add(btnY);
		
		JButton btnZr = new JButton("Zr");
		btnZr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(39).toString());
				text.setVisible(true);
			}
		});
		btnZr.setForeground(new Color(0, 206, 209));
		btnZr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnZr.setBackground(UIManager.getColor("Button.background"));
		btnZr.setBounds(228, 319, 70, 37);
		contentPane.add(btnZr);
		
		JButton btnNb = new JButton("Nb");
		btnNb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(40).toString());
				text.setVisible(true);
			}
		});
		btnNb.setForeground(new Color(0, 204, 204));
		btnNb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNb.setBackground(UIManager.getColor("Button.background"));
		btnNb.setBounds(301, 319, 70, 37);
		contentPane.add(btnNb);
		
		JButton btnCr_1 = new JButton("Mo");
		btnCr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(41).toString());
				text.setVisible(true);
			}
		});
		btnCr_1.setForeground(new Color(72, 209, 204));
		btnCr_1.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_1.setBackground(UIManager.getColor("Button.background"));
		btnCr_1.setBounds(373, 319, 70, 37);
		contentPane.add(btnCr_1);
		
		JButton btnCr_18 = new JButton("Tc");
		btnCr_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(42).toString());
				text.setVisible(true);
			}
		});
		btnCr_18.setForeground(new Color(72, 209, 204));
		btnCr_18.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_18.setBackground(UIManager.getColor("Button.background"));
		btnCr_18.setBounds(446, 319, 70, 37);
		contentPane.add(btnCr_18);
		
		JButton btnCr_19 = new JButton("Ru");
		btnCr_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(43).toString());
				text.setVisible(true);
			}
		});
		btnCr_19.setForeground(new Color(72, 209, 204));
		btnCr_19.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_19.setBackground(UIManager.getColor("Button.background"));
		btnCr_19.setBounds(519, 319, 70, 37);
		contentPane.add(btnCr_19);
		
		JButton btnCr_14 = new JButton("Rh");
		btnCr_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(44).toString());
				text.setVisible(true);
			}
		});
		btnCr_14.setForeground(new Color(72, 209, 204));
		btnCr_14.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_14.setBackground(UIManager.getColor("Button.background"));
		btnCr_14.setBounds(592, 319, 70, 37);
		contentPane.add(btnCr_14);
		
		JButton btnCr_13 = new JButton("Pd");
		btnCr_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(45).toString());
				text.setVisible(true);
			}
		});
		btnCr_13.setForeground(new Color(72, 209, 204));
		btnCr_13.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_13.setBackground(UIManager.getColor("Button.background"));
		btnCr_13.setBounds(665, 319, 70, 37);
		contentPane.add(btnCr_13);
		
		JButton btnCr_10 = new JButton("Ag");
		btnCr_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(46).toString());
				text.setVisible(true);
			}
		});
		btnCr_10.setForeground(new Color(72, 209, 204));
		btnCr_10.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_10.setBackground(UIManager.getColor("Button.background"));
		btnCr_10.setBounds(738, 319, 70, 37);
		contentPane.add(btnCr_10);
		
		JButton btnCr_5 = new JButton("Cd");
		btnCr_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(47).toString());
				text.setVisible(true);
			}
		});
		btnCr_5.setForeground(new Color(72, 209, 204));
		btnCr_5.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_5.setBackground(UIManager.getColor("Button.background"));
		btnCr_5.setBounds(812, 319, 70, 37);
		contentPane.add(btnCr_5);
		
		JButton btnIn = new JButton("In");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(48).toString());
				text.setVisible(true);
			}
		});
		btnIn.setForeground(new Color(255, 69, 0));
		btnIn.setFont(new Font("Georgia", Font.BOLD, 17));
		btnIn.setBackground(UIManager.getColor("Button.background"));
		btnIn.setBounds(885, 319, 70, 37);
		contentPane.add(btnIn);
		
		JButton btnSn = new JButton("Sn");
		btnSn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(49).toString());
				text.setVisible(true);
			}
		});
		btnSn.setForeground(new Color(255, 69, 0));
		btnSn.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSn.setBackground(UIManager.getColor("Button.background"));
		btnSn.setBounds(957, 319, 70, 37);
		contentPane.add(btnSn);
		
		JButton btnSb = new JButton("Sb");
		btnSb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(50).toString());
				text.setVisible(true);
			}
		});
		btnSb.setForeground(new Color(51, 204, 0));
		btnSb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSb.setBackground(UIManager.getColor("Button.background"));
		btnSb.setBounds(1030, 319, 70, 37);
		contentPane.add(btnSb);
		
		JButton btnTe = new JButton("Te");
		btnTe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(51).toString());
				text.setVisible(true);
			}
		});
		btnTe.setForeground(new Color(51, 204, 0));
		btnTe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTe.setBackground(UIManager.getColor("Button.background"));
		btnTe.setBounds(1103, 319, 70, 37);
		contentPane.add(btnTe);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(52).toString());
				text.setVisible(true);
			}
		});
		btnI.setForeground(new Color(255, 204, 51));
		btnI.setFont(new Font("Georgia", Font.BOLD, 17));
		btnI.setBackground(UIManager.getColor("Button.background"));
		btnI.setBounds(1176, 319, 70, 37);
		contentPane.add(btnI);
		
		JButton btnBa = new JButton("Ba");
		btnBa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(55).toString());
				text.setVisible(true);
			}
		});
		btnBa.setForeground(new Color(128, 0, 128));
		btnBa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnBa.setBackground(UIManager.getColor("Button.background"));
		btnBa.setBounds(83, 372, 70, 37);
		contentPane.add(btnBa);
		
		JButton button_35 = new JButton("57-71");
		button_35.setFont(new Font("Georgia", Font.BOLD, 13));
		button_35.setBackground(new Color(51, 255, 0));
		button_35.setBounds(156, 372, 70, 37);
		contentPane.add(button_35);
		
		JButton btnHf = new JButton("Hf");
		btnHf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(71).toString());
				text.setVisible(true);
			}
		});
		btnHf.setForeground(new Color(0, 206, 209));
		btnHf.setFont(new Font("Georgia", Font.BOLD, 17));
		btnHf.setBackground(UIManager.getColor("Button.background"));
		btnHf.setBounds(228, 372, 70, 37);
		contentPane.add(btnHf);
		
		JButton btnTa = new JButton("Ta");
		btnTa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(72).toString());
				text.setVisible(true);
			}
		});
		btnTa.setForeground(new Color(0, 204, 204));
		btnTa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTa.setBackground(UIManager.getColor("Button.background"));
		btnTa.setBounds(301, 372, 70, 37);
		contentPane.add(btnTa);
		
		JButton btnCr_2 = new JButton("W");
		btnCr_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(73).toString());
				text.setVisible(true);
			}
		});
		btnCr_2.setForeground(new Color(72, 209, 204));
		btnCr_2.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_2.setBackground(UIManager.getColor("Button.background"));
		btnCr_2.setBounds(373, 372, 70, 37);
		contentPane.add(btnCr_2);
		
		JButton btnCr_20 = new JButton("Re");
		btnCr_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(74).toString());
				text.setVisible(true);
			}
		});
		btnCr_20.setForeground(new Color(72, 209, 204));
		btnCr_20.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_20.setBackground(UIManager.getColor("Button.background"));
		btnCr_20.setBounds(446, 372, 70, 37);
		contentPane.add(btnCr_20);
		
		JButton btnCr_21 = new JButton("Os");
		btnCr_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(75).toString());
				text.setVisible(true);
			}
		});
		btnCr_21.setForeground(new Color(72, 209, 204));
		btnCr_21.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_21.setBackground(UIManager.getColor("Button.background"));
		btnCr_21.setBounds(519, 372, 70, 37);
		contentPane.add(btnCr_21);
		
		JButton btnCr_25 = new JButton("Ir");
		btnCr_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(76).toString());
				text.setVisible(true);
			}
			
		});
		btnCr_25.setForeground(new Color(72, 209, 204));
		btnCr_25.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_25.setBackground(UIManager.getColor("Button.background"));
		btnCr_25.setBounds(592, 372, 70, 37);
		contentPane.add(btnCr_25);
		
		JButton btnCr_26 = new JButton("Pt");
		btnCr_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(77).toString());
				text.setVisible(true);
			}
		});
		btnCr_26.setForeground(new Color(72, 209, 204));
		btnCr_26.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_26.setBackground(UIManager.getColor("Button.background"));
		btnCr_26.setBounds(665, 372, 70, 37);
		contentPane.add(btnCr_26);
		
		JButton btnCr_9 = new JButton("Au");
		btnCr_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(78).toString());
				text.setVisible(true);
			}
		});
		btnCr_9.setForeground(new Color(72, 209, 204));
		btnCr_9.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_9.setBackground(UIManager.getColor("Button.background"));
		btnCr_9.setBounds(738, 372, 70, 37);
		contentPane.add(btnCr_9);
		
		JButton btnCr_6 = new JButton("Hg");
		btnCr_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(79).toString());
				text.setVisible(true);
			}
		});
		btnCr_6.setForeground(new Color(72, 209, 204));
		btnCr_6.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_6.setBackground(UIManager.getColor("Button.background"));
		btnCr_6.setBounds(811, 372, 70, 37);
		contentPane.add(btnCr_6);
		
		JButton btnTi_1 = new JButton("Ti");
		btnTi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(80).toString());
				text.setVisible(true);
			}
		});
		btnTi_1.setForeground(new Color(255, 69, 0));
		btnTi_1.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTi_1.setBackground(UIManager.getColor("Button.background"));
		btnTi_1.setBounds(884, 372, 70, 37);
		contentPane.add(btnTi_1);
		
		JButton btnRa = new JButton("Ra");
		btnRa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(87).toString());
				text.setVisible(true);
			}
		});
		btnRa.setForeground(new Color(128, 0, 128));
		btnRa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnRa.setBackground(UIManager.getColor("Button.background"));
		btnRa.setBounds(83, 425, 70, 37);
		contentPane.add(btnRa);
		
		JButton button_47 = new JButton("89-103");
		button_47.setFont(new Font("Georgia", Font.BOLD, 13));
		button_47.setBackground(new Color(255, 0, 0));
		button_47.setBounds(156, 425, 70, 37);
		contentPane.add(button_47);
		
		JButton btnRf = new JButton("Rf");
		btnRf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(103).toString());
				text.setVisible(true);
			}
		});
		btnRf.setForeground(new Color(0, 206, 209));
		btnRf.setFont(new Font("Georgia", Font.BOLD, 17));
		btnRf.setBackground(UIManager.getColor("Button.background"));
		btnRf.setBounds(228, 425, 70, 37);
		contentPane.add(btnRf);
		
		JButton btnDb = new JButton("Db");
		btnDb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(104).toString());
				text.setVisible(true);
			}
		});
		btnDb.setForeground(new Color(0, 204, 204));
		btnDb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnDb.setBackground(UIManager.getColor("Button.background"));
		btnDb.setBounds(301, 425, 70, 37);
		contentPane.add(btnDb);
		
		JButton btnCr_3 = new JButton("Sg");
		btnCr_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(105).toString());
				text.setVisible(true);
			}
		});
		btnCr_3.setForeground(new Color(72, 209, 204));
		btnCr_3.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_3.setBackground(UIManager.getColor("Button.background"));
		btnCr_3.setBounds(374, 425, 70, 37);
		contentPane.add(btnCr_3);
		
		JButton btnCr_22 = new JButton("Bh");
		btnCr_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(106).toString());
				text.setVisible(true);
			}
		});
		btnCr_22.setForeground(new Color(72, 209, 204));
		btnCr_22.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_22.setBackground(UIManager.getColor("Button.background"));
		btnCr_22.setBounds(447, 425, 70, 37);
		contentPane.add(btnCr_22);
		
		JButton btnCr_23 = new JButton("Hs");
		btnCr_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(107).toString());
				text.setVisible(true);
			}
		});
		btnCr_23.setForeground(new Color(72, 209, 204));
		btnCr_23.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_23.setBackground(UIManager.getColor("Button.background"));
		btnCr_23.setBounds(519, 425, 70, 37);
		contentPane.add(btnCr_23);
		
		JButton btnCr_24 = new JButton("Mt");
		btnCr_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(108).toString());
				text.setVisible(true);
			}
		});
		btnCr_24.setForeground(new Color(72, 209, 204));
		btnCr_24.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_24.setBackground(UIManager.getColor("Button.background"));
		btnCr_24.setBounds(592, 425, 70, 37);
		contentPane.add(btnCr_24);
		
		JButton btnCr_27 = new JButton("Ds");
		btnCr_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(109).toString());
				text.setVisible(true);
			}
		});
		btnCr_27.setForeground(new Color(72, 209, 204));
		btnCr_27.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_27.setBackground(UIManager.getColor("Button.background"));
		btnCr_27.setBounds(666, 425, 70, 37);
		contentPane.add(btnCr_27);
		
		JButton btnCr_8 = new JButton("Rg");
		btnCr_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(110).toString());
				text.setVisible(true);
			}
		});
		btnCr_8.setForeground(new Color(72, 209, 204));
		btnCr_8.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_8.setBackground(UIManager.getColor("Button.background"));
		btnCr_8.setBounds(739, 425, 70, 37);
		contentPane.add(btnCr_8);
		
		JButton btnCr_7 = new JButton("Cn");
		btnCr_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(111).toString());
				text.setVisible(true);
			}
		});
		btnCr_7.setForeground(new Color(72, 209, 204));
		btnCr_7.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCr_7.setBackground(UIManager.getColor("Button.background"));
		btnCr_7.setBounds(811, 425, 70, 37);
		contentPane.add(btnCr_7);
		
		JButton btnNh = new JButton("Nh");
		btnNh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(112).toString());
				text.setVisible(true);
			}
		});
		btnNh.setForeground(new Color(255, 69, 0));
		btnNh.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNh.setBackground(UIManager.getColor("Button.background"));
		btnNh.setBounds(884, 425, 70, 37);
		contentPane.add(btnNh);
		
		JButton btnFl = new JButton("Fl");
		btnFl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(113).toString());
				text.setVisible(true);
			}
		});
		btnFl.setForeground(new Color(255, 69, 0));
		btnFl.setFont(new Font("Georgia", Font.BOLD, 17));
		btnFl.setBackground(UIManager.getColor("Button.background"));
		btnFl.setBounds(957, 425, 70, 37);
		contentPane.add(btnFl);
		
		JButton btnMc = new JButton("Mc");
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(114).toString());
				text.setVisible(true);
			}
		});
		btnMc.setForeground(new Color(255, 69, 0));
		btnMc.setFont(new Font("Georgia", Font.BOLD, 17));
		btnMc.setBackground(UIManager.getColor("Button.background"));
		btnMc.setBounds(1030, 425, 70, 37);
		contentPane.add(btnMc);
		
		JButton btnLv = new JButton("Lv");
		btnLv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(115).toString());
				text.setVisible(true);
			}
		});
		btnLv.setForeground(new Color(255, 69, 0));
		btnLv.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLv.setBackground(UIManager.getColor("Button.background"));
		btnLv.setBounds(1103, 425, 70, 37);
		contentPane.add(btnLv);
		
		JButton btnTs = new JButton("Ts");
		btnTs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(116).toString());
				text.setVisible(true);
			}
		});
		btnTs.setForeground(new Color(255, 204, 51));
		btnTs.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTs.setBackground(UIManager.getColor("Button.background"));
		btnTs.setBounds(1176, 425, 70, 37);
		contentPane.add(btnTs);
		
		JButton btnPb = new JButton("Pb");
		btnPb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(81).toString());
				text.setVisible(true);
			}
		});
		btnPb.setForeground(new Color(255, 69, 0));
		btnPb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnPb.setBackground(UIManager.getColor("Button.background"));
		btnPb.setBounds(957, 372, 70, 37);
		contentPane.add(btnPb);
		
		JButton btnBi = new JButton("Bi");
		btnBi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(82).toString());
				text.setVisible(true);
			}
		});
		btnBi.setForeground(new Color(255, 69, 0));
		btnBi.setFont(new Font("Georgia", Font.BOLD, 17));
		btnBi.setBackground(UIManager.getColor("Button.background"));
		btnBi.setBounds(1030, 372, 70, 37);
		contentPane.add(btnBi);
		
		JButton btnPo = new JButton("Po");
		btnPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(83).toString());
				text.setVisible(true);
			}
		});
		btnPo.setForeground(new Color(51, 204, 0));
		btnPo.setFont(new Font("Georgia", Font.BOLD, 17));
		btnPo.setBackground(UIManager.getColor("Button.background"));
		btnPo.setBounds(1103, 372, 70, 37);
		contentPane.add(btnPo);
		
		JButton btnAt = new JButton("At");
		btnAt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(84).toString());
				text.setVisible(true);
			}
		});
		btnAt.setForeground(new Color(255, 204, 51));
		btnAt.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAt.setBackground(UIManager.getColor("Button.background"));
		btnAt.setBounds(1176, 372, 70, 37);
		contentPane.add(btnAt);
		
		JButton btnXe = new JButton("Xe");
		btnXe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(53).toString());
				text.setVisible(true);
			}
		});
		btnXe.setForeground(new Color(255, 255, 0));
		btnXe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnXe.setBackground(UIManager.getColor("Button.background"));
		btnXe.setBounds(1249, 319, 70, 37);
		contentPane.add(btnXe);
		
		JButton btnRn = new JButton("Rn");
		btnRn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(85).toString());
				text.setVisible(true);
			}
		});
		btnRn.setForeground(new Color(255, 255, 0));
		btnRn.setFont(new Font("Georgia", Font.BOLD, 17));
		btnRn.setBackground(UIManager.getColor("Button.background"));
		btnRn.setBounds(1249, 372, 70, 37);
		contentPane.add(btnRn);
		
		JButton btnOg = new JButton("Og");
		btnOg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(117).toString());
				text.setVisible(true);
			}
		});
		btnOg.setForeground(new Color(255, 255, 0));
		btnOg.setFont(new Font("Georgia", Font.BOLD, 17));
		btnOg.setBackground(UIManager.getColor("Button.background"));
		btnOg.setBounds(1249, 425, 70, 37);
		contentPane.add(btnOg);
		
		JButton btnMg = new JButton("Mg");
		btnMg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(11).toString());
				text.setVisible(true);
			}
		});
		btnMg.setForeground(new Color(128, 0, 128));
		btnMg.setFont(new Font("Georgia", Font.BOLD, 17));
		btnMg.setBackground(UIManager.getColor("Button.background"));
		btnMg.setBounds(83, 213, 70, 37);
		contentPane.add(btnMg);
		
		JButton btnBe = new JButton("Be");
		btnBe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(3).toString());
				text.setVisible(true);
			}
		});
		btnBe.setForeground(new Color(128, 0, 128));
		btnBe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnBe.setBackground(UIManager.getColor("Button.background"));
		btnBe.setBounds(83, 161, 70, 37);
		contentPane.add(btnBe);
		
		JButton btnAr = new JButton("Ar");
		btnAr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(17).toString());
				text.setVisible(true);
			}
		});
		btnAr.setForeground(new Color(255, 255, 0));
		btnAr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAr.setBackground(UIManager.getColor("Button.background"));
		btnAr.setBounds(1249, 213, 70, 37);
		contentPane.add(btnAr);
		
		JButton btnCl = new JButton("Cl");
		btnCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(16).toString());
				text.setVisible(true);
			}
		});
		btnCl.setForeground(new Color(255, 204, 51));
		btnCl.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCl.setBackground(UIManager.getColor("Button.background"));
		btnCl.setBounds(1176, 213, 70, 37);
		contentPane.add(btnCl);
		
		JButton btnNe = new JButton("Ne");
		btnNe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(9).toString());
				text.setVisible(true);
			}
		});
		btnNe.setForeground(new Color(255, 255, 0));
		btnNe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNe.setBackground(UIManager.getColor("Button.background"));
		btnNe.setBounds(1249, 161, 70, 37);
		contentPane.add(btnNe);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(8).toString());
				text.setVisible(true);
			}
		});
		btnF.setForeground(new Color(255, 204, 51));
		btnF.setFont(new Font("Georgia", Font.BOLD, 17));
		btnF.setBackground(UIManager.getColor("Button.background"));
		btnF.setBounds(1176, 161, 70, 37);
		contentPane.add(btnF);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(15).toString());
				text.setVisible(true);
			}
		});
		btnS.setForeground(new Color(51, 0, 204));
		btnS.setFont(new Font("Georgia", Font.BOLD, 17));
		btnS.setBackground(UIManager.getColor("Button.background"));
		btnS.setBounds(1103, 213, 70, 37);
		contentPane.add(btnS);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(14).toString());
				text.setVisible(true);
			}
		});
		btnP.setForeground(new Color(51, 0, 204));
		btnP.setFont(new Font("Georgia", Font.BOLD, 17));
		btnP.setBackground(UIManager.getColor("Button.background"));
		btnP.setBounds(1030, 213, 70, 37);
		contentPane.add(btnP);
		
		JButton btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(13).toString());
				text.setVisible(true);
			}
			
		});
		btnSi.setForeground(new Color(51, 204, 0));
		btnSi.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSi.setBackground(UIManager.getColor("Button.background"));
		btnSi.setBounds(957, 213, 70, 37);
		contentPane.add(btnSi);
		
		JButton btnAl = new JButton("Al");
		btnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(12).toString());
				text.setVisible(true);
			}
		});
		btnAl.setForeground(new Color(255, 69, 0));
		btnAl.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAl.setBackground(UIManager.getColor("Button.background"));
		btnAl.setBounds(884, 213, 70, 37);
		contentPane.add(btnAl);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(7).toString());
				text.setVisible(true);
			}
		});
		btnO.setForeground(new Color(51, 0, 204));
		btnO.setFont(new Font("Georgia", Font.BOLD, 17));
		btnO.setBackground(UIManager.getColor("Button.background"));
		btnO.setBounds(1103, 161, 70, 37);
		contentPane.add(btnO);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(6).toString());
				text.setVisible(true);
				
			}
		});
		btnN.setForeground(new Color(51, 0, 204));
		btnN.setFont(new Font("Georgia", Font.BOLD, 17));
		btnN.setBackground(UIManager.getColor("Button.background"));
		btnN.setBounds(1030, 161, 70, 37);
		contentPane.add(btnN);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(5).toString());
				text.setVisible(true);
			}
			
		});
		btnC.setForeground(new Color(51, 0, 204));
		btnC.setFont(new Font("Georgia", Font.BOLD, 17));
		btnC.setBackground(UIManager.getColor("Button.background"));
		btnC.setBounds(957, 161, 70, 37);
		contentPane.add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(4).toString());
				text.setVisible(true);
			}
		});
		btnB.setForeground(new Color(51, 204, 0));
		btnB.setFont(new Font("Georgia", Font.BOLD, 17));
		btnB.setBackground(UIManager.getColor("Button.background"));
		btnB.setBounds(884, 161, 70, 37);
		contentPane.add(btnB);
		
		JButton btnHe = new JButton("He");
		btnHe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(1).toString());
				text.setVisible(true);
			}
		});
		btnHe.setForeground(new Color(255, 255, 0));
		btnHe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnHe.setBackground(UIManager.getColor("Button.background"));
		btnHe.setBounds(1249, 107, 70, 37);
		contentPane.add(btnHe);
		
		JLabel lblL = new JLabel("Lanthanide");
		lblL.setFont(new Font("Georgia", Font.BOLD, 14));
		lblL.setBounds(10, 509, 86, 14);
		contentPane.add(lblL);
		
		JLabel lblSeries = new JLabel("Series");
		lblSeries.setFont(new Font("Georgia", Font.BOLD, 14));
		lblSeries.setBounds(20, 522, 46, 24);
		contentPane.add(lblSeries);
		
		JLabel label_1 = new JLabel("Series");
		label_1.setFont(new Font("Georgia", Font.BOLD, 14));
		label_1.setBounds(20, 598, 46, 24);
		contentPane.add(label_1);
		
		JLabel lblActinide = new JLabel("Actinide");
		lblActinide.setFont(new Font("Georgia", Font.BOLD, 14));
		lblActinide.setBounds(10, 585, 86, 14);
		contentPane.add(lblActinide);
		
		JButton btnLa = new JButton("La");
		btnLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(56).toString());
				text.setVisible(true);
			}
		});
		btnLa.setForeground(new Color(51, 255, 0));
		btnLa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLa.setBackground(UIManager.getColor("Button.background"));
		btnLa.setBounds(112, 509, 70, 37);
		contentPane.add(btnLa);
		
		JButton btnCe = new JButton("Ce");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(57).toString());
				text.setVisible(true);
			}
		});
		btnCe.setForeground(new Color(51, 255, 0));
		btnCe.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCe.setBackground(UIManager.getColor("Button.background"));
		btnCe.setBounds(185, 509, 70, 37);
		contentPane.add(btnCe);
		
		JButton btnAc = new JButton("Ac");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(88).toString());
				text.setVisible(true);
			}
		});
		btnAc.setForeground(new Color(255, 0, 0));
		btnAc.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAc.setBackground(UIManager.getColor("Button.background"));
		btnAc.setBounds(112, 574, 70, 37);
		contentPane.add(btnAc);
		
		JButton btnTh = new JButton("Th");
		btnTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(89).toString());
				text.setVisible(true);
			}
		});
		btnTh.setForeground(new Color(255, 0, 0));
		btnTh.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTh.setBackground(UIManager.getColor("Button.background"));
		btnTh.setBounds(185, 574, 70, 37);
		contentPane.add(btnTh);
		
		JButton btnPr = new JButton("Pr");
		btnPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(58).toString());
				text.setVisible(true);
			}
		});
		btnPr.setForeground(new Color(51, 255, 0));
		btnPr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnPr.setBackground(UIManager.getColor("Button.background"));
		btnPr.setBounds(257, 509, 70, 37);
		contentPane.add(btnPr);
		
		JButton btnNd = new JButton("Nd");
		btnNd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(59).toString());
				text.setVisible(true);
			}
		});
		btnNd.setForeground(new Color(51, 255, 0));
		btnNd.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNd.setBackground(UIManager.getColor("Button.background"));
		btnNd.setBounds(330, 509, 70, 37);
		contentPane.add(btnNd);
		
		JButton btnPa = new JButton("Pa");
		btnPa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(90).toString());
				text.setVisible(true);
			}
		});
		btnPa.setForeground(new Color(255, 0, 0));
		btnPa.setFont(new Font("Georgia", Font.BOLD, 17));
		btnPa.setBackground(UIManager.getColor("Button.background"));
		btnPa.setBounds(257, 574, 70, 37);
		contentPane.add(btnPa);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(91).toString());
				text.setVisible(true);
			}
		});
		btnU.setForeground(new Color(255, 0, 0));
		btnU.setFont(new Font("Georgia", Font.BOLD, 17));
		btnU.setBackground(UIManager.getColor("Button.background"));
		btnU.setBounds(330, 574, 70, 37);
		contentPane.add(btnU);
		
		JButton btnSm = new JButton("Sm");
		btnSm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(61).toString());
				text.setVisible(true);
			}
		});
		btnSm.setForeground(new Color(51, 255, 0));
		btnSm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnSm.setBackground(UIManager.getColor("Button.background"));
		btnSm.setBounds(475, 509, 70, 37);
		contentPane.add(btnSm);
		
		JButton btnPm = new JButton("Pm");
		btnPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(60).toString());
				text.setVisible(true);
			}
		});
		btnPm.setForeground(new Color(51, 255, 0));
		btnPm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnPm.setBackground(UIManager.getColor("Button.background"));
		btnPm.setBounds(402, 509, 70, 37);
		contentPane.add(btnPm);
		
		JButton btnGd = new JButton("Gd");
		btnGd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(63).toString());
				text.setVisible(true);
			}
		});
		btnGd.setForeground(new Color(51, 255, 0));
		btnGd.setFont(new Font("Georgia", Font.BOLD, 17));
		btnGd.setBackground(UIManager.getColor("Button.background"));
		btnGd.setBounds(621, 509, 70, 37);
		contentPane.add(btnGd);
		
		JButton btnEu = new JButton("Eu");
		btnEu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(62).toString());
				text.setVisible(true);
			}
		});
		btnEu.setForeground(new Color(51, 255, 0));
		btnEu.setFont(new Font("Georgia", Font.BOLD, 17));
		btnEu.setBackground(UIManager.getColor("Button.background"));
		btnEu.setBounds(548, 509, 70, 37);
		contentPane.add(btnEu);
		
		JButton btnDy = new JButton("Dy");
		btnDy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(65).toString());
				text.setVisible(true);
			}
		});
		btnDy.setForeground(new Color(51, 255, 0));
		btnDy.setFont(new Font("Georgia", Font.BOLD, 17));
		btnDy.setBackground(UIManager.getColor("Button.background"));
		btnDy.setBounds(768, 509, 70, 37);
		contentPane.add(btnDy);
		
		JButton btnTb = new JButton("Tb");
		btnTb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(64).toString());
				text.setVisible(true);
			}
		});
		btnTb.setForeground(new Color(51, 255, 0));
		btnTb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTb.setBackground(UIManager.getColor("Button.background"));
		btnTb.setBounds(695, 509, 70, 37);
		contentPane.add(btnTb);
		
		JButton btnEr = new JButton("Er");
		btnEr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(67).toString());
				text.setVisible(true);
			}
		});
		btnEr.setForeground(new Color(51, 255, 0));
		btnEr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnEr.setBackground(UIManager.getColor("Button.background"));
		btnEr.setBounds(913, 509, 70, 37);
		contentPane.add(btnEr);
		
		JButton btnHo = new JButton("Ho");
		btnHo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(66).toString());
				text.setVisible(true);
			}
		});
		btnHo.setForeground(new Color(51, 255, 0));
		btnHo.setFont(new Font("Georgia", Font.BOLD, 17));
		btnHo.setBackground(UIManager.getColor("Button.background"));
		btnHo.setBounds(840, 509, 70, 37);
		contentPane.add(btnHo);
		
		JButton btnYb = new JButton("Yb");
		btnYb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(69).toString());
				text.setVisible(true);
			}
		});
		btnYb.setForeground(new Color(51, 255, 0));
		btnYb.setFont(new Font("Georgia", Font.BOLD, 17));
		btnYb.setBackground(UIManager.getColor("Button.background"));
		btnYb.setBounds(1059, 509, 70, 37);
		contentPane.add(btnYb);
		
		JButton btnTm = new JButton("Tm");
		btnTm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(68).toString());
				text.setVisible(true);
			}
		});
		btnTm.setForeground(new Color(51, 255, 0));
		btnTm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnTm.setBackground(UIManager.getColor("Button.background"));
		btnTm.setBounds(986, 509, 70, 37);
		contentPane.add(btnTm);
		
		JButton btnAm = new JButton("Pu");
		btnAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(93).toString());
				text.setVisible(true);
			}
		});
		btnAm.setForeground(new Color(255, 0, 0));
		btnAm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAm.setBackground(UIManager.getColor("Button.background"));
		btnAm.setBounds(475, 574, 70, 37);
		contentPane.add(btnAm);
		
		JButton btnNp = new JButton("Np");
		btnNp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(92).toString());
				text.setVisible(true);
			}
		});
		btnNp.setForeground(new Color(255, 0, 0));
		btnNp.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNp.setBackground(UIManager.getColor("Button.background"));
		btnNp.setBounds(402, 574, 70, 37);
		contentPane.add(btnNp);
		
		JButton btnCm = new JButton("Cm");
		btnCm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(95).toString());
				text.setVisible(true);
			}
		});
		btnCm.setForeground(new Color(255, 0, 0));
		btnCm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCm.setBackground(UIManager.getColor("Button.background"));
		btnCm.setBounds(621, 574, 70, 37);
		contentPane.add(btnCm);
		
		JButton btnAm_1 = new JButton("Am");
		btnAm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(94).toString());
				text.setVisible(true);
			}
		});
		btnAm_1.setForeground(new Color(255, 0, 0));
		btnAm_1.setFont(new Font("Georgia", Font.BOLD, 17));
		btnAm_1.setBackground(UIManager.getColor("Button.background"));
		btnAm_1.setBounds(548, 574, 70, 37);
		contentPane.add(btnAm_1);
		
		JButton btnCf = new JButton("Cf");
		btnCf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(97).toString());
				text.setVisible(true);
			}
		});
		btnCf.setForeground(new Color(255, 0, 0));
		btnCf.setFont(new Font("Georgia", Font.BOLD, 17));
		btnCf.setBackground(UIManager.getColor("Button.background"));
		btnCf.setBounds(768, 574, 70, 37);
		contentPane.add(btnCf);
		
		JButton btnBk = new JButton("Bk");
		btnBk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(96).toString());
				text.setVisible(true);
			}
		});
		btnBk.setForeground(new Color(255, 0, 0));
		btnBk.setFont(new Font("Georgia", Font.BOLD, 17));
		btnBk.setBackground(UIManager.getColor("Button.background"));
		btnBk.setBounds(695, 574, 70, 37);
		contentPane.add(btnBk);
		
		JButton btnFm = new JButton("Fm");
		btnFm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(99).toString());
				text.setVisible(true);
			}
		});
		btnFm.setForeground(new Color(255, 0, 0));
		btnFm.setFont(new Font("Georgia", Font.BOLD, 17));
		btnFm.setBackground(UIManager.getColor("Button.background"));
		btnFm.setBounds(913, 574, 70, 37);
		contentPane.add(btnFm);
		
		JButton btnEs = new JButton("Es");
		btnEs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(98).toString());
				text.setVisible(true);
			}
		});
		btnEs.setForeground(new Color(255, 0, 0));
		btnEs.setFont(new Font("Georgia", Font.BOLD, 17));
		btnEs.setBackground(UIManager.getColor("Button.background"));
		btnEs.setBounds(840, 574, 70, 37);
		contentPane.add(btnEs);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(101).toString());
				text.setVisible(true);
			}
		});
		btnNo.setForeground(new Color(255, 0, 0));
		btnNo.setFont(new Font("Georgia", Font.BOLD, 17));
		btnNo.setBackground(UIManager.getColor("Button.background"));
		btnNo.setBounds(1059, 574, 70, 37);
		contentPane.add(btnNo);
		
		JButton btnMd = new JButton("Md");
		btnMd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(100).toString());
				text.setVisible(true);
			}
		});
		btnMd.setForeground(new Color(255, 0, 0));
		btnMd.setFont(new Font("Georgia", Font.BOLD, 17));
		btnMd.setBackground(UIManager.getColor("Button.background"));
		btnMd.setBounds(986, 574, 70, 37);
		contentPane.add(btnMd);
		
		JButton btnLu = new JButton("Lu");
		btnLu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(70).toString());
				text.setVisible(true);
			}
		});
		btnLu.setForeground(new Color(51, 255, 0));
		btnLu.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLu.setBackground(UIManager.getColor("Button.background"));
		btnLu.setBounds(1133, 509, 70, 37);
		contentPane.add(btnLu);
		
		JButton btnLr = new JButton("Lr");
		btnLr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Element> list = new ArrayList<>();
				ArrayElements elements = new ArrayElements();
				list = elements.getList();
				
				Text text = new Text(list.get(102).toString());
				text.setVisible(true);
			}
		});
		btnLr.setForeground(new Color(255, 0, 0));
		btnLr.setFont(new Font("Georgia", Font.BOLD, 17));
		btnLr.setBackground(UIManager.getColor("Button.background"));
		btnLr.setBounds(1133, 574, 70, 37);
		contentPane.add(btnLr);
		
		JLabel lblBeryllium = new JLabel("Beryllium");
		lblBeryllium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBeryllium.setBounds(83, 197, 70, 14);
		contentPane.add(lblBeryllium);
		
		JLabel lblMag = new JLabel("Magnesium");
		lblMag.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMag.setBounds(83, 250, 70, 14);
		contentPane.add(lblMag);
		
		JLabel lblCalcium = new JLabel("Calcium");
		lblCalcium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCalcium.setBounds(83, 302, 70, 14);
		contentPane.add(lblCalcium);
		
		JLabel lblStrontium = new JLabel("Strontium");
		lblStrontium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblStrontium.setBounds(83, 356, 70, 14);
		contentPane.add(lblStrontium);
		
		JLabel lblBarium = new JLabel("Barium");
		lblBarium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBarium.setBounds(83, 408, 70, 14);
		contentPane.add(lblBarium);
		
		JLabel lblRadium = new JLabel("Radium");
		lblRadium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRadium.setBounds(83, 462, 70, 14);
		contentPane.add(lblRadium);
		
		JLabel lblScandium = new JLabel("Scandium");
		lblScandium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblScandium.setBounds(156, 302, 70, 14);
		contentPane.add(lblScandium);
		
		JLabel lblYttrium = new JLabel("Yttrium");
		lblYttrium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblYttrium.setBounds(156, 356, 70, 14);
		contentPane.add(lblYttrium);
		
		JLabel lblTitanium = new JLabel("Titanium");
		lblTitanium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTitanium.setBounds(229, 302, 70, 14);
		contentPane.add(lblTitanium);
		
		JLabel lblZirconium = new JLabel("Zirconium");
		lblZirconium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblZirconium.setBounds(229, 356, 70, 14);
		contentPane.add(lblZirconium);
		
		JLabel lblHafnium = new JLabel("Hafnium");
		lblHafnium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblHafnium.setBounds(229, 408, 70, 14);
		contentPane.add(lblHafnium);
		
		JLabel lblRutherfordium = new JLabel("Rutherfordium");
		lblRutherfordium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRutherfordium.setBounds(205, 462, 94, 14);
		contentPane.add(lblRutherfordium);
		
		JLabel lblVabadium = new JLabel("Vabadium");
		lblVabadium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblVabadium.setBounds(301, 302, 70, 14);
		contentPane.add(lblVabadium);
		
		JLabel lblZirconium_1 = new JLabel("Nioblum");
		lblZirconium_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblZirconium_1.setBounds(301, 356, 70, 14);
		contentPane.add(lblZirconium_1);
		
		JLabel lblTantalum = new JLabel("Tantalum");
		lblTantalum.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTantalum.setBounds(301, 408, 70, 14);
		contentPane.add(lblTantalum);
		
		JLabel lblDubnium = new JLabel("Dubnium");
		lblDubnium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblDubnium.setBounds(301, 462, 70, 14);
		contentPane.add(lblDubnium);
		
		JLabel lblChromium = new JLabel("Chromium");
		lblChromium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblChromium.setBounds(374, 302, 70, 14);
		contentPane.add(lblChromium);
		
		JLabel lblMolybdenium = new JLabel("Molybdenium");
		lblMolybdenium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMolybdenium.setBounds(364, 356, 80, 14);
		contentPane.add(lblMolybdenium);
		
		JLabel lblTungsten = new JLabel("Tungsten");
		lblTungsten.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTungsten.setBounds(374, 408, 70, 14);
		contentPane.add(lblTungsten);
		
		JLabel lblSeaborgium = new JLabel("Seaborgium");
		lblSeaborgium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSeaborgium.setBounds(374, 462, 70, 14);
		contentPane.add(lblSeaborgium);
		
		JLabel lblManganese = new JLabel("Manganese");
		lblManganese.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblManganese.setBounds(446, 302, 70, 14);
		contentPane.add(lblManganese);
		
		JLabel lblTechnetium = new JLabel("Technetium");
		lblTechnetium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTechnetium.setBounds(446, 356, 80, 14);
		contentPane.add(lblTechnetium);
		
		JLabel lblRhenium = new JLabel("Rhenium");
		lblRhenium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRhenium.setBounds(446, 408, 70, 14);
		contentPane.add(lblRhenium);
		
		JLabel lblBohrium = new JLabel(" Bohrium");
		lblBohrium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBohrium.setBounds(446, 462, 70, 14);
		contentPane.add(lblBohrium);
		
		JLabel lblIron = new JLabel("    Iron");
		lblIron.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblIron.setBounds(519, 302, 70, 14);
		contentPane.add(lblIron);
		
		JLabel lblRuthenium = new JLabel("Ruthenium");
		lblRuthenium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRuthenium.setBounds(519, 356, 70, 14);
		contentPane.add(lblRuthenium);
		
		JLabel lblOsmium = new JLabel("Osmium");
		lblOsmium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblOsmium.setBounds(519, 408, 70, 14);
		contentPane.add(lblOsmium);
		
		JLabel lblHassium = new JLabel("Hassium");
		lblHassium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblHassium.setBounds(519, 462, 70, 14);
		contentPane.add(lblHassium);
		
		JLabel lblCobalt = new JLabel("Cobalt");
		lblCobalt.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCobalt.setBounds(592, 302, 70, 14);
		contentPane.add(lblCobalt);
		
		JLabel lblRhodium = new JLabel("Rhodium");
		lblRhodium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRhodium.setBounds(592, 356, 70, 14);
		contentPane.add(lblRhodium);
		
		JLabel lblIridium = new JLabel("Iridium");
		lblIridium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblIridium.setBounds(592, 408, 70, 14);
		contentPane.add(lblIridium);
		
		JLabel lblMeitnerium = new JLabel("Meitnerium");
		lblMeitnerium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMeitnerium.setBounds(592, 462, 70, 14);
		contentPane.add(lblMeitnerium);
		
		JLabel lblNickel = new JLabel("Nickel");
		lblNickel.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNickel.setBounds(665, 302, 70, 14);
		contentPane.add(lblNickel);
		
		JLabel lblPalladium = new JLabel("Palladium");
		lblPalladium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPalladium.setBounds(665, 356, 70, 14);
		contentPane.add(lblPalladium);
		
		JLabel lblPlatinum = new JLabel("Platinum");
		lblPlatinum.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPlatinum.setBounds(665, 408, 70, 14);
		contentPane.add(lblPlatinum);
		
		JLabel lblDarmstadtium_1 = new JLabel("Darmstadtium");
		lblDarmstadtium_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblDarmstadtium_1.setBounds(665, 462, 70, 14);
		contentPane.add(lblDarmstadtium_1);
		
		JLabel lblCopper = new JLabel("Copper");
		lblCopper.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCopper.setBounds(739, 302, 70, 14);
		contentPane.add(lblCopper);
		
		JLabel lblSilver = new JLabel("Silver");
		lblSilver.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSilver.setBounds(739, 356, 70, 14);
		contentPane.add(lblSilver);
		
		JLabel lblGold = new JLabel("Gold");
		lblGold.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblGold.setBounds(739, 408, 70, 14);
		contentPane.add(lblGold);
		
		JLabel lblRoentgenium = new JLabel("Roentgenium");
		lblRoentgenium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRoentgenium.setBounds(739, 462, 70, 14);
		contentPane.add(lblRoentgenium);
		
		JLabel lblZinc = new JLabel("Zinc");
		lblZinc.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblZinc.setBounds(812, 302, 70, 14);
		contentPane.add(lblZinc);
		
		JLabel lblCadmium = new JLabel("Cadmium");
		lblCadmium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCadmium.setBounds(812, 356, 70, 14);
		contentPane.add(lblCadmium);
		
		JLabel lblMercury = new JLabel("Mercury");
		lblMercury.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMercury.setBounds(812, 408, 70, 14);
		contentPane.add(lblMercury);
		
		JLabel lblCopernicium = new JLabel("Copernicium");
		lblCopernicium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCopernicium.setBounds(812, 462, 70, 14);
		contentPane.add(lblCopernicium);
		
		JLabel lblBoron = new JLabel("Boron");
		lblBoron.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBoron.setBounds(884, 197, 70, 14);
		contentPane.add(lblBoron);
		
		JLabel lblAluminium = new JLabel("Aluminium");
		lblAluminium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblAluminium.setBounds(884, 250, 70, 14);
		contentPane.add(lblAluminium);
		
		JLabel lblGallium = new JLabel("Gallium");
		lblGallium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblGallium.setBounds(884, 302, 70, 14);
		contentPane.add(lblGallium);
		
		JLabel lblIndium = new JLabel("Indium");
		lblIndium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblIndium.setBounds(884, 356, 70, 14);
		contentPane.add(lblIndium);
		
		JLabel lblThallium = new JLabel("Thallium");
		lblThallium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblThallium.setBounds(884, 408, 70, 14);
		contentPane.add(lblThallium);
		
		JLabel lblNihonium = new JLabel("Nihonium");
		lblNihonium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNihonium.setBounds(884, 462, 70, 14);
		contentPane.add(lblNihonium);
		
		JLabel lblCarbon = new JLabel("Carbon");
		lblCarbon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCarbon.setBounds(957, 197, 70, 14);
		contentPane.add(lblCarbon);
		
		JLabel lblSilicon = new JLabel("Silicon");
		lblSilicon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSilicon.setBounds(957, 250, 70, 14);
		contentPane.add(lblSilicon);
		
		JLabel lblGermanium = new JLabel("Germanium");
		lblGermanium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblGermanium.setBounds(957, 302, 70, 14);
		contentPane.add(lblGermanium);
		
		JLabel lblTin = new JLabel("Tin");
		lblTin.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTin.setBounds(957, 356, 70, 14);
		contentPane.add(lblTin);
		
		JLabel lblLead = new JLabel("Lead");
		lblLead.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLead.setBounds(957, 408, 70, 14);
		contentPane.add(lblLead);
		
		JLabel lblFlerovium = new JLabel("Flerovium");
		lblFlerovium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblFlerovium.setBounds(957, 462, 70, 14);
		contentPane.add(lblFlerovium);
		
		JLabel lblNitrogen = new JLabel("Nitrogen");
		lblNitrogen.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNitrogen.setBounds(1030, 197, 70, 14);
		contentPane.add(lblNitrogen);
		
		JLabel lblPhosphorus = new JLabel("Phosphorus");
		lblPhosphorus.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPhosphorus.setBounds(1030, 250, 70, 14);
		contentPane.add(lblPhosphorus);
		
		JLabel lblArsenic = new JLabel("Arsenic");
		lblArsenic.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblArsenic.setBounds(1030, 302, 70, 14);
		contentPane.add(lblArsenic);
		
		JLabel lblAntimony = new JLabel("Antimony");
		lblAntimony.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblAntimony.setBounds(1030, 356, 70, 14);
		contentPane.add(lblAntimony);
		
		JLabel lblBismuth = new JLabel("Bismuth");
		lblBismuth.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBismuth.setBounds(1030, 408, 70, 14);
		contentPane.add(lblBismuth);
		
		JLabel lblPolonium = new JLabel("Polonium");
		lblPolonium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPolonium.setBounds(1103, 408, 70, 14);
		contentPane.add(lblPolonium);
		
		JLabel lblTellurium = new JLabel("Tellurium");
		lblTellurium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTellurium.setBounds(1103, 356, 70, 14);
		contentPane.add(lblTellurium);
		
		JLabel lblSelenium = new JLabel("Selenium");
		lblSelenium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSelenium.setBounds(1103, 302, 70, 14);
		contentPane.add(lblSelenium);
		
		JLabel lblSulfur = new JLabel("Sulfur");
		lblSulfur.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSulfur.setBounds(1103, 250, 70, 14);
		contentPane.add(lblSulfur);
		
		JLabel lblOxygen = new JLabel("Oxygen");
		lblOxygen.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblOxygen.setBounds(1103, 197, 70, 14);
		contentPane.add(lblOxygen);
		
		JLabel lblFluorine = new JLabel("Fluorine");
		lblFluorine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblFluorine.setBounds(1176, 197, 70, 14);
		contentPane.add(lblFluorine);
		
		JLabel lblChlorine = new JLabel("Chlorine");
		lblChlorine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblChlorine.setBounds(1176, 250, 70, 14);
		contentPane.add(lblChlorine);
		
		JLabel lblBromine = new JLabel("Bromine");
		lblBromine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBromine.setBounds(1176, 302, 70, 14);
		contentPane.add(lblBromine);
		
		JLabel lblIodine = new JLabel("Iodine");
		lblIodine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblIodine.setBounds(1176, 356, 70, 14);
		contentPane.add(lblIodine);
		
		JLabel lblAstatine = new JLabel("Astatine");
		lblAstatine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblAstatine.setBounds(1176, 408, 70, 14);
		contentPane.add(lblAstatine);
		
		JLabel lblTennessine = new JLabel("Tennessine");
		lblTennessine.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTennessine.setBounds(1176, 462, 70, 14);
		contentPane.add(lblTennessine);
		
		JLabel lblMoscovium = new JLabel("Moscovium");
		lblMoscovium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMoscovium.setBounds(1030, 462, 70, 14);
		contentPane.add(lblMoscovium);
		
		JLabel lblLivermorium = new JLabel("Livermorium");
		lblLivermorium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLivermorium.setBounds(1103, 462, 70, 14);
		contentPane.add(lblLivermorium);
		
		JLabel lblOganesson = new JLabel("Oganesson");
		lblOganesson.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblOganesson.setBounds(1249, 462, 70, 14);
		contentPane.add(lblOganesson);
		
		JLabel lblRadon = new JLabel("Radon");
		lblRadon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRadon.setBounds(1249, 408, 70, 14);
		contentPane.add(lblRadon);
		
		JLabel lblXenon = new JLabel("Xenon");
		lblXenon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblXenon.setBounds(1249, 356, 70, 14);
		contentPane.add(lblXenon);
		
		JLabel lblKrypton = new JLabel("Krypton");
		lblKrypton.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblKrypton.setBounds(1248, 302, 70, 14);
		contentPane.add(lblKrypton);
		
		JLabel lblArgon = new JLabel("Argon");
		lblArgon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblArgon.setBounds(1249, 250, 70, 14);
		contentPane.add(lblArgon);
		
		JLabel lblNeon = new JLabel("Neon");
		lblNeon.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNeon.setBounds(1248, 197, 70, 14);
		contentPane.add(lblNeon);
		
		JLabel lblHelium = new JLabel("Helium");
		lblHelium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblHelium.setBounds(1249, 145, 70, 14);
		contentPane.add(lblHelium);
		
		JLabel lblLanthanum = new JLabel("Lanthanum");
		lblLanthanum.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLanthanum.setBounds(112, 549, 70, 14);
		contentPane.add(lblLanthanum);
		
		JLabel lblCerium = new JLabel("Cerium");
		lblCerium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCerium.setBounds(185, 549, 70, 14);
		contentPane.add(lblCerium);
		
		JLabel lblPraseodymium = new JLabel("Praseodymium");
		lblPraseodymium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPraseodymium.setBounds(240, 549, 98, 14);
		contentPane.add(lblPraseodymium);
		
		JLabel lblNeodymium = new JLabel("Neodymium");
		lblNeodymium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNeodymium.setBounds(330, 549, 80, 14);
		contentPane.add(lblNeodymium);
		
		JLabel lblPromethium = new JLabel("Promethium");
		lblPromethium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPromethium.setBounds(402, 549, 80, 14);
		contentPane.add(lblPromethium);
		
		JLabel lblSamarium = new JLabel("Samarium");
		lblSamarium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblSamarium.setBounds(485, 549, 70, 14);
		contentPane.add(lblSamarium);
		
		JLabel lblEuropium = new JLabel("Europium");
		lblEuropium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblEuropium.setBounds(558, 549, 70, 14);
		contentPane.add(lblEuropium);
		
		JLabel lblGadolinium = new JLabel("Gadolinium");
		lblGadolinium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblGadolinium.setBounds(621, 549, 70, 14);
		contentPane.add(lblGadolinium);
		
		JLabel lblTerbium = new JLabel("Terbium");
		lblTerbium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblTerbium.setBounds(695, 549, 70, 14);
		contentPane.add(lblTerbium);
		
		JLabel lblDysprosium = new JLabel("Dysprosium");
		lblDysprosium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblDysprosium.setBounds(768, 549, 70, 14);
		contentPane.add(lblDysprosium);
		
		JLabel lblHoimium = new JLabel("Hoimium");
		lblHoimium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblHoimium.setBounds(840, 549, 70, 14);
		contentPane.add(lblHoimium);
		
		JLabel lblErbium = new JLabel("Erbium");
		lblErbium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblErbium.setBounds(913, 549, 70, 14);
		contentPane.add(lblErbium);
		
		JLabel lblThulium = new JLabel("Thulium");
		lblThulium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblThulium.setBounds(986, 549, 70, 14);
		contentPane.add(lblThulium);
		
		JLabel lblYtterbium = new JLabel("Ytterbium");
		lblYtterbium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblYtterbium.setBounds(1059, 549, 70, 14);
		contentPane.add(lblYtterbium);
		
		JLabel lblLutetium = new JLabel("Lutetium");
		lblLutetium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLutetium.setBounds(1133, 549, 70, 14);
		contentPane.add(lblLutetium);
		
		JLabel lblActinium = new JLabel("Actinium");
		lblActinium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblActinium.setBounds(112, 620, 70, 14);
		contentPane.add(lblActinium);
		
		JLabel lblThorium = new JLabel("Thorium");
		lblThorium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblThorium.setBounds(185, 620, 70, 14);
		contentPane.add(lblThorium);
		
		JLabel lblProtactinium = new JLabel("Protactinium");
		lblProtactinium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblProtactinium.setBounds(247, 622, 80, 14);
		contentPane.add(lblProtactinium);
		
		JLabel lblUranium = new JLabel("Uranium");
		lblUranium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblUranium.setBounds(330, 620, 70, 14);
		contentPane.add(lblUranium);
		
		JLabel lblNeptunium = new JLabel("Neptunium");
		lblNeptunium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNeptunium.setBounds(402, 620, 70, 14);
		contentPane.add(lblNeptunium);
		
		JLabel lblPlutonium = new JLabel("Plutonium");
		lblPlutonium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblPlutonium.setBounds(475, 622, 70, 14);
		contentPane.add(lblPlutonium);
		
		JLabel lblAmericium = new JLabel("Americium");
		lblAmericium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblAmericium.setBounds(548, 622, 70, 14);
		contentPane.add(lblAmericium);
		
		JLabel lblCurium = new JLabel("Curium");
		lblCurium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCurium.setBounds(621, 622, 70, 14);
		contentPane.add(lblCurium);
		
		JLabel lblBerkelium = new JLabel("Berkelium");
		lblBerkelium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBerkelium.setBounds(695, 622, 70, 14);
		contentPane.add(lblBerkelium);
		
		JLabel lblCalifornium = new JLabel("Californium");
		lblCalifornium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblCalifornium.setBounds(768, 622, 80, 14);
		contentPane.add(lblCalifornium);
		
		JLabel lblEinestinium = new JLabel("Einestinium");
		lblEinestinium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblEinestinium.setBounds(840, 622, 86, 14);
		contentPane.add(lblEinestinium);
		
		JLabel lblFerium = new JLabel("Ferium");
		lblFerium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblFerium.setBounds(923, 622, 70, 14);
		contentPane.add(lblFerium);
		
		JLabel lblMendelevium = new JLabel("Mendelevium");
		lblMendelevium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblMendelevium.setBounds(976, 620, 80, 14);
		contentPane.add(lblMendelevium);
		
		JLabel lblNobelium = new JLabel("Nobelium");
		lblNobelium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNobelium.setBounds(1059, 622, 70, 14);
		contentPane.add(lblNobelium);
		
		JLabel lblLawerncium = new JLabel("Lawerncium");
		lblLawerncium.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblLawerncium.setBounds(1123, 620, 80, 14);
		contentPane.add(lblLawerncium);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(1230, 637, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu menu = new Menu();
				//menu.main(null);
				dispose();
			}
		});
		btnBack.setBounds(1230, 600, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("     1          2          3          4          5          6          7          8          9         10        11         12        13        14        15         16        17        18 ");
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 86, 1309, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Alkaline Earth");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, new AlkalineEarthMetals().properties());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(331, 116, 113, 43);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Alkali Metal");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new AlkaliMetal().properties());
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.MAGENTA);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(205, 116, 112, 43);
		contentPane.add(button);
		
		JButton btnTransitionMetal = new JButton("Transition Metal");
		btnTransitionMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new TransitionMetals().properties());
			}
		});
		btnTransitionMetal.setForeground(Color.WHITE);
		btnTransitionMetal.setBackground(Color.CYAN);
		btnTransitionMetal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTransitionMetal.setBounds(460, 116, 113, 43);
		contentPane.add(btnTransitionMetal);
		
		JButton btnBasicMetal = new JButton("Basic Metal");
		btnBasicMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new BasicMetals().properties());
			}
		});
		btnBasicMetal.setForeground(Color.WHITE);
		btnBasicMetal.setBackground(new Color(255, 51, 0));
		btnBasicMetal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBasicMetal.setBounds(592, 116, 113, 43);
		contentPane.add(btnBasicMetal);
		
		JButton btnSemiMetal = new JButton("Semi Metal");
		btnSemiMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new SemiMetals().properties());
			}
		});
		btnSemiMetal.setBackground(new Color(0, 204, 0));
		btnSemiMetal.setForeground(Color.WHITE);
		btnSemiMetal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSemiMetal.setBounds(725, 116, 113, 43);
		contentPane.add(btnSemiMetal);
		
		JButton btnNonMetal = new JButton("Non Metal");
		btnNonMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new NonMetals().properties());
			}
		});
		btnNonMetal.setBackground(new Color(0, 102, 204));
		btnNonMetal.setForeground(Color.WHITE);
		btnNonMetal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNonMetal.setBounds(205, 170, 113, 43);
		contentPane.add(btnNonMetal);
		
		JButton btnHalogen = new JButton("Halogen");
		btnHalogen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new Halogen().properties());
			}
		});
		btnHalogen.setBackground(new Color(255, 153, 51));
		btnHalogen.setForeground(Color.WHITE);
		btnHalogen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHalogen.setBounds(331, 170, 113, 43);
		contentPane.add(btnHalogen);
		
		JButton btnNobleGas = new JButton("Noble Gas");
		btnNobleGas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new NobleGas().properties());
			}
		});
		btnNobleGas.setBackground(Color.YELLOW);
		btnNobleGas.setForeground(Color.WHITE);
		btnNobleGas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNobleGas.setBounds(460, 170, 113, 43);
		contentPane.add(btnNobleGas);
		
		JButton btnLanthanide = new JButton("Lanthanide");
		btnLanthanide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new Lanthenide().properties());
			}
		});
		btnLanthanide.setBackground(Color.GREEN);
		btnLanthanide.setForeground(Color.WHITE);
		btnLanthanide.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLanthanide.setBounds(592, 170, 113, 43);
		contentPane.add(btnLanthanide);
		
		JButton btnActinide = new JButton("Actinide");
		btnActinide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, new Actinide().properties());
			}
		});
		btnActinide.setBackground(Color.RED);
		btnActinide.setForeground(Color.WHITE);
		btnActinide.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnActinide.setBounds(725, 170, 113, 43);
		contentPane.add(btnActinide);
	}
}
