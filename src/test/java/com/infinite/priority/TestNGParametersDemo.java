package com.infinite.priority;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters({"Name"})
	public void test(@Optional("Shashank") String name){
		System.out.println("Name is:"+name);
	}
}
