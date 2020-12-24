package cilent.infor;

public class regAdmin {
	private String name;
	private String pw;
	private String identity = "admin";
	private String job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return name+","+pw+","+identity+","+job;
	}
}
