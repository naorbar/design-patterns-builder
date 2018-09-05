
public class User {

	private String firstName;
	private String lastName;
	private String title;
	
	public static class Builder {
		
		private String firstName;
		private String lastName;
		private String title;
		
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}
		
		public User build() {
			User u = new User();
			u.firstName = this.firstName;
			u.lastName = this.lastName;
			u.title = this.title;
			return u;
		}
	}
	
	@Override
	public String toString() {
		return this.firstName + " - " + this.lastName + " - " + this.title;
	}
}
