package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {

    private FileReader fr;
    private List<CharSmash> roster = new ArrayList<CharSmash>();
    private Random rand;

   /* public Randomizer(File file) throws IOException {
        fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String buffer;
        while ((buffer = br.readLine()) != null) {
            roster.add(new CharSmash(buffer)); // Construction de la map avec tout les personnages
        }
    }*/
    
     public Randomizer(BufferedReader br) throws IOException {
        String buffer;
        while ((buffer = br.readLine()) != null) {
            roster.add(new CharSmash(buffer)); // Construction de la map avec tout les personnages
        }
    }

    public List<CharSmash> getRoster() {
        return roster;
    }

    public void setRoster(List<CharSmash> roster) {
        this.roster = roster;
    }

    public CharSmash drawChar() {
        rand = new Random();
        return roster.get(rand.nextInt(roster.size()));
    }

    public boolean getChar(String name) {

        for (CharSmash cs : roster) {
            if (cs.getName().equals(name)) {
                if (cs.isChecked()) {
                    cs.setChecked(false);
                    return true;
                } else {
                    cs.setChecked(true);
                    return false;
                }
            }

        }
        return false;
    }

}
