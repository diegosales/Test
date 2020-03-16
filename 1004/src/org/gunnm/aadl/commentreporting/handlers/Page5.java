package org.gunnm.aadl.commentreporting.handlers;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Page5  {
	private JPanel panel5;
	private JFrame frame;
	private JTable table_1;
	private JTable table;
	Page4 page4;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page5() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Covarage Requirements Device");
		frame.setBounds(100, 100, 637, 353);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel5 = new JPanel();
		panel5.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel5);
		panel5.setLayout(null);
		panel5.setVisible(true);

		JLabel lblNewLabel = new JLabel("List of Requirements Unbinding from chosen devices:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 146, 423, 13);
		panel5.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 601, 99);
		panel5.add(scrollPane);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, { null }, },
				new String[] { "" }));
		scrollPane.setViewportView(table_1);

		JButton btnNext = new JButton("Finish");
		btnNext.setBounds(522, 280, 89, 23);
		panel5.add(btnNext);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 30, 601, 105);
		panel5.add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, { null }, },
				new String[] { "" }));
		scrollPane_1.setViewportView(table);

		JLabel lblListOfRequirements = new JLabel("List of Requirements Binding from chosen devices:");
		lblListOfRequirements.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListOfRequirements.setBounds(10, 11, 354, 13);
		panel5.add(lblListOfRequirements);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Create  a new requirement System");
		chckbxNewCheckBox.setBounds(10, 280, 340, 23);
		panel5.add(chckbxNewCheckBox);

		JButton btnReturn = new JButton("Return");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page4 = new Page4();
				Page4.main(null);
				page4.setVisible(true);
				panel5.setVisible(false);
				frame.dispose();

			}
		});
		btnReturn.setBounds(423, 280, 89, 23);
		panel5.add(btnReturn);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
				Page5 window = new Page5();
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

