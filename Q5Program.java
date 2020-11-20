import java.util.*;
import java.util.Map.Entry;

public class Q5demo {
	public static void main(String args[])
	{
		Map<Integer,String> m=new HashMap();
		m.put(1011,"shrihari");
		m.put(1012,"hrishikesh");
		m.put(1013,"shraddha");
		Set<Entry<Integer,String>>set=m.entrySet();
		Iterator<Entry<Integer,String>> i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer,String>
			me=(Entry<Integer,String>)i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
	}

}
