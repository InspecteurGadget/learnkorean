package LearnKorean;

import javax.swing.*;
import java.awt.*;

public class LBtn extends JButton{
	
	private char letter;
	private String name;
	private String pronun;
	private LBtn bouton;
	private LBtn[] letterList = new LBtn[]{
			new LBtn('ㅏ',"아","a"),
			new LBtn('ㅑ',"야","ya"),
			new LBtn('ㅓ',"어","eo"),
			new LBtn('ㅕ',"여","yeo"),
			new LBtn('ㅗ',"오","o"),
			new LBtn('ㅛ',"요","yo"),
			new LBtn('ㅜ',"우","ou"),
			new LBtn('ㅠ',"유","you"),
			new LBtn('ㅡ',"으","eu"),
			new LBtn('ㅣ',"이","i")
	};
	
	public LBtn (char letter, String n, String p){
		super(Character.toString(letter));
		setFont(new Font("Arial Unicode MS", Font.PLAIN, 26));
		
	}
/*	public LBtn (LBtn bouton){
		super(Character.toString(bouton.letter));
		letter = bouton.letter;
		name = bouton.name;
		pronun = bouton.pronun;
		setFont(new Font("Arial Unicode MS", Font.PLAIN, 26));
	}*/
	
}
