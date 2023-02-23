package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		// write a code that will give you place id
		// Execute this code only when place_id is null
		
		StepDefination m = new StepDefination();
		
		if(StepDefination.place_id==null) {
		m.add_place_payload_with("Rohit", "Marathi", "Pune");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_for_above_added_maps_with_using("Rohit", "GetPlaceAPI");
		}
	}

}
