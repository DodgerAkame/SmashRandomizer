package core;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

public class CharSmash {

    private String portrait;
    private boolean checked;
    private String name;

    public CharSmash() {

    }

    public CharSmash(String name) throws IOException {
        // TODO Ajouter les switch case pour les personnages -> name devra
        // correspondre à la ref de l'image
        this.name = name;
        //this.portrait = ".\\src\\rsc\\portraits\\chr_13_" + name + "_01.png";
        this.portrait = "/rsc/portraits/chr_13_" + name + "_01.png";
        this.checked = true;
    }

    public String getName() {
        return name;
    }

    public String getPortrait() {
        return portrait;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
