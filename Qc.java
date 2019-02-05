public class Qc
{
	int i,j,temp,pivot;
	public void Quicksort(int arr[],int l,int h)
	{
		if(l<h)
		{
			pivot=l;
			i=l;
			j=h;
			while(i<j)
			{
				while(arr[i]<=arr[pivot]&&i<l)
				{
					i++;
				}
				while(arr[j]<arr[pivot])
				{
					j--;
				}
				if(i<j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			Quicksort(arr,l,j-1);
			Quicksort(arr,j+1,h);
		}
	}
	public static void main(String args[])
	{
		int arr []={22,3,33,13,1,6};
		Qc a=new Qc();
		
		a.Quicksort(arr,0,5);
	System.out.println("sorted array is ");
	for(int i=0;i<6;i++)
	{	
	System.out.print(arr[i]);
	System.out.print(" ");
	}
	}
}