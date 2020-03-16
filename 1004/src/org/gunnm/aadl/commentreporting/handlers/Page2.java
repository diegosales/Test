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
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Page2  {
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel2_1;
	private JPanel panel3;
	// private JFrame frame3;
	// private JFrame page2;
	private JLabel lblDevicesFromLibrary;
	private JTable table_2;
	Page3 page3;
	Page1 page1;
	Page2 page2;
	Page2_1 page2_1;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page2() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Chose subcomponents to analyse");
		frame.setBounds(100, 100, 637, 353);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		panel2 = new JPanel();
		panel2.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(true);

		JLabel lblNewLabel = new JLabel("Actual Architeture Model:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 155, 13);
		panel2.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 239, 232);
		panel2.add(scrollPane);

		JTree tree_dev = new JTree();
		tree_dev.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("System Implementation") {
			{
				DefaultMutableTreeNode node_1;
				DefaultMutableTreeNode node_2;
				node_1 = new DefaultMutableTreeNode("System1");
				node_2 = new DefaultMutableTreeNode("Sensors");
				node_2.add(new DefaultMutableTreeNode("MPU6500"));
				node_2.add(new DefaultMutableTreeNode("Compass"));
				node_2.add(new DefaultMutableTreeNode("NEO8N"));
				node_2.add(new DefaultMutableTreeNode("Pitot"));
				node_2.add(new DefaultMutableTreeNode("New Sensor"));
				node_1.add(node_2);
				node_2 = new DefaultMutableTreeNode("Acturators");
				node_2.add(new DefaultMutableTreeNode("MG995"));
				node_2.add(new DefaultMutableTreeNode("ESC1"));
				node_2.add(new DefaultMutableTreeNode("ESC2"));
				node_2.add(new DefaultMutableTreeNode("ESC3"));
				node_2.add(new DefaultMutableTreeNode("New Actuator"));
				node_1.add(node_2);
				node_2 = new DefaultMutableTreeNode("Subsystems");
				node_2.add(new DefaultMutableTreeNode("Sonar"));
				node_2.add(new DefaultMutableTreeNode("RTK"));
				node_2.add(new DefaultMutableTreeNode("LiDar"));
				node_2.add(new DefaultMutableTreeNode("TxRx Ground"));
				node_2.add(new DefaultMutableTreeNode("New Subsystem"));
				node_1.add(node_2);
				add(node_1);
				node_1 = new DefaultMutableTreeNode("System2");
				node_2 = new DefaultMutableTreeNode("Sensors");
				node_2.add(new DefaultMutableTreeNode("MPU6500"));
				node_2.add(new DefaultMutableTreeNode("Compass"));
				node_2.add(new DefaultMutableTreeNode("NEO8N"));
				node_2.add(new DefaultMutableTreeNode("Pitot"));
				node_2.add(new DefaultMutableTreeNode("New Sensor"));
				node_1.add(node_2);
				node_2 = new DefaultMutableTreeNode("Acturators");
				node_2.add(new DefaultMutableTreeNode("MG995"));
				node_2.add(new DefaultMutableTreeNode("ESC1"));
				node_2.add(new DefaultMutableTreeNode("ESC2"));
				node_2.add(new DefaultMutableTreeNode("ESC3"));
				node_2.add(new DefaultMutableTreeNode("New Actuator"));
				node_1.add(node_2);
				node_2 = new DefaultMutableTreeNode("Subsystems");
				node_2.add(new DefaultMutableTreeNode("Sonar"));
				node_2.add(new DefaultMutableTreeNode("RTK"));
				node_2.add(new DefaultMutableTreeNode("LiDar"));
				node_2.add(new DefaultMutableTreeNode("TxRx Ground"));
				node_2.add(new DefaultMutableTreeNode("New Subsystem"));
				node_1.add(node_2);
				add(node_1);
			}
			}
		));

		tree_dev.addTreeSelectionListener(tse -> {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree_dev.getLastSelectedPathComponent();
			DefaultTableModel model2 = (DefaultTableModel) table_2.getModel();

			String indexs2 = node.toString();
			// model2.addColumn(indexs2);
			model2.addRow(new Object[] { indexs2, 0 });

		});
		scrollPane.setViewportView(tree_dev);

		lblDevicesFromLibrary = new JLabel("Device Selected:");
		lblDevicesFromLibrary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDevicesFromLibrary.setBounds(341, 11, 155, 13);
		panel2.add(lblDevicesFromLibrary);

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(340, 26, 258, 232);
		panel2.add(scrollPane_1_1);

		table_2 = new JTable();
		table_2.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "" }));
		scrollPane_1_1.setViewportView(table_2);

		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page3 = new Page3();
				Page3.main(null);
				page3.setVisible(true);
				panel2.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel2.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page1 = new Page1();
				Page1.main(null);
				page1.setVisible(true);
				panel1.setVisible(true);
				panel2.setVisible(false);
				page2.setVisible(false);
				frame.dispose();

			}
		});
		btnReturn.setBounds(419, 280, 89, 23);
		panel2.add(btnReturn);

		JButton btnSelected = new JButton(">>");
		btnSelected.setBounds(259, 132, 61, 23);
		panel2.add(btnSelected);

		JButton btnNewDevice = new JButton("New device");
		btnNewDevice.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				page2_1 = new Page2_1();
				Page2_1.main(null);
				page2_1.setVisible(true);
				panel2.setVisible(false);
				frame.dispose();
			}
		});
		btnNewDevice.setBounds(10, 280, 110, 23);
		panel2.add(btnNewDevice);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					Page2 window = new Page2();
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

