package cilent.infor;

public class newWork {
	private String workname;
	private String companyname;
	private String job;
	private String workcontent;
	private String money;
	private String telephone_number;
	private String employer;
	//SELECT workname,job,workcontent,money,`telephone number`,employer from `work` where
	public void setWorkname(String workname) {
		this.workname = workname;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setWorkcontent(String workcontent) {
		this.workcontent = workcontent;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	@Override
	public String toString() {
		return workname+","+companyname+","+job+","+workcontent+","+money+","+telephone_number+","+employer;
	}
}
