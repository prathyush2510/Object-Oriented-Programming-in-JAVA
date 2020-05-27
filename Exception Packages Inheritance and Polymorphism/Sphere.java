package MyPack;
import MyPack1.*;
public class Sphere implements Shape3D
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
