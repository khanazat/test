package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import calculation.calc1;;

public class test1 {

	@Test
	public void test() {
		
		     calc1 calcu_mounth = new calc1( 1000,  1, 5);
		assertEquals(252.66,calcu_mounth.mes_plateg,0.01);
			 calc1 calcu_mounth1 = new calc1( 50000,  0.2, 5);
        assertEquals(10505.50,calcu_mounth1.mes_plateg,0.01);
			 calc1 calcu_mounth2 = new calc1( 10,  0.1, 1);
	     assertEquals(10.08,calcu_mounth2.mes_plateg,0.01);
			 calc1 calcu_mounth3 = new calc1( 10101,  0.10101, 101);
			    assertEquals(148.87,calcu_mounth3.mes_plateg,0.01);
	}

}
