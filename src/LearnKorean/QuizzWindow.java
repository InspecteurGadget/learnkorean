package LearnKorean;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class QuizzWindow extends JFrame implements ActionListener {
	
	private Question quizzPanel;
	private LBtn[] list;
	private int count;
	
	public QuizzWindow() {
		super("Quizz");
		setLocationRelativeTo(null);
		setVisible(true);		
		
		list = new LetterList().getLetterList();
		LetterList.shuffleArray(list);
		list = Arrays.copyOfRange(list, 0, 10);
		count = 0;
		nextQuestion(count);
		/*for (LBtn i : list) {
			nextQuestion(i);
			i.addActionListener(this);
		}*/
		
	}
	public void nextQuestion(int count) {
		if (count < 10){
			quizzPanel = new Question(this, list[count]);
			count++;
		}
		//getContentPane().repaint();
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
	}

}
