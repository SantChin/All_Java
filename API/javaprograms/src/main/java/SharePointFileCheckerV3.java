import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class SharePointFileCheckerV3 {

    private static final String SITE_URL = "https://cloudfuzecom.sharepoint.com/sites/Janustest";
    private static final String DOCUMENT_LIBRARY_TITLE = "Document Library Title";
    private static final String FILE_GUID = "0E85DE8F-73D7-43AE-B0C5-A9D07F9CF8FF"; // Replace with the file's unique ID (GUID)

    public static void main(String[] args) {
        boolean isFileExist = checkIfFileExists(FILE_GUID);
        if (isFileExist) {
            System.out.println("File with GUID " + FILE_GUID + " exists in SharePoint.");
        } else {
            System.out.println("File with GUID " + FILE_GUID + " does not exist in SharePoint.");
        }
    }

    public static boolean checkIfFileExists(String fileGuid) {
        try {
            String endpoint = SITE_URL + "/_api/web/lists/getByTitle('" + DOCUMENT_LIBRARY_TITLE + "')/items?$filter=File/UniqueId eq '" + fileGuid + "'";
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            String auth = getAuthorization();
            connection.setRequestProperty("Authorization", auth);
            connection.setRequestProperty("Accept", "application/json;odata=verbose");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();
                String jsonResponse = response.toString();
                if (jsonResponse.contains(fileGuid)) {
                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static String getAuthorization() {
        String username = "your-username";
        String password = "your-password";
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes());
        return "Basic " + new String(encodedAuth);
    }
}
