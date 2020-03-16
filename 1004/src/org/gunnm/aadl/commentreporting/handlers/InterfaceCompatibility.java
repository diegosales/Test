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
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class InterfaceCompatibility  {
	private JPanel panel4;
	private JFrame page4;
	private JLabel lblDevicesFromLibrary;
	// private JLabel selectedLabel;


	/**
	 * @wbp.parser.entryPoint
	 */
	public InterfaceCompatibility() {
		initialize();
	}

	/**
	 * Launch the application.
	 */

	public void initialize() {
		page4 = new JFrame();
		page4.setTitle("Interface Compatibility");
		page4.setBounds(100, 100, 633, 349);
		page4.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		page4.getContentPane().setLayout(null);
		// selectedLabel = new JLabel();
		// selectedLabel.add(selectedLabel, BorderLayout.SOUTH);


		panel4 = new JPanel();
		panel4.setBounds(0, 0, 621, 314);
		page4.getContentPane().add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(true);

		lblDevicesFromLibrary = new JLabel("Actual Device Interface:");
		lblDevicesFromLibrary.setBounds(10, 11, 155, 13);
		panel4.add(lblDevicesFromLibrary);

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 25, 144, 232);
		panel4.add(scrollPane_1_1);

		JTree tree_dev = new JTree();
		tree_dev.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Devices") {
			{
				DefaultMutableTreeNode node_dev;
				node_dev = new DefaultMutableTreeNode("MPU6500");
				node_dev.add(new DefaultMutableTreeNode("i2c"));
				node_dev.add(new DefaultMutableTreeNode("int"));
				node_dev.add(new DefaultMutableTreeNode("power"));
				node_dev.add(new DefaultMutableTreeNode("Data:6_axis"));
				add(node_dev);
				node_dev = new DefaultMutableTreeNode("Compass");
				node_dev.add(new DefaultMutableTreeNode("i2c"));
				node_dev.add(new DefaultMutableTreeNode("power"));
				node_dev.add(new DefaultMutableTreeNode("Data::3_axis"));
				add(node_dev);
			}
		}));
		scrollPane_1_1.setViewportView(tree_dev);

//		tree_dev.getSelectionModel().addTreeSelectionListener(e -> {
//			DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree_dev.getLastSelectedPathComponent();
//			lblDevicesFromLibrary.setText(selectedNode.getUserObject().toString());
//		});

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(522, 280, 89, 23);
		panel4.add(btnNext);

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(419, 280, 89, 23);
		panel4.add(btnReturn);

		JLabel lblLibraryDevice = new JLabel("Candidate Device Interface:");
		lblLibraryDevice.setBounds(152, 11, 155, 13);
		panel4.add(lblLibraryDevice);

		JButton btnNewButton = new JButton(">>");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TreePath path = tree_dev.getSelectionPath();
				tree_dev.getSelectionModel();
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree_dev.getLastSelectedPathComponent();

				// Container node_IntSelected = null;
				// String selectedItem = selectedNode.getUserObject().toString();
				// table.add(selectedItem, null);
				lblDevicesFromLibrary.setText(selectedNode.getUserObject().toString());

				// tree_CandSelected.parent.add(new DefaultMutableTreeNode(selectedItem);

				;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(306, 114, 54, 23);
		panel4.add(btnNewButton);


		JScrollPane scrollPane_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1.setBounds(357, 25, 122, 232);
		panel4.add(scrollPane_1_1_1_1);

		JTree tree_IntSelected = new JTree();
		tree_IntSelected.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Devices") {
			{
				DefaultMutableTreeNode node_IntSelected;
				node_IntSelected = new DefaultMutableTreeNode("MPU\t");
				node_IntSelected.add(new DefaultMutableTreeNode("interface"));
				add(node_IntSelected);
			}
		}));
		scrollPane_1_1_1_1.setViewportView(tree_IntSelected);

		JLabel lblSelectedInterface = new JLabel("Actual interface:");
		lblSelectedInterface.setBounds(357, 11, 122, 13);
		panel4.add(lblSelectedInterface);

		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(152, 25, 144, 232);
		panel4.add(scrollPane_1_1_1);

		JTree tree_devC = new JTree();
		tree_devC.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Devices") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("MPU9250");
				node_1.add(new DefaultMutableTreeNode("spi"));
				node_1.add(new DefaultMutableTreeNode("i2c"));
				node_1.add(new DefaultMutableTreeNode("power_3V3"));
				node_1.add(new DefaultMutableTreeNode("int"));
				add(node_1);
			}
		}));
		scrollPane_1_1_1.setViewportView(tree_devC);

		JScrollPane scrollPane_1_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1_1.setBounds(489, 25, 122, 232);
		panel4.add(scrollPane_1_1_1_1_1);

		JTree tree_CandSelected = new JTree();
		tree_CandSelected.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Devices") {
			{
				add(new DefaultMutableTreeNode(""));
			}
			}
		));
		scrollPane_1_1_1_1_1.setViewportView(tree_CandSelected);

		JLabel lblSelectedCandidateInterface = new JLabel("Canditate Interface:");
		lblSelectedCandidateInterface.setBounds(487, 10, 155, 13);
		panel4.add(lblSelectedCandidateInterface);
	}


		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
				InterfaceCompatibility window = new InterfaceCompatibility();
				window.page4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}
	}

