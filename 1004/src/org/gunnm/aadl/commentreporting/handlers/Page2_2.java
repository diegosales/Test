package org.gunnm.aadl.commentreporting.handlers;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Page2_2  {
	private JPanel panel2_2;
	private JFrame frame;
	private JTable table;
	private JTextField textField;
	Page3 page3;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page2_2() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Property Set Device");
		frame.setBounds(100, 100, 637, 353);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel2_2 = new JPanel();
		panel2_2.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel2_2);
		panel2_2.setLayout(null);
		panel2_2.setVisible(true);

		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page3 = new Page3();
				Page3.main(null);
				page3.setVisible(true);
				panel2_2.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel2_2.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(e -> {
		});
		btnReturn.setBounds(419, 280, 89, 23);
		panel2_2.add(btnReturn);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(10, 11, 601, 258);
		panel2_2.add(tabbedPane);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Temporal", null, desktopPane_1, null);

		JLabel lblNewLabel_1_7 = new JLabel("Priority:");
		lblNewLabel_1_7.setBounds(10, 11, 46, 14);
		desktopPane_1.add(lblNewLabel_1_7);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSpinner spinner = new JSpinner();
		spinner.setBounds(91, 8, 181, 22);
		desktopPane_1.add(spinner);

		JLabel lblNewLabel_1_5_2 = new JLabel("Period (ms):");
		lblNewLabel_1_5_2.setBounds(10, 36, 68, 14);
		desktopPane_1.add(lblNewLabel_1_5_2);
		lblNewLabel_1_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(91, 33, 181, 22);
		desktopPane_1.add(spinner_2);

		JLabel lblNewLabel_1_5_4 = new JLabel("Latency (ms):");
		lblNewLabel_1_5_4.setBounds(10, 61, 83, 14);
		desktopPane_1.add(lblNewLabel_1_5_4);
		lblNewLabel_1_5_4.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(91, 58, 181, 22);
		desktopPane_1.add(spinner_3);

		JLabel lblNewLabel_1_5_4_1 = new JLabel("Deadline (ms):");
		lblNewLabel_1_5_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5_4_1.setBounds(10, 86, 83, 14);
		desktopPane_1.add(lblNewLabel_1_5_4_1);

		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setBounds(91, 83, 181, 22);
		desktopPane_1.add(spinner_3_1);

		JButton btnNewButton = new JButton(">>");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(294, 113, 53, 23);
		desktopPane_1.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(368, 11, 218, 208);
		desktopPane_1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {}, new String[] { "    Properties", "    Data Defined" }));
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_1_5_4_1_1 = new JLabel("New_Propertie:");
		lblNewLabel_1_5_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5_4_1_1.setBounds(10, 205, 110, 14);
		desktopPane_1.add(lblNewLabel_1_5_4_1_1);

		textField = new JTextField();
		textField.setBounds(100, 203, 172, 20);
		desktopPane_1.add(textField);
		textField.setColumns(10);

		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Physical", null, desktopPane_2, null);

		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Electrical", null, desktopPane_3, null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.inactiveCaptionBorder);
		tabbedPane.addTab("Deployment", null, desktopPane, null);

		JLabel lblNewLabel_1_6 = new JLabel("Functional:");
		lblNewLabel_1_6.setBounds(10, 11, 60, 14);
		desktopPane.add(lblNewLabel_1_6);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));

	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					Page2_2 window = new Page2_2();
				window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
	}

