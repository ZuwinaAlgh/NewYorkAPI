import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class InsertAuthers{
	
	public static void insert() throws IOException, InterruptedException{
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con ;
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=X6HQXpdkS5Iqv0M8PTmGmSd4veJz7vMi")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String uglyJsonString = response.body();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jp = new JsonParser();
				
			
			Mains insertAuthers = gson.fromJson(uglyJsonString, Mains.class);
				for (int i=0; i<=uglyJsonString.length(); i++) {
					String title =insertAuthers.getResults1().getBooks()[i].getTitle();
					String author =insertAuthers.getResults1().getBooks()[i].getAuthor();
					String description = insertAuthers.getResults1().getBooks()[i].getDescription();
					String book_uri=insertAuthers.getResults1().getBooks()[i].getBook_uri();
			
					String SQLqueryForInserting = "insert into authors(title, author, description,book_uri )"
							+ " values('" + title  + "', '" + author+ "',' " +description+  "','"+book_uri+"')";
				
					
					
					
		    try {
						Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
						DriverManager.registerDriver(driver);
						con = DriverManager.getConnection(url, user, pass);
						java.sql.Statement st = con.createStatement();
						// Executing query
						
						int m = st.executeUpdate(SQLqueryForInserting );
						if (m >0)
							System.out.println("inserted successfully **** " );
						else
							System.out.println("insertion failed **** ");
						// Closing the connections
						con.close();
					} catch (Exception ex) {
						// Display message when exceptions occurs
						System.err.println(ex);
					}
			
				}
	}

}
