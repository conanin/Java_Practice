/** 
* @author: conanin
  @E-mail: conanin@live.cn
* @version:  
* @Creation date： Sep 24, 2015 9:20:40 AM 
*/
public class TestPoint {
	
	private float coordinate_x;
	private float coordinate_y;
	private float coordinate_z;
	
	public TestPoint( float _coordinate_x, float _coordinate_y, float _coordinate_z)
	{
		this.coordinate_x = _coordinate_x;
		this.coordinate_y = _coordinate_y;
		this.coordinate_z = _coordinate_z;
	}
	
	public float getCoordinate_x() {
		return coordinate_x;
	}

	public void setCoordinate_x(float coordinate_x) {
		this.coordinate_x = coordinate_x;
	}

	public float getCoordinate_y() {
		return coordinate_y;
	}

	public void setCoordinate_y(float coordinate_y) {
		this.coordinate_y = coordinate_y;
	}

	public float getCoordinate_z() {
		return coordinate_z;
	}

	public void setCoordinate_z(float coordinate_z) {
		this.coordinate_z = coordinate_z;
	}
	
	public float square( TestPoint p)
	{
		float result = 0.0f;
		result = ( coordinate_x - p.coordinate_x ) * ( coordinate_x - p.coordinate_x ) + 
				 ( coordinate_y - p.coordinate_y ) * ( coordinate_y - p.coordinate_y ) + 
				 ( coordinate_z - p.coordinate_z ) * ( coordinate_z - p.coordinate_z ); 
		return result;
	}
	
	public static void main(String[] args)
	{
		TestPoint fromPoint = new TestPoint( 2, 3, 4 );
		TestPoint toPoint = new TestPoint( 5,6,7);
		float square = fromPoint.square( toPoint );
		System.out.println(square);
	}
}
