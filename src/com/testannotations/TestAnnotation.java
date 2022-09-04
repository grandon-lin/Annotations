package com.testannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test
	public void test1()
	{
		System.out.println("test1 Executed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 Executed");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest executed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass executed");
	}
}
