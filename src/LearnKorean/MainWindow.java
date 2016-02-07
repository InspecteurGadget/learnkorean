package LearnKorean;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {

	private LPanel learnPanel;
	private JPanel southPanel;
	private QuizzWindow qW = null;
	private JButton sQuizz;
	
public MainWindow(String title) {
    super(title);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(350, 400));
    setLocationRelativeTo(null);
    
    learnPanel = new LPanel(this);
    southPanel = new JPanel();
    sQuizz = new JButton("Démarrer le Quizz!");
    sQuizz.addActionListener(this);
    southPanel.add(sQuizz);
    
    add(learnPanel, BorderLayout.CENTER);
    add(southPanel, BorderLayout.SOUTH);
    
    pack();
    setVisible(true);

  }


@Override
public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if (src == sQuizz) {
	    qW = new QuizzWindow();		
	}
	else {
		LBtn.doPlay((LBtn) src);
	}
	
}

}
