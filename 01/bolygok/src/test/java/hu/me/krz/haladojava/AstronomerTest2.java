package hu.me.krz.haladojava;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
public class AstronomerTest2 {
	
	@Test
public void getName(){
		String name = "Vala ki";
		Astronomer astronomer=new Astronomer(name);
		
		assertThat(astronomer.getName(), is(equalTo(name)));
		
		
	}
	
 @Test
 	 public void getDiscoveredPlanets() {
	 
	 
 }

 @Test
 
 public void observeTheSky() {
	 String name=" Vami mi";
	 Astronomer astronomer =new Astronomer(name);
	 
	 astronomer.observeTheSky();
	 
	 assertThat(astronomer.getDiscoveredPlanets().size(),is(equalTo(10)));
	 assertThat(astronomer.getDiscoveredPlanets().get(0).getPosition(),is(equalTo(new Point(0,0,0))));
	 assertThat(astronomer.getDiscoveredPlanets().get(0).getName(),is(equalTo(String.format("", name))));
	 
	 
 }
}
 