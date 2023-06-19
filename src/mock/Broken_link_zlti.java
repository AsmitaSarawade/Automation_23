package mock;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link_zlti {
	
	public static void main(String[] args) throws IOException {
        String homePage = "http://www.zlti.com";
        HttpURLConnection huc = null;
        int respCode = 200;
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.zlti.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	 Iterator<WebElement> it = links.iterator();
     String url="";
     while(it.hasNext())
     {
    	 //The code below will retrieve the href of the anchor tag and store it in the URL variable.
      url = it.next().getAttribute("href");
         
         System.out.println(url);
     //If the URL is null or Empty, skip the steps after this.
         if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
             continue;
         }
         //If the URL belongs to the main domain, continue. If it belongs to a third party domain, skip the steps after this.
         if(!url.startsWith(homePage)){
             System.out.println("URL belongs to another domain, skipping it.");
             continue;
         }
         try {
        	 //Methods in the HttpURLConnection class will send HTTP requests and capture the HTTP response code.
        	 //Therefore, the output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
             huc = (HttpURLConnection)(new URL(url).openConnection());
             //If testers set Request type as “HEAD” instead of “GET”, only headers will be returned, not the document body.
             huc.setRequestMethod("HEAD");
             //When the tester invokes the connect() method, the actual connection to the URL is established and the HTTP request is sent.
             huc.connect();
             
             respCode = huc.getResponseCode();
             
             if(respCode >= 400){
                 System.out.println(url+" is a broken link");
             }
             else{
                 System.out.println(url+" is a valid link");
             }
                 
         } catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
	}
	}
}
