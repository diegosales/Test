package org.gunnm.aadl.commentreporting.handlers;


import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class Page6  {
	private JPanel panel5;
	private JFrame page5;


	/**
	 * @wbp.parser.entryPoint
	 */
	public Page6() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		page5 = new JFrame();
		page5.setTitle("Architectural Quality Attributes");
		page5.setBounds(100, 100, 637, 353);
		page5.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		page5.getContentPane().setLayout(null);


		panel5 = new JPanel();
		panel5.setBounds(0, 0, 621, 314);
		page5.getContentPane().add(panel5);
		panel5.setLayout(null);
		panel5.setVisible(true);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(522, 280, 89, 23);
		panel5.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(419, 280, 89, 23);
		panel5.add(btnReturn);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 30, 296, 105);
		panel5.add(scrollPane_1);

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(316, 30, 296, 105);
		panel5.add(scrollPane_1_1);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
				Page6 window = new Page6();
				window.page5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
	}

