import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class Q3demo {

	public static void main(String[] args) {
		List<Integer> mylist=new CopyOnWriteArrayList<Integer>();
          for(int i=0,j=10;i<5;i++,j+=10)
          {
        	  mylist.add(j);
          }
          Iterator itr=mylist.iterator();
         // int count=0;
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
        	 /* if(count==0)
        	  {
        	  mylist.add(90);
        	  }
        	  count++; */
        	  
          }
          mylist.add(90);
           System.out.println(mylist);
	}

}
