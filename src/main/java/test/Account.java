package test;

public class Account {

	long id;
	String name;

	// Builder based on spark builder plugin (eclipse marketplace)
	private Account(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private long id;
		private String name;

		private Builder() {
		}

		public Builder withId(long id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Account build() {
			return new Account(this);
		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
}
