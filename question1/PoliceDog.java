package question1;

public class PoliceDog extends Dog{
	private int weekHours;
	private static int totalHoursforAll;
	private int times;
	private Police trainer;
	public PoliceDog(String name,double weight) {
		super(name,weight);
	}
	public Police getTrainer() {
		return trainer;
	}
	public void setTrainer(Police trainer) {
		this.trainer=trainer;
	}
	public int getWeekHours() {
		if(times<7)
			System.out.println("No a week yet");
		times=0;
		int output=weekHours;
		weekHours=0;
		return output;
	}
	public static int getTotalHours() {
		return totalHoursforAll;
	}
	public void train(int hours) {
		weekHours+=hours;
		totalHoursforAll+=hours;
		times++;
	}
}
