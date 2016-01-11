package rcspy.pccontroller.video;

import java.awt.image.BufferedImage;

import rcspy.pccontroller.ihm.VideoPanel;

public class VideoStream {
	
	private int _width;
	private int _height;
	private BufferedImage _image;

	public VideoStream() {
		_width = 640;
		_height = 480;
		_image = new BufferedImage(_width, _height, BufferedImage.TYPE_USHORT_565_RGB);
	}

	public int getHeight() {
		return _height;
	}

	public int getWidth() {
		return _width;
	}
	
	public VideoPanel getVideoPanel()
	{
		return new VideoPanel(_image);
	}

}
