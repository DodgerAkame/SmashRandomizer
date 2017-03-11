package akame.dodger.test;

import java.io.File;
import java.io.IOException;

import akame.dodger.controller.Controller;

public class Main {

	public static void main(String[] args) {
		try {
			Controller controller = new Controller();
			System.out.println(controller.readSave(new File("save.txt")).size());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
