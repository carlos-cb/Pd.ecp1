package Visitor.Figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class FigureTest {

	private Collection<Figure> coleccion = new ArrayList<Figure>();
	
	@Before
	public void before() {
		coleccion.add(new Triangle("Triangle",2,4));
		coleccion.add(new Circle("Circle", 1));
		coleccion.add(new Square("Square", 2));
	}
	
	@Test
	public void testVisitorArea() {
		VisitorArea visitorArea = new VisitorArea();
		for (Figure figure:coleccion){
			figure.accept(visitorArea);
		}
		assertEquals(11.14,visitorArea.getArea(),0.01);
	}
	
	@Test
	public void testVisitorSides(){
		VisitorSides visitorSides = new VisitorSides();
		for (Figure figure:coleccion){
			figure.accept(visitorSides);
		}
		assertTrue(visitorSides.getSides() == Double.POSITIVE_INFINITY);
	}

}
