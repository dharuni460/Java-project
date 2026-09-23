package com.AIDS.studentt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class AppTest {
	@ParameterizedTest
	@CsvSource({
		"5,2,3",
		"10,5,5",
		"20,7,13",
		"7,2,5",
		"2,7,-5",
		"100,50,50"
		
	})
	public void test(int x, int y,int result) {
		App a=new App();
		assertEquals(result, a.sub(x,y));
	}
	
}