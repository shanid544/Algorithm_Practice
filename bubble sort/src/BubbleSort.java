
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {6,9,19,24,51};
		
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int temp;
		
		int flag = 0;
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-1-i;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("Already Sorted");
				break;
				
		}
		
		}
		if(flag==1) {
		   System.out.println("After Sorting");
		   for(int i=0;i<a.length;i++) {
			   System.out.print(a[i]+" ");
		   }
		}
		
	}

}
