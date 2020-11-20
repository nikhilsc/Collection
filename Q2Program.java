import java.util.*;
public class Q2demo {

	public static void main(String[] args) {
	  LinkedList<Integer> lst=new LinkedList<>();
      for(int i=0,j=10;i<4;i++,j+=10)
      {
    	  lst.add(j);
      }
      System.out.println(lst);
      lst.addFirst(500);
      lst.add(1,400);
      lst.addLast(1000);
      System.out.println("after adding elements");
      System.out.println(lst);
	}

}
