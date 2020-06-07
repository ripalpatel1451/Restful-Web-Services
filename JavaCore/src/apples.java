import java.util.EnumSet;

public class apples
{
    public static  void main(String[] args)
    {
        Animal[] a = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();

        a[0] = d;
        a[1] = f;

        for(Animal i : a)
        {
            i.noise();
        }
     }
}
