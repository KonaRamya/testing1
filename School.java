import java.util.*;
public class School {
		  private String _name;
		  private Vector _registrations;

		  public School(String name) {
		    _name = name;
		    _registrations = new Vector();
		  }

		  public void setName(String name) {
		    _name = name;
		  }

		  public String getName() {
		    return(_name);
		  }

		//school class continues
		public void addRegistration(Registration reg) {
		   _registrations.add(reg);
		 }

		 public void removeRegistration(Registration reg) {
		   _registrations.remove(reg);
		 }

		 public Enumeration getStudents() {
		   int i;
		   Vector students = new Vector();

		   for (i = 0; i < _registrations.size(); i++)
		       students.add(((Registration) _registrations.elementAt(i)).getStudent());
		   return(students.elements());
		 }
		} // school


