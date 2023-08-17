package Desition_making;
import java.net.URL;




public class Validate_Url_Valid_Or_Not {

	public static void main(String[] args) {
		
		String urls ="https://www.swiggy.com/";
		
		if(isValidUrl(urls)) {
			System.out.println("Url is Valid");
			
		}else {
			System.out.println("Url not valid");
		}
		

	}

	public static boolean isValidUrl( String input) {
		// TODO Auto-generated method stub
		try {
		 new URL(input);
		return true;
	
	}catch (Exception e) {
		
		return false;
	}
	}

}
