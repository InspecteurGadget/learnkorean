package LearnKorean;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class QuizzWindow extends JFrame{
	
	private Question quizzPanel;
	private LBtn[] list;
	private int count, nQuest = 10, right = 0, wrong = 0;
	
	public QuizzWindow() {
		super("Quizz");
		setPreferredSize(new Dimension(500, 600));
		setLocationRelativeTo(null);
		setVisible(true);		
		
		list = new LetterList().getLetterList();
		LetterList.shuffleArray(list);
		list = Arrays.copyOfRange(list, 0, nQuest);
		count = 0;
		nextQuestion();		
	}
	public void nextQuestion() {
		count++;
		if (count < nQuest){
			quizzPanel = new Question(this, list[count]);
		}
		else {
			System.out.println(right+" "+wrong+" "+ count);
			quizzPanel = new Question(this, right, wrong, nQuest);
		}
		getContentPane().repaint();
		pack();
	}
	public void addWrong() {
		wrong++;
	}
	public void addRight() {
		right++;
	}
	}
