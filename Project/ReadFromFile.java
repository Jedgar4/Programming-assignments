import java.io.*;
import java.util.*;
public class ReadFromFile
{
public static void main(String[] args)
{
String[] capitals = readCSV( "Capitals.csv" );
String[] states = readCSV( "States.csv" );
System.out.println( Arrays.toString(capitals) );
System.out.println( Arrays.toString(states) );
}
public static String[] readCSV( String filename )
{
try
{
File f = new File( filename );
Scanner scan = new Scanner(f);
int numElements = scan.nextInt();
scan.nextLine();
String[] data = new String[numElements];
for( int i = 0; i < numElements; i++ )
{
data[i] = scan.nextLine();
}
return data;
}catch( FileNotFoundException e )
{
System.out.println( "File was not found." );
return null;
}
}
}
