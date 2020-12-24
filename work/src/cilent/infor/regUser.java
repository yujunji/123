package cilent.infor;

public class regUser {
	private String name;
	private String pw;
	private String personalname;
	private String sex;
	private String age;
	private String qualification;
	private String id_card;
	private String telephonenumber;
	private String identity = "user";
	public void setName(String name) {
		this.name = name;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	@Override
	public String toString() {
		return 	name+","+pw+","+identity+","+personalname+","+sex+","+age+","+qualification+","+id_card+","+telephonenumber;
	}
}
