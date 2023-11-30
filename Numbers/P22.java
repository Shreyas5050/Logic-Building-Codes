package cdac;

public class P22 {
//22. How to check if two rectangles overlap with each other?
	 public static void main(String[] args) {
	        Rectangle rectangle1 = new Rectangle(0, 0, 5, 5);
	        Rectangle rectangle2 = new Rectangle(3, 3, 5, 5);

	        if (rectangle1.overlap(rectangle2)) {
	            System.out.println("Rectangles overlap.");
	        } else {
	            System.out.println("Rectangles do not overlap.");
	        }
	    }
}
class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    


public boolean overlap(Rectangle other) {
    // Check if one rectangle is to the left of the other
    if (this.x + this.width < other.x || other.x + other.width < this.x) {
        return false;
    }

    // Check if one rectangle is above the other
    if (this.y + this.height < other.y || other.y + other.height < this.y) {
        return false;
    }

    // Rectangles overlap
    return true;
}
}