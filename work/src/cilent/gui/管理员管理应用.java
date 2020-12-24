/*
 * 管理员管理应用.java
 *
 * Created on __DATE__, __TIME__
 */

package cilent.gui;
import java.awt.event.ActionListener;

import cilent.Core;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class 管理员管理应用 extends javax.swing.JFrame {
	String work1,w1id,epid1;
	String work2,w2id,epid2;
	String tmp;
	/** Creates new form 管理员管理应用 */
	public 管理员管理应用() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(管理员管理应用.class.getResource("/img/\u5FAE\u4FE1\u56FE\u7247tb.jpg")));
		setBounds(new Rectangle(560, 110, 0, 0));
		tmp = Core.readworkInfo("Go");
		init(tmp);
		initComponents();
	}
	private void init(String tmp) {
		System.out.println(tmp);
		if (tmp.equals("ERROR")) {
			System.err.println("No");
		}else {
		String works[] = tmp.split("下一个");
		System.out.println(works.length);
		try {
		work1 = 
				"<html>公司名称:" + works[0].split(",")[1]
				+ "<br>工作名称:"+works[0].split(",")[0]
				+"<br>工作岗位:"+works[0].split(",")[2]
				+"<br>职位详细:"+works[0].split(",")[3]
				+"<br>工作ID:"+works[0].split(",")[4]	
				+"<br>雇主ID:"+works[0].split(",")[5]	
				+"</html>";
		w1id=works[0].split(",")[4];
		epid1=works[0].split(",")[5];
		work2 = 
				"<html>公司名称:" + works[1].split(",")[1]
				+"<br>工作名称:"+works[1].split(",")[0]
				+"<br>工作岗位:"+works[1].split(",")[2]
				+"<br>职位详细:"+works[1].split(",")[3]
				+"<br>工作ID:"+works[1].split(",")[4]	
				+"<br>雇主ID:"+works[1].split(",")[5]	
				+"</html>";
		w2id=works[1].split(",")[4];
		epid2=works[1].split(",")[5];
		} catch (ArrayIndexOutOfBoundsException e) {
			if (works.length==1) {
				work2 = "空";
			}else if (works.length==0) {
				work2 = "空";
				work1 = "空";
			}
			e.printStackTrace();
		}
		}
	}
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBorder(null);
		jPanel1.setForeground(new Color(255, 255, 255));
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Core.passworkInfo(w1id).equals("true")) {
					JOptionPane.showMessageDialog(null, "已通过", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
					init(Core.readworkInfo("Go"));
					jLabel1.setText(work1);
					jLabel2.setText(work2);
				}else {
					JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		jButton3 = new javax.swing.JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Core.delworkInfo(w1id).equals("true")) {
					JOptionPane.showMessageDialog(null, "已删除", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
					init(Core.readworkInfo("Go"));
					jLabel1.setText(work1);
					jLabel2.setText(work2);
				}else {
					JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		jButton5 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jPanel4.setForeground(new Color(102, 255, 153));
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(1, 0, 419, 139);
		jPanel3 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Core.delworkInfo(w2id).equals("true")) {
					JOptionPane.showMessageDialog(null, "已删除", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
					init(Core.readworkInfo("Go"));
					jLabel1.setText(work1);
					jLabel2.setText(work2);
				}else {
					JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		jButton10 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jPanel5.setForeground(new Color(153, 204, 153));
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setBounds(1, 0, 418, 135);
		jButton4 = new javax.swing.JButton();
		jButton4.setBackground(new Color(255, 255, 255));
		jLabel1.setText(work1);
		jLabel2.setText(work2);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(102, 102, 255));

		jPanel1.setBackground(new Color(0, 204, 153));

		jButton1.setBackground(new Color(0, 153, 102));
		jButton1.setFont(new java.awt.Font("黑体", 0, 18));
		jButton1.setForeground(new Color(255, 255, 255));
		jButton1.setText("\u641c\u7d22");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPanel2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jButton2.setBackground(new java.awt.Color(51, 255, 0));
		jButton2.setFont(new java.awt.Font("黑体", 0, 18));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u901a\u8fc7\u7533\u8bf7");

		jButton3.setBackground(new java.awt.Color(255, 51, 51));
		jButton3.setFont(new java.awt.Font("黑体", 0, 18));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u5220\u9664\u53d1\u5e03");

		jButton5.setBackground(new java.awt.Color(0, 153, 102));
		jButton5.setFont(new java.awt.Font("黑体", 0, 18));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u4e0e\u5546\u5bb6\u5bf9\u8bdd");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jPanel4.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setFont(new java.awt.Font("黑体", 0, 18));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jButton2)
							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
							.addComponent(jButton3))
						.addComponent(jButton5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(16)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jButton3)
								.addComponent(jButton2))
							.addGap(18)
							.addComponent(jButton5)))
					.addContainerGap())
		);
		jPanel4.setLayout(null);
		jPanel4.add(jLabel1);
		jPanel2.setLayout(jPanel2Layout);

		jPanel3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jButton7.setBackground(new java.awt.Color(102, 255, 51));
		jButton7.setFont(new java.awt.Font("黑体", 0, 18));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u901a\u8fc7\u7533\u8bf7");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(255, 51, 51));
		jButton8.setFont(new java.awt.Font("黑体", 0, 18));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u5220\u9664\u53d1\u5e03");

		jButton10.setBackground(new java.awt.Color(0, 153, 102));
		jButton10.setFont(new java.awt.Font("黑体", 0, 18));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u4e0e\u5546\u5bb6\u5bf9\u8bdd");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jPanel5.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel2.setBackground(new java.awt.Color(255, 255, 255));
		jLabel2.setFont(new java.awt.Font("黑体", 0, 18));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addComponent(jButton7)
							.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
							.addComponent(jButton8))
						.addComponent(jButton10, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(16)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jButton8)
								.addComponent(jButton7))
							.addGap(18)
							.addComponent(jButton10)))
					.addContainerGap())
		);
		jPanel5.setLayout(null);
		jPanel5.add(jLabel2);
		jPanel3.setLayout(jPanel3Layout);

		jButton4.setFont(new java.awt.Font("黑体", 0, 18));
		jButton4.setForeground(new Color(0, 204, 153));
		jButton4.setText("\u5e7f\u544a\u53d1\u5e03");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		
		btnNewButton = new JButton("\u5237\u65B0");
		btnNewButton.setFont(new Font("黑体", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 153, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init(Core.readworkInfo("Go"));
				jLabel1.setText(work1);
				jLabel2.setText(work2);
			}
		});
		
		lblNewLabel = new JLabel("\u517C\u804C\u5E73\u53F0");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("华文彩云", Font.PLAIN, 36));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(管理员管理应用.class.getResource("/img/3.png")));
		
		btnNewButton_1 = new JButton("\u9000\u51FA\u767B\u5F55");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				登陆界面.main(null);
			     dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 153, 102));
		btnNewButton_1.setFont(new Font("黑体", Font.PLAIN, 18));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(36)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton)
									.addGap(18)
									.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(jPanel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jPanel2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1, Alignment.LEADING))))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addGap(534)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGap(66))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(74)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(21))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 828, Short.MAX_VALUE)
					.addGap(1))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		广告界面.main(null);
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		管理员与商家对话.main(epid2);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		管理员与商家对话.main(epid1);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		if (Core.passworkInfo(w2id).equals("true")) {
			JOptionPane.showMessageDialog(null, "已通过", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			init(Core.readworkInfo("Go"));
			jLabel1.setText(work1);
			jLabel2.setText(work2);
		}else {
			JOptionPane.showMessageDialog(null, "操作失败", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		管理员搜索.main(Core.searchwork(jFormattedTextField1.getText()));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 管理员管理应用().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JFormattedTextField jFormattedTextField1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
}