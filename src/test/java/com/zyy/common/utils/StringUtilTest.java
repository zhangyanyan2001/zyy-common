package com.zyy.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
		boolean b = StringUtil.hasLength("");
		
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		
		boolean b = StringUtil.hasText(" ");
		
		System.out.println(b);
		
	}

	@Test
	public void testRandomChineseString() {
		
		String name = StringUtil.randomChineseString(10);
		
		System.out.println(name);
		
	}

	@Test
	public void testGenerateChineseName() {
		
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			
			System.out.println(name+"  ");
			
		}
		
	}

}
