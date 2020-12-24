package server;
import server.database.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import pub.Protocol;

public class Core implements Protocol{
	private ServerSocket ss;
	private Socket s;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public void get() throws IOException, SQLException {
		if (ois!=null) {
			oos.close();
			ois.close();
			s.close();
			ss.close();
		}
		ss = new ServerSocket(5432);
		s = ss.accept();
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
		int sgn = ois.readInt();
		oos.flush();
		System.out.println(sgn);
		String res = null;
		if (sgn == LOGIN ) {
			res = server.login(ois.readUTF());
		}else if(sgn == REGA ){
			res = server.signinA(ois.readUTF());
		}else if(sgn == REGE ){
			res = server.signinE(ois.readUTF());
		}else if(sgn == REGU ){
			res = server.signinU(ois.readUTF());
		}else if(sgn == SetAD ){
			res = server.SAD(ois.readUTF());
		}else if(sgn == GetAD ){
			res = server.GAD(ois.readUTF());
		}else if(sgn == newWork ){
			res = server.NW(ois.readUTF());
		}else if(sgn == readwork ){
			res = server.readwork(ois.readUTF());
		}else if(sgn == passwork ){
			res = server.passwork(ois.readUTF());
		}else if(sgn == delwork ){
			res = server.delwork(ois.readUTF());
		}else if(sgn == changeUser ){
			res = server.cUSER(ois.readUTF());
		}else if(sgn == changeEmp ){
			res = server.cEMP(ois.readUTF());
		}else if(sgn == Agetchat ){
			res = server.AGC(ois.readUTF());
		}else if(sgn == Addchat ){
			res = server.ADC(ois.readUTF());
		}else if(sgn == getworkinfo ){
			res = server.GWI(ois.readUTF());
		}else if(sgn == getVIP ){
			res = server.GVIP(ois.readUTF());
		}else if(sgn == setVIP ){
			res = server.SVIP(ois.readUTF());
		}else if(sgn == applywork ){
			res = server.APW(ois.readUTF());
		}else if(sgn == Searchwork ){
			res = server.ADSW(ois.readUTF());
		}else if(sgn == USearchwork ){
			res = server.USSW(ois.readUTF());
		}else if(sgn == EPgetworkinfo ){
			res = server.EPGW(ois.readUTF());
		}else if(sgn == getAPuser ){
			res = server.GAPUS(ois.readUTF());
		}else if(sgn == EPGuser ){
			res = server.EPGU(ois.readUTF());
		}else if(sgn == EPpassUSwork ){
			res = server.EPPUW(ois.readUTF());
		}else if(sgn == EPUC ){
			res = server.EPUC(ois.readUTF());
		}else if(sgn == USGMW ){
			res = server.USGMW(ois.readUTF());
		}
		oos.writeUTF(res);
		oos.flush();
	}
	public void off() throws IOException, SQLException {
		if (ois==null) {
			ois.close();
			oos.close();
			s.close();
			ss.close();
		}
	}
}
class server {
	public static String login(String tmp) throws SQLException {
		String [] val = tmp.split(",");
		return DB.request_login(val[0], val[1]);
	}
	public static String signinA(String tmp) throws SQLException {
		String [] val = tmp.split(",");
		return String.valueOf(DB.request_regA(val[0], val[1],tmp));
	}
	public static String signinE(String tmp) throws SQLException {
		String [] val = tmp.split(",");
		return String.valueOf(DB.request_regE(val[0], val[1],tmp));
	}
	public static String signinU(String tmp) throws SQLException {
		String [] val = tmp.split(",");
		return String.valueOf(DB.request_regU(val[0], val[1],tmp));
	}
	public static String SAD(String tmp) throws SQLException {
		return String.valueOf(DB.request_SAD(tmp));
	}
	public static String GAD(String tmp) throws SQLException {
		return String.valueOf(DB.request_GAD());
	}
	public static String NW(String tmp) throws SQLException {
		return String.valueOf(DB.newWorks(tmp));
	}
	public static String readwork(String tmp) throws SQLException {
		return String.valueOf(DB.readwork());
	}
	public static String passwork(String tmp) throws SQLException {
		return String.valueOf(DB.passwork(tmp));
	}
	public static String delwork(String tmp) throws SQLException {
		return String.valueOf(DB.delwork(tmp));
	}
	public static String cUSER(String tmp) throws SQLException {
		return String.valueOf(DB.change_USER(tmp));
	}
	public static String cEMP(String tmp) throws SQLException {
		return String.valueOf(DB.change_EP(tmp));
	}
	public static String AGC(String tmp) throws SQLException {
		return String.valueOf(DB.AGetChats(tmp));
	}
	public static String ADC(String tmp) throws SQLException {
		return String.valueOf(DB.addchat(tmp));
	}
	public static String GWI(String tmp) throws SQLException {
		return String.valueOf(DB.getworkinfo(tmp));
	}
	public static String GVIP(String tmp) throws SQLException {
		return String.valueOf(DB.GetVIP(tmp));
	}
	public static String SVIP(String tmp) throws SQLException {
		return String.valueOf(DB.SetVIP(tmp));
	}
	public static String APW(String tmp) throws SQLException {
		return String.valueOf(DB.apwork(tmp));
	}
	public static String ADSW(String tmp) throws SQLException {
		return String.valueOf(DB.ADSW(tmp));
	}
	public static String USSW(String tmp) throws SQLException {
		return String.valueOf(DB.USSW(tmp));
	}
	public static String EPGW(String tmp) throws SQLException {
		return String.valueOf(DB.EPgetworkinfo(tmp));
	}
	public static String GAPUS(String tmp) throws SQLException {
		return String.valueOf(DB.GetAPUser(tmp));
	}
	public static String EPGU(String tmp) throws SQLException {
		return String.valueOf(DB.EPGetUser(tmp));
	}
	public static String EPPUW(String tmp) throws SQLException {
		return String.valueOf(DB.EPpassUSwork(tmp));
	}
	public static String EPUC(String tmp) throws SQLException {
		return String.valueOf(DB.EPupdatacontent(tmp));
	}
	public static String USGMW(String tmp) throws SQLException {
		return String.valueOf(DB.USgetworkinfo(tmp));
	}
}
class runThread implements Runnable{
	boolean stop = false;
	Core c1 = new Core();
	Thread t1= new Thread(){
        public void run(){
        	DB.connect();
        	while(!stop){
        		try {
        			c1.get();
				} catch (Exception e) {
					//ÈÌÆøÍÌÉù
					e.printStackTrace();
				}
				
			}
        	
        }
    };
	public void run(){
    	stop = false;
		t1.start();
	}
	public void stop() {
		stop = true;
		try {
			c1.off();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}