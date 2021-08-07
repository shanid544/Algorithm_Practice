
public class InsertionSort {

	public static void main(String[] args) {
		
		
		int[] a={5,1,6,22,4,3};
		
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int temp,j;
		
		for(int i=1;i<a.length;i++) {
			
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			 
			a[j]=temp;
		}
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
