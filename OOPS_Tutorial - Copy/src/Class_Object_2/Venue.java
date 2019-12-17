package Class_Object_2;

public class Venue {
	private String name;
	private String city;
    Venue(String p, String q) {
		setName(p);
		setCity(q);
	}
	public void setName(String x) {
		this.name = x;
	}
	public void setCity(String y) {
		this.city = y;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String toString() {
	    return (getClass()+" "+"["+this.getName()+" --- "+this.getCity()+"]");
	}
}
