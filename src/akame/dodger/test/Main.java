package akame.dodger.test;

import java.io.IOException;

import akame.dodger.controller.Controller;

public class Main {

	public static void main(String[] args) {
		try {
			Controller controller = new Controller();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
