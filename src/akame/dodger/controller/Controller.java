/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akame.dodger.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import akame.dodger.model.CharSmash;

/**
 *
 * @author DodgerAkame
 */
public class Controller {

	private ArrayList<CharSmash> roster = new ArrayList<CharSmash>();

	public Controller() throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("Roster.txt")));
//		String buffer;
//		while ((buffer = br.readLine()) != null) {
//			roster.add(new CharSmash(buffer));
//		}
		//TODO Décommenter dès que possible
		roster.add(new CharSmash("bayonetta"));
		roster.add(new CharSmash("captain"));
		roster.add(new CharSmash("cloud"));
		roster.add(new CharSmash("dedede"));
		
	}

	public ArrayList<CharSmash> getRoster() {
		return roster;
	}

	public void setRoster(ArrayList<CharSmash> roster) {
		this.roster = roster;
	}

	// TODO gérer actions ici hein, pas dans la vue

}
