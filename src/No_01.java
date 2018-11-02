import java.util.Scanner;
public class No_01 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in );

        int n=k.nextInt();
        int Value=k.nextInt();
        int coin[]=new int[n];

        for(int i=0;i<n;i++){
            coin[i]=k.nextInt();
        }
        System.out.println(minCoins(coin, n, Value) );
    }
    static int minCoins(int coin[], int n, int Value)
    {
        if (Value == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int i=0; i<n; i++)
        {
            if (coin[i] <= Value)
            {
                int sub_res = minCoins(coin, n, Value-coin[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }
}
