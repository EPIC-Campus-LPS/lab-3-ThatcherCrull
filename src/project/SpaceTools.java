package project;

public class SpaceTools{
	public static double travelTime(Planet p, double speed) {
		double d = (p.getDistanceFromSun() * 1000000);
		double f = d / speed;
		return f;
	}
	
	public static String compareDistance(Planet a, Planet b) {
		double d1 = (a.getDistanceFromSun() * 1000000);
		double d2 = (b.getDistanceFromSun() * 1000000);
		
		if (d1 > d2) {
			return a.getName();
		} else {
			return b.getName();
		}
	}
	public static String abbreviation(Planet p) {
		String n = p.getName();
		String an = n.substring(0, 3);
		String f = an.toUpperCase();
		return f;
	}
	public static double orbitTime(Planet p) {
		double diameter = 2 * (p.getDistanceFromSun() * 1000000);
		double cir = (diameter * Math.PI);
		double f = (cir) / 100000;
		return f;
	}
	public static double orbitTime(Planet p, double speed) {
		double diameter = 2 * (p.getDistanceFromSun() * 1000000);
		double cir = (diameter * Math.PI);
		double f = (cir) / speed;
		return f;
	}
	

}
