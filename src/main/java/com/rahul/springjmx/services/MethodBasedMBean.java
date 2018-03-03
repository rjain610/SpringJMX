package com.rahul.springjmx.services;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

@Service("mb")
public class MethodBasedMBean {

	int mb = 1024 * 1024;
	
	

	public int getMb() {
		return mb;
	}


	public void setMb(int mb) {
		this.mb = mb;
	}


	// Getting the runtime reference from system
	Runtime runtime = Runtime.getRuntime();
	
	RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
	

	public String printVMInfo() {
		
		StringBuilder str = new StringBuilder();
		str.append("\n##### Heap utilization statistics [MB] #####");

		// Print used memory
		str.append("\nUsed Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);

		// Print free memory
		str.append("\nFree Memory:" + runtime.freeMemory() / mb);

		// Print total available memory
		str.append("\nTotal Memory:" + runtime.totalMemory() / mb);

		// Print Maximum available memory
		str.append("\nMax Memory:" + runtime.maxMemory() / mb);
		
		
		return str.toString();
	}
	
	public String printApplicationRunTime() {
		
		return "\nApplication uptime "+ rb.getUptime();
	}

}
