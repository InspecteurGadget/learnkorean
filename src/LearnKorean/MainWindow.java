package LearnKorean;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {

	private LPanel learnPanel;
	private JPanel southPanel;
	private QuizzWindow qW = null;
	private JButton sQuizz;
	
	private LBtn[] clonedList = new LBtn[letterList.length];

	
public MainWindow(String title) {
    super(title);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    learnPanel = new LPanel(this);
    southPanel = new JPanel();
    qW = new QuizzWindow(this);
    sQuizz = new JButton("Démarrer le Quizz!");
    sQuizz.addActionListener(this);
    southPanel.add(sQuizz);
    
    add(learnPanel, BorderLayout.CENTER);
    add(southPanel, BorderLayout.SOUTH);
    
    pack();
    setVisible(true);

  }
/*public LBtn[] getLetterList(){
	for ( int i = 0; i < letterList.length; i++){
		clonedList[i] = new LBtn(letterList[i]);
	}
	return clonedList;*/
	
}
@Override
public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if (src == sQuizz) {
		qW.pack();
		qW.setVisible(true);
		
	}
	
}

}
