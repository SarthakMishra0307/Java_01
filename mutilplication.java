import java.util.Scanner;

public class mutilplication {
public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of array");
// int n = sc.nextInt();
// int c = 0;
// System.out.println("Enter the array");


// int num[] = new int[n];
// for(int i=0;i<n;i++)
// {
// num[i]=sc.nextInt();
// }
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (num[i] == num[j]) {
// c++;
// }
// }
// }
// System.out.println("Total number of good pairs :-" + c);



Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int []arr=new int[n];
for(int j=0;j<n;j++)
{
arr[j]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int t=0;t<(n+i)/2;t++)
{
if (arr[i] < arr[i+t])
{
System.out.println(arr[i+t]);
}else if(arr[i]>arr[i+n])
{
System.out.println("0");
}
}
}
}
}