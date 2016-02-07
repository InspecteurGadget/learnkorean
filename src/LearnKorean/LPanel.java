package LearnKorean;

import javax.swing.*;

public class LPanel extends JTabbedPane{
	
	private JPanel vowelPanel;
	private JPanel consPanel;
	private JPanel cVowelPanel;
	private JPanel dConsPanel;
	private LBtn[] vowelList;
	private LBtn[] consList;
	private LBtn[] cVowelList;
	private LBtn[] dConsList;
		
	public LPanel(MainWindow parent){
		super();
		
		//Voyelles
		vowelPanel = new JPanel();
		addTab("Voyelles", vowelPanel);
		vowelList = new LetterList().getVowels();
		for (LBtn i : vowelList) {
			vowelPanel.add(i);
			i.enableToolTip();
			i.addActionListener(parent);
		}
		
		//Consonnes
		consPanel = new JPanel();
		addTab("Consonnes", consPanel);
		consList = new LetterList().getCons();
		for (LBtn i : consList) {
			consPanel.add(i);
			i.enableToolTip();
			i.addActionListener(parent);
		}
		
		//Voyelles composées
		cVowelPanel = new JPanel();
		addTab("Voyelles composées", cVowelPanel);
		cVowelList = new LetterList().getCVowels();
		for (LBtn i : cVowelList) {
			cVowelPanel.add(i);
			i.enableToolTip();
			i.addActionListener(parent);
		}
		
		//Doubles consonnes
		dConsPanel = new JPanel();
		addTab("Doubles consonnes", dConsPanel);
		dConsList = new LetterList().getDCons();
		for (LBtn i : dConsList) {
			dConsPanel.add(i);
			i.enableToolTip();
			i.addActionListener(parent);
		}
		
	}

}
