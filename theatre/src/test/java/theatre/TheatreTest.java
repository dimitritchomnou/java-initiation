package theatre;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TheatreTest {

	@Test
	public void doitRenvoyerMeilleurePlaceRangA() {
		Theatre theatre = new Theatre();
		assertEquals("A4", theatre.reserver(1));
	}
	
	@Test
	public void doitRenvoyerDeuxMeilleuresPlacesRangA() {
		Theatre theatre = new Theatre();
		assertEquals("A3A4", theatre.reserver(2));
	}
	
	@Test
	public void renvoieAcunePlaceDisponible() {
		Theatre theatre = new Theatre();
		assertEquals(0, theatre.getPlaces().size());
	}
	
	@Test
	public void renvoiLeNombreDePlaceImpairsDeLapremierRange() {
		Theatre theatre = new Theatre();
		assertEquals(4,theatre.countPlacesImpair());
		
		
		
		
	}
}
