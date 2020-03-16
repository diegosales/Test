package org.gunnm.aadl.commentreporting.handlers;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class Page2_3  {
	private JPanel panel2;
	private JFrame page2;
	private JTable table;
	private JTextField textField;


	/**
	 * @wbp.parser.entryPoint
	 */
	public Page2_3() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		page2 = new JFrame();
		page2.setTitle("Create a new device");
		page2.setBounds(100, 100, 637, 353);
		page2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		page2.getContentPane().setLayout(null);


		panel2 = new JPanel();
		panel2.setBounds(0, 0, 621, 314);
		page2.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(true);

		JLabel lblNewLabel = new JLabel("Define features:");
		lblNewLabel.setBounds(10, 11, 155, 13);
		panel2.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 601, 94);
		panel2.add(scrollPane);

		table = new JTable();
		table.setForeground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
				new String[] { "       Name", "       Type", "         MCM", "   Interface", "   Protocol",
						"      Data" }));
		scrollPane.setViewportView(table);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(522, 280, 89, 23);
		panel2.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(419, 280, 89, 23);
		panel2.add(btnReturn);

		JButton btnNewButton = new JButton("Edit Device");
		btnNewButton.setBounds(10, 280, 89, 23);
		panel2.add(btnNewButton);

		JLabel lblDefineProperties = new JLabel("Define Properties:");
		lblDefineProperties.setBounds(10, 131, 155, 13);
		panel2.add(lblDefineProperties);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(10, 144, 601, 130);
		panel2.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Timing", null, panel, null);

		JLabel lblNewLabel_1 = new JLabel("Period (ms):");
		panel.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);

		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JSpinner spinner = new JSpinner();
		panel.add(spinner);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					Page2_3 window = new Page2_3();
				window.page2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
	}

