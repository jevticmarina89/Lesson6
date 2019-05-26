package exercises;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints â€œHanging a red ornamentâ€�, etc.
 */

public class Ornament {
	
	String color;
	String type;
	
	public Ornament(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public void hang(){
		System.out.println("hanging a " + color + " ornament " + type);
	}

}

