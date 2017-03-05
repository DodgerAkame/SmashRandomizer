/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akame.dodger.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import akame.dodger.model.CharSmash;

/**
 *
 * @author Dodger
 */
public class View extends javax.swing.JFrame {

	/**
	 * Creates new form View
	 */
	public View() {
		initComponents();
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
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		try {
			controller1 = new akame.dodger.controller.Controller();
		} catch (java.io.IOException e1) {
			e1.printStackTrace();
		}
		buttonGroup1 = new javax.swing.ButtonGroup();
		result = new javax.swing.JLabel();
		draw = new javax.swing.JButton();
		jToggleButton1 = new javax.swing.JToggleButton();
		jToggleButton2 = new javax.swing.JToggleButton();
		jToggleButton3 = new javax.swing.JToggleButton();
		jToggleButton4 = new javax.swing.JToggleButton();
		act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (CharSmash character : controller1.getRoster())
					if (character.getName().equals(e.getActionCommand())) {
						character.setChecked(!character.isChecked());
						return;
					}
			}
		};

		buttonGroup1.add(jToggleButton1);
		buttonGroup1.add(jToggleButton2);
		buttonGroup1.add(jToggleButton3);
		buttonGroup1.add(jToggleButton4);

		jToggleButton1.addActionListener(act);
		jToggleButton2.addActionListener(act);
		jToggleButton3.addActionListener(act);
		jToggleButton4.addActionListener(act);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		draw.setText("Draw a character");
		draw.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				drawActionPerformed(evt);
			}
		});

		jToggleButton1.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_bayonetta_01.png"))); // NOI18N
		jToggleButton1.setAlignmentY(0.0F);
		jToggleButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
		jToggleButton1.setName("bayonetta"); // NOI18N
		jToggleButton1.setActionCommand("bayonetta");

		jToggleButton2.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_captain_01.png"))); // NOI18N
		jToggleButton2.setAlignmentY(0.0F);
		jToggleButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
		jToggleButton2.setName("captain"); // NOI18N
		jToggleButton2.setActionCommand("captain");

		jToggleButton3.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_cloud_01.png"))); // NOI18N
		jToggleButton3.setAlignmentY(0.0F);
		jToggleButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
		jToggleButton3.setName("cloud"); // NOI18N
		jToggleButton3.setActionCommand("cloud");

		jToggleButton4.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/akame/dodger/rsc/icons/chr_00_dedede_01.png"))); // NOI18N
		jToggleButton4.setAlignmentY(0.0F);
		jToggleButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
		jToggleButton4.setName("dedede"); // NOI18N
		jToggleButton4.setActionCommand("dedede");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 366,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(141, 141, 141).addComponent(draw).addGap(0, 751,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 379,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jToggleButton1).addComponent(jToggleButton2))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jToggleButton4).addComponent(jToggleButton3))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
						.addComponent(draw).addGap(21, 21, 21)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

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

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup buttonGroup1;
	private akame.dodger.controller.Controller controller1;
	private javax.swing.JButton draw;
	private javax.swing.JToggleButton jToggleButton1;
	private javax.swing.JToggleButton jToggleButton2;
	private javax.swing.JToggleButton jToggleButton3;
	private javax.swing.JToggleButton jToggleButton4;
	private javax.swing.JLabel result;
	private ActionListener act;
	// End of variables declaration//GEN-END:variables
}
