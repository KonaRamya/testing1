
public class Registration {
		  private Person _student;
		  private School _school;
		  private int _studentNo;

		  private Registration(Person student, School school, int studentNo) {
		    _school = school;
		    _student = student;
		    _studentNo = studentNo;
		  }

		  static public void register(Person student, School school, int studentNo) {
		    Registration reg = new Registration(student, school, studentNo);
		    school.addRegistration(reg);
		    student.addRegistration(reg);
		  }
		  
		// Class Registration continues
		  public void deregister() {
		    this._school.removeRegistration(this);
		    this._student.removeRegistration(this);
		  }

		   public School getSchool() {
		    return(_school);
		  }

		   public Person getStudent() {
		    return(_student);
		  }

		} // class Registration


