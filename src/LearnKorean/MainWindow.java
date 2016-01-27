package LearnKorean;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener {

	private LearnPanel learnPanel;
	
	
public MainWindow(String title) {
    super(title);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    learnPanel = new LearnPanel(this);
    add(learnPanel, BorderLayout.CENTER);
    
    pack();
    setVisible(true);

  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
