import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sample
{
    public static void main(String ... a) {
        Scanner s = new Scanner(System.in);
        int x =1;
        do {
            try {
                System.out.println("Enter first number: ");
                int n1 = s.nextInt();


                System.out.println("Enter second number: ");
                int n2 = s.nextInt();

                int sum = n1 / n2;
                System.out.println(sum);
                x=2;
            } catch (Exception e) {
                System.out.println("You can't do that");
            }
        }while (x==1);
    }
}
