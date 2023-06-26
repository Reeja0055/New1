package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String actual_title =driver.getTitle();
		System.out.println("actual title is: "+actual_title);
		
		String expected ="Google.com";
		if(actual_title.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}

}
