package Test.Java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Java.*;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;
	
	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small, 
	 * --> the trade-off seems acceptable. 
	 * --> implicit setup can be used to deine the fixture common for all tests. 
	 * --> Small in-line and delegate setup statements may supplement .. 
	 *     the speciic preconditions on per-test basis. 
	 * */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
	}
        
        /* TC 1 - 5 */
        
        // TC 1 : Range nBil tidak valid pada batas bawah
        // PJ : Bima Putra S
	@Test
	public void nBilInvalidLowerBoundaries() {
		int jumlahDeretBil;
		boolean actual, expected;
                // Test Data = 0
		jumlahDeretBil = 0;
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
        
	// TC 2 : Range nBil tidak valid pada batas atas
        // PJ : Bima Putra S
	@Test
	public void nBilInvalidUpperBoundaries() {
		int jumlahDeretBil;
		boolean actual, expected;
                // Test Data = 11
		jumlahDeretBil = 11;
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
        
        /* TC 6 - 10 */
        
        
        /* TC 11 - 15 */
}
