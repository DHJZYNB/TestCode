package question1;

public class Dog extends Animal {
	private String breed="unknown";
	public Dog(String name, double weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}
	//feed method
	public void feed() {
		double temp;
		temp=super.getWeight();
		temp+=1.0;
		super.setWeight(temp);
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
}