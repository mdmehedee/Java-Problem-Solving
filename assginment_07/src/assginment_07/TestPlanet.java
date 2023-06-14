package assginment_07;

public class TestPlanet {
	public static final double GravCons = 6.67300E-11;
	
	public static double surfaceGravity(Planet planet) {
		return GravCons * planet.getMass() / (planet.getRadius() * planet.getRadius());
	}
	
	public static double surfaceWeight(double mass, Planet pl) {
		return mass * surfaceGravity(pl);
	}
	
	public static void main(String[] args) {
		double earthWeight = 175.00;
		
		Planet plnt = Planet.EARTH;
		double mass = earthWeight/surfaceGravity(plnt);
		
		for (Planet pl : Planet.values()) {
			System.out.printf("Your weight on %s is %f%n", pl, surfaceWeight(mass, pl));
		}
	}
}