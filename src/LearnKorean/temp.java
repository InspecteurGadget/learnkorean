package LearnKorean;

import javax.sound.sampled.*;

public class DoPlay{

	private void doPlay(final String url) {
         Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = null;
            inputStream = AudioSystem.getAudioInputStream(
            	Main.class.getResourceAsStream("/path/to/sounds/" + url));
            clip.open(inputStream);
            clip.start();
	}
}