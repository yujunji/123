package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import server.Core;

public class DB {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost:3306/abc?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PASS = "root";
    private static Connection conn;
    private static Statement stmt;
    public static void connect() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    public static void disconnect() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 登陆
	public static String request_login(String name, String pw) throws SQLException {
		String sql = "SELECT id,identity FROM user WHERE name='" + name + "' AND password='" + pw + "'";
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		String result = "";
		while (rs.next()) {
			result = rs.getInt("id") + "," + rs.getString("identity");
		}
		return result;
	}
	//注册A类型
	public static boolean request_regA(String name, String pw,String tmp) throws SQLException {
		String tmp2 = tmp.replace(",", "','");
		String sql = "INSERT INTO user (name,password,identity,job) VALUES ('"+tmp2+"')";
		System.out.println(sql);
		boolean result = true;
		if (request_login(name,pw).equals("")) {
			stmt.execute(sql);
		}else {
			result = false;
		}
		return result;
	}
	//注册E类型
	public static boolean request_regE(String name, String pw,String tmp) throws SQLException {
		System.out.println(tmp);
		String tmp2 = tmp.replace(",", "','");
		String sql = "INSERT INTO user (name,password,identity,corporatename,companyaddress,companynumber,companyresume) VALUES ('"+tmp2+"')";
		System.out.println(sql);
		boolean result = true;
		if (request_login(name,pw).equals("")) {
			stmt.execute(sql);
		}else {
			result = false;
		}
		return result;
	}
	//注册U类型
	public static boolean request_regU(String name, String pw,String tmp) throws SQLException {
		String tmp2 = tmp.replace(",", "','");
		String sql = "INSERT INTO user (name,password,identity,personalname,sex,age,qualification,id_card,telephonenumber) VALUES ('"+tmp2+"')";
		System.out.println(sql);
		boolean result = true;
		if (request_login(name,pw).equals("")) {
			stmt.execute(sql);
		}else {
			result = false;
		}
		return result;
	}
	//读取广告
	public static String request_GAD() throws SQLException {
		String sql = "SELECT text FROM advertisement";
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);
		String result = "";
		while (rs.next()) {
			result = rs.getString("text");
		}
		return result;
	}
	//更新广告
	public static boolean request_SAD(String tmp){
		String sql = "UPDATE advertisement SET text = '" + tmp + "'";
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	//职位发布
		public static boolean newWorks(String tmp) throws SQLException {
			System.out.println(tmp);
			String tmp2 = tmp.replace(",", "','");
			String sql = "INSERT INTO work (workname,companyname,job,workcontent,money,telephonenumber,employerid) VALUES ('"+tmp2+"');";
			System.out.println(sql);
			boolean result = true;
			try {
				stmt.execute(sql);
			} catch (SQLException e) {
				result = false;
			}
			return result;
		}
	public static String readwork() throws SQLException {
		String sql = "SELECT workname,companyname,job,workcontent,workid,employerid FROM work where isAllow='false'";
		System.out.println(sql);
		String result []= {"",""};
		ResultSet rs = stmt.executeQuery(sql);
		int i = 0;
		while (rs.next()) {
			result[i] = rs.getString("workname")+","+rs.getString("companyname")+","+rs.getString("job")+","+rs.getString("workcontent")+","+rs.getInt("workid")+","+rs.getInt("employerid");
			i++;
			if (i==2) {
				break;
			}
		}
		String tmp = result[0]+"下一个"+result[1];
		return tmp;
	}
	public static boolean passwork(String tmp){
		String sql = "UPDATE work SET isAllow = 'true' where workid="+tmp;
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	public static boolean delwork(String tmp){
		String sql = "DELETE FROM work WHERE workid = "+tmp;
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	//修改用户信息
	public static boolean change_USER(String tmp){
		System.out.println(tmp);
		String val[]=tmp.split(",");
		String sql = "UPDATE user SET "
				+ "personalname='"+val[1]+"',"
				+ "sex='"+val[2]+"',"
				+ "qualification='"+val[4]+"',"
				+ "id_card='"+val[5]+"',"
				+ "telephonenumber='"+val[6]+"',"
				+ "age='"+val[3]+"' where id="+val[0];
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	//修改商家信息
	public static boolean change_EP(String tmp){
		System.out.println(tmp);
		String val[]=tmp.split(",");
		//corporatename,companyaddress,companynumber,companyresume
		String sql = "UPDATE user SET "
				+ "corporatename='"+val[1]+"',"
				+ "companyaddress='"+val[2]+"',"
				+ "companyresume='"+val[4]+"',"
				+ "companynumber='"+val[3]+"' where id="+val[0];
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	//Get聊天记录(admin)
	public static String AGetChats(String tmp){
		String sql = "SELECT M FROM chats WHERE T='0' AND F='"+tmp+"'";
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = result + rs.getString("M")+",";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//发送聊天语句
	public static boolean addchat(String tmp) throws SQLException {
		String tmp2 = tmp.replace(",", "','");
		String sql = "INSERT INTO chats VALUES ('"+tmp2+"')";
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	//查看工作
	public static String getworkinfo(String tmp) throws SQLException {
		String sql = "SELECT * FROM work WHERE isAllow='true' ORDER by money desc,SearchV desc";
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = result + rs.getInt("workid")+","+rs.getString("workname")+","+ rs.getString("job")+","+ rs.getString("workcontent")+","+ rs.getString("telephonenumber")+","+ rs.getInt("employerid")+","+ rs.getInt("usid")+"下一个";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static String GetVIP(String tmp){
		String sql = "SELECT isVIP FROM user WHERE id='"+tmp+"'";
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				result = rs.getString("isVIP");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static boolean SetVIP(String tmp){
		String sql = "UPDATE user SET isVIP = 'true' where id="+tmp;
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	public static boolean addwork(String tmp){
		String sql = "UPDATE user SET mywork = '"+tmp+"' where id="+tmp;
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	public static boolean apwork(String tmp){
		//String tmp2 = tmp.replace(",", "','");
		/*String sql = "INSERT INTO epwork (userid,epid) VALUES ('"+tmp2+"')";*/
		String sql;
		sql= "SELECT usid,usid1,usid2,usid3,usid4 FROM work WHERE workid='"+tmp.split(",")[0]+"'";
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				if (rs.getInt(1)==0) {
					sql = "UPDATE work SET usid='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
				}else if (rs.getInt(2)==0) {
					sql = "UPDATE work SET usid1='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
				}else if (rs.getInt(3)==0) {
					sql = "UPDATE work SET usid2='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
				}else if (rs.getInt(4)==0) {
					sql = "UPDATE work SET usid3='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
				}else if (rs.getInt(5)==0) {
					sql = "UPDATE work SET usid4='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
	public static String ADSW(String tmp){
		String sql = "SELECT * FROM work WHERE workname LIKE '%"+tmp+"%' AND isAllow='true'";
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				result = result + rs.getString("workname")+","+ rs.getString("job")+","+ rs.getString("workcontent")+","+ rs.getString("telephonenumber")+","+rs.getInt("workid")+","+ rs.getInt("employerid")+","+ rs.getInt("usid")+"下一个";
			}
		} catch (SQLException e) {
			result = "";
		}
		return result;
	}
	public static String USSW(String tmp){
		String sql = "SELECT * FROM work WHERE workname LIKE '%"+tmp+"%' AND isAllow='true'";
		String sql2="";
		System.out.println(sql);
		String result = "";
		int SV;
		int workid;
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				workid = rs.getInt("workid");
				SV = rs.getInt("SearchV");
				result = result + workid+","+rs.getString("workname")+","+ rs.getString("job")+","+ rs.getString("workcontent")+","+ rs.getString("telephonenumber")+","+ rs.getInt("employerid")+"下一个";
				SV++;
				sql2= sql2 + "UPDATE work SET SearchV="+SV+" where workid="+workid+";";
			}
		} catch (SQLException e) {
			result = "";
			e.printStackTrace();
		}
		try {
			String[] tmp2=sql2.split(";");
			for (String sq : tmp2) {
				stmt.execute(sq);
			}
		} catch (Exception e) {
			System.out.println(sql2);
			e.printStackTrace();
		}
		return result;
	}
	//;
	public static String EPgetworkinfo(String tmp) throws SQLException {
		String sql = "SELECT * FROM work WHERE employerid="+tmp;
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = result + rs.getInt("workid")+","+rs.getString("workname")+","+ rs.getString("job")+","+ rs.getString("workcontent")+","+ rs.getString("telephonenumber")+","+ rs.getInt("employerid")+"下一个";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static String GetAPUser(String tmp) throws SQLException {
		String sql = "SELECT * FROM work WHERE workid="+tmp;
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = rs.getInt("usid")+","+rs.getInt("usid1")+","+ rs.getInt("usid2")+","+ rs.getInt("usid3")+","+ rs.getInt("usid4");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static String EPGetUser(String tmp) throws SQLException {
		String sql = "SELECT * FROM user WHERE id="+tmp;
		/*
		 * + "personalname='"+val[1]+"',"
				+ "sex='"+val[2]+"',"
				+ "qualification='"+val[4]+"',"
				+ "id_card='"+val[5]+"',"
				+ "telephonenumber='"+val[6]+"',"
				+ "age='"+val[3]+"' where id="+val[0];
		 * */
		System.out.println(sql);
		String result = "";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = rs.getString("personalname") + "," +
							 rs.getString("age") + "," +
							 rs.getString("sex") + "," +
							 rs.getString("qualification") + "," +
							 rs.getString("id_card") + "," +
							 rs.getString("telephonenumber")+","+
							 rs.getInt("id");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static boolean EPpassUSwork(String tmp){
		//String tmp2 = tmp.replace(",", "','");
		/*String sql = "INSERT INTO epwork (userid,epid) VALUES ('"+tmp2+"')";*/
		String sql = "UPDATE user SET mywork='"+tmp.split(",")[1]+"' WHERE id='"+tmp.split(",")[0]+"'";
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	public static boolean EPupdatacontent(String tmp){
		String sql = "UPDATE work SET workcontent='"+tmp.split(",")[1]+"' WHERE workid='"+tmp.split(",")[0]+"'";
		System.out.println(sql);
		boolean result = true;
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	public static String USgetworkinfo(String tmp) throws SQLException {
		String sql;
		String result;
		result = "";
		sql = "SELECT mywork FROM user WHERE id="+tmp;
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result = rs.getString("mywork"); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "SELECT * FROM work WHERE workid="+result;
		System.out.println(sql);
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				try {
					result =rs.getInt("workid")+","+rs.getString("workname")+","+ rs.getString("job")+","+ rs.getString("workcontent")+","+ rs.getString("telephonenumber")+","+ rs.getInt("employerid");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
