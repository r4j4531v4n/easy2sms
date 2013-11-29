package easy2sms;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonNode {
	
	private JSONObject jsonObject;
	private JSONArray jsonArray;
	
	private boolean array;

	public JsonNode(String json) {
            String json1="["+json+"]";
		try {
                       
			jsonObject = new JSONObject(json1);
		} catch (JSONException e) {
			// It may be an array
			try {
				jsonArray = new JSONArray(json1);
				array = true;
			} catch (JSONException e1) {
				throw new RuntimeException(e1);
			}
		}
	}
	
	public JSONObject getObject() {
		return this.jsonObject;
	}
	
	public JSONArray getArray() {
		JSONArray result = this.jsonArray;
		if (array == false) {
			result = new JSONArray();
			result.put(jsonObject);
		}
		return result;
	}
	
	public boolean isArray() {
		return this.array;
	}
	
	@Override
	public String toString() {
		if (isArray()) {
			if (jsonArray == null) return null;
			return jsonArray.toString();
		}
		if (jsonObject == null) return null;
		return jsonObject.toString();
	}
}
