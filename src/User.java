public class User {
	private String name;
	private String surName;
	private int age;
	private String tel;
	private String address;
	
	public static class UserBuilder {
		private String name;
		private String surName;
		private int age;
		private String tel;
		private String address;
		
		public UserBuilder(String name,String surname) {
			this.name=name;
			this.surName=surname;
		}
		
		public UserBuilder age(int b) {
			age=b;
			return this;
		}
		public UserBuilder tel(String b) {
			tel=b;
			return this;
		}
		public UserBuilder address(String b) {
			address=b;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}
	
	private User(UserBuilder builder) {
	    name = builder.name;
	    surName = builder.surName;
	    age = builder.age;
	    tel = builder.tel;
	    address = builder.address;
	  }
	
	   @Override
	    public String toString() {
	        return "User Name: " + this.name + ", User SurName:" + this.surName + ", User Age:" + this.age + ", User Tel:" + this.tel + ", User Adres:" + this.address;
	    }

}
