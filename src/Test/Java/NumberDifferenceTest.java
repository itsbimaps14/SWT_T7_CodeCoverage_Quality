package Test.Java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

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
        
        // TC 3 : Non group, There’s no difference ( 0 loop )
        // PJ : Bima Putra S
	@Test
	public void testNonGroupNoDiff0Loop() {
            /*
                Data Uji
                N = 1
                Number = 38
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(38));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 4 : Non group, There’s no difference ( 1 loop )
        // PJ : Bima Putra S
	@Test
	public void testNonGroupNoDiff1Loop() {
            /*
                Data Uji
                N = 2
                Number = 38 38
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(38, 38));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 5 : Non group, There’s no difference ( 2 loop )
        // PJ : Bima Putra S
	@Test
	public void testNonGroupNoDiff2Loop() {
            /*
                Data Uji
                N = 3
                Number = 38 38 38
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(38, 38, 38));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        
        /* TC 6 - 10 */
        
        // TC 6 : Non group, There’s no difference ( 9 loop )
        // PJ : Sabar Muhamad Itikap
	@Test
	public void testNonGroupNoDiff9Loop() {
            /*
                Data Uji
                N = 10
                Number = 38 38 38 38 38 38 38 38 38 38
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(38, 38, 38, 38, 38, 38, 38, 38, 38, 38));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 7 : Group 1, Small difference ( 1 loop )
        // PJ : Sabar Muhamad Itikap
	@Test
	public void testGroup1NoDiff1Loop() {
            /*
                Data Uji
                N = 2
                Number = 3 8
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(3, 8));
            
            // Expected Result
            String expectedMessage = "Difference : 5\nGroup 1, Small Difference";
            Integer expectedDifference = 5;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 8 : Group 1, Small difference ( 2 loop )
        // PJ : Sabar Muhamad Itikap
	@Test
	public void testGroup1NoDiff2Loop() {
            /*
                Data Uji
                N = 3
                Number = 1 3 8
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 3, 8));
            
            // Expected Result
            String expectedMessage = "Difference : 7\nGroup 1, Small Difference";
            Integer expectedDifference = 7;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 9 : Group 1, Small difference ( 9 loop )
        // PJ : Sabar Muhamad Itikap
	@Test
	public void testGroup1NoDiff9Loop() {
            /*
                Data Uji
                N = 10
                Number = 1 3 8 8 8 8 8 8 8 8
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 3, 8, 8, 8, 8, 8, 8, 8, 8));
            
            // Expected Result
            String expectedMessage = "Difference : 7\nGroup 1, Small Difference";
            Integer expectedDifference = 7;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 10 : Group 2, Medium difference ( 1 loop )
        // PJ : Sabar Muhamad Itikap
	@Test
	public void testGroup2NoDiff1Loop() {
            /*
                Data Uji
                N = 2
                Number = 3 38
            */
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(3, 38));
            
            // Expected Result
            String expectedMessage = "Difference : 35\nGroup 2, Medium Difference";
            Integer expectedDifference = 35;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        /* TC 11 - 15 */
}
