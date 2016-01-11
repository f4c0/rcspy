package rcspy.pccontroller.network.messages;

public abstract class MsgGeneric {
	
	protected static final byte MAGIC_PATTERN_MSB = (byte)0xA5;
	protected static final byte MAGIC_PATTERN_LSB = (byte)0xA5;
	
	protected static int MSG_SIZE = 0;
	
	protected int _payloadLength;

	public MsgGeneric(int expectedPayloadLength, byte[] payload) throws MessageException
	{
		if(expectedPayloadLength != payload.length)
		{
			throw new MessageException("[MsgGeneric]: Unexpected payload length: " + expectedPayloadLength);
		}
		_payloadLength = expectedPayloadLength;
	}
	
	public byte[] getNetworkPacket()
	{
		byte[] packet = new byte[6];
		
		packet[0] =  MAGIC_PATTERN_MSB;
		packet[1] =  MAGIC_PATTERN_LSB;
		packet[2] =  (byte)((_payloadLength >> 24) & 0x000000FF);
		packet[3] =  (byte)((_payloadLength >> 16) & 0x000000FF);
		packet[4] =  (byte)((_payloadLength >>  8) & 0x000000FF);
		packet[5] =  (byte)(_payloadLength & 0x000000FF);
		
		return packet;
	}

}
