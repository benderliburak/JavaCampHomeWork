
public class Main {

	public static void main(String[] args) {
		
	Student burak = new Student();
		burak.nationalIdentity = "171013";
		burak.email="burak@email.com";
		
	Instructor engin  = new Instructor();
		engin.nationalIdentity="789456";
		engin.email="engin@email.com";
		UserManager usermanager = new UserManager();
		
		
		/*usermanager.add(engin);
		usermanager.add(burak);*/
		
		
	
	User[] user = {engin ,burak};
	usermanager.addMultiple(user);
		

	}

}
