import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExample
{
    public static void main(String[] args)
    {
        String s = "This is Toronto DownTown This is Welcome";
        String[] array = s.split(" ");
        List<String> arrayList = Arrays.asList(array);

        //String[] sa = (String[]) arrayList.toArray();
        //String[] sa = arrayList.toArray(new String[arrayList.size()]);

        for(String s1 : s) {
            System.out.println(s1);
        }
    }
}
