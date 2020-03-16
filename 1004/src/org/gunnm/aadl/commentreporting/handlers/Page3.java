package org.gunnm.aadl.commentreporting.handlers;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Page3  {
	private JPanel panel3;
	private JPanel panel2;
	private JFrame frame;
	private JLabel lblDevicesFromLibrary;
	private JTable table1;
	private JTable table2;
	private JTable table4;
	private JTable table3;
	Page4 page4;
	Page2 page2;
	Page3_1 page3_1;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page3() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Choose a new device from library");
		frame.setBounds(100, 100, 633, 349);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel3 = new JPanel();
		panel3.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(true);

		lblDevicesFromLibrary = new JLabel("Device Selected:");
		lblDevicesFromLibrary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDevicesFromLibrary.setBounds(10, 11, 155, 13);
		panel3.add(lblDevicesFromLibrary);

		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				page4 = new Page4();
				Page4.main(null);
				page4.setVisible(true);
				panel3.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel3.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page2 = new Page2();
				Page2.main(null);
				page2.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(false);
				page2.setVisible(false);
				frame.dispose();

			}
		});
		btnReturn.setBounds(419, 280, 89, 23);
		panel3.add(btnReturn);

		JLabel lblLibraryDevice = new JLabel("Library Device:");
		lblLibraryDevice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLibraryDevice.setBounds(147, 11, 155, 13);
		panel3.add(lblLibraryDevice);

		JLabel lblNewDeviceSelected = new JLabel("Device Selected:");
		lblNewDeviceSelected.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewDeviceSelected.setBounds(320, 11, 155, 13);
		panel3.add(lblNewDeviceSelected);

		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(467, 25, 125, 207);
		panel3.add(scrollPane4);

		table4 = new JTable();
		table4.setModel(new DefaultTableModel(new Object[][] { { null }, }, new String[] { "" }));
		scrollPane4.setViewportView(table4);

		JButton btnNewButton_3 = new JButton("<<");
		btnNewButton_3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TableModel model1 = table1.getModel();
				int indexs3 = table3.getSelectedRow();
				Object[] row3 = new Object[4];
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				model3.removeRow(indexs3);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_3.setBounds(350, 243, 55, 23);
		panel3.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("<<");
		btnNewButton_4.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TableModel model1 = table1.getModel();
				int indexs4 = table4.getSelectedRow();
				Object[] row4 = new Object[4];
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				model4.removeRow(indexs4);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_4.setBounds(505, 243, 55, 23);
		panel3.add(btnNewButton_4);

		JButton btnNewButton_2 = new JButton(">>");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TableModel model1 = table1.getModel();
				int indexs2[] = table2.getSelectedRows();
				Object[] row2 = new Object[4];
				DefaultTableModel model4 = (DefaultTableModel) table4.getModel();
				for (int i = 0; i < indexs2.length; i++) {
					row2[0] = table2.getValueAt(indexs2[i], 0);

					row2[1] = table2.getValueAt(indexs2[i], 0);

					row2[2] = table2.getValueAt(indexs2[i], 0);

					row2[3] = table2.getValueAt(indexs2[i], 0);

					model4.addRow(row2);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setBounds(181, 243, 55, 23);
		panel3.add(btnNewButton_2);

		JButton btnNewButton = new JButton(">>");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TableModel model1 = table1.getModel();
				int indexs1[] = table1.getSelectedRows();
				Object[] row = new Object[4];
				DefaultTableModel model3 = (DefaultTableModel) table3.getModel();
				for (int i = 0; i < indexs1.length; i++) {
					row[0] = table1.getValueAt(indexs1[i], 0);

					row[1] = table1.getValueAt(indexs1[i], 0);

					row[2] = table1.getValueAt(indexs1[i], 0);

					row[3] = table1.getValueAt(indexs1[i], 0);

					model3.addRow(row);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(45, 243, 55, 23);
		panel3.add(btnNewButton);

		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 25, 125, 207);
		panel3.add(scrollPane1);

		table1 = new JTable();
		table1.setModel(new DefaultTableModel(new Object[][] { { "MPU-9250" }, { "COMPASS" }, { "" }, { null }, },
				new String[] { "" }));
		scrollPane1.setViewportView(table1);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(147, 25, 125, 207);
		panel3.add(scrollPane2);

		table2 = new JTable();
		table2.setModel(new DefaultTableModel(new Object[][] { { "ADS1408" }, { "ICM-20789" }, { "ICM-42605" },
				{ "ICM-20948" }, { "CH-201" }, { "" }, { null }, }, new String[] { "" }));
		scrollPane2.setViewportView(table2);

		JLabel lblCandidateSelected = new JLabel("Candidate Selected:");
		lblCandidateSelected.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCandidateSelected.setBounds(467, 11, 155, 13);
		panel3.add(lblCandidateSelected);

		JScrollPane scrollPane4_1 = new JScrollPane();
		scrollPane4_1.setBounds(320, 25, 125, 207);
		panel3.add(scrollPane4_1);

		table3 = new JTable();
		table3.setModel(new DefaultTableModel(new Object[][] { { null }, }, new String[] { "" }));
		scrollPane4_1.setViewportView(table3);

		JButton btnInComponent = new JButton("Integrate components");
		btnInComponent.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				page3_1 = new Page3_1();
				Page3_1.main(null);
				page3_1.setVisible(true);
				panel3.setVisible(false);
				frame.dispose();
			}
		});
		btnInComponent.setBounds(11, 280, 186, 23);
		panel3.add(btnInComponent);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
				Page3 window = new Page3();
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


