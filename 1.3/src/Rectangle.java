public class Rectangle {
    private float width;
    private float length;
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float length, float widht) {
        this.width = widht;
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getArea() {
        return length * width;
    }
    public float getPerimeter() {
        return 2* (length + width);
    }
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
