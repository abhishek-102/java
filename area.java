import java.util.*;
// area calculation
public class Area {


public static void main(String[] args) {
String shape;
Scanner scan = new Scanner(System.in); 
shape = scan.next();
Area a = new Area();
if(shape.equalsIgnoreCase("CIRCLE")) {
System.out.println("area is" + a.circle());
}
else if(shape.equalsIgnoreCase("RECTANGLE")) {
System.out.println("area is" + a.rectangle());
}
else if(shape.equalsIgnoreCase("SQUARE")) {
System.out.println("area is" + a.square());
}
else if(shape.equalsIgnoreCase("TRIANGLE")) {
System.out.println("area is" + a.triangle());
}
else {
System.out.println("Error");
}

}

public double circle() {
int side;
Scanner scan = new Scanner(System.in); 
side = scan.nextInt();
return 3.14*side*side;
}

public int rectangle() {
int length, breadth;
Scanner scan = new Scanner(System.in); 
length = scan.nextInt();
breadth =scan.nextInt();
return length*breadth;
}

public int square() {
int side;
Scanner scan = new Scanner(System.in); 
side = scan.nextInt();
return side*side;
}

public float triangle() {
int altitude, base;
Scanner scan = new Scanner(System.in); 
altitude = scan.nextInt();
base = scan.nextInt();
return (base*altitude/2);
}

}
