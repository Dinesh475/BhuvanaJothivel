package Class_Object_10;

public class Venue_3 {
	private String name;
	City city;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s", name,city);
	}

	public Venue_3(String name, City city) {
		super();
		this.name = name;
		this.city = city;
	}
	
}
