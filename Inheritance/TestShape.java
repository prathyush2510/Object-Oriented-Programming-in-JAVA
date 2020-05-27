import java.lang.*;
import java.util.*;

class Shape {
    protected String color;

    public Shape() {
        color = "red";
    }
    
    public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    protected float radius;

    public Circle() {
        radius = 1.0f;
    }
    
    public Circle(float radius) {
        this.radius = radius;
    }
    
    public Circle(float radius,String color) {
        super(color);
        this.radius = radius;
    }
    
    public float getRadius() {
        return radius;
    }
    
    public void setRadius(float radius) {
        this.radius=radius;
    }
    
    public float getArea() {
        return (3.14f*radius*radius);
    }
    
    public float getPerimeter() {
        return 2*3.14f*radius;
    }
}

class Rectangle extends Shape {
    protected float width,length;

    public Rectangle() {
        width = 1.0f;
        length = 1.0f;
    }
    
    public Rectangle(float width,float length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(float width,float length,String color) {
        super(color);
        this.width = width;
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
        this.length=length;
    }
    
    public float getArea() {
        return length*width;
    }
    
    public float getPerimeter() {
        return 2*(length+width);
    }
}

class Square extends Rectangle{
    protected float side;
    
    public Square() {
        side=1.0f;
    }
    
    public Square(float side) {
	super(side,side);
        this.side=side;
    }
    
    public Square(float side,String color) {
        super(side,side,color);
        this.side=side;
    }
    
    public float getSide() {
        return side;
    }
    
    public void setSide(float side) {
        this.side=side;
    }
}

public class TestShape {

    public static void main(String[] args) {
        String color;
        float radius,width,length,side;
        int ch,c,f;
        Circle circle = null;
        Rectangle rect = null;
        Square square = null;
        Scanner in = new Scanner(System.in);
	do
        {
	System.out.println("Choose\n1.Circle\n2.Rectanagle\n3.Square\n4.Exit");
        c=in.nextInt();
	do{
        if(c==1) {
            System.out.println("\nTesting Circle class ");
            System.out.println("Choose\n1.without Parameters\n2.with radius\n3.with radius and color\n4.Exit");
            ch=in.nextInt();
            if(ch==1)
                circle=new Circle();
            else if(ch==2) {
                System.out.print("Enter the radius: ");
                radius=in.nextFloat();
                circle=new Circle(radius);
            }
            else if(ch==3) {
                System.out.print("Enter the radius: ");
                radius=in.nextFloat();
                System.out.print("Enter the color: ");
                color=in.next();
                circle=new Circle(radius,color);
            }
        }
        else if(c==2) {
            System.out.println("\nTesting Rectangle class ");
            System.out.println("Choose\n1.Without parameters\n2.with l&b\n3.with l&b and color\n4.Exit");
            ch=in.nextInt();
            if(ch==1)
                rect=new Rectangle();
            else if(ch==2) {
                System.out.print("Enter the length: ");
                length=in.nextInt();
                System.out.print("Enter the breadth: ");
                width=in.nextInt();
                rect=new Rectangle(length ,width);
            }
            else if(ch==3) {
                System.out.print("Enter the length: ");
                length=in.nextInt();
                System.out.print("Enter the width: ");
                width=in.nextInt();
                System.out.print("Enter the color: ");
                color=in.next();
                rect=new Rectangle(length ,width,color);
            }
        }
        else if(c==3) {
            System.out.println("\nTesting Square class ");
            System.out.println("Choose\n1.without parameters\n2.with side\n3.with side and color\n4.Exit");
            ch=in.nextInt();
            if(ch==1)
                square = new Square();
            else if(ch==2) {
                System.out.print("Enter the side: ");
                side=in.nextInt();
                square=new Square(side);
            }
            else if(ch==3) {
                System.out.print("Enter the side: ");
                side=in.nextInt();
                System.out.print("Enter the color: ");
                color=in.next();
                square=new Square(side,color);
            }
        }
	else if(c==4){
                System.out.println("\n!!! THANK YOU.... !!!\n");
		return;
	}
        else{
            System.out.println("\n!!! Invalid choice !!!\n");
	    ch=4;}
	

            if(c==1) {
                System.out.println("\nInside Circle class ");
                System.out.println("**********************************");
                System.out.println("Radius    : "+circle.getRadius());
                System.out.println("Color     : "+circle.getColor());
                System.out.println("Area      : "+circle.getArea());
                System.out.println("Perimeter : "+circle.getPerimeter());
                System.out.println("**********************************");
            }
            else if(c==2) {
                System.out.println("\nInside Rectangle class ");
                System.out.println("**********************************");
                System.out.println("Width     : "+rect.getWidth());
                System.out.println("Length    : "+rect.getLength());
                System.out.println("color     : "+rect.getColor());
                System.out.println("Area      : "+rect.getArea());
                System.out.println("Perimeter : "+rect.getPerimeter());
                System.out.println("**********************************");
            }
            else if (c==3) {
                System.out.println("\nInside Square class ");
                System.out.println("**********************************");
                System.out.println("side  : "+square.getSide());
                System.out.println("color : "+square.getColor());
                System.out.println("Area  : "+square.getArea());
                System.out.println("Perimeter : "+square.getPerimeter());
                System.out.println("**********************************");
            }
            else
                System.out.println("\n!!! There is no record !!!\n");
	}while(ch!=4);
        /*System.out.println("\nChoose\n1.Change the details\n2.Exit");
        f=in.nextInt();
        if(f==1) {
            if(c==1) {
                do {
                    System.out.println("\n!!! Testing Circle class public methods !!!\n");
                    System.out.println("choose\n1.change the Radius\n2.change the Color\n3.Exit");
                    f=in.nextInt();
                    if(f==1) {
                        System.out.println("\nTesting setRadius method");
                        System.out.print("Enter the new Radius : ");
                        radius=in.nextFloat();
                        circle.setRadius(radius);
                        System.out.println("circle radius changed to "+circle.getRadius());
                        System.out.println("New rectangle area "+circle.getArea());
                    }
                    else if(f==2) {
                        System.out.println("\nTesting setColor method");
                        System.out.print("Enter the new Color : ");
                        color=in.next();
                        circle.setColor(color);
                        System.out.println("circle color changed to "+circle.getColor());
                    }
                    else if (f>3)
                        System.out.println("\n!!! Invalid choice !!!\n");
                    else
                        System.out.println("\n!!! Exiting.... !!!\n");
                }while(f!=3);
            }
            else if(c==2) {
                do {
                    System.out.println("\n!!! Testing Rectangle class public methods !!!\n");
                    System.out.println("choose\n1.change the Width\n2.change the Length\n3.change the Color\n4.Exit");
                    f=in.nextInt();
                    if(f==1) {
                        System.out.println("\nTesting setWidth method");
                        System.out.print("Enter the new Width : ");
                        width=in.nextFloat();
                        rect.setWidth(width);
                        System.out.println("rectangle width changed to "+rect.getWidth());
                        System.out.println("New rectangle area "+rect.getArea());
                    }
                    else if(f==2) {
                        System.out.println("\nTesting setLength method");
                        System.out.print("Enter the new Length : ");
                        length=in.nextFloat();
                        rect.setLength(length);
                        System.out.println("rectangle Length changed to "+rect.getLength());
                        System.out.println("New rectangle area "+rect.getArea());
                    }
                    else if(f==3) {
                        System.out.println("\nTesting setColor method");
                        System.out.print("Enter the new Color : ");
                        color=in.next();
                        rect.setColor(color);
                    }
                    else if(f>4)
                        System.out.println("\n!!! Invalid choice !!!\n");
                    else
                        System.out.println("\n!!! Exiting.... !!!\n");
                }while(f!=4);
            }
            else if(c==3) {
                do {
                    System.out.println("\n!!! Testing Circle class public methods !!!\n");
                    System.out.println("choose\n1.change the Side\n2.change the Color\n3.Exit");
                    f=in.nextInt();
                    if(f==1) {
                        System.out.println("\n!!! Testing Square class public methods !!!\n");
                        System.out.println("\nTesting setSide method");
                        System.out.print("Enter the new Side : ");
                        side=in.nextFloat();
                        square.setSide(side);
                        System.out.println("New rectangle area "+square.getArea());
                    }
                    else if(f==2) {
                        System.out.println("\nTesting setColor method");
                        System.out.print("Enter the new Color : ");
                        color=in.next();
                        square.setColor(color);
                    }
                    else if(f>3)
                        System.out.println("\n!!! Invalid choice !!!\n");
                    else
                        System.out.println("\n!!! ThankYou.... !!!\n");
                }while(f!=3);
            }
            else 
                System.out.println("\n!!! There is no record !!!\n");
        }
        else
            System.out.println("\n!!! changing details part omited !!!\n");
	*/
    //}
}while(c!=4);
}
}
