/**
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                    Version 2, December 2004
 *
 * Copyright (C) 2004 Sam Hocevar <sam@hocevar.net>
 *
 * Everyone is permitted to copy and distribute verbatim or modified
 * copies of this license document, and changing it is allowed as long
 * as the name is changed.
 *
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *  0. You just DO WHAT THE FUCK YOU WANT TO.
 */

package org.gunnm.aadl.commentreporting.handlers;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */


public class Page1 extends AbstractHandler {

	private JFrame frame;
	private File selectedFile;
	private JPanel panel1;
	private JTextField textField;
	private JButton btnNext;

	Page2 page2;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Page1() {
		initialize();
	}

	private void initialize() {
		JFrame frame = new JFrame();
		frame.setTitle("Device Compatibility");
		frame.setBounds(100, 100, 637, 353);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		panel1 = new JPanel();
		panel1.setBounds(0, 0, 621, 314);
		frame.getContentPane().add(panel1);
		panel1.setVisible(true);
		panel1.setLayout(null);

		JLabel lblSelectAadlFile = new JLabel("Select Reqspecs File :");
		lblSelectAadlFile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectAadlFile.setBounds(10, 146, 135, 14);
		panel1.add(lblSelectAadlFile);

		textField = new JTextField();
		textField.setBounds(20, 103, 334, 32);
		panel1.add(textField);
		textField.setColumns(10);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showSaveDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					selectedFile = fileChooser.getSelectedFile();
					textField.setText(selectedFile.getPath());

				}

			}
		});
		btnBrowse.setBounds(380, 41, 89, 23);
		panel1.add(btnBrowse);

		btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				page2 = new Page2();
				Page2.main(null);
				page2.setVisible(true);
				frame.setVisible(false);
				panel1.setVisible(false);
				frame.dispose();
			}
		});
		btnNext.setBounds(522, 280, 89, 23);
		panel1.add(btnNext);

		JLabel lblSelectAadlFile_1 = new JLabel("Select AADL File :");
		lblSelectAadlFile_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectAadlFile_1.setBounds(10, 11, 114, 14);
		panel1.add(lblSelectAadlFile_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 36, 334, 32);
		panel1.add(textField_1);

		JButton btnBrowse_1 = new JButton("Browse");
		btnBrowse_1.setBounds(380, 108, 89, 23);
		panel1.add(btnBrowse_1);

		JLabel lblSelectAadlFile_2 = new JLabel("Select Library AADL File :");
		lblSelectAadlFile_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectAadlFile_2.setBounds(10, 78, 135, 14);
		panel1.add(lblSelectAadlFile_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 171, 334, 32);
		panel1.add(textField_2);

		JButton btnBrowse_2 = new JButton("Browse");
		btnBrowse_2.setBounds(380, 176, 89, 23);
		panel1.add(btnBrowse_2);


	}

	/*public void change() {
		for(sb.toString() : new ArrayList(lista))
			if()



	}*/

	/*public SampleHandler() {
	}*/

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Page1 window = new Page1();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}



	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}


}
	/*public SampleHandler() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		TextArea textArea = new TextArea();
		textArea.setBounds(25, 29, 380, 160);
		frame.getContentPane().add(textArea);
	}*/

	/*@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return null;
	}
}*/

	/*
	public static int countNb(ComponentInstance component, ComponentCategory cat) {
		List<ComponentInstance> l = component.getAllComponentInstances().stream().filter(c -> c.getCategory() == cat).collect(Collectors.toList());
		return l.size();

	}*/
	/*public static int countActAndSen(ComponentInstance component, ComponentCategory cat, FeatureCategory ftc, Device d, DeviceClassifier dc, Feature f, FeatureClassifier fc, FeatureInstance fi) {
		List<ComponentInstance> s = new ArrayList<ComponentInstance>();
		for(ComponentInstance c : component.getAllComponentInstances())
		{
			if(component instanceof Device)
			{
				s.add(c);

			}
		}
		return s.size();
	}*/
	/*public static boolean InParameter(Parameter p) {
		return p.getDirection().equals(DirectionType.IN);
	}
	public static boolean OutParameter(Parameter p) {
		return p.getDirection().equals(DirectionType.OUT);
	}*/
	/*public String getDeviceName(Device d) {
		return d.getName();
	}*/

	/*public static List<ComponentInstance> getDevices(ComponentInstance component){
		List<ComponentInstance> s;
		s = new ArrayList<ComponentInstance>();
		for(ComponentInstance ci : component.getAllComponentInstances())
		{
			if(ci instanceof Device)
			{
				s.add(ci);
			}
		}
		return s;

	}*/

//	@Override
//	public Object execute(ExecutionEvent event) throws ExecutionException {
//
//
//		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
//		IOutlineNode node = (IOutlineNode) selection.getFirstElement();
//
//		node.readOnly (state -> {
//			SystemInstance rootInstance = null;
//			EObject selectedObject = state;
//			StringBuffer output = new StringBuffer();
//			if (selectedObject instanceof SystemInstance)
//			{
//				rootInstance = (SystemInstance) selectedObject;
//			}
//
//			if (selectedObject instanceof ComponentImplementation) {
//				try {
//					rootInstance =
//							InstantiateModel.buildInstanceModelFile((ComponentImplementation)selectedObject);
//
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//					return null;
//				}
//			}
//
//			//StringBuilder sb = new StringBuilder();
//			for(ComponentInstance ci : rootInstance.getAllComponentInstances())
//			{
//				if(ci.getCategory() == ComponentCategory.DEVICE)
//				{
//					for(FeatureInstance fi : ci.getAllFeatureInstances())
//					{
//						if(fi.getDirection() == DirectionType.IN)
//						{
//							listaActuators.add(ci.getName());
//							//sb.append(ci.getName()+"-"+"Atuador"+"\n");
//						}
//						if(fi.getDirection() == DirectionType.OUT)
//						{
//							listaSensor.add(ci.getName());
//							//sb.append(ci.getName()+"-"+"Sensor"+"\n");
//
//						}
//					}
//				}
//			}
//
//			//MessageDialog.openInformation(window.getShell(), "Component Statistics", sb.toString());
//			//textArea.setText(sb.toString());
//
//
//			return null;
//		}
//
//		);
//
//		return null;
//
//	}
//}
