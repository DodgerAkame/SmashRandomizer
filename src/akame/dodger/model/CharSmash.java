package akame.dodger.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

/**
 *
 * @author DodgerAkame
 */

public class CharSmash {

	private String portrait;
	private boolean checked;
	private String name;

	public CharSmash() {
	}

	public CharSmash(String name) {
		this.name = name;
		this.checked = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public ImageIcon getIcon() {
		// TODO Auto-generated method stub
		return new ImageIcon("chr_00_" + name + "_01.png");
	}

}
