
public class BubbleSortForString {

	public static void main(String[] args) {
		
		
String[] a = {"shanid","aaban","thanveer","jaza","moosa","kadeeja"};
		
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		String temp;
		
		int flag = 0;
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-1-i;j++) {
				
				if(a[j].compareTo (a[j+1])>0) {
					
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
