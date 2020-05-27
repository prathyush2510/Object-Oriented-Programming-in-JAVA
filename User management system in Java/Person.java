package Mini;
public class Person
{
public String name;
private String password;
public String secq;
private String secans;
public int id;
public Person(String name,String password,String secq,String secans,int id)
{
this.name=name;
this.password=password;
this.secq=secq;
this.secans=secans;
this.id=id;
}
public String getPass(){
return password;
}
public String getSA(){
return secans;
} 
public void setPass(String ps)
{
password=ps;
}
public void setSA(String sa)
{
secans=sa;
}
public String display(){
 return "\nName: " +name +"\nPassword: " +password +"\nSecurity question: " +secq +"\nSecurity Answer: " +secans +"\nID: " +id ;
}
public String toString(){
 return "\nName: " +name +"\nID: " +id;
}
}
