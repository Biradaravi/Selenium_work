package com.Demoweb.Generic;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listennto implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("the test case is started:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("the test fail is started:"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("the test case is skipped:"+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
