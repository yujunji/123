/*
 * 商家注册.java
 *
 * Created on __DATE__, __TIME__
 */

package cilent.gui;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cilent.Core;
import cilent.infor.regAdmin;
import cilent.infor.regEmployer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class 商家注册 extends javax.swing.JFrame {

	/** Creates new form 商家注册 */
	public 商家注册() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(商家注册.class.getResource("/img/\u5FAE\u4FE1\u56FE\u7247tb.jpg")));
		setBounds(new Rectangle(560, 110, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPasswordField3 = new javax.swing.JPasswordField();
		jFormattedTextField5 = new javax.swing.JFormattedTextField();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel2 = new javax.swing.JLabel();
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		jLabel4 = new javax.swing.JLabel();
		jPasswordField2 = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jFormattedTextField2 = new javax.swing.JFormattedTextField();
		jLabel6 = new javax.swing.JLabel();
		jFormattedTextField3 = new javax.swing.JFormattedTextField();
		jLabel7 = new javax.swing.JLabel();
		jFormattedTextField4 = new javax.swing.JFormattedTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton1.setForeground(new Color(255, 255, 255));
		jButton1.setBackground(new Color(0, 153, 102));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regEmployer rE = new regEmployer();
				rE.setName(jFormattedTextField1.getText());
				rE.setPw(String.copyValueOf(jPasswordField1.getPassword()));
				rE.setCname(jFormattedTextField2.getText());
				rE.setCaddress(jFormattedTextField3.getText());
				rE.setCnumber(jFormattedTextField4.getText());
				rE.setCresume(jTextField1.getText());
				String rString=Core.regE(rE.toString());
				if (rString.equals("true")) {
					JOptionPane.showMessageDialog(null,"注册成功", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,"注册失败", "MESSAGE",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		jPasswordField3.setText("jPasswordField3");

		jFormattedTextField5.setText("jFormattedTextField5");
		setBackground(new java.awt.Color(2, 26, 25));

		jPanel1.setBackground(new Color(0, 204, 153));

		jLabel1.setFont(new Font("黑体", Font.PLAIN, 36));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u5546\u5bb6\u6ce8\u518c");

		jLabel3.setFont(new java.awt.Font("黑体", 0, 24));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u5bc6\u7801");

		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("黑体", 0, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u5e10\u53f7");

		jFormattedTextField1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jFormattedTextField1ActionPerformed(evt);
					}
				});

		jLabel4.setFont(new java.awt.Font("黑体", 0, 24));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u786e\u8ba4\u5bc6\u7801");

		jLabel5.setFont(new Font("黑体", Font.PLAIN, 24));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u4f01\u4e1a\u540d\u79f0");

		jLabel6.setFont(new Font("黑体", Font.PLAIN, 24));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("\u4f01\u4e1a\u8be6\u7ec6\u5730\u5740");

		jLabel7.setFont(new Font("黑体", Font.PLAIN, 24));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("\u5de5\u5546\u6ce8\u518c\u53f7\u7801");

		jLabel8.setFont(new Font("黑体", Font.PLAIN, 24));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("\u4f01\u4e1a\u7b80\u4ecb");

		jButton1.setFont(new java.awt.Font("黑体", 0, 24));
		jButton1.setText("\u6ce8\u518c");
		
		lblNewLabel = new JLabel("\u517C\u804C\u5E73\u53F0");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华文彩云", Font.PLAIN, 36));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(商家注册.class.getResource("/img/3.png")));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(97)
									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(jLabel6)
										.addComponent(jLabel4)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
											.addComponent(jLabel3)
											.addComponent(jLabel2))
										.addComponent(jLabel5)
										.addComponent(jLabel7)))
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(131)
									.addComponent(jLabel8)))
							.addGap(18)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addComponent(jFormattedTextField1, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
								.addComponent(jFormattedTextField4, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addComponent(jFormattedTextField3)
								.addComponent(jFormattedTextField2)
								.addComponent(jPasswordField2)
								.addComponent(jPasswordField1))))
					.addGap(124))
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					.addContainerGap(308, Short.MAX_VALUE)
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(233))
				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					.addContainerGap(299, Short.MAX_VALUE)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(210))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2)
						.addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel4)
						.addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel5)
						.addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel6)
						.addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel8)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(jButton1)
					.addGap(41)
					.addComponent(lblNewLabel_1)
					.addGap(88))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 722, Short.MAX_VALUE)
					.addGap(1))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jFormattedTextField1ActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 商家注册().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JFormattedTextField jFormattedTextField1;
	private javax.swing.JFormattedTextField jFormattedTextField2;
	private javax.swing.JFormattedTextField jFormattedTextField3;
	private javax.swing.JFormattedTextField jFormattedTextField4;
	private javax.swing.JFormattedTextField jFormattedTextField5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JTextField jTextField1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	// End of variables declaration//GEN-END:variables

}