//print special characters from a String
class specialchar
{
public static void main(String g[])
{
String str="sasa@#$%dsada123%^&";
int special=0;
for(int i=0;i<str.length();i++)
{
if (Character.isLetterOrDigit(str.charAt(i))==false)
{
special++;
System.out.println("Special character: "+str.charAt(i));
}
}
System.out.println(special);
}
}
