import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SharePointFileExistenceCheckerV2 {
    public static void main(String[] args) {
        String siteUrl = "https://cloudfuzecom.sharepoint.com/sites/Janustest"; // Replace with your SharePoint site URL
        String fileUrl = "https://cloudfuzecom.sharepoint.com/:x:/s/Janustest/EUGswOeqFahPh7xyFRsVFpMBy3pkgnGYXNc7TikFo375kw?e=jPoOSy"; // Replace with your file URL

        boolean isFileExists = checkFileExistence(siteUrl, fileUrl);
        if (isFileExists) {
            System.out.println("File exists in SharePoint Online.");
        } else {
            System.out.println("File does not exist in SharePoint Online.");
        }
    }

    static boolean checkFileExistence(String siteUrl, String fileUrl) {
        boolean isFileExists = false;
        try {
            // Create the REST URL for checking file existence
            String restUrl = siteUrl + "/_api/web/GetFileByServerRelativeUrl('" + fileUrl + "')?$select=Exists";
            URL url = new URL(restUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json;odata=nometadata");
            conn.connect();
            
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String response = "";
                String line;
                while ((line = br.readLine()) != null) {
                    response += line;
                }
                br.close();
                
                // Parse the response and check if file exists
                if (response.contains("\"Exists\": true")) {
                    isFileExists = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFileExists;
    }
}
