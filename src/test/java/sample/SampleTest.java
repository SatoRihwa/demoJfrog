package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testSampleMin() {
		Sample s = new Sample(-1);
		String r = s.test();
		assertThat(r,is("マイナス"));	
	}
	
	@Test
	public void testSampleZero() {
		Sample s = new Sample(0);
		String r = s.test();
		assertThat(r,is("ゼロです"));	
	}
	
	@Test
	public void testSample1() {
		Sample s = new Sample(1);
		String r = s.test();
		assertThat(r,is("10以下です"));	
		
		Sample s2 = new Sample(9);
		String r2 = s2.test();
		assertThat(r2,is("10以下です"));	
	}
	
	@Test
	public void testSample2() {
		Sample s = new Sample(10);
		String r = s.test();
		assertThat(r,is("10以上です"));	
	}
	
	@Test
	public void testSample100() {
		Sample s = new Sample(100);
		String r = s.test();
		assertThat(r,is("100です"));	
	}

}
