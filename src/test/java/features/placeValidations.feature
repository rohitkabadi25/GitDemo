Feature: Valdidating Place API
@AddPlace
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
		Given Add Place Payload with "<name>" "<language>" "<address>"
		When user calls "AddPlaceAPI" with "POST" http request
		Then The API call is success with Status code 200
		And "status" in response body is "OK"
		And "scope" in response body is "APP"
		And verify place_id created for above added maps with "<name>" using "GetPlaceAPI"
		
Examples: 
		| name     | language | address						  |
		| AA House | English  | World Trade Center  |
#		| BB House | Spanish  | Indian Trade Center |

@DeletePlace
Scenario:
		Given DeletePlace Payload
		When user calls "DeletePlaceAPI" with "POST" http request
		Then The API call is success with Status code 200
		And "status" in response body is "OK"