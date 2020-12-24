package cilent;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//去掉注释开启手动配置服务端
		
		//弹窗输入服务器
		/*
		String address = JOptionPane.showInputDialog(null, "请输入服务器域名:", "localhost");
		int port = Integer.valueOf(JOptionPane.showInputDialog(null, "请输入服务器域名:", 5432));
		cilent.client.address=address;
		cilent.client.port=port;
		*/
		
		/*本地
		cilent.client.address="localhost";
		cilent.client.port=5432; 
		*/
		
		/*云服务
		cilent.client.address="zgcloud.iok.la";
		cilent.client.port=18335; 
		*/
		cilent.gui.登陆界面.main(null);
	}

}
