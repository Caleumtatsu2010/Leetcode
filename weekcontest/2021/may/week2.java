

public class week2 
{
    public static boolean checkPrime(int n) 
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
    public static int countPrimes(int n) 
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(checkPrime(i))
            {
                count++;
            }
        }
        return count;
    }
    public static int maxScore(int[] cardPoints, int k) 
    {
        int total=0;
        for(int i=0;i<k;i++)
        {
            total+=cardPoints[i];
        }
        int best = total;
        for(int i=k-1, j = cardPoints.length-1; i>=0; i--,j--)
        {
            total += cardPoints[j] - cardPoints[i];
            Math.max(total, best);
        }
        return best;
    }
    public static void main(String[] args) 
    {
        //System.out.println(checkPrime(4));
        int cardPoints[] = {1,2,3,4,5,6,1};
        System.out.println(maxScore(cardPoints, 3));
        
    }
}
