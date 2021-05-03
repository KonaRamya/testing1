import java.util.*;

public class Main3 {
	public static void main(String argv[]) {
		int i;
                String schoolNames[] = {"TWGS", "KCTS", "LKP", "CMT", "KKY"};
                String studentNames[] = {"Peter Chan", "Alan Tong", "John Lee", "Venice Tsui", "Mary Lui"};
                Person students[] = new Person[5];
                School schools[] = new School[5];
		for (i = 0; i < 5; i++) {
                        students[i] = new Person(studentNames[i]);
                        schools[i] = new School(schoolNames[i]);
 		}
		
		Registration.register(students[0], schools[0], 1241);
        Registration.register(students[1], schools[1], 1234);
        Registration.register(students[2], schools[1], 1111);
        Registration.register(students[3], schools[2], 9878);
        Registration.register(students[4], schools[3], 6782);
        Registration.register(students[4], schools[4], 9807);
        Registration.register(students[4], schools[0], 9080);

       Person p = students[4];
       Enumeration s = p.getSchools();
       System.out.println(p.getName() + " studies in the following schools:");
       for (;s.hasMoreElements();) 
       	System.out.println(((School) s.nextElement()).getName());
       
       School sc = schools[0];
       Enumeration st = sc.getStudents();
       System.out.println(sc.getName()+ " has the following students:" );
       for (;st.hasMoreElements();)
    	   System.out.println( ((Person) st.nextElement()).getName());
	}
}



