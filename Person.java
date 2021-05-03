import java.util.*;
public class Person {
	  private String _name;
	  private Vector _registrations;

	  public Person(String name) {
	    _name = name;
	    _registrations = new Vector();
	  }

	  String getName() {
	    return(_name);
	  }

	  void setName(String name) {
	    _name = name;
	  }
	  
	// Class Person continues
	  public void addRegistration(Registration reg) {
	      _registrations.add(reg);
	    }

	  public void removeRegistration(Registration reg) {
	      _registrations.remove(reg);
	    }
	    
	  public Enumeration getSchools() {
	      int i;
	      Vector schools = new Vector();
	      for (i = 0; i < _registrations.size(); i++)
	        schools.add(((Registration) _registrations.elementAt(i)).getSchool());
	      return(schools.elements());
	    }
}
