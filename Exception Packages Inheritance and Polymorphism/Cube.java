package MyPack;
import MyPack1.*;
public class Cube implements Shape3D
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
}
