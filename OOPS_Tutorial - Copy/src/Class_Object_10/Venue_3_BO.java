package Class_Object_10;

public class Venue_3_BO {
	public Venue_3 createVenue_3(String data, City[] cityList) {
		String[] input = data.split(",");
		City c = null;
		for(int i=0;i<cityList.length;i++) {
			if(cityList[i].getName().equals(input[1])) {
				c = cityList[i];
				break;
			}
		}
		Venue_3 v = new Venue_3(input[0],c);
		return v;
		
	}
}