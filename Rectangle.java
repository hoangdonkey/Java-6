public class Rectangle {
	float length = 1.0f;
	float width = 1.0f;

	public Rectangle() {
		length = 1;
		width = 1;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	public String toString() {
		return "Rectangle[length = "+ length + "; width = "+ width + "]";
	}
}