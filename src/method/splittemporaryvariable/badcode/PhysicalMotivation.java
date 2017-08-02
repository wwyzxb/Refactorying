package method.splittemporaryvariable.badcode;

public class PhysicalMotivation {
	private double mass;
	private double primaryForce;
	private double secondaryForce;

	public PhysicalMotivation(double mass, double primaryForce,
			double secondaryForce) {
		this.mass = mass;
		this.primaryForce = primaryForce;
		this.secondaryForce = secondaryForce;
	}

	double getDistanceTravelled(int time, int delay) {
		double result;
		double acc = primaryForce / mass;
		int primaryTime = Math.min(time, delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if (secondaryTime > 0) {
			double primaryVel = acc * delay;
			acc = (primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime
					* secondaryTime;
		}
		return result;
	}
}
