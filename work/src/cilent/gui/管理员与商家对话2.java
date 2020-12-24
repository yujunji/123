/*
 * 管理员与商家对话.java
 *
 * Created on __DATE__, __TIME__
 */

package cilent.gui;
import javax.swing.JTextArea;

import cilent.Core;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

/**
 *
 * @author  __USER__
 */
public class 管理员与商家对话2 extends javax.swing.JFrame {
	private String EPID="-1";
	private String chat="null";
	/** Creates new form 管理员与商家对话 */
	public 管理员与商家对话2(String EPID) {
		setBounds(new Rectangle(560, 110, 0, 0));
		this.EPID = EPID;
		initComponents();
		chat=Core.agetchat(EPID).replace(",", "\n");
		textArea.setText(chat);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(EPID+",0,"+jTextField1.getText());
				if (Core.addchat(EPID+",0,商家说:"+jTextField1.getText()).equals("true")) {
					jTextField1.setText("");
					chat=Core.agetchat(EPID).replace(",", "\n");
					textArea.setText(chat);
				}else {
					JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new Color(0, 204, 153));
		
		textArea = new JTextArea();

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel2.setLayout(jPanel2Layout);

		jButton1.setBackground(new Color(0, 153, 102));
		jButton1.setFont(new java.awt.Font("黑体", 0, 18));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u53d1\u9001");

		jLabel1.setFont(new Font("黑体", Font.PLAIN, 28));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u5BF9\u8BDD");
		
		lblNewLabel = new JLabel("\u517C\u804C\u5E73\u53F0");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华文彩云", Font.PLAIN, 36));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(管理员与商家对话2.class.getResource("/img/3.png")));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(317)
							.addComponent(jLabel1))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel_1))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(39)
							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(49)
							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(jLabel1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(lblNewLabel_1)
					.addGap(91))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 710, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(final String args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 管理员与商家对话2(args).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextArea textArea;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
}