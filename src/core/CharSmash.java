package core;

import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

public class CharSmash {

    private String name;
    private String portrait;
    private String icon;
    private boolean checked;

    public CharSmash() {

    }

    public CharSmash(String name) throws IOException {
        // TODO Ajouter les switch case pour les personnages -> name devra
        // correspondre à la ref de l'image
        this.name = getCorrectName(name);
        this.portrait = ".\\src\\rsc\\portraits\\chr_13_" + name + "_01.png";
        this.icon = ".\\src\\rsc\\icons\\chr_00_" + name + "_01.png";
    }

    public String getName() {
        return name;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getIcon() {
        return icon;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    private String getCorrectName(String name) {
        String correctName = "";
        switch (name) {
            case "bayonetta":
                correctName = "Bayonetta";
                break;
            case "koopa":
                correctName = "Bowser";
                break;
            case "koopajr":
                correctName = "Bowser Jr.";
                break;
            case "captain":
                correctName = "Captain Falcon";
                break;
            case "lizardon":
                correctName = "Dracaufeu";
                break;
            case "cloud":
                correctName = "Cloud";
                break;
            case  "kamui":
                correctName = "Corrin";
                break;
            case "pitb":
                correctName = "Pit Maléfique";
                break;
            case "purin":
                correctName = "Rondoudou";
                break;
            case "donkey":
                correctName = "Donkey Kong";
                break;
            case "drmario":
                correctName = "Dr. Mario";
                break;
            case "duckhunt":
                correctName = "Duo Duck Hunt";
                break;
            case "falco":
                correctName = "Falco";
                break;
            case "fox":
                correctName = "Fox";
                break;
            case "ganon":
                correctName = "Ganondorf";
                break;
            case "gekkouga":
                correctName = "Amphinobi";
                break;
            case "ike":
                correctName = "Ike";
                break;
            case "dedede":
                correctName = "Roi Dadidou";
                break;
            case "kirby":
                correctName = "Kirby";
                break;
            case "link":
                correctName = "Link";
                break;
            case "littlemac":
                correctName = "Little Mac";
                break;
            case "lucario":
                correctName = "Lucario";
                break;
            case "lucas":
                correctName = "Lucas";
                break;
            case "lucina":
                correctName = "Lucina";
                break;
            case "luigi":
                correctName = "Luigi";
                break;
            case "mario":
                correctName = "Mario";
                break;
            case "marth":
                correctName = "Marth";
                break;
            case "rockman":
                correctName = "Mega Man";
                break;
            case "metaknight":
                correctName = "Meta Knight";
                break;
            case "mewtwo":
                correctName = "Mewtwo";
                break;
            case "gamewatch":
                correctName = " Mr.Game&Watch";
                break;
            case "ness":
                correctName = "Ness";
                break;
            case "pikmin":
                correctName = "Olimar";
                break;
            case "pacman":
                correctName = "Pac-Man";
                break;
            case "palutena":
                correctName = "Palutena";
                break;
            case "peach":
                correctName = "Peach";
                break;
            case "pikachu":
                correctName = "Pikachu";
                break;
            case "pit":
                correctName = "Pit";
                break;
            case "robot":
                correctName = "R.O.B";
                break;
            case "reflet":
                correctName = "Daraen";
                break;
            case "rosetta":
                correctName = "Harmonie et Luma";
                break;
            case "roy":
                correctName = "Roy";
                break;
            case "ryu":
                correctName = "Ryu";
                break;
            case "samus":
                correctName = "Samus";
                break;
            case "sheik":
                correctName = "Sheik";
                break;
            case "shulk":
                correctName = "Shulk";
                break;
            case "sonic":
                correctName = "Sonic";
                break;
            case "toonlink":
                correctName = "Link Cartoon";
                break;
            case "murabito":
                correctName = "Villageois";
                break;
            case "wario":
                correctName = "Wario";
                break;
            case "wiifit":
                correctName = "Entraîneuse Wii Fit";
                break;
            case "yoshi":
                correctName = "Yoshi";
                break;
            case "zelda":
                correctName = "Zelda";
                break;
            case "szerosuit":
                correctName = "Samus Sans Armure";
                break;
            case "miiswordsman":
                correctName = "Mii épéiste";
                break;
            case "miifighter":
                correctName = "Mii combattant";
                break;
            case "miigunner":
                correctName = "Mii tireur";
                break;
        }

        return correctName;
    }

}
