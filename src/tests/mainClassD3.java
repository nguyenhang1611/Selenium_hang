package tests;

import main.registerAccount;
import main.verifyElement;

public class mainClassD3 {
	public static void main(String[] args) throws InterruptedException {
		verifyElement ex1 = new verifyElement();
		ex1.exercise1Day3();

		registerAccount regist = new registerAccount();
		regist.register();
	}
}
