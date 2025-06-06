import java.util.Scanner;
public class selecsort{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of elements\n");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("\nEnter " + n + " integers: ");
        for(int i=0;i<n;i++)
	{
            arr[i] = scanner.nextInt();
        }
        ss(arr);
        System.out.println("\nSorted array\n");
        for(int num:arr)
	{
            System.out.println(num + " ");
        }
    }
    public static void ss(int []  arr)
   {
        int n = arr.length;
        for(int i =0; i<n;i++)
	{
            int minindex=i;{
            for(int j=i+1;j<n;j++)
		{
			if(arr[j]<arr[minindex])
			minindex=j;
		} 
		int temp=arr[minindex];
		arr[minindex]=arr[i];
		arr[i]=temp;  
          }
}
    }
}