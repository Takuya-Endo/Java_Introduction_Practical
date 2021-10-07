package exercise_11_sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {
	
//	@Test public void instantiate() {
//		AccountTest a = new AccountTest("ミナト", 30000);
//		assertEquals("ミナト", a.owner);
//		assertEquals(30000, a.zandaka);
//	}
	
	@Test
	public void コンストラクタtest() {
		AccountTest a = new AccountTest("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.zandaka);
		
	}

}
