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
		
		PausableTask task1 = new PausableTask(1, thread1Button, textPane1);	
		this.vec.add(task1);
		PausableTask task2 = new PausableTask(2, thread2Button, textPane1);	
		this.vec.add(task2);
		PausableTask task3 = new PausableTask(3, thread3Button, textPane1);	
		this.vec.add(task3);
		PausableTask task4 = new PausableTask(4, thread4Button, textPane1);	
		this.vec.add(task4);
	}

//	private void button2ActionPerformed(ActionEvent e) {
//		PausableTask task = new PausableTask(currentTask);
//		this.vec.add(task);
//		task.start();
//		currentTask++;
//	}

	private void thread1ButtonActionPerformed(ActionEvent e) {
		manageThreads(thread1Button, 1);
	}

	private void thread2ButtonActionPerformed(ActionEvent e) {
		manageThreads(thread2Button, 2);
	}

	private void thread3ButtonActionPerformed(ActionEvent e) {
		manageThreads(thread3Button, 3);
	}

	private void thread4ButtonActionPerformed(ActionEvent e) {
		manageThreads(thread4Button, 4);
	}

	private void terminateButtonActionPerformed(ActionEvent e) {
		for(int i = 0; i < vec.size(); i++)
		{
			vec.elementAt(i).stop();
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Garry Moore
		panelMain = new JPanel();
		terminateButton = new JButton();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		thread1Button = new JButton();
		thread2Button = new JButton();
		thread3Button = new JButton();
		thread4Button = new JButton();

		//======== panelMain ========
		{

			// JFormDesigner evaluation mark
			panelMain.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panelMain.getBorder())); panelMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panelMain.setLayout(new FormLayout(
				"6*(default, $lcgap), default",
				"default, $lgap, 111dlu, $lgap, default"));

			//---- terminateButton ----
			terminateButton.setText("Stop");
			terminateButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					terminateButtonActionPerformed(e);
				}
			});
			panelMain.add(terminateButton, CC.xywh(1, 1, 13, 1));

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(textPane1);
			}
			panelMain.add(scrollPane1, CC.xywh(1, 2, 13, 2));

			//---- thread1Button ----
			thread1Button.setText("Thread 1");
			thread1Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					thread1ButtonActionPerformed(e);
				}
			});
			panelMain.add(thread1Button, CC.xy(1, 5));

			//---- thread2Button ----
			thread2Button.setText("Thread 2");
			thread2Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					thread2ButtonActionPerformed(e);
				}
			});
			panelMain.add(thread2Button, CC.xy(5, 5));

			//---- thread3Button ----
			thread3Button.setText("Thread 3");
			thread3Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					thread3ButtonActionPerformed(e);
				}
			});
			panelMain.add(thread3Button, CC.xy(9, 5));

			//---- thread4Button ----
			thread4Button.setText("Thread 4");
			thread4Button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					thread4ButtonActionPerformed(e);
				}
			});
			panelMain.add(thread4Button, CC.xy(13, 5));
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
	// Generated using JFormDesigner Evaluation license - Garry Moore
	private JPanel panelMain;
	private JButton terminateButton;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JButton thread1Button;
	private JButton thread2Button;
	private JButton thread3Button;
	private JButton thread4Button;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	private Vector<PausableTask> vec = new Vector<PausableTask>();
	
	private void manageThreads(JButton button, int threadNum)
	{
		if(button.getText() == "Suspend")
		{
			button.setText("Continue");
			vec.elementAt(threadNum-1).pause();
		}
		else if(button.getText() == "Continue")
		{
			button.setText("Suspend");
			vec.elementAt(threadNum-1).resume();
		}
		else if(button.getText() == "Done")
		{
			
		}
		else 
		{
			button.setText("Suspend");
			vec.elementAt(threadNum-1).start();
		}
	}
}
