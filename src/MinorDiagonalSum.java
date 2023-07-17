import java.util.Scanner;

public class MinorDiagonalSum {
    public static int DiagonalSum(int [][]array,int rowsize,int columnsize)
    {
        int i=0,j=columnsize-1,sum=0;
        while(i<columnsize && j>=0)
        {
            sum+=array[i][j];
            i++;
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Rowsize=scanner.nextInt();
        int Columnsize=scanner.nextInt();
        int Array[][]=new int[Rowsize][Columnsize];
        for(int i=0;i<Rowsize;i++)
        {
            for(int j=0;j<Columnsize;j++)
            {
                Array[i][j]=scanner.nextInt();
            }
        }
        System.out.println(DiagonalSum(Array,Rowsize,Columnsize));
    }
}
