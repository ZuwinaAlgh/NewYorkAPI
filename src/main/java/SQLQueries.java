import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class SQLQueries {
	
	public static void Top5Sections() throws IOException, InterruptedException{
		
		//What are the top 5 sections with the most articles
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con ;
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://universities.hipolabs.com/search?country=United+States")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String uglyJsonString = response.body();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jp = new JsonParser();
			
				
				try {
					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			            DriverManager.registerDriver(driver);

			            con = DriverManager.getConnection(url, user, pass);

			            Statement st = con.createStatement();
			           
			            Scanner sa=new Scanner(System.in);
			        	System.out.println("Enter id: ");
			            int idinput =sa.nextInt();
			            int count=0;
			            String sql = "UPDATE ApiTable SET web_pages = 'www.razan.com', alpha_two_code = 'Oman' "+" WHERE id = '"+idinput+"'";
			            ResultSet rs=st.executeQuery(sql);
			            
				} catch (Exception ex) {
					// Display message when exceptions occurs
					System.err.println(ex);
				}
		
			}
		
		
	}

}
