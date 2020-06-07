public class AnimalList
{
    private Animal[] list = new Animal[5];
    private int i = 0;

    public void add(Animal a)
    {
        if(i < list.length)
        {
            list[i] = a;
            System.out.println("The Animal Added at Index "+i);
            i++;
        }
    }
}
