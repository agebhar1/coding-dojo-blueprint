package com.github.agebhar1.dojo;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add() {
		assertThat(Calculator.add(1, 4), is(equalTo(5)));
	}

}
