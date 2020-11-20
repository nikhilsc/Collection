import java.util.*;
import java.io.*;
class Employee implements Serializable
{
	private String empid;
	private String empname;
	private String desig;
	public Employee(String empid,String empname,String desig)
	{
		this.empid=empid;
		this.empname=empname;
		this.desig=desig;
	}
	public void disp()
	{
		System.out.println(" employee id is "+this.empid+" name is "+this.empname+" designation is "+this.desig);
	}
}
public class Q7demo {

	public static void main(String[] args) throws ClassNotFoundException {
		Employee emp1=new Employee("e001","shraddha","Manager");
		Employee emp2=new Employee("e002","Akshay","senior developer");
		Employee emp3=new Employee("e003","Shalu","junior developer");
		Employee emp4=new Employee("e004","ashu","devops engineer");
		List<Employee> list2=new ArrayList<Employee>();
          list2.add(emp1);
          list2.add(emp2);
          list2.add(emp3);
          list2.add(emp4);
          try(FileOutputStream fos1=new FileOutputStream("demo1.txt"))
          {
        	  try(ObjectOutputStream oos1=new ObjectOutputStream(fos1))
        	  {
        		  oos1.writeObject(list2);
        	  } catch (IOException e) {
				e.printStackTrace();
			}
          } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
			
		}
          try(FileInputStream fis=new FileInputStream("demo1.txt"))
          {
        	  try(ObjectInputStream ois=new ObjectInputStream(fis))
        	  {
        		 ArrayList ref=(ArrayList)ois.readObject();
        		 Employee arr1[]=new Employee[4];
        		 Object[] arr=ref.toArray();
        		 for(int i=0;i<4;i++)
        		 {
        			 arr1[i]=(Employee) arr[i];
        			 arr1[i].disp();
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
