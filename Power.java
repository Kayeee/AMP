import java.util.ArrayList;	

public class PowerMain {
	
	static ArrayList<Double> positions = new ArrayList<Double>();
	static ArrayList<Double> timeStamps = new ArrayList<Double>();
	static ArrayList<Double> instantVelocities = new ArrayList<Double>();
	static double mass = 1.0;
	
	
	public static void main(String[] args){
		
		positions.add(0.0);
		for(double i = 1.0; i <= 32; i = i*2){
			positions.add(i);
		}
		
		for(double i = 0.0; i < 7; i = i + 1){
			timeStamps.add(i);
		}
		
		double averageVelocity = getAverageVel();
		
		makeInstantVelocities();
		System.out.println(instantVelocities);
		
		double changeInKinetic = getChangeInKinetic();
		System.out.println(changeInKinetic);
		double changeInTime = getChangeInTime();
		System.out.println(changeInTime);
		
		double power = getPower(changeInKinetic, changeInTime);
		System.out.println(power);
	}
	
	public static double getPower(double changeKin, double changeTime){
		double calculatedPower = changeKin/changeTime;
		return calculatedPower;
	}
	
	public static double getChangeInTime(){
		double finalTime = timeStamps.get(timeStamps.size() - 2);
		double initialTime = timeStamps.get(1);
		
		double changeInTime = finalTime - initialTime;
		
		return changeInTime;
	}
	
	public static double getChangeInKinetic(){
		int lastIndex = instantVelocities.size() - 1;
		
		double finalVelocity = instantVelocities.get(lastIndex);
		double initialVelocity = instantVelocities.get(0);
		
		double totalChangeKinetic = (0.5)*mass*((finalVelocity*finalVelocity) - (initialVelocity*initialVelocity));
		
		return totalChangeKinetic;
	}
	
	public static void makeInstantVelocities(){
		
		for (int i = 1; i < positions.size() - 1; i = i + 1){
			double xf = positions.get(i + 1);
			double xi = positions.get(i - 1);
			
			double tf = timeStamps.get(i + 1);
			double ti = timeStamps.get(i - 1);
			
			double instantVel = (xf - xi)/(tf - ti);
			
			instantVelocities.add(instantVel);
		}

	}
	
	public static double getAverageVel(){
		double xf = positions.get(positions.size() - 1);
		double xi = positions.get(0);
		
		double tf = timeStamps.get(timeStamps.size()-1);
		double ti = timeStamps.get(0);
		
		double averageVel = (xf - xi)/(tf - ti);
		
		return averageVel;
	}	
	
	
	
	
	
	
	
	
}
