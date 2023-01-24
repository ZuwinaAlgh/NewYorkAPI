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
			
				
				try {
					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			            DriverManager.registerDriver(driver);

			            con = DriverManager.getConnection(url, user, pass);

			            Statement st = con.createStatement();
			           
			            Scanner sa=new Scanner(System.in);
			        	System.out.println("Enter id: ");
			            int idinput =sa.nextInt();
			            int count=0;
			            String sql = 
			            ResultSet rs=st.executeQuery(sql);
			            
				} catch (Exception ex) {
					// Display message when exceptions occurs
					System.err.println(ex);
				}
		
			}
	
	public static void Top10Articles() throws IOException, InterruptedException{
 		
 		//What are the top 10 articles with the most views?
 		
 		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
 		String user = "sa";
 		String pass = "root";
 		Connection con ;
 			
 				
 				try {
 					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
 			            DriverManager.registerDriver(driver);

 			            con = DriverManager.getConnection(url, user, pass);

 			            Statement st = con.createStatement();
 			           
 			            String sql = "SELECT author, COUNT(*) as articales_Numbers FROM authors Group by author;";
 			            ResultSet rs=st.executeQuery(sql);
 			            
 			            
 				} catch (Exception ex) {
 					// Display message when exceptions occurs
 					System.err.println(ex);
 				}
 		
 			}
         public static void ArticlesNumbers() throws IOException, InterruptedException{
		
		//How many articles were written by each author?
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		Connection con ;
			
				
				try {
					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			            DriverManager.registerDriver(driver);

			            con = DriverManager.getConnection(url, user, pass);

			            Statement st = con.createStatement();
			           
			            String sql = "SELECT author, COUNT(*) as articales_Numbers FROM authors Group by author;";
			            ResultSet rs=st.executeQuery(sql);
			            
			            
				} catch (Exception ex) {
					// Display message when exceptions occurs
					System.err.println(ex);
				}
		
			}
         
         
         
         public static void PublishedDate() throws IOException, InterruptedException{
      		
      		//How many articles were published each month in the year 2021?
      		
      		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
      		String user = "sa";
      		String pass = "root";
      		Connection con ;
      			
      				
      				try {
      					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
      			            DriverManager.registerDriver(driver);

      			            con = DriverManager.getConnection(url, user, pass);

      			            Statement st = con.createStatement();
      			           
      			            String sql = "SELECT published_date, COUNT(*) as articales_Published_2021 FROM articles where published_date between'2021-01-01' and '2021-12-31' Group by published_date;";
      			            ResultSet rs=st.executeQuery(sql);
      			            
      			            
      				} catch (Exception ex) {
      					// Display message when exceptions occurs
      					System.err.println(ex);
      				}
      		
      			}
         
         public static void mostPublished() throws IOException, InterruptedException{
       		
       		//Which section had the most articles published on a particular day?
       		
       		String url = "jdbc:sqlserver://localhost:1433;databaseName=Artical;encrypt=true;trustServerCertificate=true";
       		String user = "sa";
       		String pass = "root";
       		Connection con ;
       			
       				
       				try {
       					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
       			            DriverManager.registerDriver(driver);

       			            con = DriverManager.getConnection(url, user, pass);

       			            Statement st = con.createStatement();
       			           
       			            String sql = "SELECT published_date, COUNT(*) as articales_Published_2021 FROM articles where published_date between'2021-01-01' and '2021-12-31' Group by published_date;";
       			            ResultSet rs=st.executeQuery(sql);
       			            
       			            
       				} catch (Exception ex) {
       					// Display message when exceptions occurs
       					System.err.println(ex);
       				}
       		
       			}
		
		
	}


