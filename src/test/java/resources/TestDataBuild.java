package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayload(String name, String language, String address) {
		
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		ap.setName(name);
		ap.setPhonenumber("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		
		List<String> p = new ArrayList<String>();
		p.add("shoe park");
		p.add("shop");
		ap.setTypes(p);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		ap.setLocation(l);
		
		return ap;
	}
	
	public String deletePlacePayload(String place_id) {
		
		String deletePlacePayload = "{\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}\r\n"
				+ "";
		return deletePlacePayload;
	}

}
