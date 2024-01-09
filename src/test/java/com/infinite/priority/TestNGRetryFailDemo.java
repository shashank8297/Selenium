package com.infinite.priority;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGRetryFailDemo {

	@Test
	public void test1(){
		System.out.println("Inside Test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("Inside Test 2");
		int i = 1;
	}
	
	@Test(retryAnalyzer = com.infinite.listeners.retryAnalyzer.class)
	public void test3(){
		System.out.println("Inside Test 3");
		Assert.assertTrue(false);
	}
}
