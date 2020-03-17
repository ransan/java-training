
public class GenricsExample<T> {
	private T firstName;
	private T lastName;
	
	public GenricsExample(T fName, T lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public T getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(T fName) {
		this.firstName = fName;
	}
	
	public T getLastName() {
		return this.lastName;
	}
	
	public void setLastName(T lName) {
		this.lastName = lName;
	}
}
