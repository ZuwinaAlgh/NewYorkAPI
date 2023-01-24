import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Scanner;

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


	public static void main(String[] args) throws IOException, InterruptedException {
		boolean menuExit = true;
		Scanner sa = new Scanner(System.in);
        while (menuExit) {
	                      System.out.println("####################");
	                      System.out.println("1.Insert Articles Data");
	                      System.out.println("2.Insert Authers Data");
	                      System.out.println("3.Insert Sections Data");
	                      System.out.println("4.top 5 sections with the most articles");
	                      System.out.println("5.How many articles were written by each author");
	                      System.out.println("6.What are the top 10 articles with the most views?");
	                      System.out.println("7.How many articles were published each month in the year 2021?");
	                      System.out.println("8.Which section had the most articles published on a particular day?");
	                      System.out.println("####################");
	                      String menu = sa.next();
	                      int option = Integer.parseInt(menu);
	                      switch (option) {
	                      case 1:
		                           InsertArticles.insert();
		                  break;

	                      case 2:
		                           InsertAuthers.insert();
		                  break;
	                      case 3:
		                           InsertSections.insert();
		                  break;
	                      case 4:
	                    	       SQLQueries.Top5Sections();  
	                   	  break;
	                      case 5:
	                    	       SQLQueries.ArticlesNumbers(); 
	                    	  break;
	                      case 6:
	                    	       SQLQueries.Top10Articles();
	                    	  break;
	                      case 7:
	                    	       SQLQueries.PublishedDate();
	                    	  break;
	                      case 8:
	                    	       SQLQueries.mostPublished();
	                    	 

	                    	  
	                    }
                        }
                         menuExit = false;

                        }
                        }
