/**
 * 
 */

/**
 * @author yinga
 *
 */
public class ClassModifier {

	private static final int CONSTANT_POOL_COUNT_INDEX = 8;
	
	private static final int CONSTANT_Uft8_info = 1;
	
	private static final int[] CONSTANT_ITEM_LENGTH = { -1,-1,-1,5,5,9,9,3,3,5,5,5,5};
	
	private static final int u1 = 1;
	
	private static final int u2 = 2;
	
	private byte[] classByte;
	
	public ClassModifier(byte[] classByte)
	{
		this.classByte = classByte;
	}
	
	public byte[] modifyUTF8Constant(String oldStr, String newStr)
	{
		int cpc = get
	}
	
	public int getConstantPoolCount()
	{
		return ByteUtils.
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
