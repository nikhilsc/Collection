import java.util.*;
import java.io.*;
class MyClass implements Serializable
{
	int num;
	public MyClass(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
}
public class Q4demo {

	public static void main(String[] args) throws ClassNotFoundException {
		MyClass ob1=new MyClass(100);
		MyClass ob2=new MyClass(200);
		MyClass ob3=new MyClass(300);
		MyClass ob4=new MyClass(400);
		MyClass ob5=new MyClass(500);
		List<MyClass> list1=new ArrayList<MyClass>();
          list1.add(ob1);
          list1.add(ob2);
          list1.add(ob3);
          list1.add(ob4);
          list1.add(ob5);
          try(FileOutputStream fos=new FileOutputStream("demo1.txt"))
          {
        	  try(ObjectOutputStream oos=new ObjectOutputStream(fos))
        	  {
        		  oos.writeObject(list1);
        	  } catch (IOException e) {
				e.printStackTrace();
			}
          } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
			
		}
          try(FileInputStream fos=new FileInputStream("demo1.txt"))
          {
        	  try(ObjectInputStream oos=new ObjectInputStream(fos))
        	  {
        		 ArrayList ref=(ArrayList)oos.readObject();
        		 MyClass arr1[]=new MyClass[5];
        		 Object[] arr=ref.toArray();
        		 for(int i=0;i<5;i++)
        		 {
        			 arr1[i]=(MyClass) arr[i];
        			 System.out.println(arr1[i].getNum());
        		 }
        	  } catch (IOException e) {
				e.printStackTrace();
			}
          } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
          
	}

}
