package cilent.infor;

public class collUser {
	private String personalname;
	private String sex;
	private String age;
	private String qualification;
	private String telephonenumber;
	private String id_card;


	public String getPersonalname() {
		return personalname;
	}


	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getTelephonenumber() {
		return telephonenumber;
	}


	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}


	public String getId_card() {
		return id_card;
	}


	public void setId_card(String id_card) {
		this.id_card = id_card;
	}


	public String toString() {
		return 	personalname+","+sex+","+age+","+qualification+","+id_card+","+telephonenumber;
	}
}
