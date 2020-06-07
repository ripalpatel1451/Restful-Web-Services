public class PhoneDemo
{
    public static void main(String[] args)
    {

        Iphone obj = new Iphone();
        Samsung obj1 = new Samsung();
        show(obj);
    }

    public static void show(phone obj)
    {
        obj.showConfig();
    }

}

abstract class phone
{
    public abstract void showConfig();
}
class Iphone extends phone
{
    public void showConfig()
    {
        System.out.println("2 Gb, IOS 9.3");
    }
}
class Samsung extends phone
{
    public void showConfig()
    {
        System.out.println("2 Gb, Lolipop");
    }
}
