package cilent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import cilent.infor.collUser;
import pub.Protocol;


public class Core implements Protocol{
	//*********
	//登入方法
    //*********
	public static String login(String name,String pw) {
    	try {
			return client.msg(LOGIN,name+","+pw);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	//*********
	//注册方法
	//*********
    public static String regA(String tmp) {
    	try {
			return client.msg(REGA,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			e.printStackTrace();
			return "ERROR";
		}
	}
    public static String regE(String tmp) {
    	try {
			return client.msg(REGE,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String regU(String tmp) {
    	try {
			return client.msg(REGU,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	//*********
	//广告方法
	//*********
    public static String SetAD(String tmp) {
    	try {
			return client.msg(SetAD,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String GetAD(String tmp) {
    	try {
			return client.msg(GetAD,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	//*********
	//商家方法
	//*********
    public static String newWorks(String tmp) {
    	try {
			return client.msg(newWork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String changeEPInfo(String tmp) {
    	try {
			return client.msg(changeEmp,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}    
    public static String EPGetWorkInfo(String tmp) {
    	try {
			return client.msg(EPgetworkinfo,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String getAPUser(String tmp) {
    	try {
			return client.msg(getAPuser,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String EPgetUserinfo(String tmp) {
    	try {
			return client.msg(EPGuser,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static void outputfile(String address,String text) throws IOException {
		File file = new File(address);
		text=text.replace("</html>", "");
		text=text.replace("<html>", "");
		text=text.replace("<br>", "\n");
			FileOutputStream out = new FileOutputStream(file);
			byte[] textInBytes = text.getBytes();
			out.write(textInBytes);
			out.flush();
			out.close();
	}
    public static String EPpassAPformUser(String tmp) {
    	try {
			return client.msg(EPpassUSwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String EPUC(String tmp) {
    	try {
			return client.msg(EPUC,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	//*********
	//用户方法
	//*********
    public static String changeURInfo(String tmp) {
    	try {
			return client.msg(changeUser,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String getmywork(String tmp) {
    	try {
			return client.msg(USGMW,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String GetWorkInfo(String tmp) {
    	try {
			return client.msg(getworkinfo,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	public static collUser ReadFromFile(String tmp) throws Exception {
		collUser c1 = new collUser();
		File file = new File(tmp);
		byte[] bytes = new byte[(int) file.length()];
		FileInputStream in = new FileInputStream(file);
		in.read(bytes);
		String tmp2 = new String(bytes, "UTF-8");
		// tmp2.replace("\n", ",");
		c1.setPersonalname(tmp2.split("\r\n")[0].split(":")[1]);
		c1.setSex(tmp2.split("\r\n")[1].split(":")[1]);
		c1.setAge(tmp2.split("\r\n")[2].split(":")[1]);
		c1.setQualification(tmp2.split("\r\n")[3].split(":")[1]);
		c1.setTelephonenumber(tmp2.split("\r\n")[4].split(":")[1]);
		c1.setId_card(tmp2.split("\r\n")[5].split(":")[1]);
		in.close();
		return c1;
	}
    public static String GetVIP(String tmp) {
    	try {
			return client.msg(getVIP,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String SetVIP(String tmp) {
    	try {
			return client.msg(setVIP,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String APWork(String tmp) {
    	try {
			return client.msg(applywork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String Usearchwork(String tmp) {
    	try {
			return client.msg(USearchwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
	//*********
	//管理员方法
	//*********
    public static String readworkInfo(String tmp) {
    	try {
			return client.msg(readwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
    	
	}
    public static String passworkInfo(String tmp) {
    	try {
			return client.msg(passwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
    	
	}
    public static String delworkInfo(String tmp) {
    	try {
			return client.msg(delwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String agetchat(String tmp) {
    	try {
			return client.msg(Agetchat,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    public static String searchwork(String tmp) {
    	try {
			return client.msg(Searchwork,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
    //聊天
    public static String addchat(String tmp) {
    	try {
			return client.msg(Addchat,tmp);
		} catch (UnknownHostException e) {
			return "找不到服务器";
		} catch (IOException e) {
			return "ERROR";
		}
	}
}
class client {
	public static String address = "127.0.0.1";
	public static int port = 5432;
	static String msg(int sgn,String tmp) throws UnknownHostException, IOException{
		Socket s = new Socket(address,port);
		ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
		oos.writeInt(sgn);
		oos.flush();
		oos.writeUTF(tmp);
		oos.flush();
		String result = ois.readUTF();
		s.close();
		oos.close();
		ois.close();
		return result;
	}
}