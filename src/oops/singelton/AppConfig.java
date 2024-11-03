package oops.singelton;

public class AppConfig {
	private AppConfig() {
		
	}
	private static AppConfig obj = null;
			
	
	public static AppConfig getInstance() {  //Only return the single Instance of AppConfig Class
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
	}
	
}
