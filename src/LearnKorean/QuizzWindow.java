package LearnKorean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuizzWindow extends JFrame implements ActionListener {
	
	private MainWindow parent;
	private LBtn[] answerList;
	
	public QuizzWindow(MainWindow parent) {
		super("Quizz");
		parent = (MainWindow)parent;
		answerList = parent.getLetterList();
		
		add(answerList[0]);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
