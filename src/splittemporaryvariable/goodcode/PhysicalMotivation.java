package splittemporaryvariable.goodcode;

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
		result = getFirstTravelledDistance(getPrimaryTime(time, delay));
		if (getSecondaryTime(time, delay) > 0) {
			result += getSecondTravelledDistance(time, delay);
		}
		return result;
	}

	private double getFirstTravelledDistance(int primaryTime) {
		return 0.5 * getPrimaryAcc() * primaryTime * primaryTime;
	}

	private double getSecondTravelledDistance(int time, int delay) {
		final int secondaryTime = getSecondaryTime(time, delay);
		return getPrimaryVel(delay) * secondaryTime + 0.5 * getSecondrayAcc()
				* secondaryTime * secondaryTime;
	}

	private double getPrimaryAcc() {
		return primaryForce / mass;
	}

	private double getSecondrayAcc() {
		return (primaryForce + secondaryForce) / mass;
	}

	private int getPrimaryTime(int time, int delay) {
		return Math.min(time, delay);
	}

	private int getSecondaryTime(int time, int delay) {
		return time - delay;
	}

	private double getPrimaryVel(int delay) {
		return getPrimaryAcc() * delay;
	}
}
