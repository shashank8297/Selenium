package com.infinite.priority;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {

	@Test
	public void test1(){
		System.out.println("Inside Test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("Inside Test 2");
	}
	
	@Test
	@Ignore
	public void test3(){
		System.out.println("Inside Test 3");
	}
}
