package hu.me.krz.haladojava;

import java.util.*;

public class Astronomer {
	private String name;
	private List<Planet> DiscoveredPlanets = new ArrayList<>();

	public Astronomer(String name) {
	super();
	this.name = name;
	}

	public List<Planet> getDiscoveredPlanets() {
	return DiscoveredPlanets;
	
	}
	
	
	public void observeTheSky() {
			for (int i = 0; i < 10; i++) {
					String nev = this.name + (i + 1);
					Point pozicio = new Point(i * 10, 0, 0);
					double rad = new Random().nextInt(1000000);

				
	DiscoveredPlanets.add(new Planet(pozico.toString,nev,rad));
		
	}
	}
}
	
