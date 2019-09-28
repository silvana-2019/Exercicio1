import junit.framework.TestCase;

public class testCase extends TestCase {
	
	private Valores v;
	
	protected void setUp() throws Exception{
		
		super.setUp();
		v = new Valores();
		v.ins(2);
		v.ins(9);
		v.ins(7);
		v.ins(12);
		v.ins(6);
		v.ins(1);
		v.ins(100);
		v.ins(3);
		v.ins(25);
		v.ins(11);
		
	}
	
	public void testins() {
		assertEquals(25,v.del(8));
		assertEquals(11,v.del(9));
		v.ins(17);
		assertEquals(9,v.size());
		v.ins(13);
		assertEquals(10,v.size());
			
	}
	
	
	
	public void testMean() {
		assertTrue(Math.round(17.6) == Math.round(v.mean()));
		}

	public void testGreater() {
		assertEquals(100, v.greater());
		}

	public void testLower() {
		assertEquals(1, v.lower());
		
		}
	
	
}