package Webdriver_Method.Manage_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//first line of code 
	    WebDriver driver=new ChromeDriver();
	    
	    //capture the dimension object 
	    Dimension dimension =driver.manage().window().getSize();
	    
	    System.out.println("before maximize");
	    //print the dimension
	    System.out.println("Dimension:" + dimension);
	    
	    //print the width
	    System.out.println("width : " +dimension.getWidth()+"pixel");
	    
	  //print the height
	   System.out.println("Height : " +dimension.getHeight()+"pixel");
	   
	   System.out.println("after maximize");
	   
	   driver.manage().window().maximize();
	   
	   //capture the dimension object
	   dimension =driver.manage().window().getSize();
	   
	   //printing the width
	   System.out.println("Width : " + dimension.getWidth()+"pixel");
      
	 //printing the height
	   System.out.println("Height : " + dimension.getHeight()+"pixel");
	     
	}

}

