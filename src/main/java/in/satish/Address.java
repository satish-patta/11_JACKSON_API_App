package in.satish;

public class Address {
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", country=" + country + "]";
	}

	private String city;
	private String State;
	private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
