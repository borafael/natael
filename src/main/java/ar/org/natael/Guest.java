package ar.org.natael;

public class Guest {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String cell;
	private String group;
	private String invited;
	private String confirmed;
	private String menu;
	private String address;
	private String postalCode;
	private String city;
	private String province;
	private String table;
	private String sex;
	
	private Guest(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phone = builder.phone;
		this.cell = builder.cell;
		this.group = builder.group;
		this.invited = builder.invited;
		this.confirmed = builder.confirmed;
		this.menu = builder.menu;
		this.address = builder.address;
		this.postalCode = builder.postalCode;
		this.city = builder.city;
		this.province = builder.province;
		this.table = builder.table;
		this.sex = builder.sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}

	public String getCell() {
		return cell;
	}

	public String getGroup() {
		return group;
	}

	public String getInvited() {
		return invited;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public String getMenu() {
		return menu;
	}

	public String getAddress() {
		return address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getTable() {
		return table;
	}

	public String getSex() {
		return sex;
	}
	
	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		private String cell;
		private String group;
		private String invited;
		private String confirmed;
		private String menu;
		private String address;
		private String postalCode;
		private String city;
		private String province;
		private String table;
		private String sex;
		
		public Builder() {}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder cell(String cell) {
			this.cell = cell;
			return this;
		}
		
		public Builder group(String group) {
			this.group = group;
			return this;
		}
		
		public Builder invited(String invited) {
			this.invited = invited;
			return this;
		}
		
		public Builder confirmed(String confirmed) {
			this.confirmed = confirmed;
			return this;
		}
		
		public Builder menu(String menu) {
			this.menu = menu;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public Builder postalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}
		
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		
		public Builder province(String province) {
			this.province = province;
			return this;
		}
		
		public Builder table(String table) {
			this.table = table;
			return this;
		}
		
		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}
		
		public Guest build() {
			return new Guest(this);
		}
	}
}