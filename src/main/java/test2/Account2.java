package test2;

public class Account2 {

	long id;
	String name;

	// Builder based on bpep dropin: https://github.com/henningjensen/bpep 
	public static class Builder {
		private long id;
		private String name;

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Account2 build() {
			Account2 account2 = new Account2();
			account2.id = id;
			account2.name = name;
			return account2;
		}
	}

	@Override
	public String toString() {
		return "Account2 [id=" + id + ", name=" + name + "]";
	}
}
