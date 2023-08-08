package Testng;

import org.testng.annotations.Test;

public class Demo {

	@Test(priority = 1)
		public static void createAccount() {
		System.out.println("value");	
		}
	@Test(priority = 2)
	public  void modifyAccount() {
		System.out.println("modified");
	}
	@Test(priority = 3)
	public  void modifyvaluee() {
		System.out.println("modified value");
		}

	}


