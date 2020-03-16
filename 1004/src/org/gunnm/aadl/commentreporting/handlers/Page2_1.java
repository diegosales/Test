package org.gunnm.aadl.commentreporting.handlers;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Page2_1  {
	private JPanel panel2_1;
	private JFrame frame;
	private JTable table;
	private JTable table_2;
	private JTextField textField;
	private JTable table_3;
	Page2_2 page2_2;
	Page2 page2;
	/**
	 * @wbp.parser.entryPoint
	 */
	public Page2_1() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Create a new device");
		frame.setBounds(100, 100, 637, 353);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel2_1 = new JPanel();
		panel2_1.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel2_1);
		panel2_1.setLayout(null);
		panel2_1.setVisible(true);

		JLabel lblNewLabel = new JLabel("Define features:");
		lblNewLabel.setBounds(10, 128, 155, 13);
		panel2_1.add(lblNewLabel);

		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				page2_2 = new Page2_2();
				Page2_2.main(null);
				page2_2.setVisible(true);
				panel2_1.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel2_1.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(419, 280, 89, 23);
		panel2_1.add(btnReturn);

		JLabel lblNewLabel_1 = new JLabel("Which requirement is covered?");
		lblNewLabel_1.setBounds(10, 11, 248, 14);
		panel2_1.add(lblNewLabel_1);

		JButton btnReturn_1 = new JButton(">>");
		btnReturn_1.setBounds(288, 64, 49, 23);
		panel2_1.add(btnReturn_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 30, 250, 87);
		panel2_1.add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, }, new String[] { "" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		scrollPane.setViewportView(table);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(361, 30, 250, 87);
		panel2_1.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(
				new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, }, new String[] { "" }));
		scrollPane_2.setViewportView(table_2);

		JLabel lblRequirementsSelected = new JLabel("Requirements Selected:");
		lblRequirementsSelected.setBounds(339, 12, 155, 13);
		panel2_1.add(lblRequirementsSelected);

		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 152, 46, 14);
		panel2_1.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(86, 152, 169, 20);
		panel2_1.add(textField);

		JLabel lblNewLabel_1_1_1 = new JLabel("Type:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 186, 46, 14);
		panel2_1.add(lblNewLabel_1_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Sensor", "Actuator", "System" }));
		comboBox.setBounds(86, 183, 169, 22);
		panel2_1.add(comboBox);

		JLabel lblNewLabel_1_3 = new JLabel("Interface:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 219, 77, 14);
		panel2_1.add(lblNewLabel_1_3);

		JComboBox comboBox_interface = new JComboBox();
		comboBox_interface
				.setModel(new DefaultComboBoxModel(new String[] { "Input Event ", "Out Event", "Input", "Output" }));
		comboBox_interface.setBounds(86, 216, 169, 22);
		panel2_1.add(comboBox_interface);

		JButton btnReturn_1_1 = new JButton(">>");
		btnReturn_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnReturn_1_1.setBounds(284, 244, 53, 22);
		panel2_1.add(btnReturn_1_1);

		JLabel lblNewLabel_1_3_1 = new JLabel("Buss:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(10, 244, 77, 14);
		panel2_1.add(lblNewLabel_1_3_1);

		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(361, 152, 250, 117);
		panel2_1.add(scrollPane_2_1);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "  Name", "   Type", "Interface", "  Buss" }));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(76);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(71);
		scrollPane_2_1.setViewportView(table_3);

		JComboBox comboBox_buss = new JComboBox();
		comboBox_buss
				.setModel(new DefaultComboBoxModel(new String[] { "I2C", "SPI", "Serial", "PWM", "CANBUS", "RS422" }));
		comboBox_buss.setBounds(86, 244, 169, 22);
		panel2_1.add(comboBox_buss);

		JButton btnReturn_1_1_1 = new JButton(">>");
		btnReturn_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnReturn_1_1_1.setBounds(284, 216, 53, 22);
		panel2_1.add(btnReturn_1_1_1);

		JButton btnReturn_1_1_2 = new JButton(">>");
		btnReturn_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnReturn_1_1_2.setBounds(284, 183, 53, 22);
		panel2_1.add(btnReturn_1_1_2);

		JButton btnReturn_1_1_3 = new JButton(">>");
		btnReturn_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnReturn_1_1_3.setBounds(284, 152, 53, 22);
		panel2_1.add(btnReturn_1_1_3);

		JButton btnNewButton = new JButton("New Requirement");
		btnNewButton.setBounds(10, 280, 135, 23);
		panel2_1.add(btnNewButton);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					Page2_1 window = new Page2_1();
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

