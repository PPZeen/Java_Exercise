import java.util.Random;
import java.util.Arrays;

public class testStopWatch {
    public static void main(String agrs[])
    {
        testSorting();
        System.out.println("------------------------------------------------------------");
        testPalindromPrim();
    }
    public static void testSorting()
    {
        StopWatch time = new StopWatch();

        System.out.println("Creating a list containing 1000 elements,");

        double[] list = new double[1000];
        Random random = new Random(3);
        for(int i = 0; i < 1000; i++)
        {
            list[i] = random.nextDouble(1000);
            System.out.format("%.2f  " , list[i]);
            if((i+1)%5 == 0){System.out.println("");}
        }
        System.out.println("List created.");
        
        time.start();
        System.out.println("Sorting stopwatch starts...");

        Arrays.sort(list);
        for(int i = 0; i < 1000; i++)
        {
            System.out.format("%.2f  " , list[i]);
            if((i+1)%5 == 0){System.out.println("");}
        }

        time.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + time.getElapsedTime() + " milliseconds.");
    }

    public static void testPalindromPrim()
    {
        StopWatch time = new StopWatch();
        time.start();

        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");

        int n = 0;
        int i = 1;
        while (n < 100)
        {
            if(prime(i) && palindom(i) )
            {
                n++;
                if(n > 1 && n%10 == 0){System.out.println(i);}
                else{System.out.print(i + " ");}
            }
            i++;
        }
        time.stop();

        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is " + time.getElapsedTime() + " milliseconds.");
    }
    public static boolean palindom(int num)
    {
        int i = 0;
        int n = num;
        while (num > 0)
        {
            i += num%10;
            num /= 10;
            i *= 10;
        }
        i/=10;
        if (i == n){return true;}
        return false;
    }
    public static boolean prime(int num)
    {
        if(num <= 1) return false;
        for(int k = 2; k < num; k++)
        {
            if(num%k == 0) return false;
        }
        return true;
    }
}