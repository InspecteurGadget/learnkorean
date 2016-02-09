package LearnKorean;

import javax.swing.*;

import javafx.scene.media.AudioClip;

import java.awt.*;
import java.nio.file.Paths;

public class LBtn extends JButton{
	
	private String letter;
	private String name;
	private String pronun;
	private String type;

	public LBtn (char l, String n, String p, String t){
		super(Character.toString(l));
		letter = Character.toString(l);
		name = n;
		pronun = p;
		type = t;
		setFont(new Font("Arial Unicode MS", Font.PLAIN, 48));
	}
	public void enableToolTip() {
		setToolTipText(pronun + " (" + name + ")");
	}
	public static void doPlay(LBtn bouton){
		String audioFile = "audio/" + bouton.letter + ".mp3";
		AudioClip mediaPlayer = new AudioClip(Paths.get(audioFile).toUri().toString());
		mediaPlayer.play();
	}
	public static void getType(LBtn bouton){
		
	}
}
