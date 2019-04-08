package ar.org.natael;

public class Guest {
	
	private String firstName;
	private String lastName;
	
	private Guest(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		
		public Builder() {}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Guest build() {
			return new Guest(this);
		}
	}
}