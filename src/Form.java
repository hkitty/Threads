import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Thu Dec 08 14:12:47 EET 2016
 */

public class Form extends JPanel {
	public Form() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		this.button1.setText("Stop");
		this.button2.setEnabled(true);
	}

	private void button2ActionPerformed(ActionEvent e) {
		PausableTask task = new PausableTask(currentTask);
		this.vec.add(task);
		task.start();
		currentTask++;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Alan Walker
		panelMain = new JPanel();
		button1 = new JButton();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();

		//======== panelMain ========
		{

			// JFormDesigner evaluation mark
			panelMain.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panelMain.getBorder())); panelMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panelMain.setLayout(new FormLayout(
				"7*(default, $lcgap), default",
				"default, $lgap, 111dlu, $lgap, default"));

			//---- button1 ----
			button1.setText("Start");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
					button1ActionPerformed(e);
				}
			});
			panelMain.add(button1, CC.xywh(1, 1, 15, 1));

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(textPane1);
			}
			panelMain.add(scrollPane1, CC.xywh(1, 2, 15, 2));

			//---- button2 ----
			button2.setText("Thread");
			button2.setEnabled(false);
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button2ActionPerformed(e);
				}
			});
			panelMain.add(button2, CC.xy(1, 5));

			//---- button3 ----
			button3.setText("Done");
			panelMain.add(button3, CC.xy(5, 5));

			//---- button4 ----
			button4.setText("Continue");
			panelMain.add(button4, CC.xy(11, 5));

			//---- button5 ----
			button5.setText("Suspend");
			panelMain.add(button5, CC.xy(15, 5));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("App");
		frame.setContentPane(new Form().panelMain);
		frame.pack();
		frame.setVisible(true);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Alan Walker
	private JPanel panelMain;
	private JButton button1;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	private Vector<PausableTask> vec = new Vector<PausableTask>();
	private int currentTask = 1;
}
