package HW6;

public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s", this.name);
	}
}
