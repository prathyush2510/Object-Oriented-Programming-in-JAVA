package MyPack1;

public interface Shape3D
{
public static final float pi=(float)3.14;
public float calVolume();
public float calSurfaceArea();
}
/*class Sphere implements Shape3D
{
private float f,vol,sa;
private String r;
public Sphere(String radius){
r=radius;
}
public float calVolume(){
try{
f=Float.parseFloat(r);
vol=(float)(4/3*pi*f*f*f);
}catch(NumberFormatException e)
{
System.out.println("Exception caught");
throw e;
}
return vol;
}
public float calSurfaceArea(){
try{
f=Float.parseFloat(r);
sa=(float)(4*pi*f*f);
}catch(NumberFormatException e)
{
System.out.println("Exception caught");
throw e;
}
return sa;
}
}
class Cube implements Shape3D
{
private float f,vol,sa;
private String a;
public Cube(String side){
a=side;
}
public float calVolume(){
try{
f=Float.parseFloat(a);
vol=(float)(f*f*f);
}catch(NumberFormatException e)
{
System.out.println("Exception caught");
throw e;
}
return vol;
}
public float calSurfaceArea(){
try{
f=Float.parseFloat(a);
sa=(float)(6*f*f);
}catch(NumberFormatException e)
{
System.out.println("Exception caught");
throw e;
}
return sa;
}
}*/
