package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test4 extends BaseClass{
	
	@Test
	public void test4() {
		
		excel.getStringDataFrom_Excel("Homepage", 0, 0);
		excel.getNumericDataFrom_Excel("Homepage", 0, 1);
	}

}
