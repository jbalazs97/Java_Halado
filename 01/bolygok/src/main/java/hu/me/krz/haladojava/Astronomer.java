package hu.me.krz.haladojava;

import java.util.*;

public class Astronomer {
	private String name;
	private List<Planet> DiscoveredPlanets = new ArrayList<>();

	public Astronomer(String name) {
	super();
	this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public List<Planet> getDiscoveredPlanets() {
	return DiscoveredPlanets;
	
	}
	
	
	public void observeTheSky() {
			for (int i = 0; i < 10; i++) {
					String name = this.name + (i + 1);
					Point position = new Point(i * 10, 0, 0);
					int radian = new Random().nextInt(1000000);
					DiscoveredPlanets.add(new Planet(position,radian,name));
		
	}
	}
}
	
