package pub;

public interface Protocol {
	final int LOGIN = 1;
	final int REGA = 2;
	final int REGE = 3;
	final int REGU = 4;
	final int SetAD = 5;
	final int GetAD = 6;
	final int newWork = 7;
	
	final int changeEmp = 8;
	final int changeUser = 9;
	
	final int readwork = 1001;
	final int passwork = 1002;
	final int delwork = 1003;
	final int Agetchat = 1004;
	final int Addchat = 1005;
	final int Searchwork = 1006;
	final int EPpassUSwork = 97;
	final int EPGuser = 98;
	final int getAPuser = 99;
	final int EPgetworkinfo = 100;//EMP
	final int getworkinfo = 101;//USER
	final int getVIP = 102;
	final int setVIP = 103;
	final int applywork = 104;
	final int addmywork = 105;
	final int USearchwork = 106;
	final int EPUC = 51;
	final int USGMW = 52;

}
