package com.james.ex1.a;
import static org.junit.Assert.*;
import org.junit.Test;
public class ex1aTest
{
	GradeChecker gradeCheck = new GradeChecker();
	@Test
	public void isValid1() {
		assertNotSame("Method returns invalid", true, gradeCheck.isValid(5));
	}
}
