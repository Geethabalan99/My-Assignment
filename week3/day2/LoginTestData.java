package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("User Name - Geetha Balan");
	}
	public void enterPassword() {
		System.out.println("Password is 12345");
	}
	public static void main(String[] args) {
		LoginTestData data=new LoginTestData();
		data.enterCredentials();	
		data.enterUsername();
		data.enterPassword();
		data.navigateToHomePage();
		
		
	}

}
