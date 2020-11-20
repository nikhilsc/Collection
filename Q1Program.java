import java.util.*;
import java.util.Scanner;
public class Q1demo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
         int num;
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<10;i++)
         {
        	 num=sc.nextInt();
        	 list.add(num);
         }
         ListIterator ltr=list.listIterator();
         while(ltr.hasNext())
         {
        	 System.out.print(ltr.next());
         }
         System.out.println();
         while(ltr.hasPrevious())
         {
        	 System.out.print(ltr.previous());
         }
	}
}
