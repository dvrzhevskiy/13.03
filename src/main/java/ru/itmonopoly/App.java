package ru.itmonopoly;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        "DD".equalsIgnoreCase("dd");

        StringBuffer sb = new StringBuffer("a");
        sb.append("cd");
        String s = sb.toString();
        System.out.println(sb);
    }
}
