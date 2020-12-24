/*
 * 商家工作管理.java
 *
 * Created on __DATE__, __TIME__
 */

package cilent.gui;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import cilent.Core;
import server.GUI;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JButton;

/**
 *
 * @author  __USER__
 */
public class 商家工作管理 extends javax.swing.JFrame {
	private String WORKID = "-1";
	private String EPID = "-1";
	private String [] applyer;
	private String [] user= {"","","","",""};
	/** Creates new form 商家工作管理 
	 * @param USERID */
	public 商家工作管理(String USERID,String EPID) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(商家工作管理.class.getResource("/img/\u5FAE\u4FE1\u56FE\u7247tb.jpg")));
		setBounds(new Rectangle(560, 110, 0, 0));
		this.WORKID = USERID;
		this.EPID = EPID;
		initComponents();
		Init();
	}
	private void Init() {
		String tmp = Core.getAPUser(WORKID);
		applyer=tmp.split(",");
		for (int i = 0; i < applyer.length; i++) {
			System.out.println(applyer[i]);
			user[i]=Core.EPgetUserinfo(applyer[i]);
		}
		jLabel1.setText(user[0].split(",")[0]);
		jLabel3.setText(user[1].split(",")[0]);
		jLabel5.setText(user[2].split(",")[0]);
		jLabel7.setText(user[3].split(",")[0]);
		jLabel9.setText(user[4].split(",")[0]);
	}
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton2.setForeground(new Color(255, 255, 255));
		jButton2.setBackground(new Color(0, 153, 102));
		jButton3 = new javax.swing.JButton();
		jButton3.setForeground(new Color(255, 255, 255));
		jButton3.setBackground(new Color(0, 153, 102));
		jButton4 = new javax.swing.JButton();
		jButton4.setForeground(new Color(255, 255, 255));
		jButton4.setBackground(new Color(0, 153, 102));
		jButton5 = new javax.swing.JButton();
		jButton5.setBackground(new Color(0, 153, 102));
		jButton5.setForeground(new Color(255, 255, 255));
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton6 = new javax.swing.JButton();
		jButton6.setBackground(new Color(0, 153, 102));
		jButton6.setForeground(new Color(255, 255, 255));
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setForeground(new Color(255, 255, 255));
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setForeground(new Color(255, 255, 255));
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setForeground(new Color(255, 255, 255));
		jLabel8 = new javax.swing.JLabel();
		jLabel8.setForeground(new Color(255, 255, 255));
		jLabel10 = new javax.swing.JLabel();
		jLabel10.setForeground(new Color(255, 255, 255));
		jPanel4 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		jPanel2.setBackground(new Color(0, 204, 153));

		jButton2.setFont(new java.awt.Font("黑体", 0, 18));
		jButton2.setText("\u67e5\u770b\u8be6\u60c5");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("黑体", 0, 18));
		jButton3.setText("\u67e5\u770b\u8be6\u60c5");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new java.awt.Font("黑体", 0, 18));
		jButton4.setText("\u67e5\u770b\u8be6\u60c5");

		jButton5.setFont(new java.awt.Font("黑体", 0, 18));
		jButton5.setText("\u67e5\u770b\u8be6\u60c5");

		jButton6.setFont(new java.awt.Font("黑体", 0, 18));
		jButton6.setText("\u67e5\u770b\u8be6\u60c5");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setText("\u72b6\u6001");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setText("\u72b6\u6001");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel6.setText("\u72b6\u6001");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel8.setText("\u72b6\u6001");

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel10.setText("\u72b6\u6001");

		jPanel4.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(51, 102, 255)));

		jLabel1.setText("\u5e94\u8058\u8005\u4e00");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1).addContainerGap(441,
								Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addGap(24, 24, 24)
						.addComponent(jLabel1).addContainerGap(25,
								Short.MAX_VALUE)));

		jPanel5.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(51, 102, 255)));

		jLabel3.setText("\u5e94\u8058\u8005\u4e8c");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3).addContainerGap(441,
								Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel5Layout.createSequentialGroup().addContainerGap(32,
						Short.MAX_VALUE).addComponent(jLabel3).addGap(26, 26,
						26)));

		jPanel6.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(51, 102, 255)));

		jLabel5.setText("\u5e94\u8058\u8005\u4e09");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel5).addContainerGap(441,
								Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addGap(24, 24, 24)
						.addComponent(jLabel5).addContainerGap(28,
								Short.MAX_VALUE)));

		jPanel7.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 102, 255)));
		jPanel7.setForeground(new java.awt.Color(240, 240, 240));

		jLabel7.setText("\u5e94\u8058\u8005\u56db");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel7).addContainerGap(441,
								Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel7,
								javax.swing.GroupLayout.DEFAULT_SIZE, 35,
								Short.MAX_VALUE).addContainerGap()));

		jPanel8.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 102, 255)));

		jLabel9.setText("\u5e94\u8058\u8005\u4e94");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel9).addContainerGap(441,
								Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout.createSequentialGroup().addGap(24, 24, 24)
						.addComponent(jLabel9).addContainerGap(28,
								Short.MAX_VALUE)));
		
		lblNewLabel = new JLabel("\u517C\u804C\u5E73\u53F0");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("华文彩云", Font.PLAIN, 36));
		
		lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_2 = new JLabel("");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(71)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel8, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
						.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel10)
						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
							.addComponent(jLabel2))
						.addComponent(jPanel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel6))
						.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(36)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jPanel2,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		应聘者详情.main(user[0],EPID,WORKID);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param USERID the command line arguments
	 */
	public static void main(final String USERID,final String EPID) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 商家工作管理(USERID,EPID).setVisible(true);
			}
		});
	}
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
}