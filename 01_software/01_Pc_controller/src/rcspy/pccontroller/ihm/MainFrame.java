package rcspy.pccontroller.ihm;

import javax.swing.JFrame;

import rcspy.pccontroller.video.VideoStream;

public class MainFrame extends JFrame {

	private VideoPanel _videoPanel; 
	
	public MainFrame(VideoStream videoStream)
	{
		super();
		_videoPanel = videoStream.getVideoPanel();		
		initContent();
		
		setTitle("RC Spy Controller");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initContent()
	{
		setContentPane(_videoPanel);
		setSize(_videoPanel.getSize());
	}
	

}
