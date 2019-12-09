package Class_Object_7;

public class DeliveryBO {
	public void displayAllDeliveryDetails(Delivery[] DeliveryList) {
		int i=1;
		for(Delivery m : DeliveryList) {
			System.out.println("Delivery -- "+(i));
			System.out.println(m.toString());
			i++;
		}
	}
}
