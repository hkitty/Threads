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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Alan Walker
		button1 = new JButton();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new FormLayout(
			"7*(default, $lcgap), default",
			"default, $lgap, 111dlu, $lgap, default"));

		//---- button1 ----
		button1.setText("Stop");
		add(button1, CC.xywh(1, 1, 15, 1));

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(textPane1);
		}
		add(scrollPane1, CC.xywh(1, 2, 15, 2));

		//---- button2 ----
		button2.setText("Thread");
		add(button2, CC.xy(1, 5));

		//---- button3 ----
		button3.setText("Done");
		add(button3, CC.xy(5, 5));

		//---- button4 ----
		button4.setText("Continue");
		add(button4, CC.xy(11, 5));

		//---- button5 ----
		button5.setText("Suspend");
		add(button5, CC.xy(15, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Alan Walker
	private JButton button1;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
