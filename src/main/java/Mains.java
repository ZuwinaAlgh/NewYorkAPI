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




public class Mains {
	
	results results;
    response response;
	
	public response getResponse() {
		return response;
	}

	public void setResponse(response response) {
		this.response = response;
	}

	public results getResults1() {
		return results;
	}

	public void setResults1(results results1) {
		this.results = results1;
	}
	
	
	
//	//calling Functions
//	public static void main(String [] args)throws IOException, InterruptedException{
//		InsertArticles.insert();
//		
//	}
	
//	public static void main(String [] args)throws IOException, InterruptedException{
//		
//		InsertAuthers.insert();	
//	}
	
public static void main(String [] args)throws IOException, InterruptedException{
		
	InsertSections.insert();	
	}
	
	
	

}
