package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Sample2 {
	
	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses(Sample.class,Sample1.class);
		System.out.println("FAILURE COUNT:"+r.getFailureCount());
		System.out.println("RUN COUNT:"+r.getRunCount());
		int ic = r.getIgnoreCount();
		System.out.println("IGNORE COUNT:"+ic);
		System.out.println("RUN TIME:"+r.getRunTime());
		List<Failure> f = r.getFailures();
		for (Failure failure : f) {
			System.out.println(failure);
			
		}
	}

}
