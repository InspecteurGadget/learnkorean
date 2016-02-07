package LearnKorean;

import javax.swing.*;

public class LPanel extends JTabbedPane{
	
	private JPanel vowelPanel;
	private JPanel consPanel;
	private JPanel dvowelPanel;
	private JPanel dconsPanel;
	
	public LPanel(MainWindow parent){
		super();
		
		//Construction des voyelles
		vowelPanel = new JPanel();
		addTab("Voyelles", vowelPanel);
		for (int i = 0; i < 10; i++) {
			vowelPanel.add(parent.getLetterList()[i]);
		}
		
		consPanel = new JPanel();
		addTab("Consonnes", consPanel);
		
		dvowelPanel = new JPanel();
		addTab("Doubles Voyelles", dvowelPanel);
		
		dconsPanel = new JPanel();
		addTab("Doubles consonnes", dconsPanel);
	}

}
