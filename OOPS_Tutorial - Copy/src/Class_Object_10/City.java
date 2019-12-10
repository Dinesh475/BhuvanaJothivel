package Class_Object_10;

public class City {
	private String name;
	
	public City(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%-15s", name);
	}
	
}
