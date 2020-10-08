package com.san.designpattern.abstractfactorypattern;

//For shape we will create Shape interface, as follows
interface Shape {
	void draw();
}

//we create an interface for Printers.
interface Printer {
	void print();
}

//Then we create concrete classes implementing the Shape interface
class Rectangle implements Shape {

	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

class Square implements Shape {

	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

class Circle implements Shape {

	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

//Then we create concrete classes implementing the Printer interface.
class PaperPrinter implements Printer {

	public void print() {
		System.out.println("paper");
	}
}

class WebPrinter implements Printer {

	public void print() {
		System.out.println("web");
	}
}

class ScreenPrinter implements Printer {

	public void print() {
		System.out.println("screen");
	}
}

//Finally we create an abstract class to get factories for Printer and Shape Objects.
abstract class AbstractFactory {
	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}

//Finally we create Factory classes extending AbstractFactory to generate object of concrete class based 
//on given information.
class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	Printer getPrinter(String type) {
		return null;
	}
}

class PrinterFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Printer getPrinter(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("paper")) {
			return new PaperPrinter();
		} else if (type.equalsIgnoreCase("web")) {
			return new WebPrinter();
		} else if (type.equalsIgnoreCase("Screen")) {
			return new ScreenPrinter();
		}
		return null;
	}
}


//Create a Factory generator/producer class to get factories by passing an information such as Shape or Printer
class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Printer")) {
			return new PrinterFactory();
		}
		return null;
	}
}


//The following code shows how to use the abstract factory patterns.
public class AbstractFactoryPattern {

	public static void main(String[] args) {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Shape Rectangle
		shape2.draw();

		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of Shape Square
		shape3.draw();

		// get printer factory
		AbstractFactory printerFactory = FactoryProducer.getFactory("printer");

		Printer printer1 = printerFactory.getPrinter("Paper");
		printer1.print();
		Printer printer2 = printerFactory.getPrinter("Web");
		printer2.print();
		Printer printer3 = printerFactory.getPrinter("Screen");
		printer3.print();
	}
}
