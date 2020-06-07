public class MultiThreading
{
    public static void main(String ... args) throws InterruptedException {
        new Thread(() -> new MultiThreading().show("Hi")).start();

        Thread.sleep(10);

        new Thread(() ->  new MultiThreading().show("Hello")).start();
    }
    public  void show(String str)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(str);
            try { Thread.sleep(200);} catch (InterruptedException e) {}
        }
    }

}

class A extends Thread
{
    public void show() throws InterruptedException {
        for(int i=1;i<=5;i++) {
            System.out.println("Hi");

            Thread.sleep(1000);
        }
    }

    public  void run()
    {
        try {
            show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

