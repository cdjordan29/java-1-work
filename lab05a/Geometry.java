/***
  *Geometry.java contains geometry methods
  *
  * @author		<Daniel Jordan>
  * @version	<2/15/16>
  */
  
public class Geometry
{
	//area
	public double area(double height, double width)
	{
		return (height * width);	
	}
	
	//perimeter
	public double perimeter(double height, double width)
	{
		return ((height * 2) + (width * 2));
	}
	
	//volume
	public double volume(double length, double width, double height)
	{
		return (length * width * height);
	}

	//density
	public double density(double mass, double length, double width, double height)
	{
		double volume;
		return ((mass) / (volume = this.volume(length, width, height)));	
	}







}