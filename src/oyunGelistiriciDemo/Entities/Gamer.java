package oyunGelistiriciDemo.Entities;

public class Gamer {

	private String name;
	private String lastName;
	private long nationalityId;
	private int dateOfBirth;
	
	
	public Gamer(String name, String lastName, long nationalityId, int dateOfBirth) {
		super();
		this.name = name.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
