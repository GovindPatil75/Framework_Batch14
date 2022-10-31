package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test2 extends BaseClass{
	
	@Test
	public void test2() {
		System.out.println("Test 2");
		String data1=excel.getNumericDataFrom_Excel("Login_Page", 2, 0);
		
		System.out.println(data1);
	}

}
