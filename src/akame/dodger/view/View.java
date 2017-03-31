/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akame.dodger.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import akame.dodger.controller.Controller;
import akame.dodger.model.CharSmash;

/**
 *
 * @author Dodger
 */
public class View extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1410045969634068628L;

	/**
	 * Creates new form View
	 */
	public View() {
		File file = new File("save.txt");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(rootPane, "An error occured during creation of save file");
			}

		initComponents();

		act = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (CharSmash character : controller1.getRoster())
					if (character.getName().equals(e.getActionCommand())) {
						character.setChecked(!character.isChecked());
						if (!character.isChecked()) {

							tintToogle((JToggleButton) e.getSource());

						} else {
							((JToggleButton) e.getSource()).setIcon(new ImageIcon(new ImageIcon(getClass()
									.getResource("/akame/dodger/rsc/icons/chr_00_" + character.getName() + "_01.png"))
											.getImage().getScaledInstance(75, 75, BufferedImage.SCALE_SMOOTH)));
							((JToggleButton) e.getSource()).setBackground(null);
						}

						try {
							controller1.writeSave();
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(rootPane, "A problem occured with the file save.txt.");
							e1.printStackTrace();
							// TODO Faire un log d'erreur
						}

						return;
					}
			}
		};

		drmario.addActionListener(act);
		mario.addActionListener(act);
		luigi.addActionListener(act);
		peach.addActionListener(act);
		koopa.addActionListener(act);
		koopajr.addActionListener(act);
		rosetta.addActionListener(act);
		yoshi.addActionListener(act);
		donkey.addActionListener(act);
		diddy.addActionListener(act);
		link.addActionListener(act);
		zelda.addActionListener(act);
		sheik.addActionListener(act);
		ganon.addActionListener(act);
		toonlink.addActionListener(act);
		samus.addActionListener(act);
		szerosuit.addActionListener(act);
		kirby.addActionListener(act);
		metaknight.addActionListener(act);
		dedede.addActionListener(act);
		fox.addActionListener(act);
		falco.addActionListener(act);
		pikachu.addActionListener(act);
		purin.addActionListener(act);
		mewtwo.addActionListener(act);
		lizardon.addActionListener(act);
		lucario.addActionListener(act);
		gekkouga.addActionListener(act);
		captain.addActionListener(act);
		ness.addActionListener(act);
		lucas.addActionListener(act);
		marth.addActionListener(act);
		roy.addActionListener(act);
		ike.addActionListener(act);
		reflet.addActionListener(act);
		lucina.addActionListener(act);
		kamui.addActionListener(act);
		gamewatch.addActionListener(act);
		pit.addActionListener(act);
		palutena.addActionListener(act);
		pitb.addActionListener(act);
		wario.addActionListener(act);
		pikmin.addActionListener(act);
		robot.addActionListener(act);
		sonic.addActionListener(act);
		murabito.addActionListener(act);
		littlemac.addActionListener(act);
		wiifit.addActionListener(act);
		duckhunt.addActionListener(act);
		shulk.addActionListener(act);
		rockman.addActionListener(act);
		pacman.addActionListener(act);
		ryu.addActionListener(act);
		cloud.addActionListener(act);
		bayonetta.addActionListener(act);
		miifighter.addActionListener(act);
		miigunner.addActionListener(act);
		miiswordman.addActionListener(act);

	}

	private void tintToogle(JToggleButton e) {

		BufferedImage bimage = new BufferedImage(e.getIcon().getIconWidth(), e.getIcon().getIconHeight(),
				BufferedImage.TYPE_4BYTE_ABGR);

		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(((ImageIcon) e.getIcon()).getImage(), 0, 0, null);
		bGr.dispose();

		BufferedImage biresult = new BufferedImage(e.getIcon().getIconWidth(), e.getIcon().getIconHeight(),
				BufferedImage.TYPE_4BYTE_ABGR);

		float data[] = { 0.0625f, 0.125f, 0.0625f, 0.125f, -0.25f, 0.125f, 0.0625f, 0.125f, 0.0625f };
		Kernel kernel = new Kernel(3, 3, data);
		ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_ZERO_FILL, null);
		convolve.filter(bimage, biresult);

		e.setBackground(Color.DARK_GRAY);

		e.setIcon(new ImageIcon(biresult.getSubimage(0, 11, 75, 50)));

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// TODO gérer erreur & nombre boucle pour buttonGroup
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		try {
			controller1 = new Controller();
		} catch (Exception e) {
			e.printStackTrace();
		}
		buttonGroup1 = new javax.swing.ButtonGroup();
		result = new javax.swing.JLabel();
		draw = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		drmario = new javax.swing.JToggleButton();
		mario = new javax.swing.JToggleButton();
		luigi = new javax.swing.JToggleButton();
		peach = new javax.swing.JToggleButton();
		koopa = new javax.swing.JToggleButton();
		koopajr = new javax.swing.JToggleButton();
		rosetta = new javax.swing.JToggleButton();
		yoshi = new javax.swing.JToggleButton();
		donkey = new javax.swing.JToggleButton();
		diddy = new javax.swing.JToggleButton();
		link = new javax.swing.JToggleButton();
		zelda = new javax.swing.JToggleButton();
		sheik = new javax.swing.JToggleButton();
		ganon = new javax.swing.JToggleButton();
		toonlink = new javax.swing.JToggleButton();
		samus = new javax.swing.JToggleButton();
		szerosuit = new javax.swing.JToggleButton();
		kirby = new javax.swing.JToggleButton();
		metaknight = new javax.swing.JToggleButton();
		dedede = new javax.swing.JToggleButton();
		fox = new javax.swing.JToggleButton();
		falco = new javax.swing.JToggleButton();
		pikachu = new javax.swing.JToggleButton();
		purin = new javax.swing.JToggleButton();
		mewtwo = new javax.swing.JToggleButton();
		lizardon = new javax.swing.JToggleButton();
		lucario = new javax.swing.JToggleButton();
		gekkouga = new javax.swing.JToggleButton();
		captain = new javax.swing.JToggleButton();
		ness = new javax.swing.JToggleButton();
		lucas = new javax.swing.JToggleButton();
		marth = new javax.swing.JToggleButton();
		roy = new javax.swing.JToggleButton();
		ike = new javax.swing.JToggleButton();
		reflet = new javax.swing.JToggleButton();
		lucina = new javax.swing.JToggleButton();
		kamui = new javax.swing.JToggleButton();
		gamewatch = new javax.swing.JToggleButton();
		pit = new javax.swing.JToggleButton();
		palutena = new javax.swing.JToggleButton();
		pitb = new javax.swing.JToggleButton();
		wario = new javax.swing.JToggleButton();
		pikmin = new javax.swing.JToggleButton();
		robot = new javax.swing.JToggleButton();
		sonic = new javax.swing.JToggleButton();
		murabito = new javax.swing.JToggleButton();
		littlemac = new javax.swing.JToggleButton();
		wiifit = new javax.swing.JToggleButton();
		duckhunt = new javax.swing.JToggleButton();
		shulk = new javax.swing.JToggleButton();
		rockman = new javax.swing.JToggleButton();
		pacman = new javax.swing.JToggleButton();
		ryu = new javax.swing.JToggleButton();
		cloud = new javax.swing.JToggleButton();
		bayonetta = new javax.swing.JToggleButton();
		miifighter = new javax.swing.JToggleButton();
		miigunner = new javax.swing.JToggleButton();
		miiswordman = new javax.swing.JToggleButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		openFile = new javax.swing.JMenuItem();
		saveFile = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		quit = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Smash Randomizer");

		draw.setText("Draw a character");
		draw.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				drawActionPerformed(evt);
			}
		});

		jPanel1.setLayout(new java.awt.GridLayout(8, 8, 5, 2));

		drmario.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_drmario_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		drmario.setAlignmentY(0.0F);
		drmario.setMargin(new java.awt.Insets(0, 0, 0, 0));
		drmario.setName("drmario"); // NOI18N
		drmario.setActionCommand("drmario");
		if (!controller1.getCharacter(drmario.getName()).isChecked())
			tintToogle(drmario);
		jPanel1.add(drmario);

		mario.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_mario_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		mario.setAlignmentY(0.0F);
		mario.setMargin(new java.awt.Insets(0, 0, 0, 0));
		mario.setName("mario"); // NOI18N
		mario.setActionCommand("mario");
		if (!controller1.getCharacter(mario.getName()).isChecked())
			tintToogle(mario);
		jPanel1.add(mario);

		luigi.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_luigi_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		luigi.setAlignmentY(0.0F);
		luigi.setMargin(new java.awt.Insets(0, 0, 0, 0));
		luigi.setName("luigi"); // NOI18N
		luigi.setActionCommand("luigi");
		if (!controller1.getCharacter(luigi.getName()).isChecked())
			tintToogle(luigi);
		jPanel1.add(luigi);

		peach.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_peach_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		peach.setAlignmentY(0.0F);
		peach.setMargin(new java.awt.Insets(0, 0, 0, 0));
		peach.setName("peach"); // NOI18N
		peach.setActionCommand("peach");
		if (!controller1.getCharacter(peach.getName()).isChecked())
			tintToogle(peach);
		jPanel1.add(peach);

		koopa.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_koopa_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		koopa.setAlignmentY(0.0F);
		koopa.setMargin(new java.awt.Insets(0, 0, 0, 0));
		koopa.setName("koopa"); // NOI18N
		koopa.setActionCommand("koopa");
		if (!controller1.getCharacter(koopa.getName()).isChecked())
			tintToogle(koopa);
		jPanel1.add(koopa);

		koopajr.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_koopajr_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		koopajr.setAlignmentY(0.0F);
		koopajr.setMargin(new java.awt.Insets(0, 0, 0, 0));
		koopajr.setName("koopajr"); // NOI18N
		koopajr.setActionCommand("koopajr");
		if (!controller1.getCharacter(koopajr.getName()).isChecked())
			tintToogle(koopajr);
		jPanel1.add(koopajr);

		rosetta.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_rosetta_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		rosetta.setAlignmentY(0.0F);
		rosetta.setMargin(new java.awt.Insets(0, 0, 0, 0));
		rosetta.setName("rosetta"); // NOI18N
		rosetta.setActionCommand("rosetta");
		if (!controller1.getCharacter(rosetta.getName()).isChecked())
			tintToogle(rosetta);
		jPanel1.add(rosetta);

		yoshi.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_yoshi_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		yoshi.setAlignmentY(0.0F);
		yoshi.setMargin(new java.awt.Insets(0, 0, 0, 0));
		yoshi.setName("yoshi"); // NOI18N
		yoshi.setActionCommand("yoshi");
		if (!controller1.getCharacter(yoshi.getName()).isChecked())
			tintToogle(yoshi);
		jPanel1.add(yoshi);

		donkey.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_donkey_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		donkey.setAlignmentY(0.0F);
		donkey.setMargin(new java.awt.Insets(0, 0, 0, 0));
		donkey.setName("donkey"); // NOI18N
		donkey.setActionCommand("donkey");
		if (!controller1.getCharacter(donkey.getName()).isChecked())
			tintToogle(donkey);
		jPanel1.add(donkey);

		diddy.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_diddy_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		diddy.setAlignmentY(0.0F);
		diddy.setMargin(new java.awt.Insets(0, 0, 0, 0));
		diddy.setName("diddy"); // NOI18N
		diddy.setActionCommand("diddy");
		if (!controller1.getCharacter(diddy.getName()).isChecked())
			tintToogle(diddy);
		jPanel1.add(diddy);

		link.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_link_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		link.setAlignmentY(0.0F);
		link.setMargin(new java.awt.Insets(0, 0, 0, 0));
		link.setName("link"); // NOI18N
		link.setActionCommand("link");
		if (!controller1.getCharacter(link.getName()).isChecked())
			tintToogle(link);
		jPanel1.add(link);

		zelda.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_zelda_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		zelda.setAlignmentY(0.0F);
		zelda.setMargin(new java.awt.Insets(0, 0, 0, 0));
		zelda.setName("zelda"); // NOI18N
		zelda.setActionCommand("zelda");
		if (!controller1.getCharacter(zelda.getName()).isChecked())
			tintToogle(zelda);
		jPanel1.add(zelda);

		sheik.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_sheik_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		sheik.setAlignmentY(0.0F);
		sheik.setMargin(new java.awt.Insets(0, 0, 0, 0));
		sheik.setName("sheik"); // NOI18N
		sheik.setActionCommand("sheik");
		if (!controller1.getCharacter(sheik.getName()).isChecked())
			tintToogle(sheik);
		jPanel1.add(sheik);

		ganon.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_ganon_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		ganon.setAlignmentY(0.0F);
		ganon.setMargin(new java.awt.Insets(0, 0, 0, 0));
		ganon.setName("ganon"); // NOI18N
		ganon.setActionCommand("ganon");
		if (!controller1.getCharacter(ganon.getName()).isChecked())
			tintToogle(ganon);
		jPanel1.add(ganon);

		toonlink.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_toonlink_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		toonlink.setAlignmentY(0.0F);
		toonlink.setMargin(new java.awt.Insets(0, 0, 0, 0));
		toonlink.setName("toonlink"); // NOI18N
		toonlink.setActionCommand("toonlink");
		if (!controller1.getCharacter(toonlink.getName()).isChecked())
			tintToogle(toonlink);
		jPanel1.add(toonlink);

		samus.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_samus_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		samus.setAlignmentY(0.0F);
		samus.setMargin(new java.awt.Insets(0, 0, 0, 0));
		samus.setName("samus"); // NOI18N
		samus.setActionCommand("samus");
		if (!controller1.getCharacter(samus.getName()).isChecked())
			tintToogle(samus);
		jPanel1.add(samus);

		szerosuit.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_szerosuit_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		szerosuit.setAlignmentY(0.0F);
		szerosuit.setMargin(new java.awt.Insets(0, 0, 0, 0));
		szerosuit.setName("szerosuit"); // NOI18N
		szerosuit.setActionCommand("szerosuit");
		if (!controller1.getCharacter(szerosuit.getName()).isChecked())
			tintToogle(szerosuit);
		jPanel1.add(szerosuit);

		kirby.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_kirby_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		kirby.setAlignmentY(0.0F);
		kirby.setMargin(new java.awt.Insets(0, 0, 0, 0));
		kirby.setName("kirby"); // NOI18N
		kirby.setActionCommand("kirby");
		if (!controller1.getCharacter(kirby.getName()).isChecked())
			tintToogle(kirby);
		jPanel1.add(kirby);

		metaknight.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_metaknight_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		metaknight.setAlignmentY(0.0F);
		metaknight.setMargin(new java.awt.Insets(0, 0, 0, 0));
		metaknight.setName("metaknight"); // NOI18N
		metaknight.setActionCommand("metaknight");
		if (!controller1.getCharacter(metaknight.getName()).isChecked())
			tintToogle(metaknight);
		jPanel1.add(metaknight);

		dedede.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_dedede_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		dedede.setAlignmentY(0.0F);
		dedede.setMargin(new java.awt.Insets(0, 0, 0, 0));
		dedede.setName("dedede"); // NOI18N
		dedede.setActionCommand("dedede");
		if (!controller1.getCharacter(dedede.getName()).isChecked())
			tintToogle(dedede);
		jPanel1.add(dedede);

		fox.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_fox_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		fox.setAlignmentY(0.0F);
		fox.setMargin(new java.awt.Insets(0, 0, 0, 0));
		fox.setName("fox"); // NOI18N
		fox.setActionCommand("fox");
		if (!controller1.getCharacter(fox.getName()).isChecked())
			tintToogle(fox);
		jPanel1.add(fox);

		falco.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_falco_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		falco.setAlignmentY(0.0F);
		falco.setMargin(new java.awt.Insets(0, 0, 0, 0));
		falco.setName("falco"); // NOI18N
		falco.setActionCommand("falco");
		if (!controller1.getCharacter(falco.getName()).isChecked())
			tintToogle(falco);
		jPanel1.add(falco);

		pikachu.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_pikachu_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		pikachu.setAlignmentY(0.0F);
		pikachu.setMargin(new java.awt.Insets(0, 0, 0, 0));
		pikachu.setName("pikachu"); // NOI18N
		pikachu.setActionCommand("pikachu");
		if (!controller1.getCharacter(pikachu.getName()).isChecked())
			tintToogle(pikachu);
		jPanel1.add(pikachu);

		purin.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_purin_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		purin.setAlignmentY(0.0F);
		purin.setMargin(new java.awt.Insets(0, 0, 0, 0));
		purin.setName("purin"); // NOI18N
		purin.setActionCommand("purin");
		if (!controller1.getCharacter(purin.getName()).isChecked())
			tintToogle(purin);
		jPanel1.add(purin);

		mewtwo.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_mewtwo_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		mewtwo.setAlignmentY(0.0F);
		mewtwo.setMargin(new java.awt.Insets(0, 0, 0, 0));
		mewtwo.setName("mewtwo"); // NOI18N
		mewtwo.setActionCommand("mewtwo");
		if (!controller1.getCharacter(mewtwo.getName()).isChecked())
			tintToogle(mewtwo);
		jPanel1.add(mewtwo);

		lizardon.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_lizardon_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		lizardon.setAlignmentY(0.0F);
		lizardon.setMargin(new java.awt.Insets(0, 0, 0, 0));
		lizardon.setName("lizardon"); // NOI18N
		lizardon.setActionCommand("lizardon");
		if (!controller1.getCharacter(lizardon.getName()).isChecked())
			tintToogle(lizardon);
		jPanel1.add(lizardon);

		lucario.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_lucario_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		lucario.setAlignmentY(0.0F);
		lucario.setMargin(new java.awt.Insets(0, 0, 0, 0));
		lucario.setName("lucario"); // NOI18N
		lucario.setActionCommand("lucario");
		if (!controller1.getCharacter(lucario.getName()).isChecked())
			tintToogle(lucario);
		jPanel1.add(lucario);

		gekkouga.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_gekkouga_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		gekkouga.setAlignmentY(0.0F);
		gekkouga.setMargin(new java.awt.Insets(0, 0, 0, 0));
		gekkouga.setName("gekkouga"); // NOI18N
		gekkouga.setActionCommand("gekkouga");
		if (!controller1.getCharacter(gekkouga.getName()).isChecked())
			tintToogle(gekkouga);
		jPanel1.add(gekkouga);

		captain.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_captain_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		captain.setAlignmentY(0.0F);
		captain.setMargin(new java.awt.Insets(0, 0, 0, 0));
		captain.setName("captain"); // NOI18N
		captain.setActionCommand("captain");
		if (!controller1.getCharacter(captain.getName()).isChecked())
			tintToogle(captain);
		jPanel1.add(captain);

		ness.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_ness_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		ness.setAlignmentY(0.0F);
		ness.setMargin(new java.awt.Insets(0, 0, 0, 0));
		ness.setName("ness"); // NOI18N
		ness.setActionCommand("ness");
		if (!controller1.getCharacter(ness.getName()).isChecked())
			tintToogle(ness);
		jPanel1.add(ness);

		lucas.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_lucas_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		lucas.setAlignmentY(0.0F);
		lucas.setMargin(new java.awt.Insets(0, 0, 0, 0));
		lucas.setName("lucas"); // NOI18N
		lucas.setActionCommand("lucas");
		if (!controller1.getCharacter(lucas.getName()).isChecked())
			tintToogle(lucas);
		jPanel1.add(lucas);

		marth.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_marth_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		marth.setAlignmentY(0.0F);
		marth.setMargin(new java.awt.Insets(0, 0, 0, 0));
		marth.setName("marth"); // NOI18N
		marth.setActionCommand("marth");
		if (!controller1.getCharacter(marth.getName()).isChecked())
			tintToogle(marth);
		jPanel1.add(marth);

		roy.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_roy_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		roy.setAlignmentY(0.0F);
		roy.setMargin(new java.awt.Insets(0, 0, 0, 0));
		roy.setName("roy"); // NOI18N
		roy.setActionCommand("roy");
		if (!controller1.getCharacter(roy.getName()).isChecked())
			tintToogle(roy);
		jPanel1.add(roy);

		ike.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_ike_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		ike.setAlignmentY(0.0F);
		ike.setMargin(new java.awt.Insets(0, 0, 0, 0));
		ike.setName("ike"); // NOI18N
		ike.setActionCommand("ike");
		if (!controller1.getCharacter(ike.getName()).isChecked())
			tintToogle(ike);
		jPanel1.add(ike);

		reflet.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_reflet_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		reflet.setAlignmentY(0.0F);
		reflet.setMargin(new java.awt.Insets(0, 0, 0, 0));
		reflet.setName("reflet"); // NOI18N
		reflet.setActionCommand("reflet");
		if (!controller1.getCharacter(reflet.getName()).isChecked())
			tintToogle(reflet);
		jPanel1.add(reflet);

		lucina.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_lucina_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		lucina.setAlignmentY(0.0F);
		lucina.setMargin(new java.awt.Insets(0, 0, 0, 0));
		lucina.setName("lucina"); // NOI18N
		lucina.setActionCommand("lucina");
		if (!controller1.getCharacter(lucina.getName()).isChecked())
			tintToogle(lucina);
		jPanel1.add(lucina);

		kamui.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_kamui_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		kamui.setAlignmentY(0.0F);
		kamui.setMargin(new java.awt.Insets(0, 0, 0, 0));
		kamui.setName("kamui"); // NOI18N
		kamui.setActionCommand("kamui");
		if (!controller1.getCharacter(kamui.getName()).isChecked())
			tintToogle(kamui);
		jPanel1.add(kamui);

		gamewatch.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_gamewatch_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		gamewatch.setAlignmentY(0.0F);
		gamewatch.setMargin(new java.awt.Insets(0, 0, 0, 0));
		gamewatch.setName("gamewatch"); // NOI18N
		gamewatch.setActionCommand("gamewatch");
		if (!controller1.getCharacter(gamewatch.getName()).isChecked())
			tintToogle(gamewatch);
		jPanel1.add(gamewatch);

		pit.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_pit_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		pit.setAlignmentY(0.0F);
		pit.setMargin(new java.awt.Insets(0, 0, 0, 0));
		pit.setName("pit"); // NOI18N
		pit.setActionCommand("pit");
		if (!controller1.getCharacter(pit.getName()).isChecked())
			tintToogle(pit);
		jPanel1.add(pit);

		palutena.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_palutena_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		palutena.setAlignmentY(0.0F);
		palutena.setMargin(new java.awt.Insets(0, 0, 0, 0));
		palutena.setName("palutena"); // NOI18N
		palutena.setActionCommand("palutena");
		if (!controller1.getCharacter(palutena.getName()).isChecked())
			tintToogle(palutena);
		jPanel1.add(palutena);

		pitb.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_pitb_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		pitb.setAlignmentY(0.0F);
		pitb.setMargin(new java.awt.Insets(0, 0, 0, 0));
		pitb.setName("pitb"); // NOI18N
		pitb.setActionCommand("pitb");
		if (!controller1.getCharacter(pitb.getName()).isChecked())
			tintToogle(pitb);
		jPanel1.add(pitb);

		wario.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_wario_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		wario.setAlignmentY(0.0F);
		wario.setMargin(new java.awt.Insets(0, 0, 0, 0));
		wario.setName("wario"); // NOI18N
		wario.setActionCommand("wario");
		if (!controller1.getCharacter(wario.getName()).isChecked())
			tintToogle(wario);
		jPanel1.add(wario);

		pikmin.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_pikmin_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		pikmin.setAlignmentY(0.0F);
		pikmin.setMargin(new java.awt.Insets(0, 0, 0, 0));
		pikmin.setName("pikmin"); // NOI18N
		pikmin.setActionCommand("pikmin");
		if (!controller1.getCharacter(pikmin.getName()).isChecked())
			tintToogle(pikmin);
		jPanel1.add(pikmin);

		robot.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_robot_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		robot.setAlignmentY(0.0F);
		robot.setMargin(new java.awt.Insets(0, 0, 0, 0));
		robot.setName("robot"); // NOI18N
		robot.setActionCommand("robot");
		if (!controller1.getCharacter(robot.getName()).isChecked())
			tintToogle(robot);
		jPanel1.add(robot);

		sonic.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_sonic_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		sonic.setAlignmentY(0.0F);
		sonic.setMargin(new java.awt.Insets(0, 0, 0, 0));
		sonic.setName("sonic"); // NOI18N
		sonic.setActionCommand("sonic");
		if (!controller1.getCharacter(sonic.getName()).isChecked())
			tintToogle(sonic);
		jPanel1.add(sonic);

		murabito.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_murabito_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		murabito.setAlignmentY(0.0F);
		murabito.setMargin(new java.awt.Insets(0, 0, 0, 0));
		murabito.setName("murabito"); // NOI18N
		murabito.setActionCommand("murabito");
		if (!controller1.getCharacter(murabito.getName()).isChecked())
			tintToogle(murabito);
		jPanel1.add(murabito);

		littlemac.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_littlemac_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		littlemac.setAlignmentY(0.0F);
		littlemac.setMargin(new java.awt.Insets(0, 0, 0, 0));
		littlemac.setName("littlemac"); // NOI18N
		littlemac.setActionCommand("littlemac");
		if (!controller1.getCharacter(littlemac.getName()).isChecked())
			tintToogle(littlemac);
		jPanel1.add(littlemac);

		wiifit.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_wiifit_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		wiifit.setAlignmentY(0.0F);
		wiifit.setMargin(new java.awt.Insets(0, 0, 0, 0));
		wiifit.setName("wiifit"); // NOI18N
		wiifit.setActionCommand("wiifit");
		if (!controller1.getCharacter(wiifit.getName()).isChecked())
			tintToogle(wiifit);
		jPanel1.add(wiifit);

		duckhunt.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_duckhunt_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		duckhunt.setAlignmentY(0.0F);
		duckhunt.setMargin(new java.awt.Insets(0, 0, 0, 0));
		duckhunt.setName("duckhunt"); // NOI18N
		duckhunt.setActionCommand("duckhunt");
		if (!controller1.getCharacter(duckhunt.getName()).isChecked())
			tintToogle(duckhunt);
		jPanel1.add(duckhunt);

		shulk.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_shulk_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		shulk.setAlignmentY(0.0F);
		shulk.setMargin(new java.awt.Insets(0, 0, 0, 0));
		shulk.setName("shulk"); // NOI18N
		shulk.setActionCommand("shulk");
		if (!controller1.getCharacter(shulk.getName()).isChecked())
			tintToogle(shulk);
		jPanel1.add(shulk);

		rockman.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_rockman_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		rockman.setAlignmentY(0.0F);
		rockman.setMargin(new java.awt.Insets(0, 0, 0, 0));
		rockman.setName("rockman"); // NOI18N
		rockman.setActionCommand("rockman");
		if (!controller1.getCharacter(rockman.getName()).isChecked())
			tintToogle(rockman);
		jPanel1.add(rockman);

		pacman.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_pacman_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		pacman.setAlignmentY(0.0F);
		pacman.setMargin(new java.awt.Insets(0, 0, 0, 0));
		pacman.setName("pacman"); // NOI18N
		pacman.setActionCommand("pacman");
		if (!controller1.getCharacter(pacman.getName()).isChecked())
			tintToogle(pacman);
		jPanel1.add(pacman);

		ryu.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_ryu_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		ryu.setAlignmentY(0.0F);
		ryu.setMargin(new java.awt.Insets(0, 0, 0, 0));
		ryu.setName("ryu"); // NOI18N
		ryu.setActionCommand("ryu");
		if (!controller1.getCharacter(ryu.getName()).isChecked())
			tintToogle(ryu);
		jPanel1.add(ryu);

		cloud.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_cloud_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		cloud.setAlignmentY(0.0F);
		cloud.setMargin(new java.awt.Insets(0, 0, 0, 0));
		cloud.setName("cloud"); // NOI18N
		cloud.setActionCommand("cloud");
		if (!controller1.getCharacter(cloud.getName()).isChecked())
			tintToogle(cloud);
		jPanel1.add(cloud);

		bayonetta.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_bayonetta_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		bayonetta.setAlignmentY(0.0F);
		bayonetta.setMargin(new java.awt.Insets(0, 0, 0, 0));
		bayonetta.setName("bayonetta"); // NOI18N
		bayonetta.setActionCommand("bayonetta");
		if (!controller1.getCharacter(bayonetta.getName()).isChecked())
			tintToogle(bayonetta);
		jPanel1.add(bayonetta);

		miifighter.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_miifighter_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		miifighter.setAlignmentY(0.0F);
		miifighter.setMargin(new java.awt.Insets(0, 0, 0, 0));
		miifighter.setName("miifighter"); // NOI18N
		miifighter.setActionCommand("miifighter");
		if (!controller1.getCharacter(miifighter.getName()).isChecked())
			tintToogle(miifighter);
		jPanel1.add(miifighter);

		miigunner.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_miigunner_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		miigunner.setAlignmentY(0.0F);
		miigunner.setMargin(new java.awt.Insets(0, 0, 0, 0));
		miigunner.setName("miigunner"); // NOI18N
		miigunner.setActionCommand("miigunner");
		if (!controller1.getCharacter(miigunner.getName()).isChecked())
			tintToogle(miigunner);
		jPanel1.add(miigunner);

		miiswordman.setIcon(new javax.swing.ImageIcon(
				new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_miiswordsman_01.png")).getImage()
						.getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING))); // NOI18N
		miiswordman.setAlignmentY(0.0F);
		miiswordman.setMargin(new java.awt.Insets(0, 0, 0, 0));
		miiswordman.setName("miiswordsman"); // NOI18N
		miiswordman.setActionCommand("miiswordsman");
		if (!controller1.getCharacter(miiswordman.getName()).isChecked())
			tintToogle(miiswordman);
		jPanel1.add(miiswordman);

		jMenu1.setText("File");

		openFile.setText("Open File");
		openFile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				openFileActionPerformed(evt);
			}
		});
		jMenu1.add(openFile);

		saveFile.setText("Save  File");
		saveFile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveFileActionPerformed(evt);
			}
		});
		jMenu1.add(saveFile);
		jMenu1.add(jSeparator1);

		quit.setText("Quit");
		quit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quitActionPerformed(evt);
			}
		});
		jMenu1.add(quit);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Presets");
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 366,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(141, 141, 141).addComponent(draw).addGap(0, 0,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 379,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
				.addComponent(draw).addGap(21, 21, 21)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void openFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openFileActionPerformed
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(rootPane);
		List<String> preset;
		try {
			preset = controller1.readSave(chooser.getSelectedFile());
			// TODO huifuiezufguizeifgui
			int i = 0;
			for (Component component : jPanel1.getComponents()) {
				if (component instanceof JToggleButton) {
					if (preset.contains(component.getName())) {

						controller1.getCharacter(component.getName()).setChecked(true);
						((JToggleButton) component).setIcon(new ImageIcon(new ImageIcon(getClass()
								.getResource("/akame/dodger/rsc/icons/chr_00_" + component.getName() + "_01.png"))
										.getImage().getScaledInstance(75, 75, BufferedImage.SCALE_SMOOTH)));
						component.setBackground(null);

						i++;
						continue;
					}

					controller1.getCharacter(component.getName()).setChecked(false);
					ImageIcon icon = tintToogle2((JToggleButton) component, component.getName());
					((JToggleButton) jPanel1.getComponents()[i]).setIcon(icon);
					jPanel1.getComponents()[i].setBackground(Color.DARK_GRAY);
					i++;
					
				}
			}

			jPanel1.invalidate();
			controller1.writeSave();

		} catch (Exception e) {
			// TODO
			e.printStackTrace();
		}

	}// GEN-LAST:event_openFileActionPerformed

	private ImageIcon tintToogle2(JToggleButton component, String character) {

		BufferedImage bimage = new BufferedImage(component.getIcon().getIconWidth(),
				component.getIcon().getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);

		Graphics g = bimage.createGraphics();
		g.drawImage(
				new ImageIcon(
						new ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_" + character + "_01.png"))
								.getImage().getScaledInstance(75, 75, BufferedImage.SCALE_AREA_AVERAGING)).getImage(),
				0, -10, null);

		// Graphics2D bGr = bimage.createGraphics();
		// bGr.drawImage(((ImageIcon) component.getIcon()).getImage(), 0, 0,
		// null);
		// bGr.dispose();

		BufferedImage biresult = new BufferedImage(component.getIcon().getIconWidth(),
				component.getIcon().getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);

		float data[] = { 0.0625f, 0.125f, 0.0625f, 0.125f, -0.25f, 0.125f, 0.0625f, 0.125f, 0.0625f };
		Kernel kernel = new Kernel(3, 3, data);
		ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_ZERO_FILL, null);
		convolve.filter(bimage, biresult);

		return new ImageIcon(biresult);
	}

	private void quitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_quitActionPerformed

		int result = JOptionPane.showConfirmDialog(null, "Do you really wanna quit ?", "Quit ? Really ?",
				JOptionPane.YES_NO_OPTION);
		// TODO Récupérer choix utilisateur

		if (result == JOptionPane.YES_OPTION)
			this.dispose();

	}// GEN-LAST:event_quitActionPerformed

	private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveFileActionPerformed
		// TODO add your handling code here:
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showSaveDialog(rootPane);
		try {
			controller1.writeSave(fileChooser.getSelectedFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// GEN-LAST:event_saveFileActionPerformed

	private void actionButtonGroupListener(ActionEvent ae) {

	}

	private void drawActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_drawActionPerformed
		ArrayList<CharSmash> activeChar = new ArrayList<CharSmash>();
		for (CharSmash character : controller1.getRoster())
			if (character.isChecked())
				activeChar.add(character);

		try {
			Random rand = new Random();
			String name = activeChar.get(rand.nextInt(activeChar.size())).getName();

			result.setIcon(
					new ImageIcon(getClass().getResource("/akame/dodger/rsc/portraits/chr_13_" + name + "_01.png")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(rootPane, "Your selection is empty, please select at least one character");
		}

	}// GEN-LAST:event_drawActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new View().setVisible(true);
			}
		});
	}

	private ActionListener act;
	private Controller controller1;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JToggleButton bayonetta;
	private javax.swing.JToggleButton koopa;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JToggleButton captain;
	private javax.swing.JToggleButton cloud;
	private javax.swing.JToggleButton dedede;
	private javax.swing.JToggleButton diddy;
	private javax.swing.JToggleButton donkey;
	private javax.swing.JButton draw;
	private javax.swing.JToggleButton drmario;
	private javax.swing.JToggleButton duckhunt;
	private javax.swing.JToggleButton falco;
	private javax.swing.JToggleButton fox;
	private javax.swing.JToggleButton gamewatch;
	private javax.swing.JToggleButton ganon;
	private javax.swing.JToggleButton gekkouga;
	private javax.swing.JToggleButton ike;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JToggleButton kamui;
	private javax.swing.JToggleButton kirby;
	private javax.swing.JToggleButton koopajr;
	private javax.swing.JToggleButton link;
	private javax.swing.JToggleButton littlemac;
	private javax.swing.JToggleButton lizardon;
	private javax.swing.JToggleButton lucario;
	private javax.swing.JToggleButton lucas;
	private javax.swing.JToggleButton lucina;
	private javax.swing.JToggleButton luigi;
	private javax.swing.JToggleButton mario;
	private javax.swing.JToggleButton marth;
	private javax.swing.JToggleButton metaknight;
	private javax.swing.JToggleButton mewtwo;
	private javax.swing.JToggleButton miifighter;
	private javax.swing.JToggleButton miigunner;
	private javax.swing.JToggleButton miiswordman;
	private javax.swing.JToggleButton murabito;
	private javax.swing.JToggleButton ness;
	private javax.swing.JMenuItem openFile;
	private javax.swing.JToggleButton pacman;
	private javax.swing.JToggleButton palutena;
	private javax.swing.JToggleButton peach;
	private javax.swing.JToggleButton pikachu;
	private javax.swing.JToggleButton pikmin;
	private javax.swing.JToggleButton pit;
	private javax.swing.JToggleButton pitb;
	private javax.swing.JToggleButton purin;
	private javax.swing.JMenuItem quit;
	private javax.swing.JToggleButton reflet;
	private javax.swing.JLabel result;
	private javax.swing.JToggleButton robot;
	private javax.swing.JToggleButton rockman;
	private javax.swing.JToggleButton rosetta;
	private javax.swing.JToggleButton roy;
	private javax.swing.JToggleButton ryu;
	private javax.swing.JToggleButton samus;
	private javax.swing.JMenuItem saveFile;
	private javax.swing.JToggleButton sheik;
	private javax.swing.JToggleButton shulk;
	private javax.swing.JToggleButton sonic;
	private javax.swing.JToggleButton szerosuit;
	private javax.swing.JToggleButton toonlink;
	private javax.swing.JToggleButton wario;
	private javax.swing.JToggleButton wiifit;
	private javax.swing.JToggleButton yoshi;
	private javax.swing.JToggleButton zelda;
	// End of variables declaration//GEN-END:variables
}