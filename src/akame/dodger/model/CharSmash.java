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

    public CharSmash() {}

    public CharSmash(String name) { 
        this.name = name;
        this.portrait = "/rsc/portraits/chr_13_" + name + "_01.png";
        this.checked = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getPortrait() {
        return portrait;
    }
    
    public void setPortrait(String portrait){
        this.portrait = portrait;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }


}
