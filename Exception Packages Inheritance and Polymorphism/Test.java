import java.util.*;
import MyPack.*;
public class Test{

public static void main(String[] args){
Shape3D s[]=new Shape3D[10];
String side,radius;
int ch;
int i=0;
Cube c;
Sphere sp;
Scanner in=new Scanner(System.in);

do{
System.out.println("\nEnter the choice: \n1.Sphere \n2.Cube \n3.Exit");
ch=in.nextInt();
if(ch==1)
{
System.out.println("\nEnter the radius of the sphere");
radius=in.next();
sp=new Sphere(radius);
s[i]=sp;
}
else if(ch==2)
{
System.out.println("\nEnter the side of the cube");
side=in.next();
c=new Cube(side);
s[i]=c;
}
else
{
System.out.println("Thankyou");
return;
}
try{
System.out.println("Volume :\t"+ s[i].calVolume());
System.out.println("Surface Area : "+ s[i].calSurfaceArea());
}
catch(Exception e)
{
System.out.println(e);
}
i++;
}while(ch!=3);
}
}
