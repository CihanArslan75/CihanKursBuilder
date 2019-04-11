
public class Runner {
	public static void main(String[] args) {
		User user1=new User.UserBuilder("Cihan", "Arslan").age(45).tel("4444444").address("Ankara").build();
		User user2=new User.UserBuilder("aaaa", "bbbbb").tel("5555555").build();
		System.out.println(user1);
		System.out.println(user2);
	}

}
