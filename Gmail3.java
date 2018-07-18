import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Gmail3
{
public static void main(String arg[])
{
Pattern compile=Pattern.compile("[a-z]*[.][a-z]?@gmail[.]com");
Matcher matcher=compile.matcher("siva.a@gmail.com");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
