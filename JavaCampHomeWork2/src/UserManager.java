
public class UserManager {

	/*public void add(Student student)
	{
		System.out.println (student.nationalIdentity +" kaydedildi");
	}
	public void add(Instructor �nstructor)
	{
		System.out.println (�nstructor.nationalIdentity +" kaydedildi");
	}*///gerek yok 
	
	public void add(User user)
	{
		System.out.println (user.getNationalIdentity() +" kaydedildi");
		System.out.println (user.email +" kaydedildi");
	}
	
	
	public void addMultiple(User [] users)
	{
		for (User user : users) {
			add(user);
			
		}
	}
}
//kurstaki ��renci ve ��retmen i�lemlerini yap�yor.