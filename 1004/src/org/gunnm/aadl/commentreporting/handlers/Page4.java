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

public class Page4  {
	private JPanel panel4;
	private JPanel panel3;
	private JFrame frame;
	private JLabel lblDevicesFromLibrary;
	private JTable table1;
	private JTable table2;
	private JTable table3;
	private JTable table4;
	// private JLabel selectedLabel;
	Page3 page3;
	Page5 page5;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page4() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Interface Compatibility");
		frame.setBounds(100, 100, 633, 349);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// selectedLabel = new JLabel();
		// selectedLabel.add(selectedLabel, BorderLayout.SOUTH);


		panel4 = new JPanel();
		panel4.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(true);

		lblDevicesFromLibrary = new JLabel("Actual Device Interface:");
		lblDevicesFromLibrary.setBounds(10, 11, 155, 13);
		panel4.add(lblDevicesFromLibrary);

		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 25, 125, 207);
		panel4.add(scrollPane1);

		table1 = new JTable();
		scrollPane1.setViewportView(table1);
		table1.setModel(new DefaultTableModel(new Object[][] { { "MPU6500" }, { "Buss:I2c" }, { "int" },
				{ "POWERpower" }, { "COMPASS" }, { "Buss:I2c" }, { "power" }, { null }, { null }, { null }, },
				new String[] { "" }));

//		tree_dev.getSelectionModel().addTreeSelectionListener(e -> {
//			DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree_dev.getLastSelectedPathComponent();
//			lblDevicesFromLibrary.setText(selectedNode.getUserObject().toString());
//		});

		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				page5 = new Page5();
				Page5.main(null);
				page5.setVisible(true);
				panel4.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel4.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page3 = new Page3();
				Page3.main(null);
				page3.setVisible(true);
				panel4.setVisible(false);
				frame.dispose();

			}
		});
		btnReturn.setBounds(419, 280, 89, 23);
		panel4.add(btnReturn);

		JLabel lblLibraryDevice = new JLabel("Candidate Device Interface:");
		lblLibraryDevice.setBounds(149, 11, 155, 13);
		panel4.add(lblLibraryDevice);

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
		panel4.add(btnNewButton);


		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(317, 25, 125, 207);
		panel4.add(scrollPane3);

		table3 = new JTable();
		table3.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "" }));
		scrollPane3.setViewportView(table3);

		JLabel lblSelectedInterface = new JLabel("Actual Selected:");
		lblSelectedInterface.setBounds(321, 11, 155, 13);
		panel4.add(lblSelectedInterface);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(147, 25, 125, 207);
		panel4.add(scrollPane2);

		table2 = new JTable();
		table2.setModel(new DefaultTableModel(new Object[][] { { "MPU9250" }, { "Buss::i2c" }, { "Buss::spi" },
				{ "int" }, { "power" }, { null }, { null }, { null }, { null }, { null }, }, new String[] { "" }));
		scrollPane2.setViewportView(table2);

		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(467, 25, 125, 207);
		panel4.add(scrollPane4);

		table4 = new JTable();
		table4.setModel(new DefaultTableModel(new Object[][] {}, new String[] { ""
			}
		));
		scrollPane4.setViewportView(table4);

		JLabel lblCandidateSelected = new JLabel("Candidate Selected:");
		lblCandidateSelected.setBounds(467, 11, 155, 13);
		panel4.add(lblCandidateSelected);

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
		panel4.add(btnNewButton_4);

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
		panel4.add(btnNewButton_3);

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
		panel4.add(btnNewButton_2);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
				Page4 window = new Page4();
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

