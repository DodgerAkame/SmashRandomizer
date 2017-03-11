/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akame.dodger.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import akame.dodger.model.CharSmash;

/**
 *
 * @author DodgerAkame
 */
public class Controller {

	private ArrayList<CharSmash> roster = new ArrayList<CharSmash>();

	public Controller() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("Roster.txt")));
		String buffer;
		while ((buffer = br.readLine()) != null) {
			roster.add(new CharSmash(buffer));
		}
		
		List<String> names = readSave(new File("save.txt"));
		for (CharSmash charSmash : roster)
			if (!names.contains(charSmash.getName()))
				charSmash.setChecked(!charSmash.isChecked());
	}

	public ArrayList<CharSmash> getRoster() {
		return roster;
	}

	public void setRoster(ArrayList<CharSmash> roster) {
		this.roster = roster;
	}

	public CharSmash getCharacter(String character){
		int index = -1;
		
		for (int i = 0; i < roster.size(); i++)
			if(roster.get(i).getName().equals(character))
				return roster.get(i);
		
		return null;
	}

	public void writeSave() throws Exception {
		ArrayList<String> names = new ArrayList<String>();

		for (CharSmash character : roster)
			if (character.isChecked())
				names.add(character.getName());

		Path save = Paths.get("save.txt");
		PrintWriter printWriter = new PrintWriter(save.getFileName().toString());
		printWriter.close();
		
		Files.write(save, names, Charset.forName("UTF-8"));

		// TODO créer un fichier si non existant
	}
	
	public List<String> readSave(File file) throws Exception{
		return Files.readAllLines(file.toPath());
	}
}
