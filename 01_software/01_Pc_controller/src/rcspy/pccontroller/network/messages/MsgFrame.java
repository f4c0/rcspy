package rcspy.pccontroller.network.messages;

import java.awt.image.BufferedImage;

public class MsgFrame extends MsgGeneric {
	
	protected static int MSG_SIZE = 0;
	
	private BufferedImage _image;
	
	public MsgFrame(byte[] payload) throws MessageException
	{
		super(MSG_SIZE, payload);
	}
	
	public BufferedImage get_image() {
		return _image;
	}
}
