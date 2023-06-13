import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SharePointFileExistenceChecker {
    public static void main(String[] args) {
        String siteUrl = "https://your-domain.sharepoint.com/sites/your-site";
        String fileUrl = "/sites/your-site/Shared Documents/your-folder/your-file.docx";
        boolean fileExists = checkFileExistence(siteUrl, fileUrl);
        System.out.println("File exists: " + fileExists);
    }

    public static boolean checkFileExistence(String siteUrl, String fileUrl) {
        boolean fileExists = false;
        try {
            URL url = new URL(siteUrl + "/_api/web/GetFileByServerRelativeUrl('" + fileUrl + "')?$select=Exists");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json;odata=nometadata");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                String jsonResponse = response.toString();
                if (jsonResponse.contains("\"Exists\":true")) {
                    fileExists = true;
                }
            } else {
                System.out.println("Error: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileExists;
    }
}
