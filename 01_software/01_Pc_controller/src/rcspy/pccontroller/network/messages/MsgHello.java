package rcspy.pccontroller.network.messages;

import java.util.Arrays;

public class MsgHello extends MsgGeneric {
	
	protected static int MSG_SIZE = 4;
	
	private int _frameWidth;
	private int _frameHeight;

	public MsgHello(byte[] payload) throws MessageException
	{
		super(MSG_SIZE, payload);
		
		_frameWidth = (payload[0] << 8) & 0xFF00;
		_frameWidth |= payload[1] & 0x00FF;
		_frameHeight = (payload[2] << 8) & 0xFF00;
		_frameHeight |= payload[3] & 0x00FF;		
	}

	public int get_frameWidth() {
		return _frameWidth;
	}

	public void set_frameWidth(int _frameWidth) {
		this._frameWidth = _frameWidth;
	}

	public int get_frameHeight() {
		return _frameHeight;
	}

	public void set_frameHeight(int _frameHeight) {
		this._frameHeight = _frameHeight;
	}
	
	public byte[] getNetworkPacket()
	{
		byte[] genericPacket = super.getNetworkPacket();
		byte[] packet = new byte[genericPacket.length + MSG_SIZE];
		
		packet = Arrays.copyOf(genericPacket, genericPacket.length);
		
		packet[genericPacket.length + 0] = (byte)((_frameWidth >> 8) & 0x00FF);
		packet[genericPacket.length + 1] = (byte)((_frameWidth) & 0x00FF);
		packet[genericPacket.length + 2] = (byte)((_frameHeight >> 8) & 0x00FF);
		packet[genericPacket.length + 3] = (byte)((_frameHeight) & 0x00FF);
		
		return packet;
	}


}
