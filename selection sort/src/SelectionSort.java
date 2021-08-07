
public class SelectionSort {

	public static void main(String[] args) {
		
		
		int[] a= {38,52,91,181,611,621,713};
		
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		int temp;
		int flag=0;
		
		for(int i =0;i<a.length;i++) {
			
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					
					min=j;
					flag=1;
					
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("After Sorting");
		if(flag==0) {
			System.out.println("Already Sorted");
		}
	
		else {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		} 
	}

}