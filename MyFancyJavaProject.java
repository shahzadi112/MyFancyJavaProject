package structural;


class Rectangle
{
 public double L;
 public double w;
 public Rectangle(double L, double w) {
  this.L = L;
  this.w = w;
 }


}


class Triangle
{
 public double b;//base
 public double h;//height

 public Triangle(int b, int h)
 {
  this.b = b;
  this.h = h;
 }
}

class Calculator
{
 Rectangle rectangle;
 public double getArea(Rectangle r)
 {
  rectangle=r;
  return rectangle.L * rectangle.w;
 }
}


class CalculatorAdapter
{

 Calculator calculator;
 Triangle triangle;

 public double getArea(Triangle t)
 {
  calculator = new Calculator();
  triangle=t;

  //Area of Triangle=0.5*base*height
  double L = triangle.b;
  double w = 0.5*triangle.h;

  Rectangle r = new Rectangle(L,w);
  return calculator.getArea(r);
 }

}

class Client
{
 public static void main(String[] args)
 {
  System.out.println("***Adapter Pattern Demo***");
  CalculatorAdapter cal=new CalculatorAdapter();

  Triangle t = new Triangle(20,10);
  System.out.println("\nAdapter Pattern Example\n");
  System.out.println("Area of Triangle is :" + cal.getArea(t));
 }

}


