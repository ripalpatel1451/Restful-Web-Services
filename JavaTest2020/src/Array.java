import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array
{

    public static void main(String[] args) throws Exception
    {
        String s = "Something have happened since the last time";

        String[] array = s.split(" ");
        for(String i : array)
        {
            System.out.print(" " + i);
        }
        System.out.println();
        for(int j = array.length; j > 0; j--)
        {
            System.out.print(" "+array[j-1]);
        }


    }
}
