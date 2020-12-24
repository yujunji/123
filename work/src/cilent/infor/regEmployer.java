package cilent.infor;

public class regEmployer {
	private String name;
	private String pw;
	private String cname;
	private String caddress;
	private String cnumber;
	private String cresume;
	private String identity = "employer";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public String getCresume() {
		return cresume;
	}
	public void setCresume(String cresume) {
		this.cresume = cresume;
	}
	@Override
	public String toString() {
		return name+","+pw+","+identity+","+cname+","+caddress+","+cnumber+","+cresume;
	}
}
