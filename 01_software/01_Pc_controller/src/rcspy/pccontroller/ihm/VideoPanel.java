package rcspy.pccontroller.ihm;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class VideoPanel extends JPanel {
	
	private BufferedImage _image;
	
	public VideoPanel(BufferedImage image)
	{
		super();
		_image = image;
		setSize(new Dimension(_image.getWidth(), _image.getHeight()));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.drawImage(_image, 0, 0, null);        
	}

}

