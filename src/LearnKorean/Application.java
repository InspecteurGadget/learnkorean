package LearnKorean;

import javax.swing.SwingUtilities;

public class Application implements Runnable {

@Override
public void run() {
	MainWindow win0 = new MainWindow("Apprenez le Koréen");
	
}
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Application());
}

}