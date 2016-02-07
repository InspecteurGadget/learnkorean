package LearnKorean;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class QuizzWindow extends JFrame implements ActionListener {
	
	private JPanel quizzPanel;
	private LBtn[][] answerList;
	private int q;
	private JButton vowelQ;
	private JButton cVowelQ;
	private JButton consQ;
	private JButton dConsQ;
	private LBtn[] list;
	
	public QuizzWindow() {
		super("Quizz");
		setLayout(new GridLayout(0,1,10,10));
		answerList = new LetterList().getLetterList();
		q = new Random().nextInt(3);
		vowelQ = new JButton("Voyelles"); 
		cVowelQ = new JButton("Consonnes");
		consQ = new JButton("Voyelles composées");  
		dConsQ = new JButton("Doubles consonnes"); 
		add(vowelQ);
		add(cVowelQ);
		add(consQ);  
		add(dConsQ);
        
		vowelQ.addActionListener(this); 
		cVowelQ.addActionListener(this);
		consQ.addActionListener(this);  
		dConsQ.addActionListener(this); 
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	public void startQuizz(LBtn[] list) {

		getContentPane().removeAll();
		getContentPane().repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == vowelQ) {
			list = new LetterList().getVowels();
		}
		else if (src == cVowelQ) {
			list = new LetterList().getCons();
		}
		else if (src == consQ) {
			list = new LetterList().getCVowels();
		}
		else if (src == dConsQ) {
			list = new LetterList().getDCons();
		}
		startQuizz(list);
	}

}
