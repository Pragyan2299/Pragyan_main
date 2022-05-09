package Com.wipro;

import java.util.HashMap;
import java.util.Map;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating and initialising array
		float monitorSize[] = new float[3];
		//Assign elements
		monitorSize[0] = 22.5f;
		monitorSize[1] = 12.5f;
		monitorSize[2] = 10.5f;
		for(int i = 0;i<monitorSize.length;i++) {
			System.out.println(monitorSize[i]);
		}
	}
private static void mapOperations() {
	Map<Integer, String> mapCountryCode = new HashMap<Integer,String>();
	System.out.println(mapCountryCode.isEmpty());
	mapCountryCode.put(91, "INDIA");
	mapCountryCode.put(81, "JAPAN");
	mapCountryCode.put(33, "FRANCE");
	System.out.println(mapCountryCode .isEmpty());
	// (india = 91,france=33,japan=81)
	System.out.println(mapCountryCode);
	boolean con
}
}
