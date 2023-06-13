import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.apache.commons.lang3.StringUtils;

public class Test {

	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		//String  path = "https://cloudfuzecom.sharepoint.com/:p:/r/sites/Janustest/_layouts/15/Doc.aspx?sourcedoc=%7B0E85DE8F-73D7-43AE-B0C5-A9D07F9CF8FF%7D&file=MS%20TEST%20PPT.pptx&action=edit&mobileredirect=true";
		
//		String path = "https://cloudfuzecom.sharepoint.com/:x:/s/Janustest/EUGswOeqFahPh7xyFRsVFpMBy3pkgnGYXNc7TikFo375kw?e=jPoOSy";
//		if(path.contains("sites")) {
//			String decodedUrl = URLDecoder.decode(path, "UTF-8");
//			String substringBetween = StringUtils.substringBetween(decodedUrl, "{", "}");
//			System.out.println(substringBetween);
//		}else if(path.contains("s")) {
//			path = path.substring(0,path.indexOf("?"));
//			System.out.println(path);
//		}
		
		
		
		String path = "https://cloudfuzecom.sharepoint.com/:x:/r/sites/Janustest/_layouts/15/Doc.aspx?sourcedoc=%7BE7C0AC41-15AA-4FA8-87BC-72151B151693%7D&file=MS%20TEST%20EXCEL.xlsx&action=default&mobileredirect=true";
	
		 String encodedUrl = encodeSharingUrl(path);
	        System.out.println("Encoded URL: " + encodedUrl);
	}
	
	public static String encodeSharingUrl(String sharingUrl) {
        byte[] urlBytes = sharingUrl.getBytes(StandardCharsets.UTF_8);
        String base64Value = Base64.getEncoder().encodeToString(urlBytes);
        String encodedUrl = "u!" + base64Value.replace('/', '_').replace('+', '-').replaceAll("=+$", "");
        return encodedUrl;
    }
}
