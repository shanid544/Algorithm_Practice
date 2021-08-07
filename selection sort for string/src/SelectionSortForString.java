
public class SelectionSortForString {

	public static void main(String[] args) {
		
		
       String[] a= {"shanid","shanib","ahammend","fathima","valya","shibu","miyas"};
		
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		String temp;
		int flag=0;
		
		for(int i =0;i<a.length;i++) {
			
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j].compareTo(a[min])<0) {
					
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
