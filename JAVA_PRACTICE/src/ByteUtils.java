/**
 * 
 */


/**
 * @author yinga
 *
 */
public class ByteUtils {

	public static int byte2Int(byte[] b, int start, int length )
	{
		int sum = 0;
		int end = start + length;
		for(int i = start; i < end; i ++ )
		{
			int n = ((int)b[i]) & 0xff;
			n <<= (--length) * 8;
			sum = n + sum;
		}
		return sum;
	}

}
