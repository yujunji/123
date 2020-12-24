/*
 * 用户应聘兼职.java
 *
 * Created on __DATE__, __TIME__
 */

package cilent.gui;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import cilent.Core;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class 用户应聘兼职 extends javax.swing.JFrame {
	private String workinfo;
	private String USID;
	private String WORKID;
	private String chat="null";
	private String epid="null";
	/** Creates new form 用户应聘兼职 */
	public 用户应聘兼职(String tmp,String USID) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(用户应聘兼职.class.getResource("/img/\u5FAE\u4FE1\u56FE\u7247tb.jpg")));
		setBounds(new Rectangle(560, 110, 0, 0));
		initComponents();
		this.workinfo=tmp;
		this.USID=USID;
		String text = 
		"<html>工作名称:"+workinfo.split(",")[1]
		+"<br>工作岗位:"+workinfo.split(",")[2]
		+"<br>职位详细:"+workinfo.split(",")[3]
		+"</html>";
		jLabel2.setText(text);
		chat=Core.agetchat(USID).replace(",", "\n");
		epid=workinfo.split(",")[5];
		System.out.println(tmp);
		WORKID=workinfo.split(",")[0];
		textArea.setText(chat);;
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
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setFont(new Font("黑体", Font.PLAIN, 20));
		jPanel3 = new javax.swing.JPanel();
		jTextField1 = new java.awt.TextField();
		jButton2 = new javax.swing.JButton();
		jButton2.setFont(new Font("黑体", Font.PLAIN, 20));
		jButton2.setBackground(new Color(0, 153, 102));
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Core.APWork(WORKID+","+USID);
				JOptionPane.showMessageDialog(null, "SUCCESS", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new Color(0, 204, 153));

		jLabel2.setText("\u804c\u4f4d\u8be6\u60c5");
		jLabel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 204, 153), null, null, null));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
					.addGap(46))
		);
		jPanel2.setLayout(jPanel2Layout);

		jPanel3.setBackground(new Color(255, 255, 255));

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				textField1ActionPerformed(evt);
			}
		});
		
		textArea = new JTextArea();
		textArea.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 204, 153), null, null, null));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(49)
					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addGap(88))
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
		);
		jPanel3.setLayout(jPanel3Layout);

		jButton2.setForeground(new Color(255, 255, 255));
		jButton2.setText("\u7533\u8bf7\u5c97\u4f4d");
		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(new Color(0, 153, 102));
		jButton1.setFont(new Font("黑体", Font.PLAIN, 20));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(USID+",0,"+jTextField1.getText());
				if (Core.addchat(USID+",0,用户说:"+jTextField1.getText()).equals("true")) {
					jTextField1.setText("");
					chat=Core.agetchat(USID).replace(",", "\n");
					textArea.setText(chat);
				}else {
					JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
				jButton1.setForeground(new Color(255, 255, 255));
				jButton1.setText("\u53d1\u9001");
		
		lblNewLabel = new JLabel("\u517C\u804C\u5E73\u53F0");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华文彩云", Font.PLAIN, 36));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					.addGap(118)
					.addComponent(jButton2)
					.addPreferredGap(ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
					.addComponent(jButton1)
					.addGap(98))
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(715, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jPanel3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButton2)
						.addComponent(jButton1))
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 795, Short.MAX_VALUE)
					.addGap(1))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 537, Short.MAX_VALUE)
					.addGap(1))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param works the command line arguments
	 */
	public static void main(final String works,final String USERID) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 用户应聘兼职(works,USERID).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private java.awt.TextField jTextField1;
	private JTextArea textArea;
	private JLabel lblNewLabel;
}