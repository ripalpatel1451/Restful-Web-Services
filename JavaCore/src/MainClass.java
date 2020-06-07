import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;


public class MainClass
{
    public static void main(String ... args)
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value: ");
        s1 = sc.nextLine();
        //s2 = sc.nextLine();

        String l1 = s1.toUpperCase();
        System.out.println("Result of length is: " + l1 );

    }
}