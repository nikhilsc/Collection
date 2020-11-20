import java.util.*;
public class Q8demo {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
        m.put(1,"Virat Kohli");
        m.put(2,"Rohit Sharma");
        m.put(3,"Steve Smith");
        m.put(4,"Babar Azam");
        m.put(5,"Joe Root");
        System.out.println("taking the user input");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int choice;
        choice=sc.nextInt();
        System.out.println("user has entered"+choice);
        switch(choice)
        {
        case 1:
        	String s1=m.get(1);
        	System.out.println("first is"+s1);
        	break;
        case 2:
        	String s2=m.get(2);
        	System.out.println("second is"+s2);
        	break;
        case 3:
        	String s3=m.get(3);
        	System.out.println("third is"+s3);
        	break;
        case 4:
        	String s4=m.get(4);
        	System.out.println("fourth is"+s4);
        	break;
        case 5:
        	String s5=m.get(5);
        	System.out.println("fifth is"+s5);
        }
	}

}
