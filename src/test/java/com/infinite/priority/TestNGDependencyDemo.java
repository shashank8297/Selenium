package com.infinite.priority;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1(){
		System.out.println("Inside Test 1");
	}

	@Test
	public void test2(){
		System.out.println("Inside Test 2");
	}
	
	@Test
	public void test3(){
		System.out.println("Inside Test 3");
	}
	
	
	
	@Test(dependsOnGroups = {"a"})
	public void testA(){
		System.out.println("Inside Test A");
	}
	
	@Test(groups = {"a"})
	public void testB(){
		System.out.println("Inside Test B");
	}
	
}
