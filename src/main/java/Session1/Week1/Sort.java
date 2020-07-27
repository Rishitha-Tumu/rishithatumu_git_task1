package Session1.Week1;

public class Sort 
{
	public void sort(int array[],int n)
	{
		int i,j,t;
		for(i=n-1;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(array[j]>array[j+1])
				{
					t=array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
			}
		}
		print(array,n);
	}
	public void print(int array[],int n)
	{
		int i;
		System.out.print("The elements of the array are:");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
