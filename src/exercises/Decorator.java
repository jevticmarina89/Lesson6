package exercises;

import java.util.ArrayList;

import examples.ImageViewer;

public class Decorator {
public static void main(String[] args) {
	
	
	ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
	boxOfDecorations.add(new Ornament("golden", "witch ball"));
	boxOfDecorations.add(new Ornament("red", "bauble"));
	boxOfDecorations.add(new Ornament("white", "angel"));
	boxOfDecorations.add(new Ornament("blue", "star"));
	boxOfDecorations.add(new Ornament("silver", "bell"));
	
	for (Ornament ornament : boxOfDecorations) {
		ornament.hang();
	}
	
	ImageViewer hangedOrnaments = new ImageViewer("Christmas-Tree-550x374.jpg");
	hangedOrnaments.show();

}
}
