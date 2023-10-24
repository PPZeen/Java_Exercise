public class Lab_3_1{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        int n = 0;
        int i = 1;

        while(n < 100)
        {
            if(prime(i) && palindom(i))
            {
                n++;
                if(n > 1 && n%10 == 0){System.out.println(i);}
                else{System.out.print(i + " ");}
            }
            i++;
        }
        
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime)/1000000;
        System.out.println(totalTime + " ms");
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