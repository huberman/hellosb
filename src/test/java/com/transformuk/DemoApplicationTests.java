package com.transformuk;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

	@Test
	public void arithmeticWorks() {
		assertEquals(1+2, 3);
	}
	
	@Test
	public void hamcrestMatchingWorks() {
		assertThat(5, is(1+3+2-1));
	}
	
	@Test
	public void oops() {
		assertTrue(true);
	}
}
