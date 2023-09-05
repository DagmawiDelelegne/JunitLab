/**
 * 
 */
package lab_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dagmawi 
 *
 */
class GradeBookTester {

	private GradeBook gradeBook;
	private GradeBook s_gradeBook;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		gradeBook = new GradeBook(5);
		s_gradeBook = new GradeBook(5);
		
		gradeBook.addScore(667);
		gradeBook.addScore(23);
		
		s_gradeBook.addScore(0);
		s_gradeBook.addScore(44);
		s_gradeBook.addScore(0.23);
		s_gradeBook.addScore(999);
		s_gradeBook.addScore(0.001);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		s_gradeBook = gradeBook = null;
	}

	/**
	 * Checks if the toString method in GradeBook works.
	 * Checks if the scoreSize contains the expected number of scores entered.
	 */
	@Test
	void testAddScore() {
		
		assertTrue("667.0 23.0".equals(gradeBook.toStirng()));
		assertTrue("0.0 44.0 0.23 999.0 0.001".equals(s_gradeBook.toStirng()));
		
		assertEquals(gradeBook.getScoreSize(),2);
		assertEquals(s_gradeBook.getScoreSize(),5);

		
	}

	/**
	 * Checks if the sum() method in GradeBook class works correctly.
	 */
	@Test
	void testSum() {
		assertEquals(gradeBook.sum(),690,0.0001);
		assertEquals(s_gradeBook.sum(),1043.231,0.0001);
	}

	/**
	 * Checks if the minimum method in GradeBook works.
	 */
	@Test
	void testMinimum() {
		assertEquals(gradeBook.minimum(), 23);
		assertEquals(s_gradeBook.minimum(), 0);
	}

	/**
	 * Checks FinalScore method in GradeBook class.
	 */
	@Test
	void testFinalScore() {
		assertEquals(gradeBook.finalScore(),667);
		assertEquals(s_gradeBook.finalScore(),1043.231);

	}

}
