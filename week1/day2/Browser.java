package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Url loaded successfully"); 
		
	}
	public static void main(String[] args) {
		Browser Brow=new Browser();
		System.out.println(Brow.launchBrowser("Edge"));
		Brow.loadUrl();
		
		
	}
	
    
	}