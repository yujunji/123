package cilent.infor;

public class collEmployer {
	private String cname;
	private String caddress;
	private String cnumber;
	private String cresume;
   
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public void setCresume(String cresume) {
		this.cresume = cresume;
	}

	public String toString(){
		return cname+","+caddress+","+cnumber+","+cresume;
	}
}
