package org.gunnm.aadl.commentreporting.handlers;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Page3_1  {
	private JPanel panel3;
	private JFrame page3;
	private JTable table;
	private JTable table_1;


	/**
	 * @wbp.parser.entryPoint
	 */
	public Page3_1() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		page3 = new JFrame();
		page3.setTitle("Integrate Software Components");
		page3.setBounds(100, 100, 633, 349);
		page3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		page3.getContentPane().setLayout(null);


		panel3 = new JPanel();
		panel3.setBounds(0, 0, 621, 314);
		page3.getContentPane().add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(true);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(522, 280, 89, 23);
		panel3.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(419, 280, 89, 23);
		panel3.add(btnReturn);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Create a new Software Component");
		chckbxNewCheckBox.setBounds(10, 280, 328, 23);
		panel3.add(chckbxNewCheckBox);

		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(477, 28, 125, 207);
		panel3.add(scrollPane4);

		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(342, 28, 125, 207);
		panel3.add(scrollPane3);

		JButton btnNewButton_3 = new JButton("<<");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_3.setBounds(384, 246, 55, 23);
		panel3.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("<<");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_4.setBounds(505, 246, 55, 23);
		panel3.add(btnNewButton_4);

		JButton btnNewButton_2 = new JButton(">>");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setBounds(220, 246, 55, 23);
		panel3.add(btnNewButton_2);

		JButton btnNewButton = new JButton(">>");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(45, 246, 55, 23);
		panel3.add(btnNewButton);

		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 28, 125, 207);
		panel3.add(scrollPane1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { ""
			}
		));
		scrollPane1.setViewportView(table);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(147, 28, 185, 207);
		panel3.add(scrollPane2);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { "p_senact", "t_transformation" }, { "p_senact", "t_behaviorest" },
						{ "p_senact", "t_fusion" }, { "p_control", "t_control" }, },
				new String[] { "    Process", "    Threads"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(71);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(91);
		scrollPane2.setViewportView(table_1);

		JLabel lblActualSoftwareBinding = new JLabel("Actual Software Binding:");
		lblActualSoftwareBinding.setBounds(147, 14, 155, 13);
		panel3.add(lblActualSoftwareBinding);

		JLabel lblCandidateDevice = new JLabel("Candidate Device:");
		lblCandidateDevice.setBounds(10, 14, 155, 13);
		panel3.add(lblCandidateDevice);

		JLabel lblCandidateDevice_1 = new JLabel("Candidate Device:");
		lblCandidateDevice_1.setBounds(342, 14, 155, 13);
		panel3.add(lblCandidateDevice_1);

		JLabel lblSoftwareIntegrated = new JLabel("Software Integrated:");
		lblSoftwareIntegrated.setBounds(477, 14, 155, 13);
		panel3.add(lblSoftwareIntegrated);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					Page3_1 window = new Page3_1();
				window.page3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
	}

