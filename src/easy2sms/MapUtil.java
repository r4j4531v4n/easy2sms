package easy2sms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class MapUtil {

	public static List<NameValuePair> getList(Map<String, Object> parameters) {
		List<NameValuePair> result = new ArrayList<NameValuePair>();
		if (parameters != null) {

			Set<String> keySet = parameters.keySet();
			for (String key : keySet) {
				Object object = parameters.get(key);
				if (object != null) {
					result.add(new BasicNameValuePair(key, object.toString()));
				}
			}

		}
		return result;
	}

}

