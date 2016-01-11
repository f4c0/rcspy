package rcspy.pccontroller.main;

import rcspy.pccontroller.ihm.MainFrame;
import rcspy.pccontroller.video.VideoStream;

public class Main {
	
		public static void main(String[] args) {
		
		VideoStream videoStream = new VideoStream();
		MainFrame ihm = new MainFrame(videoStream);
		ihm.setVisible(true);

	}

}
