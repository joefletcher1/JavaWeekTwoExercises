
public class Room {
	
	private double length;
	private double width;
	private double height;
	
	public Room(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double getAreaToPaint() {
		return (2 * (length * height) + 2 * (width * height) + (length * width));
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
