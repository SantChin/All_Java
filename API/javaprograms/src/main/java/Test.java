import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

public class Test {

	
	public static void main(String[] args) throws UnsupportedEncodingException, EncoderException, DecoderException {
		
		
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
		
		
		
//		String path = "https://cloudfuzecom.sharepoint.com/:x:/r/sites/Janustest/_layouts/15/Doc.aspx?sourcedoc=%7BE7C0AC41-15AA-4FA8-87BC-72151B151693%7D&file=MS%20TEST%20EXCEL.xlsx&action=default&mobileredirect=true";
//	
//		 String encodedUrl = encodeSharingUrl(path);
//	        System.out.println("Encoded URL: " + encodedUrl);
	        
			
//		
//			String emailPairs = "U01PX3DRDMK,U01Q6BUB4NQ";
//			String[] Emailsplit = emailPairs.split(",");
//	        String name = "mpdm-mia--vignesh.t--sophia-1";
//	        String[] split = name.split("--");
//	        if(split.length != Emailsplit.length) {
//	        	System.out.println("Not Same");
//	        }
//	        
	        
//	        String input = "HYPERLINK(\"https://app.box.com/s/mifjl01bps2ew8ewhid95beuyzjdovgo\",\"Test\")";
//	      //  String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|\"\\\\)(:,.;]*(?=[\\\",])";
//	        String pattern = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|\"\\\\)(:,.;]*[-a-zA-Z0-9+&@#/%=~_|](?=[\\\"])";
//
//	        Pattern r = Pattern.compile(pattern);
//	        Matcher m = r.matcher(input);
//	        
//	        if (m.find()) {
//	            System.out.println("Found URL: " + m.group(0));
//	        } else {
//	            System.out.println("No match found");
//	        }
	        
	        
//	        /	rId = paragraph.getDocument().getPackagePart().addExternalRelationship(URIUtil.encodePathQuery(URLDecoder.decode(replaceLink.get(s_url)), "UTF-8"),XWPFRelation.HYPERLINK.getRelation()).getId();
	
	
	String target = "https://filefuze.sharepoint.com/sites/TeamMigration/Team%20Library/Test%20Folder%20Links/Black@%23$%25%5E%26-!~%60(_-=+;%27--,.--)ForestCake24@%23$%25%5E%26-(~%60)_-=+.jpg";
	
	//String encode = URLEncoder.encode(target);
//	//String decode = URLDecoder.decode(target,"UTF-8");
//	 URLCodec urlCodec = new URLCodec();
//	//URLCodec.encodeUrl(null, null)
//	 String encodedFileName = urlCodec.decode(target);
//	System.out.println(encodedFileName);
//	encodedFileName = encodedFileName.replace(" ", "%20"); 
	
	//String updated = URLEncoder.encode(encodedFileName);
	
//	 URI targetURI;
//     try {
//         targetURI = new URI(encodedFileName);
//     } catch (URISyntaxException e) {
//         throw new IllegalArgumentException("Invalid target - " + e);
//     }
//     
//     System.out.println(targetURI);
	
//	 List<String> list = new ArrayList<>();
//     list.add("apple");
//     list.add("banana");
//    // list.add("orange");
//     list.add("apple"); // Duplicate element
//     list.add("apple"); 
//
//     // Convert List to Set
//     Set<String> set = new HashSet<>(list);
//
//     System.out.println(set.size());
//     
//     if(set.size() < 3) {
//    	 System.out.println("Inside");
//     }else {
//    	 System.out.println("Outside"); 
//     }
//     
//     // Print the Set
//     System.out.println("Set: " + set);
//	

	
	
	
	
	//String name = "Zack Reilly-InÃƒÂ©s Resano Goizueta";
	
	 List<String> data = Arrays.asList(
			 "michael.hawthorne-Adrian Arredondo",
			 "michael.hawthorne-Albert Falzarano",
			 "michael.hawthorne-Angie Li",
			 "michael.hawthorne-Audrey Cu",
			 "Richard.Zielke-Audrey Cu",
			 "Inés Resano Goizueta-Becca van Stolk",
			 "Tamara Murphy-Becca van Stolk",
			 "teresa.chan-Becca van Stolk",
			 "Utthara Rameshbabu-Becca van Stolk",
			 "Matt Bove-Bhosale Sagar",
			 "Saptarshi Banerjee-Bhosale Sagar",
			 "Shantel Ballard-Bhosale Sagar",
			 "michael.hawthorne-Bryce Clark",
			 "Amelia Leal-Carey Poole",
			 "Joel Harris-Carey Poole",
			 "Sam Schafer-Carey Poole",
			 "Stevie Poutz-Carey Poole",
			 "Guadalupe Díaz-Celeste Zavala (she/her) ",
			 "Richard.Zielke-Dale Herrera",
			 "Richard.Zielke-Daniel Ratner (he/him)",
			 "michael.hawthorne-danny kirkendall",
			 "Richard.Zielke-danny kirkendall",
			 "Guadalupe Díaz-Derek Zipp",
			 "Rachelle Moore-Derek Zipp",
			 "Yi Jin (she/her)-Derek Zipp",
			 "michael.hawthorne-Devin Licon",
			 "michael.hawthorne-Dmitriy Khatayevich",
			 "Inés Resano Goizueta-Enrique Torres",
			 "michael.hawthorne-Eric Hatland",
			 "michael.hawthorne-Erika Baterdene",
			 "ariel.cardoza-externa",
			 "Jagoda Zoltowska-external",
			 "Kelly Lincoln-external",
			 "Prashant Rege-external",
			 "michael.hawthorne-Felicia Yeo",
			 "michael.hawthorne-Fifi Sutanto",
			 "michael.hawthorne-Fuqi Liu",
			 "michael.hawthorne-Grayson Woodall",
			 "michael.hawthorne-Honami Kao",
			 "Abigail Kirchmer-irene.yim",
			 "Alejandra Ramirez-irene.yim",
			 "Alma Jovelsolis-irene.yim",
			 "Anna Koh-irene.yim",
			 "Annie Rainey-irene.yim",
			 "Anthony Nguyen-irene.yim",
			 "Apoorva Prasanna-irene.yim",
			 "Ben Isaac-irene.yim",
			 "Carolyn Gresswell-irene.yim",
			 "Christopher Qiao-irene.yim",
			 "Claire Toy-irene.yim",
			 "Colin Cerretani-irene.yim",
			 "Craig Berger-irene.yim",
			 "Danielle Soon-irene.yim",
			 "danny kirkendall-irene.yim",
			 "Darlene Nguyen-irene.yim",
			 "Devin Licon-irene.yim",
			 "Erik Drobey-irene.yim",
			 "Greg Botto-irene.yim",
			 "Greg Yurich-irene.yim",
			 "Guadalupe Díaz-irene.yim",
			 "Haley Raichelson-irene.yim",
			 "Huan Yan-irene.yim",
			 "Inés Resano Goizueta-irene.yim",
			 "Ivette Vasquez-irene.yim",
			 "Jake Fratkin-irene.yim",
			 "James Chung-irene.yim",
			 "Jane Yoo-irene.yim",
			 "Jason Casolari (he/him)-irene.yim",
			 "Jen Carr-irene.yim",
			 "Jenny Hang-irene.yim",
			 "Joshua Tsang-irene.yim",
			 "Justin Wu-irene.yim",
			 "Keely Sulprizio (she/her/hers)-irene.yim",
			 "Khai Tra-irene.yim",
			 "Kyle Okada-irene.yim",
			 "Leidy Valencia-irene.yim",
			 "Lorna Gladstone-irene.yim",
			 "Maggie Myles-irene.yim",
			 "Margaret Chi-irene.yim",
			 "Mark Menesses-irene.yim",
			 "Matt Bove-irene.yim",
			 "Matt Dunn-irene.yim",
			 "Nicole Chavez-irene.yim",
			 "Nicole Ikeuchi-irene.yim",
			 "Olga Alexandraromanova-irene.yim",
			 "Olivia Nahoum-irene.yim",
			 "Pat McGale-irene.yim",
			 "Prachi Panchal-irene.yim",
			 "Ramean Behnam-irene.yim",
			 "Roi Rutenberg-irene.yim",
			 "Sergey Trukhanov-irene.yim",
			 "Sesh Gowrishankar-irene.yim",
			 "Sneha Parab-irene.yim",
			 "Sophia Siddiqi-irene.yim",
			 "Steve Chakerian-irene.yim",
			 "Tamara Murphy-irene.yim",
			 "Tim Lucas-irene.yim",
			 "Tuan Truong-irene.yim",
			 "Tucker Chambers-irene.yim",
			 "Utthara Rameshbabu-irene.yim",
			 "Will Koh-irene.yim",
			 "Xin Li-irene.yim",
			 "Yi Jin (she/her)-irene.yim",
			 "Yiming Chen-irene.yim",
			 "Steve Chakerian-Jagoda Zoltowska",
			 "Tamara Lopatin-Jagoda Zoltowska",
			 "Tuan Truong-Jagoda Zoltowska",
			 "Richard.Zielke-Jannie Saefong",
			 "michael.hawthorne-Jared Mendenhall",
			 "michael.hawthorne-Jordan Le",
			 "michael.hawthorne-Karen Silveira",
			 "Greg Botto-Krystyna Furgacz",
			 "Sam Schafer-Krystyna Furgacz",
			 "michael.hawthorne-Kyle Okada",
			 "Richard.Zielke-Kyle Okada",
			 "michael.hawthorne-Lexi Cotcamp",
			 "Richard.Zielke-Lexi Cotcamp",
			 "michael.hawthorne-Lia Tjahjadi",
			 "michael.hawthorne-Michael Lin",
			 "Darnella K.-michael.hawthorne",
			 "Emmanuel Isip-michael.hawthorne",
			 "Jeremy Cook-michael.hawthorne",
			 "Kameisha Fudge-michael.hawthorne",
			 "michael.hawthorne-michael.hawthorne",
			 "Tuan Truong-michael.hawthorne",
			 "michael.hawthorne-Michelle Ishida",
			 "Richard.Zielke-Michelle Ishida",
			 "michael.hawthorne-Michelle LeClair (she/her)",
			 "Alejandra Ramirez-miles.laird",
			 "Anna Koh-miles.laird",
			 "Annie Rainey-miles.laird",
			 "Anthony Nguyen-miles.laird",
			 "Apoorva Prasanna-miles.laird",
			 "Ben Isaac-miles.laird",
			 "Carolyn Gresswell-miles.laird",
			 "Christopher Qiao-miles.laird",
			 "Claire Toy-miles.laird",
			 "Colin Cerretani-miles.laird",
			 "Craig Berger-miles.laird",
			 "Danielle Soon-miles.laird",
			 "Darlene Nguyen-miles.laird",
			 "Devin Licon-miles.laird",
			 "Erik Drobey-miles.laird",
			 "Erika Vazquez-miles.laird",
			 "Greg Yurich-miles.laird",
			 "Guadalupe Díaz-miles.laird",
			 "Haley Raichelson-miles.laird",
			 "Inés Resano Goizueta-miles.laird",
			 "Ivette Vasquez-miles.laird",
			 "Jake Fratkin-miles.laird",
			 "James Chung-miles.laird",
			 "Jane Yoo-miles.laird",
			 "Jason Casolari (he/him)-miles.laird",
			 "Jenny Hang-miles.laird",
			 "Joshua Tsang-miles.laird",
			 "Justin Wu-miles.laird",
			 "Keely Sulprizio (she/her/hers)-miles.laird",
			 "Khai Tra-miles.laird",
			 "Kyle Okada-miles.laird",
			 "Lorna Gladstone-miles.laird",
			 "Margaret Chi-miles.laird",
			 "Mark Menesses-miles.laird",
			 "Matt Bove-miles.laird",
			 "Matt Dunn-miles.laird",
			 "Nicole Ikeuchi-miles.laird",
			 "Olivia Nahoum-miles.laird",
			 "Pat McGale-miles.laird",
			 "Roi Rutenberg-miles.laird",
			 "Sergey Trukhanov-miles.laird",
			 "Sesh Gowrishankar-miles.laird",
			 "Sneha Parab-miles.laird",
			 "Souvik Das-miles.laird",
			 "Steve Chakerian-miles.laird",
			 "Tamara Murphy-miles.laird",
			 "Tuan Truong-miles.laird",
			 "Utthara Rameshbabu-miles.laird",
			 "Will Koh-miles.laird",
			 "Xin Li-miles.laird",
			 "Yi Jin (she/her)-miles.laird",
			 "Yiming Chen-miles.laird",
			 "michael.hawthorne-Nathan Lloyd",
			 "Richard.Zielke-Nathan Lloyd",
			 "michael.hawthorne-Nicole Chavez",
			 "Emmanuel Isip-Richard.Zielke",
			 "Jeremy Cook-Richard.Zielke",
			 "Richard.Zielke-Richard.Zielke",
			 "Sam Schafer-Richard.Zielke",
			 "Shyamashree Jana-Richard.Zielke",
			 "Anna Koh-robin.nojima",
			 "Annie Rainey-robin.nojima",
			 "Anthony Nguyen-robin.nojima",
			 "Apoorva Prasanna-robin.nojima",
			 "Ben Isaac-robin.nojima",
			 "Carolyn Gresswell-robin.nojima",
			 "Christopher Qiao-robin.nojima",
			 "Claire Toy-robin.nojima",
			 "Colin Cerretani-robin.nojima",
			 "Craig Berger-robin.nojima",
			 "Darlene Nguyen-robin.nojima",
			 "Erik Drobey-robin.nojima",
			 "Erika Vazquez-robin.nojima",
			 "Guadalupe Díaz-robin.nojima",
			 "Haley Raichelson-robin.nojima",
			 "Huan Yan-robin.nojima",
			 "Inés Resano Goizueta-robin.nojima",
			 "Ivette Vasquez-robin.nojima",
			 "Jake Fratkin-robin.nojima",
			 "James Chung-robin.nojima",
			 "Jane Yoo-robin.nojima",
			 "Jason Casolari (he/him)-robin.nojima",
			 "Jen Carr-robin.nojima",
			 "Jenny Hang-robin.nojima",
			 "Joshua Tsang-robin.nojima",
			 "Justin Wu-robin.nojima",
			 "Khai Tra-robin.nojima",
			 "Kyle Okada-robin.nojima",
			 "Leidy Valencia-robin.nojima",
			 "Lorna Gladstone-robin.nojima",
			 "Margaret Chi-robin.nojima",
			 "Mark Menesses-robin.nojima",
			 "Matt Dunn-robin.nojima",
			 "Melanie Woods-robin.nojima",
			 "Nicole Ikeuchi-robin.nojima",
			 "Olivia Nahoum-robin.nojima",
			 "Pat McGale-robin.nojima",
			 "Prachi Panchal-robin.nojima",
			 "Roi Rutenberg-robin.nojima",
			 "Sergey Trukhanov-robin.nojima",
			 "Sesh Gowrishankar-robin.nojima",
			 "Sneha Parab-robin.nojima",
			 "Souvik Das-robin.nojima",
			 "Steve Chakerian-robin.nojima",
			 "Tamara Murphy-robin.nojima",
			 "Tuan Truong-robin.nojima",
			 "Utthara Rameshbabu-robin.nojima",
			 "Will Koh-robin.nojima",
			 "Xin Li-robin.nojima",
			 "Yi Jin (she/her)-robin.nojima",
			 "Yiming Chen-robin.nojima",
			 "Abigail Kirchmer-saskia.green",
			 "Aneke Schwager-saskia.green",
			 "Anthony Nguyen-saskia.green",
			 "Brian Oberlin-saskia.green",
			 "Chris Button-saskia.green",
			 "Claire Toy-saskia.green",
			 "Colin Cerretani-saskia.green",
			 "Craig Berger-saskia.green",
			 "danny kirkendall-saskia.green",
			 "Darnella K.-saskia.green",
			 "Devin Licon-saskia.green",
			 "fawn.fang-saskia.green",
			 "Greg Yurich-saskia.green",
			 "Haley Raichelson-saskia.green",
			 "Huan Yan-saskia.green",
			 "Inés Resano Goizueta-saskia.green",
			 "Jake Fratkin-saskia.green",
			 "James Chung-saskia.green",
			 "Jane Yoo-saskia.green",
			 "Jason Casolari (he/him)-saskia.green",
			 "Jeremy Cook-saskia.green",
			 "Keely Sulprizio (she/her/hers)-saskia.green",
			 "Kyle Okada-saskia.green",
			 "Matt Dunn-saskia.green",
			 "Michael Sullivan-saskia.green",
			 "Milton Fong-saskia.green",
			 "Nicole Chavez-saskia.green",
			 "Nicole Ikeuchi-saskia.green",
			 "Olivia Nahoum-saskia.green",
			 "Osondu Ariwodo-saskia.green",
			 "Peter Travers-saskia.green",
			 "Ramean Behnam-saskia.green",
			 "rick.green-saskia.green",
			 "Sam Schafer-saskia.green",
			 "Sergey Trukhanov-saskia.green",
			 "Sesh Gowrishankar-saskia.green",
			 "Sophia Siddiqi-saskia.green",
			 "Steve Chakerian-saskia.green",
			 "Tamara Murphy-saskia.green",
			 "Tim Lucas-saskia.green",
			 "Tuan Truong-saskia.green",
			 "Utthara Rameshbabu-saskia.green",
			 "Richard.Zielke-Sergey Trukhanov",
			 "michael.hawthorne-Shiv Shinh",
			 "michael.hawthorne-Spencer Rodriguez",
			 "Richard.Zielke-Stefanie Hartt",
			 "michael.hawthorne-Tiffany Dang",
			 "Guadalupe Díaz-Vu",
			 "Inés Resano Goizueta-Vu",
			 "michael.hawthorne-Younes Jellal"
	        );
	 
	 List<String> newData = new ArrayList<>();
	 
	 for(String addencode : data) {
		 StringBuilder unicodeString = new StringBuilder();
		 for (char c : addencode.toCharArray()) {
			 if(String.format("\\u%04x", (int) c).equals("\\u002e")) {
				 unicodeString.append(String.format("\\u%04x", (int) c));
				 unicodeString.append("\\u200b");
			 }else {
				 unicodeString.append(String.format("\\u%04x", (int) c));
			 }
	            //
	            //System.out.println(c +"  : " + String.format("\\u%04x", (int) c));
	        }//.  : \u002e //For
		 
		  String unicodeEscaped = unicodeString.toString();//.replace("\\u", "");
		  StringBuilder result = new StringBuilder();
		    for (int i = 0; i < unicodeEscaped.length(); i += 6) {
		        String codePoint = unicodeEscaped.substring(i + 2, i + 6);
		        int hex = Integer.parseInt(codePoint, 16);
		        result.append((char) hex);
		    }
		 
		 System.out.println(unicodeEscaped.toString());
		 newData.add(result.toString()); 
	 }
	 
	 System.out.println(newData);
	 
	 for(String s : newData) {
		 System.out.println(s);
	 }

	// Define a mapping of incorrect sequences to their correct counterparts
     Map<String, String> corrections = new HashMap<>();
     corrections.put("ÃƒÂ©", "é"); // é
     corrections.put("ÃƒÂ­", "í"); // í
     corrections.put("ÃƒÂ±", "ñ"); // ñ
     corrections.put("ÃƒÂ¡", "á"); // á
     corrections.put("ÃƒÂº", "ú"); // ú
     corrections.put("ÃƒÂ³", "ó"); // ó
     corrections.put("DÃƒÂ­az", "Díaz"); // Díaz
     corrections.put("ÃƒÂ£", "ã"); // ã
     corrections.put("ÃƒÂ¨", "è"); // è
     corrections.put("ÃƒÂª", "ê"); // ê
     corrections.put("ÃƒÂ¤", "ä"); // ä
     corrections.put("ÃƒÂ»", "û"); // û
     corrections.put("ÃƒÂ´", "ô"); // ô
     corrections.put("ÃƒÂ¯", "ï"); // ï
     corrections.put("ÃƒÂ¶", "ö"); // ö
     corrections.put("ÃƒÂ¸", "ø"); // ø
     corrections.put("ÃƒÂª", "ê"); // ê
     corrections.put("Ã¢â‚¬â€¹", " ");
    // corrections.put(". ", ".");
	        // Add more mappings as needed

	        // Correct the strings
	       // List<String> correctedData = correctStrings(newData, corrections);
	        
	       // List<String> correctedData = correctStrings(data, corrections);

	        // Print corrected strings
//	        for (String corrected : correctedData) {
//	            System.out.println(corrected);
//	        }
	
	
     
	}
	
	
	
	 private static List<String> correctStrings(List<String> input, Map<String, String> corrections) {
	        List<String> correctedList = new ArrayList<>();
	        for (String str : input) {
	            String corrected = str;
	            for (Map.Entry<String, String> entry : corrections.entrySet()) {
	                corrected = corrected.replace(entry.getKey(), entry.getValue());
	            }
	            correctedList.add(corrected);
	        }
	        return correctedList;
	    }
	
	public static String encodeSharingUrl(String sharingUrl) {
        byte[] urlBytes = sharingUrl.getBytes(StandardCharsets.UTF_8);
        String base64Value = Base64.getEncoder().encodeToString(urlBytes);
        String encodedUrl = "u!" + base64Value.replace('/', '_').replace('+', '-').replaceAll("=+$", "");
        return encodedUrl;
    }
	}
