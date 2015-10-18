package Visitor.Figure;

public class VisitorSides extends Visitor{

	private double sides;
	
	@Override
	public void visitCircle(Circle circle) {
		this.sides += 3;
	}

	@Override
	public void visitSquare(Square square) {
		this.sides += 4;
		
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.sides += Double.POSITIVE_INFINITY;
		
	}
	
	public double getSides(){
		return sides;
	}

}
