package rcspy.pccontroller.ihm;

import javax.swing.JFrame;

import rcspy.pccontroller.video.VideoStream;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6619999896163341973L;
	private VideoPanel _videoPanel; 
	
	public MainFrame(VideoStream videoStream)
	{	
		_videoPanel = videoStream.getVideoPanel();		
		initContent();
		
		setTitle("RC Spy Controller");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initContent()
	{
		setContentPane(_videoPanel);
		System.out.println(_videoPanel.getSize());
		setSize(_videoPanel.getSize());
	}
	

}
